
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.pojo.User;
import Sanjeevaniapp.pojo.UserProfile;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

 
    private String loginId;
     private String password;
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUserId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jrbAdmin = new javax.swing.JRadioButton();
        jrbReceptionist = new javax.swing.JRadioButton();
        jrbDoctors = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtuserId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jrbadmin = new javax.swing.JRadioButton();
        jrbdoctors = new javax.swing.JRadioButton();
        jrbreceptionist = new javax.swing.JRadioButton();
        pwdPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnlogin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        jLabel5.setText("jLabel5");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 157, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("LoginID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 89, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 95, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, 1577, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 154, 126, 25));

        jrbAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAdmin.setText("Admin");
        jPanel1.add(jrbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 36));

        jrbReceptionist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbReceptionist.setText("Receptionist");
        jPanel1.add(jrbReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, 46));

        jrbDoctors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbDoctors.setText("Doctor");
        jPanel1.add(jrbDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 136, 35));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 609, 10));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 152, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Quit");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 148, 50));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\HomePageBG.jpg")); // NOI18N

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText(" Sanjaveeni Application");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 440, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 530));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("LOGIN ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("PASSWORD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, -1, -1));
        getContentPane().add(txtuserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 170, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 930, 10));

        buttonGroup1.add(jrbadmin);
        jrbadmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbadmin.setText("ADMIN");
        getContentPane().add(jrbadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, -1, -1));

        buttonGroup1.add(jrbdoctors);
        jrbdoctors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbdoctors.setText("DOCTOR");
        jrbdoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbdoctorsActionPerformed(evt);
            }
        });
        getContentPane().add(jrbdoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, -1, -1));

        buttonGroup1.add(jrbreceptionist);
        jrbreceptionist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbreceptionist.setText("RECEPTIONISTS");
        getContentPane().add(jrbreceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 700, 180, -1));
        getContentPane().add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 180, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("USER TYPE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 120, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 742, 930, 10));

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 204, 204));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 770, 120, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("QUIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 770, 110, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 62, 300, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
//        boolean isInputValid=validateInputs();
//        if(isInputValid==false){
//            JOptionPane.showMessageDialog(null,"Please input id and password");
//            return;
//        }
//        String userType=getUserType();
//        if(userType==null){
//            JOptionPane.showMessageDialog(null,"Please select a user type");
//            return;
//        }
//        try{
//            User user=new User();
//            user.setLoginId(loginId);
//            String pwd=new String(PasswordEncryption.getEncryptedPassword(password));
//            user.setPassword(pwd);
//            user.setUserType(userType);
//            String userName=UserDao.validateUser(user);
//            System.out.println("user name"+userName);
//            if(userName!=null){
//                JOptionPane.showMessageDialog(null,"Welcome "+userName,"Login success!",JOptionPane.INFORMATION_MESSAGE);
//                UserProfile.setUserName(userName);
//                UserProfile.setUserType(userType);
//                UserProfile.setUserId(loginId);
//                JFrame optionsFrame=null;
//                if(userType.equalsIgnoreCase("admin")){
//                   optionsFrame=new AdminOptionsFrame();
//                 }
//                else if(userType.equalsIgnoreCase("receptionist")){
//                   optionsFrame=new ReceptionistOptionsFrame();
//                 }
//                else{
//                    optionsFrame=new DoctorsOptionsFrame();
//                }
//                optionsFrame.setVisible(true);
//                this.dispose();
//                return;
//                
//            }
//            JOptionPane.showMessageDialog(null,"Invalid credentials!","Login denied!",JOptionPane.ERROR_MESSAGE);
//        }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//            ex.printStackTrace();
//        }
//    }


//defination of validateInputs()

//private boolean validateInputs() {
//        loginId=txtuserId.getText().trim();
//        char []pwd=pwdPassword.getPassword();
//        if(loginId.isEmpty()|| pwd.length==0)
//            return false;
//        password=new String(pwd);
//        return true;
//        
//    }

//defination of getUserType()

//    private String getUserType() {
//        if(jrbAdmin.isSelected())
//            return jrbAdmin.getText();
//        else if(jrbDoctors.isSelected())
//            return jrbDoctors.getText();
//        else if(jrbReceptionist.isSelected())
//            return jrbReceptionist.getText();
//        return null;
//    

     

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        boolean isInputValid=validateInputs();
        if(isInputValid==false){
            JOptionPane.showMessageDialog(null,"Please input id and password");
            return;
        }
        String userType=getUserType();
        if(userType==null){
            JOptionPane.showMessageDialog(null,"Please select a user type");
            return;
        }
        try{
            User user=new User();
            user.setLoginId(loginId);
            String pwd=new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(pwd);
            user.setUserType(userType);
            String userName=UserDao.validateUser(user);
            System.out.println("user name"+userName);
            if(userName!=null){
                JOptionPane.showMessageDialog(null,"Welcome "+userName,"Login success!",JOptionPane.INFORMATION_MESSAGE);
                UserProfile.setUserName(userName);
                UserProfile.setUserType(userType);
                UserProfile.setUserId(loginId);
                JFrame optionsFrame=null;
                if(userType.equalsIgnoreCase("admin")){
                   optionsFrame=new AdminOptionsFrame();
                 }
                else if(userType.equalsIgnoreCase("receptionists")){
                   optionsFrame=new ReceptionistOptionFrame();
                 }
                else{
                    optionsFrame=new DoctorOptionsFrame();
                }
                optionsFrame.setVisible(true);
                this.dispose();
                return;
                
            }
            JOptionPane.showMessageDialog(null,"Invalid credentials!","Login denied!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    
    }//GEN-LAST:event_btnloginActionPerformed

    private void jrbdoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbdoctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbdoctorsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
     private boolean validateInputs() {
        loginId=txtuserId.getText().trim();
        char []pwd=pwdPassword.getPassword();
        if(loginId.isEmpty()|| pwd.length==0)
            return false;
        password=new String(pwd);
        return true;
        
    }
     
     private String getUserType() {
        if(jrbadmin.isSelected())
            return jrbadmin.getText();
        else if(jrbdoctors.isSelected())
            return jrbdoctors.getText();
        else if(jrbreceptionist.isSelected())
            return jrbreceptionist.getText();
        return null;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnlogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbDoctors;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JRadioButton jrbadmin;
    private javax.swing.JRadioButton jrbdoctors;
    private javax.swing.JRadioButton jrbreceptionist;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtuserId;
    // End of variables declaration//GEN-END:variables
}
