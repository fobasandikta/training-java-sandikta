public class Grader {
	public static void main (String [] xyz){
		
		int a = 140;

		if (a < 0 || a > 100){
			System.out.println(a +" Kelebihan/out of range");
		}
		else if (a>=0 && a<30) {
			System.out.println("E");
		}		
		else if (a>=30 && a<40) {
			System.out.println("D");
		}
		else if (a>=40 && a<60) {
			System.out.println("C");
		}
		else if (a>=60 && a<80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
	}
}
