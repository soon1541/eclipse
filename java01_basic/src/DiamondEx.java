import java.util.Scanner;

public class DiamondEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		

		System.out.println("0보다 큰 홀수를 입력 ->");
		int max = scan.nextInt();
		
		for(int i = 1; i<=max; i+=2) { // 1,3,5,7,9 > 1줄 출력할 문자의 수
			
			//여백
			for(int s = 1; s <= (max-i)/2; s++) {
				System.out.print(" ");
				}
			//문자
			for(int c = 1; c <= i; c++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		

	}

}





