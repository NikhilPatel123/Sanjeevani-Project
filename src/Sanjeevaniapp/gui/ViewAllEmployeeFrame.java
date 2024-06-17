package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.EmpDao;
import Sanjeevaniapp.pojo.EmpPojo;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewAllEmployeeFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    public ViewAllEmployeeFrame() 
    {
        initComponents();
        setLocationRelativeTo(null);
        model=(DefaultTableModel)tableEmpdetails.getModel(); //jo table ka module h wo coonect kar do model se
        loadEmployeeDetails();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpdetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 523));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("View All Employees");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 530, -1, 47));

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 538, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 538, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tableEmpdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "Emp_Name", "Emp_Department", "Emp_Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEmpdetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 590, 960, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        JFrame fr=new ManageEmpFrame();
         fr.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnBack2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpdetails;
    // End of variables declaration//GEN-END:variables

    private void loadEmployeeDetails() {
        //jlist m listmodel use keya tha
         try{
            List<EmpPojo>empList=EmpDao.getAllEmployeeDetails(); //sabhi employess ki list aa gai
            if(empList.isEmpty()){ //bychance list agr khaali aai toh check kar lenege
                JOptionPane.showMessageDialog(null,"No record found!");//database m koi emp nhi h
                return;
            }
            for(EmpPojo e:empList){ //e m 1 by 1 list aaegii
                Vector<String>v=new Vector<>();//vector ka obj bana emppojo ka data aa raha h string ke form m //emppojo agar likhha toh apn ko 4 table baani padegi thats why use String
                v.add(e.getEmpId());//vector yek baar m yek field ko represent karega//vector m data add 1-1 m colum m add karna h
                v.add(e.getEmpName());//name add keya
                v.add(e.getEmpDept());//dept add keya
                v.add(String.valueOf(e.getEmpSal()));//ab data vector m aa gaya
                model.addRow(v);//add ho jayega model m or model de dega table m
                System.out.println(v);                
            }
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in DataBase"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
}