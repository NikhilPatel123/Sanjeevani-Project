/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.pojo.UserProfile;
import javax.swing.JFrame;


public class ViewAllPatientOptionFrame extends javax.swing.JFrame {

    public ViewAllPatientOptionFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblusers.setText("USER-"+UserProfile.getUserName().toUpperCase());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblusers = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        btnViewSingle = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello,");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblusers.setBackground(new java.awt.Color(0, 0, 0));
        lblusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 720, 57));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Patient Details");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 230, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -4, 970, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 230, 250));

        btnViewAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewAll.setText("View All Patient");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 740, 220, 50));

        btnViewSingle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewSingle.setText("View Single Patient");
        btnViewSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSingleActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 740, 210, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 830, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSingleActionPerformed
        // TODO add your handling code here:
          JFrame fr=new ViewSinglePatientFrame();
          fr.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnViewSingleActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
          JFrame fr=new ViewAllPatientFrame();
          fr.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllPatientOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllPatientOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllPatientOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewSingle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblusers;
    // End of variables declaration//GEN-END:variables
}
