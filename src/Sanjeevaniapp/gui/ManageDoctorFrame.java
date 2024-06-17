
package Sanjeevaniapp.gui;

import Sanjeevaniapp.pojo.UserProfile;
import javax.swing.JFrame;

public class ManageDoctorFrame extends javax.swing.JFrame {

    public ManageDoctorFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblusers.setText("USER-"+UserProfile.getUserName().toUpperCase());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblusers = new javax.swing.JLabel();
        back4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAddDoctos = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Doctor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 533, 160, 57));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hello,");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, -1, -1));

        lblusers.setBackground(new java.awt.Color(0, 0, 0));
        lblusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 30));

        back4.setBackground(new java.awt.Color(204, 204, 204));
        back4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back4.setForeground(new java.awt.Color(255, 51, 51));
        back4.setText("Back");
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });
        jPanel3.add(back4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 13, 114, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 13, 123, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 533, 760, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/doctor.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 608, -1, 140));

        btnAddDoctos.setBackground(new java.awt.Color(0, 0, 0));
        btnAddDoctos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddDoctos.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDoctos.setText("Add Doctors");
        btnAddDoctos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddDoctos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 669, 170, 52));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Doctors");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 669, 180, 52));

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View Doctors");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 669, 170, 52));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDoctosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctosActionPerformed
        // TODO add your handling code here:
        JFrame fr=new RegisterDoctorsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddDoctosActionPerformed

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new AdminOptionsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back4ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        JFrame fr=new RemoveDoctorFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ViewAllDoctorsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

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
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back4;
    private javax.swing.JButton btnAddDoctos;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblusers;
    // End of variables declaration//GEN-END:variables
}
