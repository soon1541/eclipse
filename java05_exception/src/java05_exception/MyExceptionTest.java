package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1~100 사이의 값을 입력받아 그 수까지의 합을 구하여 출력하는 클래스
public class MyExceptionTest {

	public MyExceptionTest() {
		
	}
	public void startSum() {
		int max = inData();
		sumOutput(max);
	}
	
	
	// 입력받는메소드
	public int inData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요->");
		int n;
		
		while(true) {
		try {
			n = scan.nextInt();
			// n의 값이 1~100사이의 값이 아니면 예외발생 시키기 (MyExceptionTest)
			if(n < 1 || n > 100) { // 잘못 입력됨
				// 강제로 예외발생 : throw
				//throw new MyException("1~100사이의 값을 입력하여야 합니다.");
				throw new MyException();
			}
			break;
		}catch(InputMismatchException ime) {
			System.out.println("정수를 입력하지 않았습니다.");
			ime.printStackTrace();
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}
	  }
		return n;
		
		
	}
	
	
	// 합을 구하여 출력하는 메소드
	
	public void sumOutput(int max) {
		int sum = 0;
		for(int i = 1; i <= max; i++) {
			sum += i;
		}
		System.out.println("1~" + max + "까지의 합은" + sum);
	}
	
	
	
	
	
	public static void main(String[] args) {
		MyExceptionTest mt = new MyExceptionTest();
		mt.startSum();

	}

}
