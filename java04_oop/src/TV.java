// 클래스명에 final이 있는 경우 현재 클래스 상속안됨
// public final class TV {
public class TV {
	int size = 42; // -> 55 -> 65
	int channel = 11; // -> 3
	int volume = 12; // -> 15
	final int MAX_VOLUME = 30;
	
	public TV() {
		size = 55;
		channel = 3;
		volume = 15;
	}
	public void volumeUp() {
		volume++;
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}
	}
	// 상속은됨. 오버라이딩 불가
	public final void volumeDown() {
		volume--;
		if(volume < 0) {
			volume = 0;
		}
	}
	
	
	
}
