/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

Package Test_Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connetion;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jovanda Mukti Anugrah
 */
public class Latihan_01 {

    static final String db_contoh = "jdbc:mysql://localhost:3306/db_contoh_01";
    private static Connection Test_Konek;
    public static Connetion db_contoh() throws SQLException,ClassNotFoundException {
        try (
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("proses deteksi driver berhasil");
            DriverManager.getConnection(db_contoh, "root", "");
            System.out.println("Proses Deteksi Driver Berhasil");
                final java.sql.Connection tersambung = 
                    DriverManager.getConnection(db_contoh, "root", "")
            System.out.println("koneksi database berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
    return Test_Konek;
}


