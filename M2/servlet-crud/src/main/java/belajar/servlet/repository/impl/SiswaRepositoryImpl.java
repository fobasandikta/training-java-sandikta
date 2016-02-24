package belajar.servlet.repository.impl;

import belajar.servlet.domain.Siswa;
import belajar.servlet.repository.SiswaRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irman Juliansyah
 */
public class SiswaRepositoryImpl implements SiswaRepository {

    private Connection koneksiDB;
    private String dbDriver = "com.mysql.jdbc.Driver";
    private String dbUrl = "jdbc:mysql://localhost/servlet";
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
    public void save(Siswa s) {
        try {
            connect();
            String sql = "INSERT INTO siswa (nama,kelas,alamat,jenisKelamin) VALUES (?,?,?,?)";
            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setString(1, s.getNama());
            ps.setString(2, s.getKelas());
            ps.setString(3, s.getAlamat());
            ps.setString(4, s.getJenisKelamin().toString());
            ps.executeUpdate();
            disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Siswa s) {

    }

    @Override
    public void delete(Siswa s) {

    }

    @Override
    public List<Siswa> getAllSiswa() {
        List<Siswa> tampil = new ArrayList<Siswa>();
        //insert code here
        return tampil;

    }

}
