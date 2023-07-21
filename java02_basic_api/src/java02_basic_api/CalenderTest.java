package java02_basic_api;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// Calendar현재 시스템에 날짜와 시간에 관련된 모든 정보를 처리하는 클래스
		
		Calendar date = Calendar.getInstance();
		//날짜 정보 변경
		date.set(2024, 2, 15); //년 월일 변경하기 2024,03,15
		//월 변경하기 3 > 7월로
		date.set(Calendar.MONDAY, 6);
		//년도를 2022년 으로 변경
		date.set(Calendar.YEAR, 2022);
		// System.out.println(date);
		
		// 2023년 07월 20일 오후 04시 36분(목)   // 2023-07-20(목) 16:36
		int year = date.get(Calendar.YEAR); //년도
		int month = date.get(Calendar.MONTH) +1 ; // 0 -> 1월, 1 -> 2월 6 -> 7월
		int day = date.get(Calendar.DAY_OF_MONTH);
		
		int amPm = date.get(Calendar.AM_PM); //오전: 0 오후:1
		String amPmTxt = "오전";
		if(amPm== 1) amPmTxt = "오후";
		
		int hour = date.get(Calendar.HOUR_OF_DAY); // 시
		int minute = date.get(Calendar.MINUTE); // 분
		
		int week = date.get(Calendar.DAY_OF_WEEK); //요일 1 > 일, 2 > 월, 3 > 화, 4 > 수, 5 > 목, 6 > 금, 7 > 토
		
		String weekStr = "";
		switch(week) {
		case 1: weekStr = "일"; break;
		case 2: weekStr = "월"; break;
		case 3: weekStr = "화"; break;
		case 4: weekStr = "수"; break;
		case 5: weekStr = "목"; break;
		case 6: weekStr = "금"; break;
		case 7: weekStr = "토"; break;
		
		}
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분(%s)\n", year, month, day, amPmTxt, hour, minute, weekStr);
	}

}
