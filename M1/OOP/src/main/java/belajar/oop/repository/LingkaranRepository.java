package belajar.oop.repository;

/**
 *
 * @author Irman Juliansyah
 */
import belajar.oop.domain.LingkaranModel;

public interface LingkaranRepository {

    public double kelilingLingkaran(LingkaranModel lm);

    public double luasLingkaran(LingkaranModel lm);
}
