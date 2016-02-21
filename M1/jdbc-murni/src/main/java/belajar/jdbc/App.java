package belajar.jdbc;

import belajar.jdbc.controller.SiswaController;
import belajar.jdbc.repository.impl.SiswaRepositoryImpl;
import belajar.jdbc.domain.Siswa;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        Siswa s = new Siswa();
        while (ulang) {
            System.out.println("FORM INPUT DATA SISWA");
            System.out.println("---------------------");
            System.out.println("1. Simpan data       ");
            System.out.println("2. Update data       ");
            System.out.println("3. Delete data       ");
            System.out.println("4. Exit              ");
            System.out.print("Masukkan Pilihan :   ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama   : ");
                    String nama = input.next();
                    System.out.print("Masukkan kelas  : ");
                    String kelas = input.next();
                    System.out.print("Masukkan alamat : ");
                    String alamat = input.next();
                    s.setNama(nama);
                    s.setKelas(kelas);
                    s.setAlamat(alamat);
                    SiswaController sc = new SiswaController(s);
                    sc.simpan();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");

            }
        }
    }
}
