import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		System.out.println("정수=");
		int num = scan.nextInt();
		
		for (int i=1; i<=num; i+=2) { 
			result1  = result1 + i;
		}
		for (int i=0; i<=num; i+=2) { 
			result2 = result2 +=i;
		}
		for (int i =1; i<=num; i++) { 
			result3 =  result3 + i;	
		}		
		System.out.println("1~"+num+"까지의 홀수의 합은="+result1);
		System.out.println("1~"+num+"까지의 짝수의 합은="+result2);
		System.out.println("1~"+num+"까지의 합은="+result3);
				
		}

	}




/*
 정수를 입력받아 입력받은 값까지 짝수의 합, 홀수의 합, 전체 합을 구하라.
 
 실행
 정수 = 10
 1~10 까지 홀수의 합은 ??
 1~10 까지 짝수의 합은 ??
 1~10 까지 의 합은 ??
  
  
  
 
*/