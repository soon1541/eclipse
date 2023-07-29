package java02_basic_api;

import java.util.Scanner;

public class EmailCheckEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("이메일입력=");
			String email = scan.nextLine();
		
			
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			if(atMark == -1 || point == -1 || atMark > point || (point - atMark<3)  ) { // 잘못된 메일주소일때   abcd@natecom
				System.out.println("잘못된 이메일주소 입니다.");
			}else { // 정상 메일주소일때
				String id = email.substring(0,atMark);
				String domain = email.substring(atMark+1);
				System.out.println("아이디=" + id);
				System.out.println("도메인=" + domain);
				
			}
		
		
		}while(true);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


/*
요구조건 : split()메소드 사용하지 말것



실행
이메일입력 = abcd.nate.com
잘못된 이메일 주소입니다.

이메일입력 = abcd@naver.com
아이디 -> abcd
도메인 -> nate.com

이메일입력 = 

*/