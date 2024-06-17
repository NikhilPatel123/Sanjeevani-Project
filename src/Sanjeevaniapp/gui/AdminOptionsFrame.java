/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.pojo.UserProfile;
import javax.swing.JFrame;


public class AdminOptionsFrame extends javax.swing.JFrame {

    
    public AdminOptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblusers.setText("USER-"+UserProfile.getUserName().toUpperCase());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnManageEmp = new javax.swing.JButton();
        btnManageDoctors = new javax.swing.JButton();
        btnManageReceptionists = new javax.swing.JButton();
        btnViewPatients = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblusers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManageEmp.setText("MANAGE EMPLOYEE");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 260, 60));

        btnManageDoctors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManageDoctors.setText("MANAGE DOCTORS");
        btnManageDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorsActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 240, 60));

        btnManageReceptionists.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManageReceptionists.setText("MANAGE RECEPTIONISTS");
        btnManageReceptionists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReceptionistsActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageReceptionists, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 750, 270, 60));

        btnViewPatients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewPatients.setText("VIEW PATIENTS");
        btnViewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 750, 240, 60));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 10, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 940, 530));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN PANEL");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 680, 50));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        lblusers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblusers, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblusers, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 230, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
    JFrame fr=new ManageEmpFrame();
    fr.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnViewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientsActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ViewAllPatientFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewPatientsActionPerformed

    private void btnManageDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorsActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ManageDoctorFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageDoctorsActionPerformed

    private void btnManageReceptionistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReceptionistsActionPerformed
        // TODO add your handling code here:
         JFrame fr=new ManageReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnManageReceptionistsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDoctors;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageReceptionists;
    private javax.swing.JButton btnViewPatients;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblusers;
    // End of variables declaration//GEN-END:variables
}
