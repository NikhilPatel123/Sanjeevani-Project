
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AppointmentRequestFrame extends javax.swing.JFrame {
    
    private List<AppointmentPojo>appList;
    private DefaultTableModel model;
    public AppointmentRequestFrame() {
        initComponents();
        setLocationRelativeTo(null);
        model=(DefaultTableModel)jtAppointments.getModel();
        loadAppointmentDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAppointments = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 942, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("View Appointments");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 180, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 540, 130, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 204));
        jButton2.setText("LOGOUT");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 540, 130, -1));

        jtAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "OPD", "Appointment Date"
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
        jtAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAppointmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAppointments);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 900, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFrame fr=new DoctorOptionsFrame();
         fr.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAppointmentsMouseClicked
        // TODO add your handling code here:
        int rowIndex= jtAppointments.getSelectedRow();
        AppointmentPojo app =appList.get(rowIndex);
        ConfirmAppointmentFrame cfrm= new ConfirmAppointmentFrame(app);
        this.dispose();
        cfrm.setVisible(true);
    }//GEN-LAST:event_jtAppointmentsMouseClicked

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
            java.util.logging.Logger.getLogger(AppointmentRequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentRequestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentRequestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAppointments;
    // End of variables declaration//GEN-END:variables

    private void loadAppointmentDetails() {
         try{
            appList=AppointmentDao.getAllAppointmentsByDoctorName(UserProfile.getUserName());
            if(appList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No appointments in there");
                return;
            }
            Object [] obj=new Object[4];
            for(AppointmentPojo app:appList){
                obj[0]=app.getPatientId();
                obj[1]=app.getPatientName();
                obj[2]=app.getOpd();
                obj[3]=app.getAppointmentDate();
                
                model.addRow(obj);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB");
            ex.printStackTrace();
             
        }
    }
        
}
