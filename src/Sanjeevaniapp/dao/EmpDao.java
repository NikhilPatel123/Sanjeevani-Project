
package Sanjeevaniapp.dao;

import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.EmpPojo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpDao {
    public static String getNextEmpId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select max(emp_id) from employees");
    rs.next();
    String str=rs.getString(1);
    int empId=101;
    if(str!=null){
        String id=str.substring(1);
        empId=Integer.parseInt(id);
        empId++;
    }
    String newId="E"+empId;
    return newId;
}
    public static boolean addEmp(EmpPojo emp)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into employees values(?,?,?,?)");
    ps.setString(1, emp.getEmpId());
    ps.setString(2, emp.getEmpName());
    ps.setString(3, emp.getEmpDept());
    ps.setDouble(4,emp.getEmpSal());
    return ps.executeUpdate()==1;
}
public static List<String> getAllemployeeId()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select emp_id from employees");
    List<String> empIdList=new ArrayList<>();
    while(rs.next()){
        empIdList.add(rs.getString(1));
    }
    return empIdList;
} 
public static boolean deleteEmployeeById(String empId)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select emp_name from employees where emp_id=?");
     ps.setString(1, empId);
     ResultSet rs=ps.executeQuery();
     rs.next();
     String empName=rs.getString(1);
     UserDao.deleteUserByName(empName);
     ps=conn.prepareStatement("Delete from employees where emp_id=?");
     ps.setString(1, empId);
     return ps.executeUpdate()==1;
}
 public static EmpPojo getEmployeeDetails(String empId)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from employees where emp_id=?");
    ps.setString(1,empId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    EmpPojo emp=new EmpPojo();
    emp.setEmpId(rs.getString(1));
    emp.setEmpName(rs.getString(2));
    emp.setEmpDept(rs.getString(3));
    emp.setEmpSal(rs.getDouble(4));
    return emp;
 } 
 public static boolean updateEmployee(EmpPojo emp) throws SQLException{
     updateName(emp);//method call ho raha jo sabi table se name update karwayega
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update employees set emp_name=?,emp_salary=? where emp_id=?");
     ps.setString(1, emp.getEmpName());//new name aa jaye
     ps.setDouble(2, emp.getEmpSal()); //sal update kar rahe h
     ps.setString(3, emp.getEmpId());// id se replace hoga
     return ps.executeUpdate()==1;
 }
 public static void updateName(EmpPojo emp)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select emp_name from employees where emp_id=?");//table se name,sal,id jiska record ho raha h update
     ps.setString(1, emp.getEmpId());//wo nam nikal leye jiska record update karna h
     ResultSet rs=ps.executeQuery();//
     rs.next();
     String currName=rs.getString(1); //name pass ho gaya currname m
     String newName=emp.getEmpName();
     UserDao.updateName(currName,newName);//bej deya user dao ko y purana nam h yese update kar do
     if(emp.getEmpDept().equalsIgnoreCase("Receptionist"))
         ReceptionistDao.updateName(currName,newName);
     else if(emp.getEmpDept().equalsIgnoreCase("Doctor"))
         DoctorDao.updateName(currName,newName);   //phr y method jayaege updatemethod ke pass jo update kardega
     
 }

 public static List<EmpPojo> getAllEmployeeDetails()throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select * from employees order by emp_id");//sort form m aa jayenge
    List<EmpPojo>empList=new ArrayList<>();
    while(rs.next()){
    EmpPojo emp=new EmpPojo();
    emp.setEmpId(rs.getString(1));
    emp.setEmpName(rs.getString(2));
    emp.setEmpDept(rs.getString(3));
    emp.setEmpSal(rs.getDouble(4));
    empList.add(emp);
    }
    return empList;    
 } 
 //jaha pe key unique aaa jaye waha pe hashmap use karna chaiye
 //searching ke best hota h hashmap
 public static Map<String,String> getUnRegisteredDoctors()throws SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select emp_id,emp_name from employees where emp_department='Doctor' and emp_name not in (select user_name from users where user_type='Doctor')order by emp_id");
   //not=yus record ko nikal wo users wale nam se match kar raha h kiii nhi
   Map<String,String> unRegDocList=new HashMap<>();//create a empty hashmap
   while(rs.next()){
       String id=rs.getString(1); 
       String name=rs.getString(2);
       //ab yen id or name ko dalana h with the help of put
       unRegDocList.put(id, name);
   }
   return unRegDocList;//arraylist yeseleye return nhi kara rahe kyuki wo shirf id le ke jaati
   //thats why use map id or name dono aa jaye hamhe searching karni h that why use map not hashtree kyu ki wo sorted output deta h
   //simply use query sort by
   //keyvalue pair lagke de degii id or name
 }
 public static Map<String,String> getUnRegisteredReceptionists()throws SQLException{
   Connection conn=DBConnection.getConnection();
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select emp_id,emp_name from employees where emp_department='Receptionist' and emp_name not in (select user_name from users where user_type='Receptionist')order by emp_id");
   Map<String,String> unRegRecepList=new HashMap<>();
   while(rs.next()){
       String id=rs.getString(1);
       String name=rs.getString(2);
       unRegRecepList.put(id, name);
   }
   return unRegRecepList;
 }
 public static void UpdateRecepName(String newName,String oldName)throws SQLException{
    Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("update employees set emp_name=? where emp_name=?"); 
     ps.setString(1, newName);
    ps.setString(2, oldName);
    ps.executeUpdate();   
 }
}

