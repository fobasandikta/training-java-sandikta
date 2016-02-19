package belajar.oop;

/**
 *
 * @author Irman Juliansyah
 */
import belajar.oop.controller.LingkaranController;
import belajar.oop.domain.LingkaranModel;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        LingkaranModel lm = new LingkaranModel();
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
            System.out.println("----------------------");
            System.out.println("    Rumus Lingkaran   ");
            System.out.println("1. Keliling Lingkaran ");
            System.out.println("2. Luas Lingkaran     ");
            System.out.println("3. Exit               ");
            System.out.print("Masukkan Pilihan anda : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("phi = ");
                    double pi = input.nextDouble();
                    System.out.print("R = ");
                    double r = input.nextDouble();
                    lm.setPhi(pi);
                    lm.setR(r);
                    LingkaranController lc = new LingkaranController(lm);
                    lc.kelilingLingkaran();
                    break;
                case 2:
                    System.out.print("phi = ");
                    double pi2 = input.nextDouble();
                    System.out.print("R = ");
                    double r2 = input.nextDouble();
                    lm.setPhi(pi2);
                    lm.setR(r2);
                    LingkaranController lc2 = new LingkaranController(lm);
                    lc2.luasLingkaran();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
    }
}
