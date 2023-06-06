package extendedpage;

import main.ConnectionDB;
import objects.User;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class Request extends javax.swing.JFrame {

    private static User dataLogin;
    
    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    public Request(User dataLogin) {
        this.dataLogin = dataLogin;
        initComponents();
        this.setTitle("Request");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
        showData();
    }
    
    public void addData(){
        if(txtNik.getText().equals("") || txtName.getText().equals("") || txtDiagnose.getText().equals("") || txtDate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Isian terlebih dahulu!", "Data Form Empty", JOptionPane.WARNING_MESSAGE);
        } else {
            try {                
                String query = "INSERT INTO patient (patient_nik, patient_name, visit_date, diagnose, medicine, doctor, status) VALUES(\""
                        + txtNik.getText() + "\",\""
                        + txtName.getText() + "\",\""
                        + txtDate.getText() + "\",\""
                        + txtDiagnose.getText() + "\",\""
                        + "<Not Set>" + "\",\""
                        + "<Not Set>" + "\",\""
                        + "Requested"
                        + "\")";
                
                st = cn.createStatement();
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Request Telah Terkirim! Silahkan Cek Data Pasien!", "Data Request", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                
            } catch (SQLException ex) {
                Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
        
            }
            
        }
    }

    public void showData(){
        txtName.setText(dataLogin.getName());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmDoctor = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblNik = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDiagnose = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        pnlAdd = new javax.swing.JPanel();
        txtAdd = new javax.swing.JLabel();
        pnlNik = new javax.swing.JPanel();
        txtNik = new javax.swing.JTextField();
        pnlName = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        pnlDiagnose = new javax.swing.JPanel();
        txtDiagnose = new javax.swing.JTextField();
        pnlDate = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel6.setText("KONFIRMASI");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel7.setText("Masukkan Password");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        confirmDoctor.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmDoctor.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmDoctor.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmDoctor.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout confirmDoctorLayout = new javax.swing.GroupLayout(confirmDoctor);
        confirmDoctor.setLayout(confirmDoctorLayout);
        confirmDoctorLayout.setHorizontalGroup(
            confirmDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmDoctorLayout.createSequentialGroup()
                .addGroup(confirmDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmDoctorLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel6))
                    .addGroup(confirmDoctorLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel7))
                    .addGroup(confirmDoctorLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confirmDoctorLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        confirmDoctorLayout.setVerticalGroup(
            confirmDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmDoctorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REQUEST PENGOBATAN");
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTitle.setPreferredSize(new java.awt.Dimension(153, 25));
        lblTitle.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                lblTitleAncestorResized(evt);
            }
        });

        lblNik.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblNik.setText("NIK");

        lblName.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblName.setText("Nama");

        lblDiagnose.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblDiagnose.setText("Keluhan");

        lblDate.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblDate.setText("Tanggal Periksa");

        pnlAdd.setBackground(new java.awt.Color(0, 255, 153));
        pnlAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAdd.setPreferredSize(new java.awt.Dimension(100, 35));
        pnlAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlAddMouseReleased(evt);
            }
        });

        txtAdd.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdd.setText("REQUEST");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNik.setBackground(new java.awt.Color(255, 255, 255));
        pnlNik.setPreferredSize(new java.awt.Dimension(0, 35));

        txtNik.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNik.setBorder(null);
        txtNik.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNik.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNik.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });
        txtNik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addData(evt);
            }
        });

        javax.swing.GroupLayout pnlNikLayout = new javax.swing.GroupLayout(pnlNik);
        pnlNik.setLayout(pnlNikLayout);
        pnlNikLayout.setHorizontalGroup(
            pnlNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNik)
                .addContainerGap())
        );
        pnlNikLayout.setVerticalGroup(
            pnlNikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlName.setBackground(new java.awt.Color(255, 255, 255));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtName.setBorder(null);
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtName.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addData(evt);
            }
        });

        javax.swing.GroupLayout pnlNameLayout = new javax.swing.GroupLayout(pnlName);
        pnlName.setLayout(pnlNameLayout);
        pnlNameLayout.setHorizontalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNameLayout.setVerticalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlDiagnose.setBackground(new java.awt.Color(255, 255, 255));
        pnlDiagnose.setPreferredSize(new java.awt.Dimension(0, 35));

        txtDiagnose.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtDiagnose.setBorder(null);
        txtDiagnose.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDiagnose.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDiagnose.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtDiagnose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addData(evt);
            }
        });

        javax.swing.GroupLayout pnlDiagnoseLayout = new javax.swing.GroupLayout(pnlDiagnose);
        pnlDiagnose.setLayout(pnlDiagnoseLayout);
        pnlDiagnoseLayout.setHorizontalGroup(
            pnlDiagnoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiagnoseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiagnose)
                .addContainerGap())
        );
        pnlDiagnoseLayout.setVerticalGroup(
            pnlDiagnoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDiagnose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlDate.setBackground(new java.awt.Color(255, 255, 255));
        pnlDate.setPreferredSize(new java.awt.Dimension(285, 35));

        txtDate.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtDate.setBorder(null);
        txtDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDate.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDate.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addData(evt);
            }
        });

        javax.swing.GroupLayout pnlDateLayout = new javax.swing.GroupLayout(pnlDate);
        pnlDate.setLayout(pnlDateLayout);
        pnlDateLayout.setHorizontalGroup(
            pnlDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDateLayout.setVerticalGroup(
            pnlDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlNik, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(lblDiagnose)
                                .addComponent(lblName)
                                .addComponent(lblNik)
                                .addComponent(pnlDiagnose, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                            .addComponent(pnlDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblNik)
                .addGap(3, 3, 3)
                .addComponent(pnlNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(3, 3, 3)
                .addComponent(pnlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiagnose)
                .addGap(3, 3, 3)
                .addComponent(pnlDiagnose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Pasien Berhasil Ditambahkan! Silahkan Refresh!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikActionPerformed

    private void lblTitleAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_lblTitleAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitleAncestorResized

    private void pnlAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseEntered
        pnlAdd.setBackground(new java.awt.Color(0, 200, 100));
        
    }//GEN-LAST:event_pnlAddMouseEntered

    private void pnlAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseExited
        pnlAdd.setBackground(new java.awt.Color(0, 255, 153));
    }//GEN-LAST:event_pnlAddMouseExited

    private void pnlAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMousePressed
        pnlAdd.setBackground(new java.awt.Color(0, 200, 100));
    }//GEN-LAST:event_pnlAddMousePressed

    private void pnlAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseReleased
        pnlAdd.setBackground(new java.awt.Color(0, 255, 153));
    }//GEN-LAST:event_pnlAddMouseReleased

    private void pnlAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseClicked
        addData();
    }//GEN-LAST:event_pnlAddMouseClicked

    private void addData(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addData
        if(evt.getKeyCode() == 10){
            addData();
        }
    }//GEN-LAST:event_addData

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
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request(dataLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane confirmDoctor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiagnose;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNik;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlDate;
    private javax.swing.JPanel pnlDiagnose;
    private javax.swing.JPanel pnlName;
    private javax.swing.JPanel pnlNik;
    private javax.swing.JLabel txtAdd;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNik;
    // End of variables declaration//GEN-END:variables

    private Object ConnectionDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
