package java02_basic_api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays : 배열을 처리하는 클래스
		
		int data[] = {52, 12, 95 ,75, 45, 19, 52, 32};
		System.out.println("정렬 전 ->" + Arrays.toString(data));
		
		// 정렬
		Arrays.sort(data);
		System.out.println("정렬 후 ->" + Arrays.toString(data));
		
		//배열의 일부값만 정렬하기
		
		int data2[] = {52, 86, 95, 75, 41, 15, 93, 46, 25};
		System.out.println("정렬 전 ->" + Arrays.toString(data2));
		
		// sort(int[] a, int fromIndex, int toIndex) (앞까지 정렬)
		Arrays.sort(data2, 2, 5);
		System.out.println("정렬 후 ->" + Arrays.toString(data2));
		
		//문자형 배열의 정렬  "2", "A", "a", "홍"
		String data3[] = {"red", "orange", "apple", "banana"};
		Arrays.sort(data3);
		System.out.println("정렬 후 ->" + Arrays.toString(data3));
		
		
		// 내림차순으로 정렬(문자데이터)
		Arrays.sort(data3, Collections.reverseOrder());
		System.out.println("data3내림차순 ->" + Arrays.toString(data3));
		
		//배열복사
		int data4[]= Arrays.copyOfRange(data2, 3, 7); // index 3부터 index 7앞까지
		System.out.println("copy ->" + Arrays.toString(data4));
		
	}

}
