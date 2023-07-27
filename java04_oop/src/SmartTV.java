
public class SmartTV extends TV {
	
	public SmartTV() {
		size = 65;
		
	}
	public void start() {
		System.out.println("MAX_VOLUME->" + MAX_VOLUME);
		// MAX_VOLUME = 50; // final변수 이므로 값을 변경할 수 없다.
		
		volumeDown();
		System.out.println("volume->" + volume);
	}
		
	// 상위클래스의 final메소드는 오버라이딩을 할 수 없다.
	// public void volumeDown() {
	//		
	//	}
	
	
	
	
	/////////////////////////////////////////////////////////
	public static void main(String args[]) {
		SmartTV sTv = new SmartTV();
		sTv.start();
	}
	
	
	
	
	
}
