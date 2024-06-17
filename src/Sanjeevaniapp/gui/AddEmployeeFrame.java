/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.pojo.EmpPojo;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AddEmployeeFrame extends javax.swing.JFrame {
    private String empName;
    private String empSal;

         public AddEmployeeFrame() {
        initComponents();
         setLocationRelativeTo(null);
        generateNewId();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtEmpSal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnAddEmp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jcEmpJob = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Employee Details:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Employee Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Job:");

        txtEmpId.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Employee Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Salary:");

        btnAddEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddEmp.setText("ADD EMPLOYEE");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jcEmpJob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcEmpJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Receptionist" }));
        jcEmpJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpJobActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/HomePageBG.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcEmpJob, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcEmpJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcEmpJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEmpJobActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
    boolean isInputValid=validateInputs();
     if(!isInputValid){
         JOptionPane.showMessageDialog(null, "Please input all the data!");
         return;
     }
     try{
         double eSal=Double.parseDouble(empSal);
         EmpPojo emp=new EmpPojo();
         emp.setEmpId(txtEmpId.getText().trim());
         emp.setEmpName(empName);
         emp.setEmpSal(eSal);
         emp.setEmpDept(jcEmpJob.getSelectedItem().toString());
         boolean result=EmpDao.addEmp(emp); //dao ka add emp method call and empdao is static becoz its instance variable nhi banayae
         // ofr apn ko new se object bane ke aaces karna padta that's why dao is staic class ke namse acces kar leye apn ne
         if(result){
          JOptionPane.showMessageDialog(null, "Record addedd successfully");
          generateNewId();
          return;
         }
         JOptionPane.showMessageDialog(null, "Could not add the record! Try Again");    
     }
     catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
     catch(NumberFormatException ex){
         JOptionPane.showMessageDialog(null,"Please input numeric salary!"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame fr=new ManageEmpFrame();
         fr.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         LoginFrame loginFrame=new LoginFrame();
         loginFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void generateNewId() {
        try{
            String empId=EmpDao.getNextEmpId();
            txtEmpId.setText(empId);
            txtEmpName.setText("");
            txtEmpSal.setText("");
            jcEmpJob.setSelectedIndex(0);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        empName=txtEmpName.getText().trim();
        empSal=txtEmpSal.getText().trim();
        if(empName.isEmpty()||empSal.isEmpty())
            return false;
        return true;
    }

    


   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcEmpJob;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSal;
    // End of variables declaration//GEN-END:variables
}
