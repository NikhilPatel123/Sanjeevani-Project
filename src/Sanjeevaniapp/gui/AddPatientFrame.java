
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.PatientPojo;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddPatientFrame extends javax.swing.JFrame {

    List<String>doctorIds;
    String patientId;
    java.sql.Date dt;
    private PatientPojo patient;
    private static int OTP=1000+(int)(Math.random()*999);
    public AddPatientFrame() {
        initComponents();
        loadDoctorIds();
         setLocationRelativeTo(null);
        getNewPatientId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtOpd = new javax.swing.JTextField();
        jcDocId = new javax.swing.JComboBox<>();
        txtPId = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtMno = new javax.swing.JTextField();
        jcGender = new javax.swing.JComboBox<>();
        jcStatus = new javax.swing.JComboBox<>();
        txtage = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 970, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add Patient Frame");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, 25));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("OPD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DoctorID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Patient ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Age");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("City");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, -1));
        jPanel2.add(txtOpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 40, 170, 30));

        jcDocId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jcDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 83, 170, -1));
        jPanel2.add(txtPId, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 128, 170, 30));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("First Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Last Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Date");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Phone no.");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Marial Status");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));
        jPanel2.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 179, 30));
        jPanel2.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 42, 179, 30));
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 179, 30));

        txtMno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMnoActionPerformed(evt);
            }
        });
        jPanel2.add(txtMno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 179, 30));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "others" }));
        jPanel2.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 180, -1));

        jcStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARRIED", "UNMARRIED" }));
        jPanel2.add(jcStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 180, -1));
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 170, 30));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 720, 390));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 200, 240));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 820, 120, -1));

        btn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn10.setText("Back");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 870, 90, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 870, 100, -1));
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 740, 164, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 970, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtMnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!validateInputs()){
            return;
        }
        patient.setOtp(OTP);
        patient.setAptStatus("REQUEST");
        patient.setOpd(txtOpd.getText().trim());
        VerifyOTPFrame verify=new VerifyOTPFrame(patient);
        this.dispose();
        verify.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
         JFrame fr=new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn10ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JComboBox<String> jcDocId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcStatus;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtPId;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorIds() {
           try{
            doctorIds=DoctorDao.getAllDoctorId();
            for(String docId:doctorIds){
               jcDocId.addItem(docId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB:"+ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
    }
    private void getNewPatientId() {
        try{
            patientId=PatientDao.getNewPatientId();
            txtPId.setText(patientId);
            Date today=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            String dateStr=sdf.format(today);
            txtDate.setText(dateStr);
            java.util.Date d1=sdf.parse(dateStr);
            long ms=d1.getTime();
            dt=new java.sql.Date(ms);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB:"+ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null,"Error in date conversion:"+ex);
            ex.printStackTrace();
        }
    }
    
   private boolean validateInputs(){
       patient=new PatientPojo();
       patient.setPatientId(txtPId.getText().trim());
       //patient.setAge(txtAge.getText().trim());
       patient.setCity(txtCity.getText().trim());
       patient.setAddress(txtAddress.getText().trim());
       patient.setFirstName(txtFName.getText().trim());
       patient.setLastName(txtLName.getText().trim());
       patient.setGender(jcGender.getSelectedItem().toString());
       patient.setMarriedStatus(jcStatus.getSelectedItem().toString());
       patient.setDoctorId(jcDocId.getSelectedItem().toString());
       patient.setDate(dt);
       patient.setMno(txtMno.getText().trim());
       if(patient.getCity().isEmpty()||patient.getFirstName().isEmpty()||patient.getLastName().isEmpty()||patient.getAddress().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"Please fill all the fields");
           return false;
           
       }  
           
    try{
           patient.setAge(Integer.parseInt(txtage.getText().trim()));
           
       }catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Invalid age"+ex);
          return false;
       }
    if(!isContactNoValid()){
        JOptionPane.showMessageDialog(null,"Invalid Mobile no");
        return false;
    }
    return true;
   }
   private boolean isContactNoValid(){
      char[]mob=patient.getMno().toCharArray();
      for(char ch:mob){
          if(Character.isDigit(ch)==false)
              return false;
      }
      if(patient.getMno().length()==10)
            return true;
      return false;
  }
}
