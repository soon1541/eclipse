package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest4() throws InputMismatchException, ArithmeticException, ArrayIndexOutOfBoundsException {
		int x = inData("first");
		int y = inData("second");
		hap(x,y);
	}
	
	// 입력받는 메소드
	public int inData(String msg)  throws InputMismatchException {
		System.out.println(msg + "=>");
		return scan.nextInt();
	}
	// 합
	public void hap(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("합=>" + (x+y));
		mok(x,y);
	}
	// 나누기
	public void mok(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("몫=>" + (x/y));
		getData();
	}
	// 배열이용 메소드
	public void getData() throws ArrayIndexOutOfBoundsException {
		int a[] = {10,20,30};
		int s = 0;
		for(int i = 0; i <= a.length; i++) {
				s +=a[i];
			}
		System.out.println("배열의 합=>" + s);
		}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		try {
		new ExceptionTest4();

	}catch(InputMismatchException ime) {
		System.out.println("입력 예외 발생함");
	}catch(ArithmeticException ae) {
		System.out.println("0으로 나눌 수 없습니다");
	}catch(ArrayIndexOutOfBoundsException aioo) {
		System.out.println("배열의 첨자 값이 잘못입력되었습니다.");
	}
	}
}
