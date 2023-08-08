package java09_thread;

public class SynchronizedEx implements Runnable {
	private int depositeMoney = 10000;
	public SynchronizedEx() {
		
	}
	// 메소드에 동기화 처리
	public synchronized void run() {
		// 스레드 동기화 : 스레드를 사용중일때 다른 스레드 대기를 하고 현재 스레드 실행이 끝나면 다음 스레드 구현된다.
		// synchronized (this){
			// 1번에 1000원씩 7번 인출
			for(int i = 1; i <=7; i ++) {
				withDraw(1000);
				// 스레드 지연 시키기
				try {
					Thread.sleep(1000); // 일정시간(밀리초) 동안 스레드 일시정지
				}catch(Exception e) {}
					withDraw(1000);
				
				}
			// }
		}
	
	public void withDraw(int howMuch) { // 인출하는 메소드
		if (depositeMoney >= howMuch) { // 잔액이 있을때
			depositeMoney -= howMuch;													// 현재실행되는 스레드의 이름
			System.out.printf("출금액 :%d , 잔액 :%d, 인출인 :%s\n", howMuch, depositeMoney, Thread.currentThread().getName());
		}else { // 잔액이 없을때
			System.out.println("출금인 :" + Thread.currentThread().getName());
			System.out.println("잔액이 부족합니다.");
			
			// 현재 실행중인 스레드 중지하기
			try {
				this.wait();
			}catch(Exception e) {
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		SynchronizedEx ATM = new SynchronizedEx(); 
		Thread mother = new Thread(ATM, "mother"); // 엄마 : A지점에서 인출
		Thread son = new Thread(ATM, "son"); // 아들 : B지점에서 인출
		
		mother.start();
		son.start();
	}

}
