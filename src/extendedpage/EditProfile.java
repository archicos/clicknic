package extendedpage;

import main.ConnectionDB;
import mainpage.PatientPage;
import mainpage.Login;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditProfile extends javax.swing.JFrame {

    private static User dataLogin;
    boolean backToLogin = true;
    
    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    public EditProfile(User dataLogin) {
        this.dataLogin = dataLogin;
        initComponents();
        this.setTitle("Update Profile");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    public void updateProfile(){
        if(txtNewName.getText().equals("") || txtNewUsername.getText().equals("") || txtNewPassword.getText().equals("") || txtOldPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Isian terlebih dahulu!", "Data Form Empty", JOptionPane.WARNING_MESSAGE);
        } else if (!txtOldPassword.getText().equals(dataLogin.getPassword())) {
            JOptionPane.showMessageDialog(null, "Password salah!", "Authentication", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String query = "UPDATE users SET name=\"" + txtNewName.getText() + "\",username=\"" + txtNewUsername.getText() + "\", password=\"" + txtNewPassword.getText() + "\" WHERE user_id=" + dataLogin.getId();
                st = cn.createStatement();
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Data berhasil diperbaharui! Silahkan Login Kembali!", "Profile Update", JOptionPane.INFORMATION_MESSAGE);
                backToLogin = false;
                this.dispose();
                new Login().setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
        
            }
            
        }
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
        lblRegNo = new javax.swing.JLabel();
        lblMedName = new javax.swing.JLabel();
        lblMedType = new javax.swing.JLabel();
        lblMedDate = new javax.swing.JLabel();
        pnlAdd = new javax.swing.JPanel();
        txtAdd = new javax.swing.JLabel();
        pnlNewName = new javax.swing.JPanel();
        txtNewName = new javax.swing.JTextField();
        pnlNewUsername = new javax.swing.JPanel();
        txtNewUsername = new javax.swing.JTextField();
        pnlNewPassword = new javax.swing.JPanel();
        txtNewPassword = new javax.swing.JPasswordField();
        pnlOldPassword = new javax.swing.JPanel();
        txtOldPassword = new javax.swing.JPasswordField();

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
        setTitle("Profile Update");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                reLogin(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("UPDATE PROFIL");
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTitle.setPreferredSize(new java.awt.Dimension(153, 25));
        lblTitle.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                lblTitleAncestorResized(evt);
            }
        });

        lblRegNo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblRegNo.setText("Nama");

        lblMedName.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedName.setText("Username");

        lblMedType.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedType.setText("Password Baru");

        lblMedDate.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedDate.setText("Password Lama");

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
        txtAdd.setText("UBAH");

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

        pnlNewName.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewName.setPreferredSize(new java.awt.Dimension(0, 35));

        txtNewName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNewName.setBorder(null);
        txtNewName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNewName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNewName.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtNewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewNameActionPerformed(evt);
            }
        });
        txtNewName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateProfile(evt);
            }
        });

        javax.swing.GroupLayout pnlNewNameLayout = new javax.swing.GroupLayout(pnlNewName);
        pnlNewName.setLayout(pnlNewNameLayout);
        pnlNewNameLayout.setHorizontalGroup(
            pnlNewNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNewName)
                .addContainerGap())
        );
        pnlNewNameLayout.setVerticalGroup(
            pnlNewNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNewName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNewUsername.setBackground(new java.awt.Color(255, 255, 255));

        txtNewUsername.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNewUsername.setBorder(null);
        txtNewUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNewUsername.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNewUsername.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtNewUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateProfile(evt);
            }
        });

        javax.swing.GroupLayout pnlNewUsernameLayout = new javax.swing.GroupLayout(pnlNewUsername);
        pnlNewUsername.setLayout(pnlNewUsernameLayout);
        pnlNewUsernameLayout.setHorizontalGroup(
            pnlNewUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNewUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNewUsernameLayout.setVerticalGroup(
            pnlNewUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNewUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewPassword.setPreferredSize(new java.awt.Dimension(0, 35));

        txtNewPassword.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNewPassword.setBorder(null);
        txtNewPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNewPassword.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateProfile(evt);
            }
        });

        javax.swing.GroupLayout pnlNewPasswordLayout = new javax.swing.GroupLayout(pnlNewPassword);
        pnlNewPassword.setLayout(pnlNewPasswordLayout);
        pnlNewPasswordLayout.setHorizontalGroup(
            pnlNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNewPassword)
                .addContainerGap())
        );
        pnlNewPasswordLayout.setVerticalGroup(
            pnlNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlOldPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlOldPassword.setPreferredSize(new java.awt.Dimension(0, 35));

        txtOldPassword.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtOldPassword.setBorder(null);
        txtOldPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtOldPassword.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateProfile(evt);
            }
        });

        javax.swing.GroupLayout pnlOldPasswordLayout = new javax.swing.GroupLayout(pnlOldPassword);
        pnlOldPassword.setLayout(pnlOldPasswordLayout);
        pnlOldPasswordLayout.setHorizontalGroup(
            pnlOldPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOldPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOldPassword)
                .addContainerGap())
        );
        pnlOldPasswordLayout.setVerticalGroup(
            pnlOldPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlNewUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlNewName, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(lblMedDate)
                            .addComponent(lblMedType)
                            .addComponent(lblMedName)
                            .addComponent(lblRegNo)
                            .addComponent(pnlNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(pnlOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRegNo)
                .addGap(3, 3, 3)
                .addComponent(pnlNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedName)
                .addGap(3, 3, 3)
                .addComponent(pnlNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedType)
                .addGap(3, 3, 3)
                .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Pasien Berhasil Ditambahkan!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNameActionPerformed

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
        updateProfile();
    }//GEN-LAST:event_pnlAddMouseClicked

    private void reLogin(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_reLogin
        if(backToLogin){
            this.dispose();
            new PatientPage(dataLogin).setVisible(true);
        } else {
            backToLogin = true;
        }
        
    }//GEN-LAST:event_reLogin

    private void updateProfile(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateProfile
        updateProfile();
    }//GEN-LAST:event_updateProfile

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile(dataLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane confirmDoctor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblMedDate;
    private javax.swing.JLabel lblMedName;
    private javax.swing.JLabel lblMedType;
    private javax.swing.JLabel lblRegNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlNewName;
    private javax.swing.JPanel pnlNewPassword;
    private javax.swing.JPanel pnlNewUsername;
    private javax.swing.JPanel pnlOldPassword;
    private javax.swing.JLabel txtAdd;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables

    private Object ConnectionDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
