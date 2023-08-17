package test03_control;

import java.util.Scanner;

public class Fibonacci {
		// 피보나치 수열
		// 0 1 2 3 5 8 13 21 ......
			
		// 반복문을 이용한 피보나치 수열 구하기
	public static void forFibonacci(int n) {
		int num1 = 0; // 첫번째 값
		int num2 = 1; // 두번째 값
		
		int sum = 1; // 첫번째(전전값) + 두번째 (전값) num1 + num2
		
		for(int i = 0; i < n; i++) { // 0,1,2,3,4
		System.out.print(sum + " ");
			
			// 다음값
			sum = num1 + num2; // 0+1 
		
			num1 = num2; // 전값 -> 전전값으로
			num2 = sum; // 현재값 -> 전값으로
	
		}
		System.out.println();
	}
	
	// 재귀호출을 이용한 피보나치 수열 구하기
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			// 전값 + 전전값
			//   1         0
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j = s.nextInt(); // 5
		
		// 반복문을 이용한 피보나치 수열 구하기
		forFibonacci(j);
		
		// 재귀호출을 이용한 피보나치 수열 구하기
		for(int i = 1; i <= j; i++) { // 1,2,3,4,5
		System.out.print(fibo(i) + " "); // 1
		}
	}

}
