import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 콘솔에서 숫자를 입력받아 그 수 까지의 홀수합, 짝수합을 구하라.
		// 단, 반복문은 while문으로 사용한다.
		/*
		 
		   실행
		   정수=10
		   홀수합=25
		   짝수합=30
		   
		 */
		while(true) {
			System.out.println("정수=");
			int num = scan.nextInt();
			
			
			int i = 1; // 숫자를 생성할 변수 1,2,3,4,5,6....num
			int odd = 0; //홀수의 합
			int even = 0; //짝수의 합
			
			while ( i <= num) {
				if(i % 2 == 1) {
					odd = odd +1; // 홀수의 합
				}else {
					even = even + i; // 짝수의 합
				}
					i++; // i의 증가식 - 다음수 수 만들기
				}
				// 출력문
			System.out.println("홀수의 합=" +odd);
			System.out.println("짝수의 합="+ even);
			
			
		}

	}

}
