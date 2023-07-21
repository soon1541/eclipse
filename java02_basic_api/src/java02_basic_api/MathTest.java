package java02_basic_api;

public class MathTest {

	public static void main(String[] args) {
		// Math 클래스 : 수학관련 메소드들
		
		System.out.println("abs=" + Math.abs(-67));
		System.out.println("ceil=" + Math.ceil(12.1)); // 올림
		System.out.println("floor=" + Math.floor(12.9)); // 버림
		System.out.println("max=" + Math.max(52, 89));
		System.out.println("min=" + Math.min(15.3, 25.1));
		System.out.println("pow=" + Math.pow(5, 3));
		System.out.println("pow=" + Math.round(23.6));
		System.out.println("pow=" + Math.sqrt((10)));
	
		System.out.println("random=" + Math.random());
		System.out.println("------------------------------");
		
		
		// 1~10 사이의 난수를 100개 만들기
		// 난수 * 10 = 0 ~ 9
		// 난수 * 5 = 0 ~ 4
		// 난수 * 25 = 0 ~ 24
		
		for(int i=1; i<=100; i++) {
			double ran = Math.random();
			//           (정수화) (난수* (큰값 - 작은값) +1) + 작은값
			//           (int)  (난수* (10 - 1 + 1)) + 1
			// int ranInt = (int)(ran*(10-1+1)) +1; // 0~9
			
			
			// 15 ~ 40 사이의 값을 난수로 생성
			int ranInt = (int)(ran * (40-15+1)) +15;
			System.out.println(ran + "->" + ranInt);
			
		}
	
		
	
	
	
	
	
	
	
	
	
	
	}

}
