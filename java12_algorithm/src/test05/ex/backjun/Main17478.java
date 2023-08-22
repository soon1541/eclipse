package test05.ex.backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17478 {

	// 문장을 보관할 배열
	static String arr[] = new String[6];
	static String underBar = ""; // 언더바의 수를 처리할 변수
	//								4 > 3 > 2 > 1 > 0 > -1 ......
	public static void recursive(int n) {
		String underBarTemp = underBar;
		if(n == 0) {
			System.out.println(underBarTemp + arr[0]);
			System.out.println(underBarTemp + arr[4]);
			System.out.println(underBarTemp + arr[5]);
			return;
		}
		
		// arr[0] ~ arr[3] 출력
		for(int i = 0; i <= 3; i++) {
			System.out.println(underBarTemp + arr[i]);
		}
		
		underBar += "____";
		recursive(n-1);
		
		System.out.println(underBarTemp + arr[5]);
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		arr[0] = "\"재귀함수가 뭔가요?\"";
		arr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		arr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		arr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		arr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		arr[5] = "라고 답변하였지.";
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		recursive(n); // 4

	}

}
