package extendedpage;

import main.ConnectionDB;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DeletePatient extends javax.swing.JFrame {
    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    public DeletePatient() {
        initComponents();
        this.setTitle("Delete Patient");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    public void deleteData(){
        if (txtNik.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan Cari Data terlebih dahulu!", "Data Not Inputted", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String query = "DELETE FROM patient WHERE patient_nik=\"" + txtNik.getText() +"\"";
                st = cn.createStatement();
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus! Silahkan Refresh!", "Data Updated", JOptionPane.INFORMATION_MESSAGE);
                txtNik.setText("");
                txtName.setText("");
                txtDiagnose.setText("");
                txtMedicine.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(DeletePatient.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
            }
            
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titleDelete = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        txtDelete = new javax.swing.JLabel();
        pnlNik = new javax.swing.JPanel();
        txtNik = new javax.swing.JTextField();
        pnlNik1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        pnlNik2 = new javax.swing.JPanel();
        txtDiagnose = new javax.swing.JTextField();
        pnlNik4 = new javax.swing.JPanel();
        txtMedicine = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel2.setText("NIK");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pasien");

        jLabel4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel4.setText("Diagnosa Penyakit");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel5.setText("Penanganan Obat");

        titleDelete.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        titleDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleDelete.setText("HAPUS PASIEN");

        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearch.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSearchMouseReleased(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSearch.setText("CARI");
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSearch.setPreferredSize(new java.awt.Dimension(54, 35));

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        pnlDelete.setBackground(new java.awt.Color(255, 0, 0));
        pnlDelete.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDeleteMouseReleased(evt);
            }
        });

        txtDelete.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDelete.setText("HAPUS");
        txtDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDelete.setPreferredSize(new java.awt.Dimension(54, 35));

        javax.swing.GroupLayout pnlDeleteLayout = new javax.swing.GroupLayout(pnlDelete);
        pnlDelete.setLayout(pnlDeleteLayout);
        pnlDeleteLayout.setHorizontalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDeleteLayout.setVerticalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlNik.setBackground(new java.awt.Color(255, 255, 255));
        pnlNik.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlNik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNikMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNikMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNikMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNikMouseReleased(evt);
            }
        });

        txtNik.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNik.setBorder(null);
        txtNik.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNik.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNik.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });
        txtNik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteData(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNikKeyTyped(evt);
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
            .addComponent(txtNik, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNik1.setBackground(new java.awt.Color(255, 255, 255));
        pnlNik1.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlNik1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNik1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNik1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNik1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNik1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNik1MouseReleased(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtName.setBorder(null);
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtName.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNik1Layout = new javax.swing.GroupLayout(pnlNik1);
        pnlNik1.setLayout(pnlNik1Layout);
        pnlNik1Layout.setHorizontalGroup(
            pnlNik1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNik1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName)
                .addContainerGap())
        );
        pnlNik1Layout.setVerticalGroup(
            pnlNik1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNik2.setBackground(new java.awt.Color(255, 255, 255));
        pnlNik2.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlNik2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNik2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNik2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNik2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNik2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNik2MouseReleased(evt);
            }
        });

        txtDiagnose.setEditable(false);
        txtDiagnose.setBackground(new java.awt.Color(255, 255, 255));
        txtDiagnose.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtDiagnose.setBorder(null);
        txtDiagnose.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDiagnose.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDiagnose.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnoseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNik2Layout = new javax.swing.GroupLayout(pnlNik2);
        pnlNik2.setLayout(pnlNik2Layout);
        pnlNik2Layout.setHorizontalGroup(
            pnlNik2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNik2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiagnose)
                .addContainerGap())
        );
        pnlNik2Layout.setVerticalGroup(
            pnlNik2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDiagnose, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlNik4.setBackground(new java.awt.Color(255, 255, 255));
        pnlNik4.setPreferredSize(new java.awt.Dimension(54, 35));
        pnlNik4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNik4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNik4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNik4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNik4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNik4MouseReleased(evt);
            }
        });

        txtMedicine.setEditable(false);
        txtMedicine.setBackground(new java.awt.Color(255, 255, 255));
        txtMedicine.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedicine.setBorder(null);
        txtMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedicine.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMedicine.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNik4Layout = new javax.swing.GroupLayout(pnlNik4);
        pnlNik4.setLayout(pnlNik4Layout);
        pnlNik4Layout.setHorizontalGroup(
            pnlNik4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNik4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedicine)
                .addContainerGap())
        );
        pnlNik4Layout.setVerticalGroup(
            pnlNik4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(pnlNik, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(pnlNik1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(pnlNik2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(pnlNik4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleDelete)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(pnlNik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(pnlNik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(pnlNik4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnoseActionPerformed

    private void txtMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void pnlSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseClicked
        if(txtNik.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan NIK terlebih dahulu!", "Input Missing", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                st = cn.createStatement();
                rs = st.executeQuery("SELECT patient_name, diagnose, medicine FROM patient WHERE patient_nik=\"" + txtNik.getText() + "\"");
                
                while(rs.next()){
                    txtName.setText(rs.getString("patient_name"));
                    txtDiagnose.setText(rs.getString("diagnose"));
                    txtMedicine.setText(rs.getString("medicine"));
                }
                
                if(txtDiagnose.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "NIK tidak terdaftar!", "NIK Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(DeletePatient.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pnlSearchMouseClicked

    private void pnlSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseEntered
        pnlSearch.setBackground(new java.awt.Color(225, 225, 225));
    }//GEN-LAST:event_pnlSearchMouseEntered

    private void pnlSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseExited
        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pnlSearchMouseExited

    private void pnlSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMousePressed
        pnlSearch.setBackground(new java.awt.Color(225, 225, 225));
    }//GEN-LAST:event_pnlSearchMousePressed

    private void pnlSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseReleased
        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pnlSearchMouseReleased

    private void pnlDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseClicked
        deleteData();
    }//GEN-LAST:event_pnlDeleteMouseClicked

    private void pnlDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseEntered
        pnlDelete.setBackground(new java.awt.Color(200, 0, 0));
    }//GEN-LAST:event_pnlDeleteMouseEntered

    private void pnlDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseExited
        pnlDelete.setBackground(new java.awt.Color(250, 0, 0));
    }//GEN-LAST:event_pnlDeleteMouseExited

    private void pnlDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMousePressed
        pnlDelete.setBackground(new java.awt.Color(200, 0, 0));
    }//GEN-LAST:event_pnlDeleteMousePressed

    private void pnlDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseReleased
        pnlDelete.setBackground(new java.awt.Color(250, 0, 0));
    }//GEN-LAST:event_pnlDeleteMouseReleased

    private void txtNikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNikKeyTyped
        txtName.setText("");
        txtMedicine.setText("");
        txtDiagnose.setText("");
    }//GEN-LAST:event_txtNikKeyTyped

    private void pnlNikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNikMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNikMouseClicked

    private void pnlNikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNikMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNikMouseEntered

    private void pnlNikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNikMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNikMouseExited

    private void pnlNikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNikMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNikMousePressed

    private void pnlNikMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNikMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNikMouseReleased

    private void pnlNik1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik1MouseClicked

    private void pnlNik1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik1MouseEntered

    private void pnlNik1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik1MouseExited

    private void pnlNik1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik1MousePressed

    private void pnlNik1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik1MouseReleased

    private void pnlNik2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik2MouseClicked

    private void pnlNik2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik2MouseEntered

    private void pnlNik2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik2MouseExited

    private void pnlNik2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik2MousePressed

    private void pnlNik2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik2MouseReleased

    private void pnlNik4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik4MouseClicked

    private void pnlNik4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik4MouseEntered

    private void pnlNik4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik4MouseExited

    private void pnlNik4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik4MousePressed

    private void pnlNik4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNik4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlNik4MouseReleased

    private void deleteData(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteData
        if(evt.getKeyCode() == 10){
            deleteData();
        }
    }//GEN-LAST:event_deleteData
    
    private void showresult(ResultSet rs){
        try {
            txtName.setText(rs.getString(1));
            txtDiagnose.setText(rs.getString(2));
            txtMedicine.setText(rs.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(DeletePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlNik;
    private javax.swing.JPanel pnlNik1;
    private javax.swing.JPanel pnlNik2;
    private javax.swing.JPanel pnlNik4;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JLabel titleDelete;
    private javax.swing.JLabel txtDelete;
    private javax.swing.JTextField txtDiagnose;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNik;
    private javax.swing.JLabel txtSearch;
    // End of variables declaration//GEN-END:variables
}
