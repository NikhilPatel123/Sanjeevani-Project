
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
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


public class UpdatePatientFrame extends javax.swing.JFrame {
    private String opd,age,city,address,firstname,lastname,phoneno ,date1,pid;
    java.sql.Date date;
    private PatientPojo patient;

    public UpdatePatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadPatientId();
        loadDoctorId();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jPatId = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jaddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        back11 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 970, -1));

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

        jPatId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatIdActionPerformed(evt);
            }
        });
        jPanel2.add(jPatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 30));

        jaddress.setColumns(20);
        jaddress.setRows(5);
        jScrollPane1.setViewportView(jaddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 720, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 552, 228, 250));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 809, 128, -1));

        back11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back11.setText("Back");
        back11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back11ActionPerformed(evt);
            }
        });
        jPanel1.add(back11, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 853, 100, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 853, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Update Patient Frame");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 531, 208, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtMnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMnoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         boolean isInputValid = validateInputs();
        if (!isInputValid) {
            JOptionPane.showMessageDialog(null, "Please input all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            patient = new PatientPojo();
            patient.setPatientId(jPatId.getSelectedItem().toString());
            patient.setFirstName(txtFName.getText().trim());
            patient.setLastName(txtLName.getText().trim());
            patient.setAge(Integer.parseInt(txtage.getText().trim()));
            patient.setGender(jcGender.getSelectedItem().toString());
            patient.setMarriedStatus(jcStatus.getSelectedItem().toString());
            patient.setAddress(jaddress.getText().trim());
            patient.setCity(txtCity.getText().trim());
            patient.setOpd(txtOpd.getText().trim());
            patient.setDoctorId(jcDocId.getSelectedItem().toString());
            patient.setDate(date);
            patient.setMno(txtMno.getText().trim());
            boolean result1=PatientDao.updatePatient(patient);
            boolean result2=AppointmentDao.updatePatientDetails(patient);
            if(result1 && result2){
              JOptionPane.showMessageDialog(null,"Record updated successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
              jPatId.setSelectedItem(0);
              txtFName.setText("");
              txtLName.setText("");
              txtage.setText("");
              txtDate.setText("");
              txtMno.setText("");
              txtOpd.setText("");
              txtCity.setText("");
              jaddress.setText("");
              txtMno.setText("");
              return;
            }
            JOptionPane.showMessageDialog(null,"Record not updated!","Failure!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB (UpdatePatientFrame)");
            ex.printStackTrace();
        }
              
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void back11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back11ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatIdActionPerformed
        // TODO add your handling code here:
        try{
            pid =jPatId.getSelectedItem().toString();
            patient = PatientDao.getPatientDetailsById(pid);
            txtFName.setText(patient.getFirstName());
            txtLName.setText(patient.getLastName());
            txtage.setText(Integer.toString(patient.getAge()));
            jcGender.setSelectedItem(patient.getGender());
            jcStatus.setSelectedItem(patient.getMarriedStatus());
            jaddress.setText(patient.getAddress());
            txtCity.setText(patient.getCity());
            txtOpd.setText(patient.getOpd());
            jcDocId.setSelectedItem(patient.getDoctorId());
            txtDate.setText(patient.getDate().toString());
            txtMno.setText(patient.getMno());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB (UpdatePatientFrame)");
            ex.printStackTrace();
            return;
        }
    }//GEN-LAST:event_jPatIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back11;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JComboBox<String> jPatId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jaddress;
    private javax.swing.JComboBox<String> jcDocId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcStatus;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMno;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables

    private void loadPatientId() {
      try {
            List<String> PatIdList = PatientDao.getAllPatientId();
            for (String id : PatIdList) {
                jPatId.addItem(id);
            }
            Date today = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
           String dateStr=sdf.format(today);
           txtDate.setText(dateStr);
           java.util.Date d1 = sdf.parse(dateStr);
           long ms = d1.getTime();
           date = new java.sql.Date(ms);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In Date " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(ParseException ex)
        {
         JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage());  
        }
    }

    private void loadDoctorId() {
        try {
            List<String> DocIdList = DoctorDao.getAllDoctorId();
            for (String id : DocIdList) {
                jcDocId.addItem(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
     private boolean validateInputs() {
        opd = txtOpd.getText().trim();
        age= txtage.getText().trim();
        city= txtCity.getText().trim();
        address= jaddress.getText().trim();
        firstname= txtFName.getText().trim();
        lastname= txtLName.getText().trim();
        date1= txtDate.getText().trim();
        phoneno= txtMno.getText().trim();
        if (opd.isEmpty() || age.isEmpty() || city.isEmpty() || address.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || date1.isEmpty() || phoneno.isEmpty())
        {
            return false;
        }
        return true;
    }
       
    }

