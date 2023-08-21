package test09.sort;

import java.util.Random;

public class ArrayInsserionSort {
	static int arr[];
	static Random ran = new Random();
	static void setData(int size) {
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
			
		}
	}
	static void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void insertionSort() {
		// 기준 데이터의 index
		for(int i = 1; i < arr.length; i++) { // 1,2,3,4,5,6,7,8,9
			
			int temp = arr[i]; // 비교대상이 되는 데이터를 임시변수에 보관한다.
			// temp보다 비교대상이 되는 값이 크면 다음값을 확인해야 한다.				
			int j;
			for(j = i-1; j >= 0 && temp < arr[j]; j--) { // i=3 -> j 
				// 값을 옮기기
				arr[j+1] = arr[j]; 
			}
			// temp의 자리에 값 대입하기
			arr[j+1] = temp;
			
		}
	}
	
	
	public static void main(String[] args) {
		// 삽입정렬(insertion sort)
		// 배열의 모든 요소를 앞에서 부터 차례대로 이미 정렬된 부분과 비교하여, 자신의 위치를 찾아 삽입한다.
		
		setData(10);
		System.out.println("**********정렬전********");
		print();

		
		// 정렬하기(insertion sort)
		insertionSort();
		System.out.println("********정렬후*********");
		print();
		
	}

}
