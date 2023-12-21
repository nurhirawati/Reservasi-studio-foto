package aplikasireservasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    public static Connection con;    
    public static Statement stm;

    public static Connection koneksiDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/reservasi_studio_foto";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.print("Koneksi Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        koneksiDB(); // Memanggil method koneksiDB saat aplikasi dijalankan

        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
}
