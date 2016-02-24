package belajar.servlet.controller;

import belajar.servlet.domain.Siswa;
import belajar.servlet.repository.SiswaRepository;
import belajar.servlet.repository.impl.SiswaRepositoryImpl;

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
    
     public void save() {
        sr.save(s);
        System.out.println("\nData berhasil ditambahkan \n");
    }
    
    
}
