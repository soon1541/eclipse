package test09.sort;

import java.util.Random;

public class ArrayQuickSort {
	// Quick Sort
	// 리스트의 가운데 값을 선택하여(pivot)하고 피벗 위치의 값보다 작은 것은 왼쪽에.
	// 큰것은 오른쪽에 배치하여 정렬한다.
	static int data[];
	
	static void arrayPrint() {
		for(int d:data) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	static void swap(int idx1, int idx2) {
		int temp = data[idx1];
		data[idx1] = data[idx2];
		data[idx2] = temp;
	}
	
	
	static void quickSort(int left, int right) {
		int pLeft = left; // 0
		int pRight = right; // 9
		
		int pivot = (left + right)/2; // 피벗 4
		
		int x = data[pivot];// 피벗의 위치의 값을 변수에 대입
		
		do { // 교환할 데이터를 pLeft, pRight위치를 기준으로 찾기
			
			 // pivot보다 큰값을 왼쪽에서 부터 찾기
			
		while(data[pLeft] < x); {
			pLeft++; // 1
		}
		// pLeft -> 4 : 피벗보다 큰 값의 index
		
		// pivot 보다 작은값을 오른쪽에서 부터 찾기
		//		1 2        60
		while(data[pRight] > x) {
			pRight--; // 8	
		}
		// pRight -> 8
		
		if(pLeft <= pRight)// 교환
			swap(pLeft++, pRight--);
		
	}while(pLeft <= pRight);
		
		// 재귀호출
		if(left < pRight) quickSort(left, pRight); // 왼쪽 재귀호출
		if(pLeft < right) quickSort(pLeft, right); 
		
		
		
}
	public static void main(String[] args) {
		// 데이터 준비
		data = new int[10];
		
		Random ran = new Random();
		
		for(int i = 0; i < data.length; i++) {
			data[i] = ran.nextInt(100)+1;
		}
		System.out.println("~~~~~~~~~~정렬전~~~~~~~~~");
		arrayPrint();
		
		//		 시작 index, 끝 index
		quickSort(0, data.length-1);
		
		System.out.println("----------정렬후-----------");
		arrayPrint();
	}

}
