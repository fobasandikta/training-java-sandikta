package belajar.jdbc.domain;

/**
 *
 * @author Irman Juliansyah
 */
public class Siswa {

    private int id;
    private String nama;
    private String kelas;
    private String alamat;

    public Siswa(String nama, String kelas, String alamat) {
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public Siswa() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
