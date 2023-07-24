import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		// 게임수를 입력받아 게임수만큼 로또 번호를 생성하여 아래와 같이 출력하라
		// 중복번호 제거, 오름차순 정렬, 보너스는 마지막에 생성한 번호여야함
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		do {
			// 게임수
			System.out.println("게임 수=");
			int cnt = scan.nextInt();
			
			
			
			
			
			// 입력받은 게임 수 만큼 만들어 출력
			for(int i = 1; i <= cnt; i++) { // cnt = 3 -> 1,2,3
				// 게임 1개 만들어
				int lotto[] = new int[7];
				
				for(int j = 0; j < lotto.length; j++) { // 0,1,2,3,4,5,6
					// j = 0
					lotto[j] = random.nextInt(45)+1; // 
					
					// 중복검사 - 현재생성된번호(j) 이전에 만들어 놓은 번호와 같은 번호가 있는지 확인
					// j = 0
					for(int check = 0; check < j; check++) {
						if(lotto[check] == lotto[j]) {
							j--;
							break; // 중복검사하는 반복문 중단.
						}
					}
				
				}
				//System.out.println("로또번호" + Arrays.toString(lotto));
				
				// 출력
				System.out.print(i+"게임=");
				// 로또 번호
				// 번호 6개만 정렬
				Arrays.sort(lotto, 0, 6);
				System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));
				System.out.println(", bonus=" + lotto[6]);
				
				
			}
			
			
			
			
			// 계속 여부 확인
			System.out.print("계속하시겠습니까(1:예, 2= 아니오)?");
			int status = scan.nextInt();
			if(status == 2) {
				break;
			}
			
			
			
			
			
		}while(true);
		
		
		
		
		
		
		
		
	}

}
