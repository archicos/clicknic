package mainpage;

import main.ConnectionDB;
import objects.User;
//import src.assets.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    Connection cn = ConnectionDB.connectDatabase();
    ResultSet rs;
    Statement st;
    
    public Login() {
        initComponents();
        this.setTitle("Login");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    public void verification(){
        boolean loginFailed = true;

        if (txtUsername.getText().equals("") || txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Isian terlebih dahulu!");
        } else {
            try {
                Statement stat = (Statement) ConnectionDB.connectDatabase().createStatement();
                String sql = "SELECT user_id, name, username, password, role FROM users";
                ResultSet rs = stat.executeQuery(sql);

                while(rs.next()){
                    if (rs.getString(3).equals(txtUsername.getText()) && rs.getString(4).equals(txtPassword.getText())){
                        
                        User dataLogin = new User();
                        dataLogin.setId(Integer.parseInt(rs.getString(1)));
                        dataLogin.setName(rs.getString(2));
                        dataLogin.setUsername(rs.getString(3));
                        dataLogin.setPassword(rs.getString(4));
                        dataLogin.setRole(rs.getString(5));
                        

//                        String dataLoginQuery = "INSERT INTO dataLogin (name, username, password, role) VALUES (\""
//                                + rs.getString(1) + "\",\""
//                                + rs.getString(2) + "\",\""
//                                + rs.getString(3) + "\",\""
//                                + rs.getString(4) + "\",\""
//                                + "\")";
//                        st = (Statement) cn.createStatement();
//                        st.execute(dataLoginQuery);
                        
                        loginFailed = false;
                        this.dispose();
                        new PatientPage(dataLogin).setVisible(true);
                    }
                }

                if(loginFailed){
                    JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(PatientPage.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Password atau Username salah!");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWrapper = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlLoginForm = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        pnlUsername = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        pnlPassword = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlWrapper.setLayout(null);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginLogo.png"))); // NOI18N
        pnlWrapper.add(lblLogo);
        lblLogo.setBounds(0, 0, 210, 480);

        pnlLoginForm.setBackground(new java.awt.Color(14, 220, 141));
        pnlLoginForm.setPreferredSize(new java.awt.Dimension(284, 480));
        pnlLoginForm.setLayout(null);

        lblUsername.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("Username");
        pnlLoginForm.add(lblUsername);
        lblUsername.setBounds(42, 167, 60, 15);

        lblPassword.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setText("Password");
        pnlLoginForm.add(lblPassword);
        lblPassword.setBounds(42, 226, 58, 15);

        lblSignUp.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(51, 51, 51));
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Belum punya akun? Daftar disini!");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignUpMouseExited(evt);
            }
        });
        lblSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblSignUpKeyPressed(evt);
            }
        });
        pnlLoginForm.add(lblSignUp);
        lblSignUp.setBounds(42, 339, 200, 15);

        pnlUsername.setBackground(new java.awt.Color(255, 255, 255));
        pnlUsername.setPreferredSize(new java.awt.Dimension(200, 36));

        txtUsername.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setBorder(null);
        txtUsername.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtUsername.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsernameLayout = new javax.swing.GroupLayout(pnlUsername);
        pnlUsername.setLayout(pnlUsernameLayout);
        pnlUsernameLayout.setHorizontalGroup(
            pnlUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlUsernameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlUsernameLayout.setVerticalGroup(
            pnlUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addGroup(pnlUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        pnlLoginForm.add(pnlUsername);
        pnlUsername.setBounds(42, 184, 200, 36);

        pnlPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlPassword.setPreferredSize(new java.awt.Dimension(100, 35));

        txtPassword.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPassword.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPasswordLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        pnlLoginForm.add(pnlPassword);
        pnlPassword.setBounds(42, 243, 200, 35);

        pnlLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlLogin.setToolTipText("MASUK");
        pnlLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLogin.setPreferredSize(new java.awt.Dimension(100, 25));
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLoginMouseExited(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Masuk");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        pnlLoginForm.add(pnlLogin);
        pnlLogin.setBounds(91, 296, 100, 25);

        pnlWrapper.add(pnlLoginForm);
        pnlLoginForm.setBounds(570, 0, 284, 480);

        lblDescription.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lblDescription.setText("With Click can Get All Support for Medic!");
        pnlWrapper.add(lblDescription);
        lblDescription.setBounds(30, 230, 330, 20);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logoBackground.png"))); // NOI18N
        lblBackground.setText("jLabel2");
        pnlWrapper.add(lblBackground);
        lblBackground.setBounds(-40, 0, 895, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSignUpKeyPressed
        new Register().setVisible(true);
    }//GEN-LAST:event_lblSignUpKeyPressed

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void pnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseClicked
        verification();
    }//GEN-LAST:event_pnlLoginMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void pnlLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseEntered
        pnlLogin.setBackground(new java.awt.Color(20, 20, 20));
    }//GEN-LAST:event_pnlLoginMouseEntered

    private void pnlLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseExited
        pnlLogin.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_pnlLoginMouseExited

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == 10){
            verification();
            pnlLogin.setBackground(new java.awt.Color(20, 20, 20));
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if(evt.getKeyCode() == 10){
            verification();
            pnlLogin.setBackground(new java.awt.Color(20, 20, 20));
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void lblSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseEntered
        lblSignUp.setFont(new java.awt.Font("Inter", 1, 12));
    }//GEN-LAST:event_lblSignUpMouseEntered

    private void lblSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseExited
        lblSignUp.setFont(new java.awt.Font("Inter", 0, 12));
    }//GEN-LAST:event_lblSignUpMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginForm;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlUsername;
    private javax.swing.JPanel pnlWrapper;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
