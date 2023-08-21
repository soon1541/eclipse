package test09.sort;

public class ArrayBubbleSort {
	// 							i 앞데이터 위치, j 다음 데이터 위치						
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		// 버블정렬 :	인접한 2개의 값을 비교하여 교환하는 정렬방법
		//		    버블정렬은 구현하기가 쉽다.
		//			이미 정렬된 데이터는 속도가 빠르다.
		//			역순으로 정렬된 데이터를 정렬할 경우 속도가 느리다.
		
		// 1~100사이의 난수를 10개 만들어 오름차순으로 정렬하라.(BubbleSort)
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(100-1+1))+1;
		}
		System.out.println("============정렬전===========");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 버블정렬
		
		for(int k = 0; k < arr.length; k++) { // 0,1,2,3,4,5,6,7,8,9
		
		for(int i = arr.length-1; i > k; i--) { // 9,8,7,6,5,4,3,2,1
			//     8        9
			if(arr[i-1] > arr[i]) {
				swap(arr, i-1, i);
				}
			}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
		
		
		
	}

}
