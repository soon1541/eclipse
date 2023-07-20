import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 단을 입력받아 구구단을 출력하라.
		
		System.out.println("단=");
		int dan = scan.nextInt();
		
		for (int i=2; i<=9; i++) { // i=2,3,4,5....9
			int result = dan * i;
			System.out.printf("%2d * %2d = %3d\n", dan, i, result);
		}
		
		

	}

}




/*
 실행
 단 = 5
 5*2 = 10
 5*3 = 15
 
 :
 
 
 5*9 = 45
 
*/