import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수=");
		int kor = scan.nextInt();
		System.out.print("영어점수=");
		int eng = scan.nextInt();
		System.out.print("수학점수=");
		int mat = scan.nextInt();

		int tot = kor + eng + mat;
		double avg = tot / 3.0;
        
        char grade;
        
        switch ((int) (avg / 10)) {
        case 10:
        case 9:
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        case 6:
            grade = 'D';
            break;
        default:
            grade = 'F';
    }
        System.out.println("총점 = " + tot);
        System.out.println("평균 = " + avg);
        System.out.println("학점 = " + grade);
		
		
	
	}
		
		
	
}




/*
 콘솔에서 국어, 영어, 수학점수를 입력받아
 총점, 평균, 학점을 구하라.
 
 if을 사용하지 않아야한다. switch문 사용
 
 점수범위 : 각 과목은 0~100사이의 값이다.
 
 	90~100 : A학점
 	80~89.9999 : B학점
 	70~79.9999 : C학점
 	60~69.9999 : D학점
 	0~59.9999 : F학점
 	
 	실행
 	국어점수 = 80
 	영어점수 = 80
 	수학점수 = 80
 	
 	총점 = 240
 	평균 = 80
 	학점 = B
 
 */