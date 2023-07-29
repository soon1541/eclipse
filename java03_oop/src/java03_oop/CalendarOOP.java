package java03_oop;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	public int data;
   Scanner sc = new Scanner(System.in);

   public CalendarOOP() {
   }

   public void start() {
      // 년월입력
      int year = inData("년도");
      int month = inData("월");
      // 년월1일 날짜 객체 구하기
      Calendar date = setDate(year, month);
      // 요일
      int week = date.get(Calendar.DAY_OF_WEEK);
      // 마지막날
      int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);

      titlePrint(year, month); // 제목 출력
      spacePrint(week); // 공백 출력
      dayPrint(week, lastDay); // 날짜 출력
   }

   // 정보입력 -- 년도와 월 입력
   public int inData(String msg) { // msg값은 외부 메소드 내로 전달
      System.out.print(msg + "->");
      return sc.nextInt();
   }

   // 날짜객체만들기 -- 날짜객체를 생성 -> 입력받은 년,월,일로 변경하여 리턴
   public Calendar setDate(int y, int m) {
      Calendar c = Calendar.getInstance(); // 오늘날짜
      c.set(y, m - 1, 1);
      return c;
   }

   // 제목출력
   public void titlePrint(int y, int m) {
      System.out.println("\t\t\t==" + y + "년 " + m + "월==");
      System.out.println("일\t월\t화\t수\t목\t금\t토");
   }

   // 공백출력 -- 1일의 요일 입력받아 날짜 출력하기전 공백처리 기능구현
   public void spacePrint(int week) {
      for (int i = 1; i < week; i++) {
         System.out.print("\t");
      }
   }

   // 날짜출력 -- 공백수(요일), 마지막날 정보를 이용하여 날짜 출력
   public void dayPrint(int week, int lastDay) {
      // spacePrint(week); // 이 방법도 가능하다.
      for (int i = 1; i <= lastDay; i++) {
         System.out.print(i + "\t");
         if ((week - 1 + i) % 7 == 0) {
            System.out.println();
         }
      }
   }

   public void dayPrint2(int week, int lastDay) {
      spacePrint(week);
      dayPrint(week, lastDay);
   }

   ////////////////////////////////////
   public static void main(String args[]) {
      CalendarOOP oop = new CalendarOOP();
      // oop.start();
      oop.dayPrint2(5, 30);
   }

}