
package Sanjeevaniapp.gui;

import Sanjeevaniapp.dao.AppointmentDao;
import Sanjeevaniapp.pojo.AppointmentPojo;
import Sanjeevaniapp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewAllConfirmAppointmentFrame extends javax.swing.JFrame {
    
     private DefaultTableModel model;
  
    public ViewAllConfirmAppointmentFrame() {
        initComponents();
        setLocationRelativeTo(null);
        model=(DefaultTableModel)jtAllRec2.getModel();
        loadAllConfirmedAppointments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAllRec2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        back10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevaniapp/gui/Sanjeevani .jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 523));

        jtAllRec2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "OPD", "Appointment Schedule"
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
        jScrollPane3.setViewportView(jtAllRec2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 574, 930, 253));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("View Appointments:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 534, 200, -1));

        back10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back10.setForeground(new java.awt.Color(0, 204, 204));
        back10.setText("Back");
        back10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back10ActionPerformed(evt);
            }
        });
        jPanel4.add(back10, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 530, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 123, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back10ActionPerformed
        // TODO add your handling code here:
        JFrame fr = new DoctorOptionsFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back10ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllConfirmAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllConfirmAppointmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back10;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtAllRec2;
    // End of variables declaration//GEN-END:variables

    private void loadAllConfirmedAppointments() {
        
        try
        {
        List <AppointmentPojo> list=AppointmentDao.getConfirmedAppointments(UserProfile.getUserName());
          if(list.isEmpty())
          {
           JOptionPane.showMessageDialog(null,"No confirmed appointments");
           return;
          }
       Object []obj=new Object[4];
       for(AppointmentPojo appointment:list)
       {
           obj[0]=appointment.getPatientId();
           obj[1]=appointment.getPatientName();
           obj[2]=appointment.getOpd();
           obj[3]=appointment.getAppointmentDate();
           model.addRow(obj);
       }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in DB!"+ex.getMessage());
        }
    }
}
