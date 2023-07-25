import java.util.Scanner;

public class No2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = Math.max(num1,Math.max(num2, num3));
	
		
		
		
		
		if(num1 == num2 && num2 == num3) {
			int a = 10000 + (max*1000);
			System.out.println(a);
		}else if (num1 == num2 && num1 != num3) {
			int b = 1000 + (num1*100);
			System.out.println(b);
		}else if (num1 == num3 && num1 != num2) {
			int c = 1000 + (num1*100);
			System.out.println(c);
		}else if (num2 == num3 && (num1 != num2)){
			int d = 1000+ num2*100;
			System.out.println(d);
		}else {
			int e = max*100;
			System.out.println(e);
		}
		


	}

}
