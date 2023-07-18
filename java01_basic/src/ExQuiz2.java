import java.util.Scanner;

public class ExQuiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 = ");
		int a = scan.nextInt();
		int b = (a / 10) * 10 +1;
		System.out.print("" +b);

	}

}
