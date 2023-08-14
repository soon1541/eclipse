

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UnicasteReceive {

	public UnicasteReceive() {
	
	}
	public void receiveStart() {
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte[] data = new byte[1024];
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("받기 대기중");
			ds.receive(dp);
			
			// 받은 후 처리
			byte[] receiveData = dp.getData();
			System.out.println("length");
			System.out.println(new String(receiveData,0,dp.getLength(),"UTF-8" ));
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		new UnicasteReceive().receiveStart();
	}

}
