public class IterationFor {
	public static void main(String [] xyz){
		
		for(int i=0; i<=10 ; i++) {
			if(i == 8) {
				break;
			} else if(i == 6) {
				continue;			
			}
			System.out.println("CETAK I : " + i);
		}
	}
}
