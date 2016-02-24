package belajar.servlet.repository;

import belajar.servlet.domain.JenisKelamin;
import belajar.servlet.domain.Siswa;
import java.util.List;

/**
 *
 * @author Irman Juliansyah
 */

public interface SiswaRepository {

    public void save(Siswa s);

    public void update(Siswa s);

    public void delete(Siswa s);

    public List<Siswa> getAllSiswa();
}
