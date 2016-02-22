package belajar.jdbc.controller;

import belajar.jdbc.domain.Siswa;
import belajar.jdbc.repository.SiswaRepository;
import belajar.jdbc.repository.impl.SiswaRepositoryImpl;
import java.util.List;

/**
 *
 * @author Irman Juliansyah
 */
public class SiswaController {

    private Siswa s;
    private SiswaRepository sr;

    public SiswaController(Siswa s) {
        this.s = s;
        sr = new SiswaRepositoryImpl();
    }

    public void simpan() {
        sr.simpan(s);
        System.out.println("\nData berhasil ditambahkan \n");
    }

    public void update() {
        sr.update(s);
        System.out.println("\nData berhasil diupdate \n");
    }

    public void delete() {
        sr.delete(s);
        System.out.println("\nData berhasil didelete \n");
    }

    public List<Siswa> tampilSiswa() {
        List<Siswa> dataSiswa = sr.getAllSiswa();
        for (Siswa s : dataSiswa) {
            System.out.println("-----------------------");
            System.out.println("ID      : "+s.getId());
            System.out.println("Nama    : "+s.getNama());
            System.out.println("Kelas   : "+s.getKelas());
            System.out.println("Alamat  : "+s.getAlamat());
            System.out.println("------------------------");
            
        }
        return sr.getAllSiswa();

    }
}
