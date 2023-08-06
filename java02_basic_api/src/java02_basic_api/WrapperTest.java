package java02_basic_api;

public class WrapperTest {

	public WrapperTest() {
		
	}
	public void start() {
		// Wrapper클래스 : 기본데이터형의 데이터를 객체화하는 클래스들
		int a = 10;
		int b = 3;
		
		Integer i1 = new Integer(5);
		Integer i2 = new Integer("12");
		
		String data = "24";
		// 문자화된 숫자 -> int(Integer)
		int c = Integer.parseInt(data);
		Integer d = Integer.valueOf(data);
	
		// 기본데이터타입은 상수를 직접가진다.
		// 객체형은 해당 클래스의 기능을 모두 가진다.
		System.out.println("바이트 수 ->" + d.SIZE);
		
		int e = Integer.bitCount(a); // 2진수의 1의 갯수를 구한다.
		System.out.println("e ->" + e);
		
		int f = Integer.parseInt("17");
		Integer g = a; // 오토박싱 : v1.5이상은 객체형 -> 기본타입데이터 대입
		int h = g; // 오토 언박싱 : v1.5 이상에서 기본타입 = 객체형 대입가능
		System.out.println("max ->" + Integer.max(a,b));
		System.out.println("reverse ->" + Integer.reverse(a));

		System.out.println("29 ->" + Integer.toHexString(29) + ", " + Integer.toOctalString(29)  );
		
		
		
		
		
	}
	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		wt.start();
	}

}
