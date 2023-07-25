import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(B+C < 60) {
			System.out.println(A +" "+ (B+C));
			
		}else {
			
			int b = (B+C)%60;
			int c = (B+C)/60;
			
			if ((A+c) >= 24) {
				System.out.println(((A+c)%24) + " " + (b));
			}else {
				System.out.println((A+c) + " " + (b));
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	}

}
