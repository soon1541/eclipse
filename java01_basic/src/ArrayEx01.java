import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 국어, 영어, 수학, 과학, 물리 시험에 대한 점수를 처리하라
		// 총점, 평균
		
		String lbl[] = {"국어", "영어", "수학", "과학", "물리"}; // 과목을 보관할 배열선언
		int jumsu[] = new int[lbl.length]; // 각 과목의 점수를 보관할 배열선언
		
		
		// 데이터 입력
		for (int i=0; i < lbl.length; i ++) { // 0 ~ 4 까지
			 System.out.print( lbl[i] + "=");
			 jumsu[i]= scan.nextInt();		
		}
		
		// 총점
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			
		}
		
		//평균
		int ave = sum / jumsu.length;
		System.out.println("총점=" + sum);
		System.out.println("평균=" + ave);

	
	
	
	
	
	
	
	}


}






/*
 
 실행
 국어 = 90
 영어 = 80
 수학 = 99
 과학 = 88
 물리 = 87
 총점 = ?
 평균 = ?
 
   
*/