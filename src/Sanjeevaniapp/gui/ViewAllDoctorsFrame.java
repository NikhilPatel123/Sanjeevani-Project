/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.DoctorDao;
import Sanjeevaniapp.pojo.DoctorPojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewAllDoctorsFrame extends javax.swing.JFrame {
    private DefaultTableModel model;
    public ViewAllDoctorsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        model=(DefaultTableModel)jtAllDoc.getModel();
        viewAllDoctorDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAllDoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 523));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("View All Doctors");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 530, -1, 47));

        btnBack7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack7.setText("Back");
        btnBack7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack7, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 538, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 538, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jtAllDoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtAllDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name", "Email ID", "Contact No", "Qualification", "Gender", "Specialist"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAllDoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 590, 890, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack7ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ManageDoctorFrame();
        fr.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btnBack7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllDoctorsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack7;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAllDoc;
    // End of variables declaration//GEN-END:variables

    private void viewAllDoctorDetails() {
        try{
            List<DoctorPojo>docList=DoctorDao.getAllDoctorDetails();
            if(docList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No record found!");
                return;
            }
            Object[] obj=new Object[7];
            for(DoctorPojo d:docList){
                obj[0]=d.getDoctorId();
                obj[1]=d.getDoctorName();
                obj[2]=d.getEmailId();
                obj[3]=d.getContactNo();
                obj[4]=d.getQualification();
                obj[5]=d.getGender();
                obj[6]=d.getSpecialist();
                model.addRow(obj);
                            
            }
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
}
 

