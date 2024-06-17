package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.dao.ReceptionistDao;
import Sanjeevaniapp.dao.UserDao;
import Sanjeevaniapp.pojo.ReceptionistPojo;
import Sanjeevaniapp.pojo.UserPojo;
import Sanjeevaniapp.utility.PasswordEncryption;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddReceptionistFrame extends javax.swing.JFrame {

     private Map<String,String>unRegRecepList;
     private String selEmpName,selEmpId,loginId;
     private String password,rePassword;
    public AddReceptionistFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadReceptionistDetails();
        getNewRecepId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtReceptionistId = new javax.swing.JTextField();
        txtReceptionistName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        jcGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtRePwd = new javax.swing.JPasswordField();
        jcEmployeeId = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        back6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Add Receptionist");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Employee ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Receptionist ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Receptionist Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Login ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Retype Password");

        jcEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtReceptionistId)
                    .addComponent(txtReceptionistName)
                    .addComponent(txtLoginId)
                    .addComponent(txtPwd)
                    .addComponent(jcGender, 0, 152, Short.MAX_VALUE)
                    .addComponent(jcEmployeeId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRePwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtReceptionistId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtReceptionistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRePwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        back6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back6.setText("Back");
        back6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back6ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back6)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegister)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back6)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back6ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ManageReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back6ActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please input all fields");
            return;
        }
        String result=matchPasswords();
        if(result!=null){
            JOptionPane.showMessageDialog(null,result);
            return;
        }
        try{
            UserPojo user=new UserPojo();
            user.setLoginId(loginId);
            String encPassword=new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(encPassword);
            user.setUserType("Receptionists");
            user.setUserName(selEmpName);
            ReceptionistPojo recep=new ReceptionistPojo();
            recep.setReceptionistId(txtReceptionistId.getText());
            recep.setGender(jcGender.getSelectedItem().toString());
            recep.setReceptionistName(selEmpName);
            boolean resp1=UserDao.addUser(user);
            boolean resp2=ReceptionistDao.addReceptionist(recep);
            if(resp1==true && resp2==true){
             JOptionPane.showMessageDialog(null,"Receptionist registered successfully");
             clearAll();
             this.getNewRecepId();
             return;
            }
            JOptionPane.showMessageDialog(null,"Receptionist registered unsuccessful");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed
       if(jcEmployeeId.getSelectedIndex()==-1)
                return;
        selEmpId=jcEmployeeId.getSelectedItem().toString();
        selEmpName=unRegRecepList.get(selEmpId);
        txtReceptionistName.setText(selEmpName); 
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back6;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JPasswordField txtRePwd;
    private javax.swing.JTextField txtReceptionistId;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables
     
    private void loadReceptionistDetails() {
    try{
            unRegRecepList=EmpDao.getUnRegisteredReceptionists();
            Set<String>recIdSet=unRegRecepList.keySet();
            for(String id:recIdSet){
                jcEmployeeId.addItem(id);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }
     
    private void getNewRecepId() {
         try{
            String recId=ReceptionistDao.getNewRecId();
            txtReceptionistId.setText(recId);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
        
    }
    private boolean validateInputs(){
      loginId=txtLoginId.getText().trim();
      char[] pw1=this.txtPwd.getPassword();
      char[]  pw2=this.txtRePwd.getPassword();
      if(loginId.isEmpty()||pw1.length==0||pw2.length==0)
          return false;
      password=new String(pw1).trim();
      rePassword=new String(pw2).trim();
      return true;
  }
     private String matchPasswords(){
      if(password.length()<3 || rePassword.length()<3)
          return "Passwords must be atleast 3 characters long";
     if(password.equals(rePassword)==false)
          return "Passwords do not match";
     return null;
  }      

    private void clearAll(){
      txtLoginId.setText("");
      this.txtPwd.setText("");
      this.txtRePwd.setText("");
      this.unRegRecepList.remove(selEmpId);
      this.jcEmployeeId.removeItem(selEmpId);
      if(unRegRecepList.size()==0){
          JOptionPane.showMessageDialog(null,"All receptionists registered!");
          ManageReceptionistFrame manageRecep=new ManageReceptionistFrame();
          manageRecep.setVisible(true);
          this.dispose();
      }
      
      
  }

    
}
