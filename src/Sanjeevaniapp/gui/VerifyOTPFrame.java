
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.dao.DoctorDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.pojo.PatientPojo;
import Sanjeevaniapp.utility.OTPSender;
import Sanjeevaniapp.utility.Sender;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VerifyOTPFrame extends javax.swing.JFrame {
    private PatientPojo patient; 
    public VerifyOTPFrame() {
        initComponents();
        setLocationRelativeTo(null);
      
    }
     public VerifyOTPFrame(PatientPojo patient)
     {
       this();
       txtPatientName.setText(patient.getFirstName()+" "+patient.getLastName());
       txtMno.setText(patient.getMno());
       this.patient=patient;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtOTP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSendOtp = new javax.swing.JButton();
        txtMno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnVerify = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        back9 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 915, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Enter OTP");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone no.");

        btnSendOtp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSendOtp.setForeground(new java.awt.Color(0, 204, 204));
        btnSendOtp.setText("SEND OTP");
        btnSendOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOtpActionPerformed(evt);
            }
        });

        txtMno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMnoActionPerformed(evt);
            }
        });

        btnVerify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(0, 204, 204));
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        back9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back9.setForeground(new java.awt.Color(0, 204, 204));
        back9.setText("Back");
        back9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOTP, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(txtPatientName))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMno, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnSendOtp, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(back9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSendOtp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtMno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back9)
                    .addComponent(btnVerify)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 882, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtMnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnoActionPerformed

    private void btnSendOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOtpActionPerformed
       try{
           Sender sender=new OTPSender();
           String potp=String.valueOf(patient.getOtp());
           boolean result=sender.send(patient.getMno(),potp);
           if(result){
               JOptionPane.showMessageDialog(null,"OTP sent successfully!");
           }else{
               JOptionPane.showMessageDialog(null,"Cannot send the OTP Please check the number!");
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnSendOtpActionPerformed

    private void back9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back9ActionPerformed
       JFrame fr=new AddPatientFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back9ActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
       if(!isValidOTP()){
            JOptionPane.showMessageDialog(null,"Invalid OTP.Try again!");
            return;
        }
        try{
            AppointmentPojo appojo=new AppointmentPojo();
            appojo.setAppointmentDate(patient.getDate().toString());
            appojo.setMobileNo(patient.getMno().trim());
            appojo.setOpd(patient.getOpd().trim());
            appojo.setPatientId(patient.getPatientId());
            appojo.setPatientName(txtPatientName.getText().trim());
            String docName=DoctorDao.getDoctorNameById(patient.getDoctorId());
             appojo.setDoctorName(docName);
            appojo.setStatus("REQUEST");
            boolean result1=PatientDao.addPatient(patient);
            boolean result2=AppointmentDao.addAppointment(appojo);
            if(result1 && result2){
                JOptionPane.showMessageDialog(null,"Patient record saved!!");
                ViewAllPatientFrame viewAll=new ViewAllPatientFrame();
                this.dispose();
                viewAll.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Sorry! could not save the patient record!");
            }
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Error in DB");
           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VerifyOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyOTPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back9;
    private javax.swing.JButton btnSendOtp;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

     private boolean isValidOTP() {
        boolean result=false;
        try{
            int otp=Integer.parseInt(txtOTP.getText().trim());
            if(otp==patient.getOtp())
                result=true;
        }catch(NumberFormatException ex){
           
        }finally{
            return result;
        }
        
    }
}

