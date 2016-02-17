import java.util.Scanner;
public class Kalkulator {
	public static void main(String[] acb){
		int x,y,hasil;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan nilai X : ");
		x = sc.nextInt();
		System.out.println("Masukkan nilai y : ");
		y = sc.nextInt();
		
		hasil = x + y ;
		System.out.println("Hasil X + Y : "+ hasil);
	}
}
