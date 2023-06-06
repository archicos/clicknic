package mainpage;

import extendedpage.AddMedicine;
import main.ConnectionDB;
import extendedpage.DeleteMedicine;
import extendedpage.EditProfile;
import extendedpage.Request;
import extendedpage.UpdateMedicine;
import objects.Medicine;
import objects.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicinePage extends javax.swing.JFrame {
    
    private static User dataLogin;
    
    public MedicinePage(User dataLogin) {
        this.dataLogin = dataLogin;
        initComponents();
        showTable();
        this.setTitle("ClickNic");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/windowIcon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        pnlProfile = new javax.swing.JPanel();
        pnlRefresh = new javax.swing.JPanel();
        txtRefresh = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        txtLogout = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        pnlUpdateProfile = new javax.swing.JPanel();
        lblUpdateProfile = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        pnlToPatient = new javax.swing.JPanel();
        lblToPatient = new javax.swing.JLabel();
        pnlToMedicine = new javax.swing.JPanel();
        lblToMedicine = new javax.swing.JLabel();
        pnlToRequest = new javax.swing.JPanel();
        lblToRequest = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicine = new javax.swing.JTable();
        pnlAdd = new javax.swing.JPanel();
        txtAdd = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        txtDelete = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cmbCari = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        pnlMenu.setBackground(new java.awt.Color(0, 255, 153));
        pnlMenu.setAlignmentX(0.0F);
        pnlMenu.setAlignmentY(0.0F);
        pnlMenu.setPreferredSize(new java.awt.Dimension(280, 680));

        pnlProfile.setBackground(new java.awt.Color(51, 51, 51));
        pnlProfile.setAlignmentX(0.0F);
        pnlProfile.setAlignmentY(0.0F);
        pnlProfile.setPreferredSize(new java.awt.Dimension(280, 280));
        pnlProfile.setLayout(null);

        pnlRefresh.setBackground(new java.awt.Color(255, 255, 255));
        pnlRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRefresh.setPreferredSize(new java.awt.Dimension(130, 37));
        pnlRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRefreshMouseExited(evt);
            }
        });

        txtRefresh.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRefresh.setLabelFor(pnlDelete);
        txtRefresh.setText("Refresh");
        txtRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlRefreshLayout = new javax.swing.GroupLayout(pnlRefresh);
        pnlRefresh.setLayout(pnlRefreshLayout);
        pnlRefreshLayout.setHorizontalGroup(
            pnlRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlRefreshLayout.setVerticalGroup(
            pnlRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlProfile.add(pnlRefresh);
        pnlRefresh.setBounds(10, 190, 100, 30);

        pnlLogout.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLogout.setPreferredSize(new java.awt.Dimension(130, 37));
        pnlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseExited(evt);
            }
        });

        txtLogout.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogout.setLabelFor(pnlAdd);
        txtLogout.setText("Logout");

        javax.swing.GroupLayout pnlLogoutLayout = new javax.swing.GroupLayout(pnlLogout);
        pnlLogout.setLayout(pnlLogoutLayout);
        pnlLogoutLayout.setHorizontalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlLogoutLayout.setVerticalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlProfile.add(pnlLogout);
        pnlLogout.setBounds(120, 190, 100, 30);

        lblWelcome.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Halo, " + dataLogin.getName() + "!");
        pnlProfile.add(lblWelcome);
        lblWelcome.setBounds(10, 90, 210, 15);

        lblRole.setFont(new java.awt.Font("Inter", 2, 12)); // NOI18N
        lblRole.setForeground(new java.awt.Color(0, 255, 153));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Role : " + dataLogin.getRole());
        pnlProfile.add(lblRole);
        lblRole.setBounds(10, 110, 210, 15);

        pnlUpdateProfile.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpdateProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlUpdateProfile.setPreferredSize(new java.awt.Dimension(100, 30));
        pnlUpdateProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUpdateProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlUpdateProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlUpdateProfileMouseExited(evt);
            }
        });

        lblUpdateProfile.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblUpdateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateProfile.setText("Update Profile");

        javax.swing.GroupLayout pnlUpdateProfileLayout = new javax.swing.GroupLayout(pnlUpdateProfile);
        pnlUpdateProfile.setLayout(pnlUpdateProfileLayout);
        pnlUpdateProfileLayout.setHorizontalGroup(
            pnlUpdateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUpdateProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlUpdateProfileLayout.setVerticalGroup(
            pnlUpdateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlProfile.add(pnlUpdateProfile);
        pnlUpdateProfile.setBounds(10, 150, 210, 30);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/titleLogo.png"))); // NOI18N
        pnlProfile.add(lblLogo);
        lblLogo.setBounds(10, 30, 210, 40);

        pnlToPatient.setBackground(new java.awt.Color(153, 255, 204));
        pnlToPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlToPatient.setPreferredSize(new java.awt.Dimension(210, 100));
        pnlToPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlToPatientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlToPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlToPatientMouseExited(evt);
            }
        });

        lblToPatient.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblToPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToPatient.setText("DATA PASIEN");

        javax.swing.GroupLayout pnlToPatientLayout = new javax.swing.GroupLayout(pnlToPatient);
        pnlToPatient.setLayout(pnlToPatientLayout);
        pnlToPatientLayout.setHorizontalGroup(
            pnlToPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(pnlToPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlToPatientLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblToPatient)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlToPatientLayout.setVerticalGroup(
            pnlToPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(pnlToPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlToPatientLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblToPatient)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlToMedicine.setBackground(new java.awt.Color(255, 255, 255));
        pnlToMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlToMedicine.setPreferredSize(new java.awt.Dimension(210, 100));

        lblToMedicine.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblToMedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToMedicine.setText("DATA OBAT");

        javax.swing.GroupLayout pnlToMedicineLayout = new javax.swing.GroupLayout(pnlToMedicine);
        pnlToMedicine.setLayout(pnlToMedicineLayout);
        pnlToMedicineLayout.setHorizontalGroup(
            pnlToMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlToMedicineLayout.setVerticalGroup(
            pnlToMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlToRequest.setBackground(new java.awt.Color(153, 255, 204));
        pnlToRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlToRequest.setPreferredSize(new java.awt.Dimension(210, 100));
        pnlToRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlToRequestMouseClicked(evt);
            }
        });

        lblToRequest.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblToRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToRequest.setText("REQUEST PENGOBATAN");

        javax.swing.GroupLayout pnlToRequestLayout = new javax.swing.GroupLayout(pnlToRequest);
        pnlToRequest.setLayout(pnlToRequestLayout);
        pnlToRequestLayout.setHorizontalGroup(
            pnlToRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlToRequestLayout.setVerticalGroup(
            pnlToRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToRequestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblToRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 153));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setPreferredSize(new java.awt.Dimension(210, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlToPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlToMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlToRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(pnlProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlToPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlToMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlToRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tableMedicine.setAutoCreateRowSorter(true);
        tableMedicine.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tableMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "NO. REGISTRASI", "NAMA OBAT", "TIPE OBAT", "TANGGAL MASUK", "APOTEKER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMedicine.setToolTipText("");
        tableMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableMedicine.setFillsViewportHeight(true);
        tableMedicine.setIntercellSpacing(new java.awt.Dimension(0, 5));
        tableMedicine.setMaximumSize(new java.awt.Dimension(430, 585));
        tableMedicine.setPreferredSize(new java.awt.Dimension(585, 550));
        tableMedicine.setRequestFocusEnabled(false);
        tableMedicine.setRowHeight(40);
        tableMedicine.setSelectionBackground(new java.awt.Color(0, 255, 153));
        tableMedicine.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tableMedicine.getTableHeader().setResizingAllowed(false);
        tableMedicine.getTableHeader().setReorderingAllowed(false);
        tableMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMedicine);

        pnlAdd.setBackground(new java.awt.Color(0, 255, 153));
        pnlAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAdd.setPreferredSize(new java.awt.Dimension(175, 37));
        pnlAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlAddFocusGained(evt);
            }
        });
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
        });

        txtAdd.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdd.setLabelFor(pnlAdd);
        txtAdd.setText("TAMBAH");

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDelete.setBackground(new java.awt.Color(255, 0, 51));
        pnlDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDelete.setPreferredSize(new java.awt.Dimension(175, 37));
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
        });

        txtDelete.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        txtDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDelete.setLabelFor(pnlDelete);
        txtDelete.setText("HAPUS");
        txtDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDeleteLayout = new javax.swing.GroupLayout(pnlDelete);
        pnlDelete.setLayout(pnlDeleteLayout);
        pnlDeleteLayout.setHorizontalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDeleteLayout.setVerticalGroup(
            pnlDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSearch.setPreferredSize(new java.awt.Dimension(350, 37));
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
        });

        txtSearch.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearch.setBorder(null);
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearch.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        cmbCari.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Cari Berdasarkan--", "No. Reg", "Nama", "Tipe", "Tanggal", "Apoteker" }));
        cmbCari.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showTable() {
        try {
            Statement stat = (Statement) ConnectionDB.connectDatabase().createStatement();
            String sql = "SELECT * FROM medicine";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) tableMedicine.getModel();
            
            tableModel.setRowCount(0);
            
            while(rs.next()){
                tableModel.addRow(new Object[]{
                   rs.getString(1), rs.getString(2), rs.getString(3), 
                   rs.getString(4), rs.getString(5), rs.getString(6)
                });
            }
            
            tableMedicine.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableMedicine.getColumnModel().getColumn(2).setPreferredWidth(200);
            tableMedicine.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableMedicine.getColumnModel().getColumn(5).setPreferredWidth(200);
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicinePage.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void searchData(){ 
        
        String kategori = "med_name";
        
        if(cmbCari.getSelectedItem().toString().equals("No. Reg")){
            kategori = "med_reg";
        } else if(cmbCari.getSelectedItem().toString().equals("Nama")){
            kategori = "med_name";
        } else if(cmbCari.getSelectedItem().toString().equals("Tipe")){
            kategori = "med_type";
        } else if(cmbCari.getSelectedItem().toString().equals("Tanggal")){
            kategori = "med_date";
        } else if(cmbCari.getSelectedItem().toString().equals("Apoteker")){
            kategori = "pharmacist";
        }
        
        try {
            Statement stat = (Statement) ConnectionDB.connectDatabase().createStatement();
            String sql = "SELECT * FROM medicine WHERE " 
                    + kategori + 
                    " LIKE '%" + txtSearch.getText() + "%'";
            ResultSet rs = stat.executeQuery(sql);
            
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel) tableMedicine.getModel();
            
            tableModel.setRowCount(0);
            
            while(rs.next()){
                tableModel.addRow(new Object[]{
                   rs.getString(1) ,rs.getString(2), rs.getString(3), rs.getString(4),
                   rs.getString(5), rs.getString(6)
                });
            }
            
            tableMedicine.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableMedicine.getColumnModel().getColumn(2).setPreferredWidth(200);
            tableMedicine.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableMedicine.getColumnModel().getColumn(5).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(PatientPage.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void pnlAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseClicked
        if(dataLogin.getRole().equals("Apoteker") || dataLogin.getRole().equals("Admin")){
            new AddMedicine(dataLogin).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Fitur ini hanya dapat diakses oleh Apoteker!", "Invalid Role", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_pnlAddMouseClicked

    private void pnlDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseClicked
        if(dataLogin.getRole().equals("Apoteker") || dataLogin.getRole().equals("Admin")){
            new DeleteMedicine().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Fitur ini hanya dapat diakses oleh Apoteker!", "Invalid Role", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_pnlDeleteMouseClicked

    private void pnlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_pnlLogoutMouseClicked

    private void pnlRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRefreshMouseClicked
        this.dispose();
        new MedicinePage(dataLogin).setVisible(true);
    }//GEN-LAST:event_pnlRefreshMouseClicked

    private void pnlAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlAddFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlAddFocusGained

    private void pnlToPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlToPatientMouseClicked
        this.dispose();
        new PatientPage(dataLogin).setVisible(true);
    }//GEN-LAST:event_pnlToPatientMouseClicked

    private void pnlUpdateProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateProfileMouseClicked
        this.dispose();
        new EditProfile(dataLogin).setVisible(true);
    }//GEN-LAST:event_pnlUpdateProfileMouseClicked

    private void pnlUpdateProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateProfileMouseEntered
        pnlUpdateProfile.setBackground(new java.awt.Color(225, 225, 225));
    }//GEN-LAST:event_pnlUpdateProfileMouseEntered

    private void pnlUpdateProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateProfileMouseExited
        pnlUpdateProfile.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pnlUpdateProfileMouseExited

    private void pnlRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRefreshMouseEntered
        pnlRefresh.setBackground(new java.awt.Color(225, 225, 225));
    }//GEN-LAST:event_pnlRefreshMouseEntered

    private void pnlRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRefreshMouseExited
        pnlRefresh.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pnlRefreshMouseExited

    private void pnlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseEntered
        pnlLogout.setBackground(new java.awt.Color(225, 225, 225));
    }//GEN-LAST:event_pnlLogoutMouseEntered

    private void pnlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseExited
        pnlLogout.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pnlLogoutMouseExited

    private void pnlAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseEntered
        pnlAdd.setBackground(new java.awt.Color(0, 200, 100));
    }//GEN-LAST:event_pnlAddMouseEntered

    private void pnlDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseEntered
        pnlDelete.setBackground(new java.awt.Color(200, 0, 0));
    }//GEN-LAST:event_pnlDeleteMouseEntered

    private void pnlDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDeleteMouseExited
        pnlDelete.setBackground(new java.awt.Color(250, 0, 0));
    }//GEN-LAST:event_pnlDeleteMouseExited

    private void pnlAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddMouseExited
        pnlAdd.setBackground(new java.awt.Color(0, 255, 153));
    }//GEN-LAST:event_pnlAddMouseExited

    private void tableMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMedicineMouseClicked

        if(dataLogin.getRole().equals("Apoteker") || dataLogin.getRole().equals("Admin")){
            Medicine medicineSelected = new Medicine();
            medicineSelected.setId(Integer.parseInt(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 0).toString()));
            medicineSelected.setReg(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 1).toString());
            medicineSelected.setName(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 2).toString());
            medicineSelected.setType(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 3).toString());
            medicineSelected.setDate(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 4).toString());
            medicineSelected.setPharmacist(tableMedicine.getValueAt(tableMedicine.getSelectedRow(), 5).toString());

            new UpdateMedicine(dataLogin, medicineSelected).setVisible(true);
        }

    }//GEN-LAST:event_tableMedicineMouseClicked

    private void pnlToPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlToPatientMouseEntered
        pnlToPatient.setBackground(new java.awt.Color(200, 255, 225));
    }//GEN-LAST:event_pnlToPatientMouseEntered

    private void pnlToPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlToPatientMouseExited
        pnlToPatient.setBackground(new java.awt.Color(153, 255, 204));
    }//GEN-LAST:event_pnlToPatientMouseExited

    private void pnlToRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlToRequestMouseClicked
        if(dataLogin.getRole().equals("Pasien") || dataLogin.getRole().equals("Admin")){
            new Request(dataLogin).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Menu ini hanya untuk Pasien!", "Access Denied", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_pnlToRequestMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(txtSearch.getText().equals("")){
            showTable();
        } else {
            searchData();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void pnlSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSearchMouseClicked

    private void pnlSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSearchMouseEntered

    private void pnlSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSearchMouseExited

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
            java.util.logging.Logger.getLogger(MedicinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinePage(dataLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblToMedicine;
    private javax.swing.JLabel lblToPatient;
    private javax.swing.JLabel lblToRequest;
    private javax.swing.JLabel lblUpdateProfile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JPanel pnlRefresh;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlToMedicine;
    private javax.swing.JPanel pnlToPatient;
    private javax.swing.JPanel pnlToRequest;
    private javax.swing.JPanel pnlUpdateProfile;
    private javax.swing.JTable tableMedicine;
    private javax.swing.JLabel txtAdd;
    private javax.swing.JLabel txtDelete;
    private javax.swing.JLabel txtLogout;
    private javax.swing.JLabel txtRefresh;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
