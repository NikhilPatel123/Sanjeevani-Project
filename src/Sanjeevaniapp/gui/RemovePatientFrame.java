
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.PatientDao;
import Sanjeevaniapp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RemovePatientFrame extends javax.swing.JFrame {

    public RemovePatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblusers.setText("USER-"+UserProfile.getUserName().toUpperCase());
        loadPatientsId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblusers = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jcPatId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello,");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, -1, -1));

        lblusers.setBackground(new java.awt.Color(0, 0, 0));
        lblusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 30));

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
        jButton1.setText("HOME");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 720, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hello,");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 13, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USER-NIKHIL");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("LOGOUT");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 204));
        jButton4.setText("HOME");
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 720, 57));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 556, 221, 284));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Delete Patient Frame");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 196, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Patient ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 710, 118, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 721, 169, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 796, 99, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 796, 128, -1));

        jcPatId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPatIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcPatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 960, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ReceptionistOptionFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPatIdActionPerformed
        System.out.println(jcPatId.getSelectedIndex());
        if(jcPatId.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"No Patients present ");
            return;
        }
        
    }//GEN-LAST:event_jcPatIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         
        String PatId=jcPatId.getSelectedItem().toString();
        try{
            boolean result=PatientDao.deletePatientById(PatId);
            if(result){
                JOptionPane.showMessageDialog(null, "Patient removed successfully!");
                jcPatId.removeItem(PatId);
                if(jcPatId.getItemCount()==0){
                    btnDelete.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "All Patients removed!");
                
            }
        }
            else{
              JOptionPane.showMessageDialog(null, "Delete unsuccessful");  
            }
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemovePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemovePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcPatId;
    private javax.swing.JLabel lblusers;
    // End of variables declaration//GEN-END:variables

    private void loadPatientsId() {
        try{
            List<String>PatList=PatientDao.getAllPatientId();
            for(String patId:PatList){
                 jcPatId.addItem(patId);
            }
            if(jcPatId.getItemCount()!=0)
                btnDelete.setEnabled(true);
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }
}

