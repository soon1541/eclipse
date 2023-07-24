import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		
		if( A != 23 && (B + C) < 60  ) {
			System.out.println( A +" "+ (B+C));
		}else if(A != 23 && (B + C) > 60  ) {
			System.out.println( A+1 +" "+ ((B+C)-60));
		}else if( A == 23 && (B + C) > 60  ) {
			System.out.println( 0 +" "+ ((B+C)-60));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
