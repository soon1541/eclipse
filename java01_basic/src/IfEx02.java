import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// if else문 사용하기
		
		System.out.print("원하는 메뉴를 선택( 1. 사각형의 넓이, 2. 원의 넓이)=");
		int num = scan.nextInt();
		
		if(num == 1) { 
			 System.out.println("가로(밑변)=");
			 int width = scan.nextInt();
			 System.out.println("세로(높이)=");
			 int height = scan.nextInt();
			 int a = width * height;
			 System.out.printf("사각형의 넓이=",a);
			 
		}else {
			 System.out.println("반지름 =");
			 int a = scan.nextInt();
			 double b = a * a * 3.14;
			 System.out.println("원의 넓이=" +b);
			 
		}
		
		

	}

}


/*
 사각형의 넓이 = 가로 * 세로
 원의 넓이 = 반지름 * 반지름 * 3.14
 
실행결과
원하는 메뉴를 선택 ( 1. 사각형의 넓이, 2, 원의 넓이)?1
가로(밑변) =
세로(높이) =
사각형의 넓이 =

원하는 메뉴를 선택 ( 1. 사각형의 넓이, 2, 원의 넓이)?2
반지름 =
원의 넓이 =
*/