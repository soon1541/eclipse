/*
 224.0.0.0 ~ 239.255.255.255
 
 224.100.100.__		53
 */

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticasteSend {

	public MulticasteSend() {
		
	}
	public void multicasteSendStart() {
		String msg = " 멀티캐스트를 이용한 데이터 전송하기 연습중.";
		try {
			MulticastSocket ms = new MulticastSocket();
			
			InetAddress ia = InetAddress.getByName("224.100.100.38");
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 15000);
			
			ms.send(dp); // 공용아이피로 정보 보내기
			System.out.println("send완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new MulticasteSend().multicasteSendStart();

	}

}
