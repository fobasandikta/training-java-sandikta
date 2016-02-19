package belajar.oop.controller;

/**
 *
 * @author Irman Juliansyah
 */
import belajar.oop.domain.LingkaranModel;
import belajar.oop.repository.impl.LingkaranRepositoryImpl;
import belajar.oop.repository.LingkaranRepository;

public class LingkaranController {

    private LingkaranModel lm;
    private LingkaranRepository lr;

    public LingkaranController(LingkaranModel lm) {
        this.lm = lm;
        lr = new LingkaranRepositoryImpl();
    }

    public void kelilingLingkaran() {
        double hasil = lr.kelilingLingkaran(lm);
        System.out.println("Hasil Keliling Lingkaran : " + hasil);
    }

    public void luasLingkaran() {
        double hasil = lr.luasLingkaran(lm);
        System.out.println("Hasil Luas Lingkaran : " + hasil);
    }
}
