package mainpage;

import main.ConnectionDB;
import java.sql.*;
import java.awt.*;
import static main.ErrorMessage.errorMessage;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    int indexDokter = 002;
    int indexApoteker = 002;
    
    public Register() {
        initComponents();
        this.setTitle("Register");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));

    }
    
    public void registerVerification(){
        boolean usernameExist = false;
        
        if (txtName.getText().equals("") && txtUsername.getText().equals("") && txtPassword.getText().equals("") && txtPasswordConfirm.getText().equals("") && comboRole.getSelectedItem().equals("--Pilih--")) {
            JOptionPane.showMessageDialog(null, "Lengkapi Isian terlebih dahulu!");
        } else {
            String role = "Not Set";
            if (comboRole.getSelectedItem().equals("Dokter")) {
                role = "Dokter";
            } else if (comboRole.getSelectedItem().equals("Apoteker")) {
                role = "Apoteker";
            } else if (comboRole.getSelectedItem().equals("Pasien")) {
                role = "Pasien";
            }
            
            String idHead = "";
            if(role.equals("Dokter")){
                idHead.equals("DOC-");
            } else if (role.equals("Apoteker")){
                idHead.equals("APT-");
            } else if (role.equals("Pasien")){
                idHead.equals("PTN-");
            }
            
            try {
                String check = "SELECT * FROM users WHERE username=\"" + txtUsername.getText() + "\"";
                
                st = cn.createStatement();
                rs = st.executeQuery(check);
                
                if(rs.next()){
                    usernameExist = true;
                }
                
                String sql = "INSERT INTO users (name, username, password, role) VALUES (\""
                        + txtName.getText() + "\",\""
                        + txtUsername.getText() + "\",\""
                        + txtPassword.getText() + "\",\""
                        + role
                        + "\")";
                
                if(!usernameExist){
                    Connection conn = (Connection) ConnectionDB.connectDatabase();
                    PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Register berhasil!", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Username sudah terdaftar!", "Register Information", JOptionPane.WARNING_MESSAGE);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWrapper = new javax.swing.JPanel();
        pnlRegisterForm = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPasswordConfirm = new javax.swing.JLabel();
        lblPosisi = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        pnlname = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        pnlUsername = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        pnlPasswordConfirm = new javax.swing.JPanel();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        pnlPassword = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        pnlRegister = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        lblToLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlWrapper.setPreferredSize(new java.awt.Dimension(854, 480));
        pnlWrapper.setLayout(null);

        pnlRegisterForm.setBackground(new java.awt.Color(14, 220, 141));
        pnlRegisterForm.setPreferredSize(new java.awt.Dimension(284, 480));

        lblUsername.setBackground(new java.awt.Color(225, 225, 225));
        lblUsername.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("Username");

        lblPassword.setBackground(new java.awt.Color(225, 225, 225));
        lblPassword.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setText("Password");

        lblName.setBackground(new java.awt.Color(225, 225, 225));
        lblName.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("Nama");

        lblPasswordConfirm.setBackground(new java.awt.Color(225, 225, 225));
        lblPasswordConfirm.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblPasswordConfirm.setForeground(new java.awt.Color(51, 51, 51));
        lblPasswordConfirm.setText("Konfirmasi Password");

        lblPosisi.setBackground(new java.awt.Color(225, 225, 225));
        lblPosisi.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblPosisi.setForeground(new java.awt.Color(51, 51, 51));
        lblPosisi.setText("Posisi");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Pasien", "Dokter", "Apoteker" }));
        comboRole.setBorder(null);
        comboRole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboRole.setPreferredSize(new java.awt.Dimension(200, 36));

        pnlname.setBackground(new java.awt.Color(255, 255, 255));
        pnlname.setPreferredSize(new java.awt.Dimension(200, 35));

        txtName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setBorder(null);
        txtName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtName.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        javax.swing.GroupLayout pnlnameLayout = new javax.swing.GroupLayout(pnlname);
        pnlname.setLayout(pnlnameLayout);
        pnlnameLayout.setHorizontalGroup(
            pnlnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName)
                .addContainerGap())
        );
        pnlnameLayout.setVerticalGroup(
            pnlnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlUsername.setBackground(new java.awt.Color(255, 255, 255));
        pnlUsername.setPreferredSize(new java.awt.Dimension(200, 35));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsername)
                .addContainerGap())
        );
        pnlUsernameLayout.setVerticalGroup(
            pnlUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlPasswordConfirm.setBackground(new java.awt.Color(255, 255, 255));
        pnlPasswordConfirm.setPreferredSize(new java.awt.Dimension(200, 35));

        txtPasswordConfirm.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtPasswordConfirm.setBorder(null);
        txtPasswordConfirm.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPasswordConfirm.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtPasswordConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordConfirmLayout = new javax.swing.GroupLayout(pnlPasswordConfirm);
        pnlPasswordConfirm.setLayout(pnlPasswordConfirmLayout);
        pnlPasswordConfirmLayout.setHorizontalGroup(
            pnlPasswordConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPasswordConfirm)
                .addContainerGap())
        );
        pnlPasswordConfirmLayout.setVerticalGroup(
            pnlPasswordConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlPassword.setPreferredSize(new java.awt.Dimension(200, 35));

        txtPassword.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPassword.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword)
                .addContainerGap())
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlRegister.setBackground(new java.awt.Color(51, 51, 51));
        pnlRegister.setToolTipText("MASUK");
        pnlRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegister.setPreferredSize(new java.awt.Dimension(100, 25));
        pnlRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRegisterMouseExited(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Daftar");

        javax.swing.GroupLayout pnlRegisterLayout = new javax.swing.GroupLayout(pnlRegister);
        pnlRegister.setLayout(pnlRegisterLayout);
        pnlRegisterLayout.setHorizontalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlRegisterLayout.setVerticalGroup(
            pnlRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        lblToLogin.setBackground(new java.awt.Color(225, 225, 225));
        lblToLogin.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        lblToLogin.setForeground(new java.awt.Color(51, 51, 51));
        lblToLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToLogin.setText("Sudah punya akun? Masuk!");
        lblToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblToLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblToLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblToLoginMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");

        javax.swing.GroupLayout pnlRegisterFormLayout = new javax.swing.GroupLayout(pnlRegisterForm);
        pnlRegisterForm.setLayout(pnlRegisterFormLayout);
        pnlRegisterFormLayout.setHorizontalGroup(
            pnlRegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterFormLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlRegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPosisi)
                    .addComponent(lblName)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword)
                    .addComponent(lblPasswordConfirm)
                    .addComponent(pnlPasswordConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRegisterFormLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblToLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        pnlRegisterFormLayout.setVerticalGroup(
            pnlRegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addGap(2, 2, 2)
                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswordConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPosisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pnlWrapper.add(pnlRegisterForm);
        pnlRegisterForm.setBounds(570, 0, 284, 480);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginLogo.png"))); // NOI18N
        pnlWrapper.add(lblLogo);
        lblLogo.setBounds(0, 0, 210, 480);

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
            .addComponent(pnlWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void lblToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblToLoginMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_lblToLoginMouseClicked

    private void pnlRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegisterMouseClicked
        registerVerification();
    }//GEN-LAST:event_pnlRegisterMouseClicked

    private void pnlRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegisterMouseEntered
        pnlRegister.setBackground(new java.awt.Color(20, 20, 20));
    }//GEN-LAST:event_pnlRegisterMouseEntered

    private void pnlRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegisterMouseExited
        pnlRegister.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_pnlRegisterMouseExited

    private void lblToLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblToLoginMouseEntered
        lblToLogin.setFont(new java.awt.Font("Inter", 1, 12));
    }//GEN-LAST:event_lblToLoginMouseEntered

    private void lblToLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblToLoginMouseExited
        lblToLogin.setFont(new java.awt.Font("Inter", 0, 12));
    }//GEN-LAST:event_lblToLoginMouseExited

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
        if(evt.getKeyCode() == 10){
            registerVerification();
        }
    }//GEN-LAST:event_enter

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if(evt.getKeyCode() == 10){
            registerVerification();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed


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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordConfirm;
    private javax.swing.JLabel lblPosisi;
    private javax.swing.JLabel lblRegister;
    public javax.swing.JLabel lblToLogin;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlPasswordConfirm;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JPanel pnlRegisterForm;
    private javax.swing.JPanel pnlUsername;
    private javax.swing.JPanel pnlWrapper;
    private javax.swing.JPanel pnlname;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
