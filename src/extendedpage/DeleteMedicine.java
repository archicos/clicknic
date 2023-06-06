
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
public class DeleteMedicine extends javax.swing.JFrame {
    Connection cn = ConnectionDB.connectDatabase();
    Statement st;
    ResultSet rs;
    
    public DeleteMedicine() {
        initComponents();
        this.setTitle("Delete Medicine");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    public void findData(){
        if(txtRegNo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Nomor Registrasi Obat terlebih dahulu!", "Input Missing", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                st = cn.createStatement();
                rs = st.executeQuery("SELECT med_reg, med_name, med_type, med_date FROM medicine WHERE med_reg=\"" + txtRegNo.getText() + "\"");
                
                while(rs.next()){
                    txtRegNo.setText(rs.getString("med_reg"));
                    txtMedName.setText(rs.getString("med_name"));
                    txtMedDate.setText(rs.getString("med_date"));
                    txtMedType.setText(rs.getString("med_type"));
                }
                
                if(txtMedType.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Obat tidak terdaftar!", "Data Not Found", JOptionPane.WARNING_MESSAGE);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(DeleteMedicine.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titleDelete = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        txtDelete = new javax.swing.JLabel();
        pnlRegNo = new javax.swing.JPanel();
        txtRegNo = new javax.swing.JTextField();
        pnlMedName = new javax.swing.JPanel();
        txtMedName = new javax.swing.JTextField();
        pnlMedType = new javax.swing.JPanel();
        txtMedType = new javax.swing.JTextField();
        pnlMedDate = new javax.swing.JPanel();
        txtMedDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel6.setText("Nomor Registrasi Obat");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel3.setText("Nama Obat");
        jLabel3.setPreferredSize(null);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel4.setText("Tipe Obat");
        jLabel4.setPreferredSize(null);

        jLabel5.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel5.setText("Tanggal Ditambahkan");

        titleDelete.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        titleDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleDelete.setText("HAPUS OBAT");

        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
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

        pnlRegNo.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRegNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRegNoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlRegNoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlRegNoMouseReleased(evt);
            }
        });

        txtRegNo.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtRegNo.setBorder(null);
        txtRegNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRegNo.setPreferredSize(null);
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });
        txtRegNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegNoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlRegNoLayout = new javax.swing.GroupLayout(pnlRegNo);
        pnlRegNo.setLayout(pnlRegNoLayout);
        pnlRegNoLayout.setHorizontalGroup(
            pnlRegNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegNoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRegNoLayout.setVerticalGroup(
            pnlRegNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedName.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMedNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMedNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMedNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMedNameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMedNameMouseReleased(evt);
            }
        });

        txtMedName.setEditable(false);
        txtMedName.setBackground(new java.awt.Color(255, 255, 255));
        txtMedName.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedName.setBorder(null);
        txtMedName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedName.setPreferredSize(null);
        txtMedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMedNameLayout = new javax.swing.GroupLayout(pnlMedName);
        pnlMedName.setLayout(pnlMedNameLayout);
        pnlMedNameLayout.setHorizontalGroup(
            pnlMedNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMedNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMedNameLayout.setVerticalGroup(
            pnlMedNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedType.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMedTypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMedTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMedTypeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMedTypeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMedTypeMouseReleased(evt);
            }
        });

        txtMedType.setEditable(false);
        txtMedType.setBackground(new java.awt.Color(255, 255, 255));
        txtMedType.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedType.setBorder(null);
        txtMedType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedType.setPreferredSize(null);
        txtMedType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMedTypeLayout = new javax.swing.GroupLayout(pnlMedType);
        pnlMedType.setLayout(pnlMedTypeLayout);
        pnlMedTypeLayout.setHorizontalGroup(
            pnlMedTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMedTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMedTypeLayout.setVerticalGroup(
            pnlMedTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedType, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlMedDate.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMedDateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMedDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMedDateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMedDateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMedDateMouseReleased(evt);
            }
        });

        txtMedDate.setEditable(false);
        txtMedDate.setBackground(new java.awt.Color(255, 255, 255));
        txtMedDate.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtMedDate.setBorder(null);
        txtMedDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMedDate.setPreferredSize(null);
        txtMedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMedDateLayout = new javax.swing.GroupLayout(pnlMedDate);
        pnlMedDate.setLayout(pnlMedDateLayout);
        pnlMedDateLayout.setHorizontalGroup(
            pnlMedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMedDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMedDateLayout.setVerticalGroup(
            pnlMedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titleDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMedType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleDelete)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlMedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedTypeActionPerformed

    private void txtMedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedDateActionPerformed

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegNoActionPerformed

    private void txtMedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedNameActionPerformed

    private void pnlSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseClicked
        findData();
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
        if (txtRegNo.getText().equals("") || txtMedName.getText().equals("") || txtMedDate.getText().equals("") || txtMedType.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan Cari Data terlebih dahulu!", "Data Not Inputted", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String query = "DELETE FROM medicine WHERE med_reg=\"" + txtRegNo.getText() +"\"";
                st = cn.createStatement();
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus! Silahkan Refresh!", "Data Updated", JOptionPane.INFORMATION_MESSAGE);
                txtRegNo.setText("");
                txtMedName.setText("");
                txtMedType.setText("");
                txtMedDate.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(DeleteMedicine.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "SQL Exception", JOptionPane.ERROR_MESSAGE);
            }
            
            this.dispose();
        }
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

    private void txtRegNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNoKeyTyped
        txtMedName.setText("");
        txtMedDate.setText("");
        txtMedType.setText("");
    }//GEN-LAST:event_txtRegNoKeyTyped

    private void pnlRegNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegNoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRegNoMouseClicked

    private void pnlRegNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegNoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRegNoMouseEntered

    private void pnlRegNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegNoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRegNoMouseExited

    private void pnlRegNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegNoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRegNoMousePressed

    private void pnlRegNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegNoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRegNoMouseReleased

    private void pnlMedNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedNameMouseClicked

    private void pnlMedNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedNameMouseEntered

    private void pnlMedNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedNameMouseExited

    private void pnlMedNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedNameMousePressed

    private void pnlMedNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedNameMouseReleased

    private void pnlMedTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedTypeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedTypeMouseClicked

    private void pnlMedTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedTypeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedTypeMouseEntered

    private void pnlMedTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedTypeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedTypeMouseExited

    private void pnlMedTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedTypeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedTypeMousePressed

    private void pnlMedTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedTypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedTypeMouseReleased

    private void pnlMedDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedDateMouseClicked

    private void pnlMedDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedDateMouseEntered

    private void pnlMedDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedDateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedDateMouseExited

    private void pnlMedDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedDateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedDateMousePressed

    private void pnlMedDateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMedDateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlMedDateMouseReleased

    private void txtRegNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNoKeyPressed
        if(evt.getKeyCode() == 10){
            findData();
        }
    }//GEN-LAST:event_txtRegNoKeyPressed
    
    private void showresult(ResultSet rs){
        try {
            txtMedName.setText(rs.getString(1));
            txtMedType.setText(rs.getString(2));
            txtMedDate.setText(rs.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(DeleteMedicine.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlMedDate;
    private javax.swing.JPanel pnlMedName;
    private javax.swing.JPanel pnlMedType;
    private javax.swing.JPanel pnlRegNo;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JLabel titleDelete;
    private javax.swing.JLabel txtDelete;
    private javax.swing.JTextField txtMedDate;
    private javax.swing.JTextField txtMedName;
    private javax.swing.JTextField txtMedType;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JLabel txtSearch;
    // End of variables declaration//GEN-END:variables
}
