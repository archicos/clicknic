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

public class AddMedicine extends javax.swing.JFrame {

    private static User dataLogin;
    
    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    public AddMedicine(User dataLogin) {
        this.dataLogin = dataLogin;
        initComponents();
        this.setTitle("Add Medicine");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    public void addData(){
        if(txtRegNo.getText().equals("") || txtMedName.getText().equals("") || txtMedType.getText().equals("") || txtMedDate.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Isian terlebih dahulu!", "Data Form Empty", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String query = "INSERT INTO medicine (med_reg, med_name, med_type, med_date, pharmacist) VALUES(\""
                        + txtRegNo.getText() + "\",\""
                        + txtMedName.getText() + "\",\""
                        + txtMedType.getText() + "\",\""
                        + txtMedDate.getText() + "\",\""
                        + "apt." + dataLogin.getName() + ", S.Farm"
                        + "\")";
                st = cn.createStatement();
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Obat berhasil ditambahkan! Silahkan Refresh!", "Data Addition", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                
            } catch (SQLException ex) {
                Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, null, ex);
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
        pnlRegNo = new javax.swing.JPanel();
        txtRegNo = new javax.swing.JTextField();
        pnlMedName = new javax.swing.JPanel();
        txtMedName = new javax.swing.JTextField();
        pnlMedType = new javax.swing.JPanel();
        txtMedType = new javax.swing.JTextField();
        pnlMedDate = new javax.swing.JPanel();
        txtMedDate = new javax.swing.JTextField();

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
        lblTitle.setText("TAMBAH OBAT");
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
        lblRegNo.setText("Nomor Registrasi Obat");

        lblMedName.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedName.setText("Nama Obat");

        lblMedType.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedType.setText("Tipe Obat");

        lblMedDate.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblMedDate.setText("Tanggal Ditambahkan");

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
        txtAdd.setText("TAMBAH");

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

        pnlRegNo.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegNo.setPreferredSize(new java.awt.Dimension(0, 35));

        txtRegNo.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtRegNo.setBorder(null);
        txtRegNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRegNo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtRegNo.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });
        txtRegNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        javax.swing.GroupLayout pnlRegNoLayout = new javax.swing.GroupLayout(pnlRegNo);
        pnlRegNo.setLayout(pnlRegNoLayout);
        pnlRegNoLayout.setHorizontalGroup(
            pnlRegNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegNoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegNo)
                .addContainerGap())
        );
        pnlRegNoLayout.setVerticalGroup(
            pnlRegNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedName.setBackground(new java.awt.Color(255, 255, 255));

        txtMedName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedName.setBorder(null);
        txtMedName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMedName.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtMedName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        javax.swing.GroupLayout pnlMedNameLayout = new javax.swing.GroupLayout(pnlMedName);
        pnlMedName.setLayout(pnlMedNameLayout);
        pnlMedNameLayout.setHorizontalGroup(
            pnlMedNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMedNameLayout.setVerticalGroup(
            pnlMedNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedType.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedType.setPreferredSize(new java.awt.Dimension(0, 35));

        txtMedType.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedType.setBorder(null);
        txtMedType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedType.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMedType.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtMedType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        javax.swing.GroupLayout pnlMedTypeLayout = new javax.swing.GroupLayout(pnlMedType);
        pnlMedType.setLayout(pnlMedTypeLayout);
        pnlMedTypeLayout.setHorizontalGroup(
            pnlMedTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedType)
                .addContainerGap())
        );
        pnlMedTypeLayout.setVerticalGroup(
            pnlMedTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedDate.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedDate.setPreferredSize(new java.awt.Dimension(0, 35));

        txtMedDate.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedDate.setBorder(null);
        txtMedDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedDate.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMedDate.setSelectionColor(new java.awt.Color(0, 255, 153));
        txtMedDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        javax.swing.GroupLayout pnlMedDateLayout = new javax.swing.GroupLayout(pnlMedDate);
        pnlMedDate.setLayout(pnlMedDateLayout);
        pnlMedDateLayout.setHorizontalGroup(
            pnlMedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMedDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedDate)
                .addContainerGap())
        );
        pnlMedDateLayout.setVerticalGroup(
            pnlMedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
                            .addComponent(pnlMedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(lblMedDate)
                            .addComponent(lblMedType)
                            .addComponent(lblMedName)
                            .addComponent(lblRegNo)
                            .addComponent(pnlMedType, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(pnlMedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
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
                .addComponent(pnlRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedName)
                .addGap(3, 3, 3)
                .addComponent(pnlMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedType)
                .addGap(3, 3, 3)
                .addComponent(pnlMedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegNoActionPerformed

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

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
        if(evt.getKeyCode() == 10){
            addData();
        }
    }//GEN-LAST:event_enter

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine(dataLogin).setVisible(true);
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
    private javax.swing.JPanel pnlMedDate;
    private javax.swing.JPanel pnlMedName;
    private javax.swing.JPanel pnlMedType;
    private javax.swing.JPanel pnlRegNo;
    private javax.swing.JLabel txtAdd;
    private javax.swing.JTextField txtMedDate;
    private javax.swing.JTextField txtMedName;
    private javax.swing.JTextField txtMedType;
    private javax.swing.JTextField txtRegNo;
    // End of variables declaration//GEN-END:variables

    private Object ConnectionDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
