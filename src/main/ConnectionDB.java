package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    static final String jdbc_driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/k1";
    static final String user = "root";
    static final String pass = "root";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        } catch(ClassNotFoundException cnf) {
            
        } try {
            conn = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Koneksi Database Gagal!");
        } catch (HeadlessException e) {
            
        }
        return conn;
    }
}
