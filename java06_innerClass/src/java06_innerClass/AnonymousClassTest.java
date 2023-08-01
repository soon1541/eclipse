package java06_innerClass;

public class AnonymousClassTest {
	String name = "블랙핑크";
	public AnonymousClassTest() {
		
	}
	public void start() {
		// 익명의 내부 클래스
		Sample s = new Sample() {
			// Sample 클래스의 sum() 메소드를 오버라이딩
			public void sum() {
				int evenSum = 0;
				for(int i = 2; i <= 100; i+=2) {
					evenSum += i;
				}
				System.out.println("evenSum=" + evenSum);
			}
			// 메소드 추가
			public void print() {
				System.out.println(num+"--->" + name);
			}
		};              // .sum();            // .print();
		
		s.sum(); // 익명의 내부클래스의 오버라이딩
		// s.print(); // 익명의 내부클래스에서 추가한 메소드는 숨김처리된다.
		
	}
	public static void main(String[] args) {
		new AnonymousClassTest().start();
		
	}

}
