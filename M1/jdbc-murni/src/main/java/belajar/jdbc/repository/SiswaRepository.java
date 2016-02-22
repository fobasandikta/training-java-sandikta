package belajar.jdbc.repository;

/**
 *
 * @author Irman Juliansyah
 */
import belajar.jdbc.domain.Siswa;
import java.util.List;

public interface SiswaRepository {

    public void simpan(Siswa s);
    
    public void update(Siswa s);

    public void delete(Siswa s);
    
    List<Siswa> getAllSiswa();
    
}
