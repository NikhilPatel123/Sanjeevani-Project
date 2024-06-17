
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.utility.Sender;
import Sanjeevaniapp.utility.SmsSender;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmAppointmentFrame extends javax.swing.JFrame {

    private AppointmentPojo app;
    public ConfirmAppointmentFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
     public ConfirmAppointmentFrame(AppointmentPojo app){
        this();
        this.app =app;
        txtPatientId.setText(app.getPatientId());
        txtPatientName.setText(app.getPatientName());
        txtOpd.setText(app.getOpd());
        txtAppointmentDate.setText(app.getAppointmentDate());
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
        txtPatientName = new javax.swing.JTextField();
        txtAppointmentDate = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtOpd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        dateSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Appointment Confirmation");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 546, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Patient Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 133, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, 104, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("OPD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 140, 65, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Patient Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 76, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Appointment Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 132, -1, -1));
        jPanel2.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 78, 253, -1));
        jPanel2.add(txtAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 134, 253, -1));

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 78, 245, -1));
        jPanel2.add(txtOpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 134, 245, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Appointment Scheduled -");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 201, 236, -1));

        btnconfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(0, 204, 204));
        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 139, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 255, 116, -1));

        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(255, 0, 51));
        btnCancle.setText("Cancel");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 255, 137, -1));

        dateSpinner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateSpinner.setModel(new javax.swing.SpinnerDateModel());
        jPanel2.add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 620, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 575, 899, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new DoctorOptionsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
      String dateStr=dateSpinner.getValue().toString();
      System.out.println(dateStr);
      DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
      LocalDateTime appDateTime=LocalDateTime.parse(dateStr,dtf);
      LocalDateTime currDateTime=LocalDateTime.now();
//        System.out.println("conv done");
        int ans=appDateTime.compareTo(currDateTime);
        System.out.println("ans:"+ans);
      if(ans>0)
      {
          System.out.println("if true"); 
          DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a");
           String appDateTimeStr=appDateTime.format(dtf2);
           app.setAppointmentDate(appDateTimeStr);
           app.setStatus("CONFIRM");
           try{
               boolean result1=AppointmentDao.updateStatus(app);
               boolean result2=PatientDao.updateStatus(txtPatientId.getText(),"CONFIRM");
               if(result1 && result2){
                   Sender obj=new SmsSender();
                   String msg="Hello "+app.getPatientName()+"\nYour appointment is fixed at "+appDateTimeStr+" with Dr. " +app.getDoctorName();
                   boolean smsResult=obj.send(app.getMobileNo(), msg);
                   System.out.println("SMS Result:"+smsResult);
                   if(smsResult){
                       System.out.println("in if smsResult:"+smsResult);
                       JOptionPane.showMessageDialog(null, "Message Sent");
                   }else{
                       JOptionPane.showMessageDialog(null, "Message Sending Failed");
                   }                   
               }
               
          
      }
           catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error in Db");
                ex.printStackTrace();
           }
               
           catch(Exception ex2){
                    JOptionPane.showMessageDialog(null, "Error in Sending SMS");
                    ex2.printStackTrace();
                   }
      }else{
          JOptionPane.showMessageDialog(null, "Appointment should be after current time");
      }
      ViewAllConfirmAppointmentFrame cfr = new ViewAllConfirmAppointmentFrame();
      cfr.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        app.setStatus("CANCELLED");
        try{
            boolean result1 = AppointmentDao.updateStatus(app);
            boolean result2 = PatientDao.updateStatus(txtPatientId.getText(),"CANCELLED");
            txtPatientId.setText("");
            txtPatientName.setText("");
            txtOpd.setText("");
            txtAppointmentDate.setText("");
            if(result1 && result2){
                JOptionPane.showMessageDialog(null, "Appointment of patient "+app.getPatientName()+" is Cancelled !");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB (ConfirmAppointmentFrame) : "+ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnCancleActionPerformed

   
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
            java.util.logging.Logger.getLogger(ConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmAppointmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
