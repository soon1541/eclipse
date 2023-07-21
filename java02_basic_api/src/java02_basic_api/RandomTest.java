package java02_basic_api;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// Random : 난수 생성하는 클래스
		
		Random random = new Random();
		
		for(int i = 0; i <= 100; i++) {
		
		//	boolean boo =random.nextBoolean();
		//		System.out.print(boo +"\t");
			
		//	double dbl = random.nextDouble();
		//	System.out.print(dbl + "\t");
		
			
		//	int ranInt = random.nextInt();
			// 12~42 사이의 값을 난수로 구하기
			//                          큰수 + 작은수 +1
			int ranInt = random.nextInt(31)+12;; // 100 > 0~99, 25> 0~24
			System.out.print(ranInt+"\t");
			
			if (i%10 == 0) System.out.println(); 
				
			
				
		}
	}

}
