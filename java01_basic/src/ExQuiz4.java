import java.util.Scanner;

public class ExQuiz4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 과일의 수와 바구니 크기를 입력받아 필요한 바구니 갯수를 구하는 프로그램을 작성하라.
		
		System.out.printf("과일의 수=");
		int a = scan.nextInt();
		
		System.out.printf("바구니의 크기=");
		int b = scan.nextInt();
		int c = (a % b == 0) ? a/b : a/b +1;
		System.out.println("바구니 갯수=" +c);
		
		     
		}
		

	}
