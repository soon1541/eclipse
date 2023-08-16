package test02_basic;

import java.io.BufferedReader;

public class ArrayScore {
	static int stuCount; // 학생수
	static int subjectCount; // 과목수 
	static String names[]; // 학생이름 
	static int stuScore[][]; // 학생점수, 총점, 평균, 석차, 과목별총점, 과목별평균	
	// 정보 얻어오기
	static void setData() {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test02_basic/sungjuk.txt")));
		
		stuCount = Integer.parseInt(br.readLine());
		subjectCount = Integer.parseInt(br.readLine());
		names = new String[10];
		stuScore = new int[stuCount+2][subjectCount+3];
		
		for(int i=0; i<stuCount; i++) { // 0,1,2,3,4,5,6,7,8,9
			String data[] = br.readLine().split(","); 	// 1줄읽기 
			names[i] = data[0];
			
			for(int j = 0; j<subjectCount; j++) {// 0,1,2
				stuScore[i][j] = Integer.parseInt(data[j+1]);
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		// 파일의 정보를 가져와 배열에 대입
		setData();
		// 처리
		
		// 출력
		
		
		
		
		
		
		
		
		

	}

}
