import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1~1000사이의 난수 200개 생성하여 배열저장하고
		// 난수의 총합, 평균, 최대값, 최소값을 구하여 출력하라.
		
		int data[] = new int[200]; // 난수를 저장할 배열 선언
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*(1000-1+1)) +1 ;
		}
		
		
		// 총합, 최대값, 최소값
		int tot = 0, avg;
		int max = data[0];
		int min = data[0];
		
		for(int i = 0; i< data.length; i++) { 
			tot += data[i]; // 합
			if(max < data[i]) max = data[i];
			if(min > data[i]) min = data[i];
		}
			avg = tot / data.length; //평균
		
			System.out.println("총합=" + tot);
			System.out.println("평균=" + avg);
			System.out.println("최대값=" + max);
			System.out.println("최소값=" + min);
		
			
			
			
			
			
			
			
			
			
			}

}




/*
 
 실행
 총합 =
 평균=
 최대값=
 최소값=
 
 */