import java.util.Scanner;

public class KelasUtama {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);			
		KalkulatorMethod km = new KalkulatorMethod();
		
		System.out.println("Masukkan bilangan pertama ");
		int angka1 = sc.nextInt();
		System.out.println("Masukkan bilangan kedua ");
		int angka2 = sc.nextInt();
	
		int hasilT = km.tambah(angka1,angka2);
		int hasilK = km.kurang(angka1,angka2);
		int hasilPK = km.perkalian(angka1,angka2);
		int hasilPG = km.pembagian(angka1,angka2);
		
		System.out.println("X + Y = "+hasilT);
		System.out.println("X - Y = "+hasilK);
		System.out.println("X * Y = "+hasilPK);
		System.out.println("X / Y = "+hasilPG);
	}
}
