
package Sanjeevaniapp.dao;

import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.User;
import Sanjeevaniapp.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {

    public static String validateUser(User user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
        ps.setString(1, user.getLoginId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType().toUpperCase());
        ResultSet rs = ps.executeQuery();
        String name = null;
        if (rs.next())
        {            
            name = rs.getString("user_name");
        }
        return name;
    }
    public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();
}
     public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, user.getUserType().toUpperCase());
     return ps.executeUpdate()==1;
}
     public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}
     public static boolean updateReceptionUser(UserPojo user,String oldName)throws SQLException{
    
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("update users set login_id=?,user_name=?,password=? where user_name=?");
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, oldName);
     return ps.executeUpdate()==1;
     }

     
     public static UserPojo getUserDetailsByName(String name)throws SQLException
     {
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("select * from users where user_name=?");
     ps.setString(1, name);
         System.out.println("IN LOOP NAME " + name);
     ResultSet rs=ps.executeQuery();
     UserPojo user=new UserPojo();
     
     while(rs.next()){
         user.setLoginId(rs.getString("login_id"));
         user.setPassword(rs.getString("password"));
         user.setUserType(rs.getString("user_type"));
     }
         System.out.println("in user dao "+user.getLoginId());
     return user;
     }
}
