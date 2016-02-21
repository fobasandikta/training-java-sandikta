package belajar.jdbc.repository.impl;

import belajar.jdbc.repository.SiswaRepository;
import belajar.jdbc.domain.Siswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Irman Juliansyah
 */
public class SiswaRepositoryImpl implements SiswaRepository {

    private Connection koneksiDB;
    private String dbDriver = "com.mysql.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost/jdbc";
    private String dbUsername = "root";
    private String dbPassword = "IRMAN";

    public void connect() {
        try {
            Class.forName(dbDriver);
            koneksiDB = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (koneksiDB != null) {
                koneksiDB.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void simpan(Siswa s) {
        try {

            connect();
            String sql = "insert into siswa(nama,kelas,alamat) values (?,?,?)";

            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setString(1, s.getNama());
            ps.setString(2, s.getKelas());
            ps.setString(3, s.getAlamat());

            ps.executeUpdate();

            disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Siswa s) {
        //insert code here
    }

    @Override
    public void delete(Siswa s) {
        //insert code here
    }
}
