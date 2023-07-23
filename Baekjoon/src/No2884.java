import java.util.Scanner;

public class No2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		
		int H = scan.nextInt();
		int M = scan.nextInt();

		if (H != 0 && M < 45) {
			System.out.print(H-1+" ");
			System.out.println(60-(45-M));
		}else if (H != 0 &&M > 45) {
			System.out.print(H+" ");
			System.out.println(M-45);
		}else if (H == 0 && M <45) {
			System.out.print(H+23 +" ");
			System.out.println(60-(45-M));
		}else if (H == 0 && M >45) {
			System.out.print(H +" ");
			System.out.println(M-45);
		}else if (H != 0 && M == 45) {
			System.out.print(H+" ");
			System.out.println(0);
		}else if (H == 0 && M == 45) {
			System.out.print(H+" ");
			System.out.println(0);
		}
		
		
	}

}
