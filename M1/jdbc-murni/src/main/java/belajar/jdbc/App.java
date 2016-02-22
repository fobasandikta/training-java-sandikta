package belajar.jdbc;

import belajar.jdbc.controller.SiswaController;
import belajar.jdbc.repository.impl.SiswaRepositoryImpl;
import belajar.jdbc.domain.Siswa;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelas, alamat;
        int id;
        boolean ulang = true;
        Siswa s = new Siswa();
        while (ulang) {
            System.out.println("FORM INPUT DATA SISWA");
            System.out.println("---------------------");
            System.out.println("1. Simpan data       ");
            System.out.println("2. Update data       ");
            System.out.println("3. Delete data       ");
            System.out.println("4. Lihat  data       ");
            System.out.println("5. Exit              ");
            System.out.print("Masukkan Pilihan :   ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama   : ");
                    nama = input.next();
                    System.out.print("Masukkan kelas  : ");
                    kelas = input.next();
                    System.out.print("Masukkan alamat : ");
                    alamat = input.next();
                    s.setNama(nama);
                    s.setKelas(kelas);
                    s.setAlamat(alamat);
                    SiswaController sc = new SiswaController(s);
                    sc.simpan();
                    break;
                case 2:
                    System.out.print("Masukkan id   : ");
                    id = input.nextInt();
                    System.out.print("Masukkan nama   : ");
                    nama = input.next();
                    System.out.print("Masukkan kelas  : ");
                    kelas = input.next();
                    System.out.print("Masukkan alamat : ");
                    alamat = input.next();
                    s.setId(id);
                    s.setNama(nama);
                    s.setKelas(kelas);
                    s.setAlamat(alamat);
                    SiswaController sc1 = new SiswaController(s);
                    sc1.update();
                    break;
                case 3:
                    System.out.print("Masukkan id   : ");
                    id = input.nextInt();
                    s.setId(id);
                    SiswaController sc2 = new SiswaController(s);
                    sc2.delete();
                    break;
                case 4:
                    SiswaController sc3 = new SiswaController(s);
                    sc3.tampilSiswa();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");

            }
        }
    }
}
