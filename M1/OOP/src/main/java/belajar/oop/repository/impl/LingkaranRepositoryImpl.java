package belajar.oop.repository.impl;

/**
 *
 * @author Irman Juliansyah
 */
import belajar.oop.domain.LingkaranModel;
import belajar.oop.repository.LingkaranRepository;

public class LingkaranRepositoryImpl implements LingkaranRepository {

    @Override
    public double kelilingLingkaran(LingkaranModel lm) {
        double hasil = 2 * lm.getPhi() * lm.getR();
        return hasil;
    }

    @Override
    public double luasLingkaran(LingkaranModel lm) {
        double pangkat = Math.pow(lm.getPhi(), 2);
        double hasil = lm.getPhi() * pangkat;
        return hasil;
    }

}
