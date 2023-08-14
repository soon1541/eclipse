import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class FileUnicasteSend {

   public FileUnicasteSend() {
   }
   public void fileSend() {
      try {
         DatagramSocket socket=new DatagramSocket();
         InetAddress ia=InetAddress.getByName("220.82.135.15"); // 받는 곳의 ip객체
         //파일전송
         //1.파일명보내기
         String filename="**%$SendStart["+"whitedog"; // 
         DatagramPacket dp=new DatagramPacket(filename.getBytes(), filename.getBytes().length, ia, 10200);
         socket.send(dp);
         
         //2. 파일의 내용
         File f = new File("C://javaFileTest", "natural1.jpg");
         FileInputStream fis = new  FileInputStream(f);
         
         while(true) {
        	 byte indata[] = new byte[512];
        	 int inBytes = fis.read(indata, 0, indata.length);
        	 if(inBytes == -1) break;
        	 
        	 // 보내기
        	 dp = new DatagramPacket(indata, inBytes, ia, 10200);
        	 socket.send(dp);
         }
         fis.close();
         
         //3. 마지막알림정보
         String endMsg = "**%$EndStart[[";
         dp = new DatagramPacket(endMsg.getBytes(), endMsg.length(), ia, 10200);
         
         socket.close();
         System.out.println("보내기 완료됨.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      new FileUnicasteSend().fileSend();

   }

}