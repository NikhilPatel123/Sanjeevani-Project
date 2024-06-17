
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.PatientPojo;
import Sanjeevaniapp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewSinglePatientFrame extends javax.swing.JFrame {
    private List<String> unRegPatList;
    List<PatientPojo> patient;
    private String selDocId;
     public ViewSinglePatientFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
         lblusers.setText("USER-"+UserProfile.getUserName().toUpperCase());
        loadPatientDetails();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblusers = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOpd = new javax.swing.JTextField();
        jcPatId = new javax.swing.JComboBox<>();
        txtDocId = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtMno = new javax.swing.JTextField();
        jcGender = new javax.swing.JComboBox<>();
        jcStatus = new javax.swing.JComboBox<>();
        txtage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 1002, -1, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Patient Details");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 230, 57));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello,");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, -1, -1));

        lblusers.setBackground(new java.awt.Color(0, 0, 0));
        lblusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 720, 57));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("OPD");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DoctorID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Patient ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Age");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("City");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, -1));
        jPanel2.add(txtOpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 40, 170, 30));

        jcPatId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPatIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcPatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));
        jPanel2.add(txtDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, 30));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel2.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("First Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Last Name");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Gender");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Phone no.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Marial Status");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));
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

        jtAddress.setColumns(20);
        jtAddress.setRows(5);
        jScrollPane1.setViewportView(jtAddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 720, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Patient Deatils");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 180, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 220, 280));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 900, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtMnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ViewAllPatientOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPatIdActionPerformed
        // TODO add your handling code here:
         if(jcPatId.getSelectedIndex()==-1)
        return;
        selDocId=jcPatId.getSelectedItem().toString();
        
    }//GEN-LAST:event_jcPatIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // TODO add your handling code here:
         try{
         patient=PatientDao.getAllPatientDetails();
        for(PatientPojo p:patient){
            if(this.jcPatId.getSelectedItem().toString().equalsIgnoreCase(p.getPatientId())){
                System.out.println("matched id "+p.getPatientId());
                    txtage.setText(String.valueOf(p.getAge()));
                    txtCity.setText(p.getCity());
                    txtDate.setText(p.getDate().toString());
                    txtDocId.setText(p.getDoctorId());
                    txtFName.setText(p.getFirstName());
                    txtLName.setText(p.getLastName());
                    txtOpd.setText(p.getOpd());
                    txtMno.setText(p.getMno());
                    jcGender.setSelectedItem(p.getGender());
                    jcStatus.setSelectedItem(p.getMarriedStatus());
                    this.jtAddress.setText(p.getAddress());
           }
        }
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Error in DB!"+e.getMessage());
         }
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
            java.util.logging.Logger.getLogger(ViewSinglePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSinglePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSinglePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSinglePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSinglePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcPatId;
    private javax.swing.JComboBox<String> jcStatus;
    private javax.swing.JTextArea jtAddress;
    private javax.swing.JLabel lblusers;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables

    private void loadPatientDetails()
    {
        try{
            unRegPatList=PatientDao.getUnRegisteredPatient();          
            for(String id:unRegPatList)
            {
                jcPatId.addItem(id);
            }       
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        } 
    }
}
