/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.dao;

import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.ReceptionistPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReceptionistDao {
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
    public static String getNewRecId()throws  SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select max(receptionist_id) from receptionists");
   rs.next();
   int recId=101;
   String id=rs.getString(1);
   if(id!=null){
       String num=id.substring(3);
       recId=Integer.parseInt(num)+1;
    }
   return "REC"+recId;
}      
    public static List<String> getAllReceptionistId()throws SQLException
{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select receptionist_id from receptionists");
    List<String>receptionistList=new ArrayList<>();
    while(rs.next())
    {
        receptionistList.add(rs.getString(1));
    }
    return receptionistList;
}
  public static boolean addReceptionist(ReceptionistPojo rec)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into receptionists values(?,?,?)");
     ps.setString(1,rec.getReceptionistId());
     ps.setString(2,rec.getReceptionistName());
     ps.setString(3,rec.getGender());
     
     return ps.executeUpdate()==1;
}
  public static ReceptionistPojo getReceptionistDetailsById(String recId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select * from receptionists where receptionist_id=?");
     ps.setString(1, recId);
     ResultSet rs=ps.executeQuery();
     ReceptionistPojo rec=new ReceptionistPojo();
     while(rs.next()){
     
     rec.setReceptionistId(rs.getString(1));
     rec.setReceptionistName(rs.getString("receptionist_name"));
     rec.setGender(rs.getString("GENDER"));
     }
     return rec;
  }
  public static List<ReceptionistPojo> getAllReceptionistDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from receptionists order by receptionist_id");
    List<ReceptionistPojo>recList=new ArrayList<>();
    while(rs.next()){
    ReceptionistPojo recep=new ReceptionistPojo();
    recep.setReceptionistId(rs.getString(1));
    recep.setReceptionistName(rs.getString(2));
    recep.setGender(rs.getString(3));
    recList.add(recep);  
    }
    return recList;
} 
  public static boolean deleteReceptionistById(String RecId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
     ps.setString(1,RecId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String RecName=rs.getString(1);
     UserDao.deleteUserByName(RecName);
     ps=conn.prepareStatement("Delete from receptionists where receptionist_id=?");
     ps.setString(1,RecId);
     return ps.executeUpdate()==1;
}
}
