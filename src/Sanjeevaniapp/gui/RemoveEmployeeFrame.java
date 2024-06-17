
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class RemoveEmployeeFrame extends javax.swing.JFrame {

   
    public RemoveEmployeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadEmployeesId();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        back5 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Remove Employee:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 96, 125, 30));

        jcEmpId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 97, 167, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 969, 14));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 130, -1));

        back5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back5.setText("Back");
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });
        jPanel2.add(back5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 128, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 540, 940, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 987, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          String empId=jcEmpId.getSelectedItem().toString();
        try{
            boolean result=EmpDao.deleteEmployeeById(empId);
            if(result){
                JOptionPane.showMessageDialog(null, "Employee removed successfully!");
                jcEmpId.removeItem(empId);
                if(jcEmpId.getItemCount()==0){
                    btnDelete.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "All Employees removed!");
                
            }
        }else{
              JOptionPane.showMessageDialog(null, "Delete unsuccessful");  
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
        // TODO add your handling code here:
         JFrame fr=new ManageEmpFrame();
         fr.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_back5ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back5;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcEmpId;
    // End of variables declaration//GEN-END:variables

    private void loadEmployeesId() {
        try{
            List<String>empList=EmpDao.getAllemployeeId();
            for(String empId:empList){
                jcEmpId.addItem(empId);
            }
            if(jcEmpId.getItemCount()!=0)
                btnDelete.setEnabled(true);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DataBase:"+ex);
            ex.printStackTrace();
        }
    }
}
