/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorDao;
import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.pojo.DoctorPojo;
import Sanjeevaniapp.pojo.UserPojo;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterDoctorsFrame extends javax.swing.JFrame {
   private Map<String,String>unRegDocList;
   private String logId,selEmpId,selEmpName;
   private String pwd1,pwd2;
   private String contactNo,emailId,qualification,specialist;
    public RegisterDoctorsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        unRegDocList=new HashMap<>();
        loadDoctorDetails();
        genNewDocId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtPwd1 = new javax.swing.JPasswordField();
        txtPwd2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtDoctorId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 533, -1, 57));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 470));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Doctor's Details:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Doctor Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Login ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Retype Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");

        jcEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "others" }));

        txtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIdActionPerformed(evt);
            }
        });

        txtPwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwd1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Doctor ID");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Contact No");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Qualification");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Specialist");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Email ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDoctorName)
                            .addComponent(jcEmployeeId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcGender, 0, 131, Short.MAX_VALUE)
                            .addComponent(txtLoginId)
                            .addComponent(txtPwd1)
                            .addComponent(txtPwd2))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel10)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(42, 42, 42)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQualification, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtSpecialist)
                                    .addComponent(txtEmailId))))))
                .addGap(61, 99, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 780, 290));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 230, 250));

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 750, 130, -1));

        back3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back3.setText("Back");
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        jPanel2.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 790, 100, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 790, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Add Doctor's Frame");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 170, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwd1ActionPerformed

    private void txtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIdActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ManageDoctorFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back3ActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed
        // TODO add your handling code here:
         if(jcEmployeeId.getSelectedIndex()==-1)
        return;
        selEmpId=jcEmployeeId.getSelectedItem().toString();
        selEmpName=unRegDocList.get(selEmpId);
        txtDoctorName.setText(selEmpName);
        
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
     }
     String passwordValid=matchPassword();
     if(passwordValid!=null){
         JOptionPane.showMessageDialog(null, passwordValid);
         return;
     }
     //agar dono if chal gay toh phr check kareega contact check karega
     if(isContactNoValid()==false){
         JOptionPane.showMessageDialog(null, "Invalid mobile no");
         return;
     }
     //then ab enter a  data in doctor m or user m
     try{
         DoctorPojo doc=new DoctorPojo();
         doc.setDoctorId(txtDoctorId.getText());
         doc.setDoctorName(selEmpName);
         doc.setEmailId(emailId);
         doc.setGender(jcGender.getSelectedItem().toString());
         doc.setContactNo(contactNo);
         doc.setQualification(qualification);
         doc.setSpecialist(specialist);
         UserPojo user=new UserPojo();
         user.setLoginId(logId);
         String encPassword=new String(PasswordEncryption.getEncryptedPassword(pwd1));
         user.setPassword(encPassword);
         user.setUserName(selEmpName);
         user.setUserType("DOCTOR");
         //saare setters call kar leye ab-
         boolean result1=DoctorDao.addDoctor(doc);//dono insert karo doctor bhi or user bhi toh register successfully
         boolean result2=UserDao.addUser(user);
         if(result1==true && result2==true){
             JOptionPane.showMessageDialog(null, "Doctor registered successfully!");
             clearAll();
             return;
         }
        JOptionPane.showMessageDialog(null, "Registration unsuccessful!"); //return false karna tab oracle ke taraf se koi problem
        return; 
                 
     }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back3;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd1;
    private javax.swing.JPasswordField txtPwd2;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecialist;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorDetails() {
        try{
            unRegDocList=EmpDao.getUnRegisteredDoctors(); //yesemese key nikaleni h or comobo m daalni h
            Set <String> empIdSet=unRegDocList.keySet();//map m shirf key lagtah yek method h set use kare
            for(String empId:empIdSet){//set se id nikal ke combo m add kare
                jcEmployeeId.addItem(empId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        
    }
    }
 //doc se  laani h docid dekha deni txtbox m 
    private void genNewDocId() {
      try{
            String docId=DoctorDao.getNewDocId();
            txtDoctorId.setText(docId);
            }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
      logId=txtLoginId.getText().trim();
      char[] p1=txtPwd1.getPassword();//gettext se password return karega string or bej dega polll mthats why use getpassword
      char[] p2=txtPwd2.getPassword();
      contactNo=txtContactNo.getText().trim();
      qualification=txtQualification.getText().trim();
      specialist=txtSpecialist.getText().trim();
      emailId=txtEmailId.getText().trim();
      //check kar leye khabi saara data khali toh nhi
      if(logId.isEmpty()||p1.length==0||p2.length==0||contactNo.isEmpty()||qualification.isEmpty()||emailId.isEmpty()||specialist.isEmpty())
          return false;
      //if nhi chal mtv kuch data h 
      pwd1=new String(p1);
      pwd2=new String(p2);
      return true;   
  }
    private String matchPassword(){
     pwd1=pwd1.trim();
     pwd2=pwd2.trim();
     if(pwd1.length()<3 || pwd2.length()<3)
         return "Passwords must be enter of atleast 3 characters in length";
     if(pwd1.equals(pwd2)==false)
         return "Passwords do not match";
     return null;
  }
    private boolean isContactNoValid(){
      char[]mob=contactNo.toCharArray();//string ko convert kar dega charArray
      for(char ch:mob){
          if(Character.isDigit(ch)==false)//check karega ki digit h kii nhi 
              return false;
      }
      if(contactNo.length()==10) //mob
            return true;
      return false;
  }
     private void clearAll(){
      txtLoginId.setText("");
      txtContactNo.setText("");
      txtDoctorId.setText("");
      txtEmailId.setText("");
      txtPwd1.setText("");
      txtPwd2.setText("");
      txtQualification.setText("");
      txtSpecialist.setText("");
      unRegDocList.remove(selEmpId);
      jcEmployeeId.removeItem(selEmpId);//combo m se bhi id hatta dii
      if(unRegDocList.size()==0){
          JOptionPane.showMessageDialog(null,"All doctors registered!");
          ManageDoctorFrame manageDoc=new ManageDoctorFrame();
          manageDoc.setVisible(true);
          this.dispose();
      } 
  }
}
