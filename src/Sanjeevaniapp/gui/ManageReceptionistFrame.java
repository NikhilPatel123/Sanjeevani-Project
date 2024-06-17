
package Sanjeevaniapp.gui;

import Sanjeevaniapp.pojo.UserProfile;
import javax.swing.JFrame;

public class ManageReceptionistFrame extends javax.swing.JFrame {

    public ManageReceptionistFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblusers1.setText("USER-"+UserProfile.getUserName().toUpperCase());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblusers = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblusers1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        back8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Receptionist");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 551, -1, 57));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hello,");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, -1, -1));

        lblusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, -27, 220, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 13, 132, -1));

        lblusers1.setText("jLabel4");
        jPanel2.add(lblusers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 6, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 551, 677, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/doctor.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 626, -1, 153));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add Receptionist");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 648, 205, 63));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update Receptionist");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 648, 223, 63));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemove.setText("Remove Receptionist");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 740, -1, 66));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setText("View Receptionist");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 740, 205, 66));

        back8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back8.setText("Back");
        back8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back8ActionPerformed(evt);
            }
        });
        getContentPane().add(back8, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 797, 94, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        JFrame fr = new AddReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        JFrame fr = new UpdateReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ViewAllReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        JFrame fr = new RemoveReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void back8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back8ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new AdminOptionsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back8;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblusers;
    private javax.swing.JLabel lblusers1;
    // End of variables declaration//GEN-END:variables
}
