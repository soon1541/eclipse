package java07_collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankWating {
	public static int count = 1; // 번호를 카운트할 변수
	// 손님정보(도착날짜, 시간, 부여번호)를 vo객체를 담을 queue 기능이 컬렉션 객체 생성
	public static LinkedList<PersionVO> watingList = new LinkedList<PersionVO>();
	Scanner scan = new Scanner(System.in);
	
	public BankWating() {
		
	}
	public void bankStart() {
		while(true) {
			System.out.println("메뉴[1.in(손님),  2.out(은행원)]?");
			int menu = scan.nextInt();
			switch(menu) {
			case 1: inGuest(); break;
			case 2: outGuest(); break;
			default:
				System.out.println("메뉴를 잘못선택하였다.");
			}
		}
		
		
	}
	
	
	// 번호표를 뽑을때 
	public void inGuest() {
		Calendar now = Calendar.getInstance();
		// 손님정보가 있는 객체 생성		  번호
		PersionVO vo = new PersionVO();
		vo.setNum(count++);
		vo.setDateTime(now);
		
		// 대기열에 추가하기
		watingList.offer(vo);
		//															    E : 요일
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (E)");
		String nowTxt = fmt.format(now.getTime());
		// Message 출력					vo객체의 수
		System.out.println("대기인수 : " + watingList.size() + "-->날짜 : " + nowTxt + ", 번호 : " + vo.getNum());
	
	
	
	
	}
	// 호출되었을때
	public void outGuest() {
		try {
		// 1. 먼저 입력된 객체를 가지고 나오면 
		PersionVO vo = watingList.pop();
		System.out.println("대기인수 : " + watingList.size() + ", 호출번호 : " + vo.getNum());
	}catch(NoSuchElementException ne) {
		System.out.println("대기자가 존재하지 않습니다.");
	}
	}
	
	public static void main(String[] args) {
		BankWating bw = new BankWating();
		bw.bankStart();
	}

}





/*
실행
메뉴[1.in(손님),  2.out(은행원)]? 1
대기인수 : 1 --> 날짜 : 2023-08-03 10:39,  번호 : 1

메뉴[1.in(손님),  2.out(은행원)]? 1
대기인수 : 2 --> 날짜 : 2023-08-03 10:45,  번호 : 2

메뉴[1.in(손님),  2.out(은행원)]? 2
대기인수 : 1     ,    호출번호 : 1

메뉴[1.in(손님),  2.out(은행원)]? 1
대기인수 : 2 --> 날짜 : 2023-08-03 10:55,  번호 : 3

:
:
*/