package belajar.jdbc.controller;

import belajar.jdbc.domain.Siswa;
import belajar.jdbc.repository.SiswaRepository;
import belajar.jdbc.repository.impl.SiswaRepositoryImpl;

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
        //insert code here
    }

    public void delete() {
        //insert code here
    }
}
