/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.ReceptionistDao;
import Sanjeevaniapp.dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class RemoveReceptionistFrame extends javax.swing.JFrame {

    public RemoveReceptionistFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadReceptionistId();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcRecId = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        back8 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Remove Receptionist:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Receptionist ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 30));

        jcRecId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcRecId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcRecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 200, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 969, 14));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 160, -1));

        back8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back8.setText("Back");
        back8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back8ActionPerformed(evt);
            }
        });
        jPanel2.add(back8, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 210, 140, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jLabel1.setText("\\");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void back8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back8ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ManageReceptionistFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back8ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          String RecId=jcRecId.getSelectedItem().toString();
        try{
//            UserDao.deleteUserByName(RecId);
            boolean result=ReceptionistDao.deleteReceptionistById(RecId);
            if(result){
                JOptionPane.showMessageDialog(null,"Receptionist removed successfully!");
                jcRecId.removeItem(RecId);
                if(jcRecId.getItemCount()==0){
                    btnDelete.setEnabled(false);
                    JOptionPane.showMessageDialog(null,"All Receptionist removed!");
                
            }
        }else{
              JOptionPane.showMessageDialog(null, "Delete unsuccessful");  
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcRecIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcRecIdActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back8;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcRecId;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistId() {
      try{
            List<String> recList=ReceptionistDao.getAllReceptionistId();
            for(String recId:recList){
                jcRecId.addItem(recId);
            }
            if(jcRecId.getItemCount()!=0)
                btnDelete.setEnabled(true);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }
}
