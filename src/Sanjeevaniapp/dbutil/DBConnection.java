/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-ONVOEIDV:1521/xe","project","nikhil");
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Cannot load driver:"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(SQLException ex)
         {
            JOptionPane.showMessageDialog(null,"DB error"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
         }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"dissconnected successfully","Success",JOptionPane.INFORMATION_MESSAGE); 
        }
        catch(SQLException ex)
         {
            JOptionPane.showMessageDialog(null,"DB error"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
         }
    }
}

