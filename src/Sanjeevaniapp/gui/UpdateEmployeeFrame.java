
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.pojo.EmpPojo;
import Sanjeevaniapp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UpdateEmployeeFrame extends javax.swing.JFrame {

    private String empname, empsal; //update karne ke apn ko empname or empsal chaiye;

    public UpdateEmployeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadEmpId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtEmpSal = new javax.swing.JTextField();
        jcDepart = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jcEmpId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Upadte Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Emp ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Department ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Emp Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Salary");

        jcDepart.setEditable(true);
        jcDepart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Receptionist" }));
        jcDepart.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Employee Details");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jcEmpId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 920, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcEmpId, 0, 148, Short.MAX_VALUE)
                            .addComponent(jcDepart, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtEmpSal))
                        .addGap(157, 157, 157))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnBack1)
                        .addGap(150, 150, 150)
                        .addComponent(btnUpdate)
                        .addGap(196, 196, 196)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jcEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(jButton2)
                    .addComponent(btnBack1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        // TODO add your handling code here:
        try {
            String empId = jcEmpId.getSelectedItem().toString();
            EmpPojo emp = EmpDao.getEmployeeDetails(empId);
            txtEmpName.setText(emp.getEmpName());
            txtEmpSal.setText(String.valueOf(emp.getEmpSal()));
            jcDepart.setSelectedItem(emp.getEmpDept().toUpperCase());
            System.out.println(emp.getEmpDept());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean isInputValid = validateInputs();
        if (!isInputValid) {
            JOptionPane.showMessageDialog(null, "Please input all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            double esal = Double.parseDouble(empsal);
            EmpPojo emp = new EmpPojo();
            emp.setEmpId(jcEmpId.getSelectedItem().toString());
            emp.setEmpDept(jcDepart.getSelectedItem().toString());
            emp.setEmpName(empname);
            emp.setEmpSal(esal);
            boolean result = EmpDao.updateEmployee(emp);
            if (result) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                if (UserProfile.getUserId().equalsIgnoreCase(emp.getEmpId()))//agr admin apna hii name update kare toh check//
                {
                    UserProfile.setUserName(empname);//agar 2 admin h nikhil sujeet ka nam change kar toh nhi raha //toh userprofile
                }              // m jo id h wo emp(pojo) kii id se match kar rahi h kya
                return;

            }
            JOptionPane.showMessageDialog(null, "Record not updated!", "Failure!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please input integer value for salary", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new ManageEmpFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void loadEmpId() {
        try {
            List<String> empIdList = EmpDao.getAllemployeeId();
            for (String id : empIdList) {
                jcEmpId.addItem(id);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcDepart;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSal;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        empname = txtEmpName.getText().trim();
        empsal = txtEmpSal.getText().trim();
        if (empname.isEmpty() || empsal.isEmpty()) {
            return false;
        }
        return true;
    }
}
