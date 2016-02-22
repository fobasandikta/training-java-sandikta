package belajar.jdbc.repository.impl;

import belajar.jdbc.repository.SiswaRepository;
import belajar.jdbc.domain.Siswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        try {
            connect();
            String sql = "update siswa set nama=?, kelas=?, alamat=? WHERE id=?";

            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setString(1, s.getNama());
            ps.setString(2, s.getKelas());
            ps.setString(3, s.getAlamat());
            ps.setInt(4, s.getId());

            ps.executeUpdate();

            disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Siswa s) {
        try {
            connect();

            String sql = "delete from siswa where id=?";
            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ps.setInt(1, s.getId());

            ps.executeUpdate();

            disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Siswa> getAllSiswa() {
        List<Siswa> tampil = new ArrayList<Siswa>();
        try {
            connect();
            String sql = "select * from siswa";
            PreparedStatement ps = koneksiDB.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Siswa s = dataResultSet(rs);

                tampil.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tampil;
    }

    private Siswa dataResultSet(ResultSet rs) throws Exception{
        Siswa s = new Siswa();
        s.setId(rs.getInt("id"));
        s.setNama(rs.getString("nama"));
        s.setKelas(rs.getString("kelas"));
        s.setAlamat(rs.getString("alamat"));
        return s;
    }
}
