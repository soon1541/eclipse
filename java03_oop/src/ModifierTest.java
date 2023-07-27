import com.multicampus.Books;
import com.multicampus.Test;

import java03_oop.CalendarOOP;

public class ModifierTest {

	public static void main(String[] args) {
		// public 접근제한자 : class, field, constractor 메소드, 메소드
		//                  어디에서든 접근을 허용한다. 공용
		
		
		CalendarOOP oop = new CalendarOOP();
		System.out.println(oop.data);
		// oop.start();
		
		// default 접근제한자 : 클래스, 필드(멤버변수), 생성자메소드, 메소드
		// 					 같은 패키지내의 클래스만 접근을 허용한다.
		
		Test t = new Test();
		int n = t.num;
		System.out.println("n=" + n);
		
		// t.plus(50,25); // plus() 메소드가 default접근제한자이므로 다른패키지에서 접근할 수 없다.
		
		
		Data d = new Data();
		System.out.println("userid=" + d.userid);
		d.dataOutput();
		
		// private 접근제한자 : 필드명, 생성자 메소드, 메소드
		//  d.password  ->  필드명 : 객체를 통한 접근불가
		
		// Data d2 = new Data("orange"); //  private 접근제한자인 생성자는 객체를 생성할 수 없다.
 		// d.information(); // 접근제한자가 private이므로 객체명,메소드()로 호출할 수 없다.
 		d.test();
 		
 		// protected : 필드, 생성자, 메소드
 		// 				같은 패키지에 있으면 접근할 수 있다.
 		//				다른 패키지에서는 반드시 상속을 받아 사용해야 한다.
 		
 		
 		
 		Product p = new Product();
 		System.out.println(p.productName);  // 객체를 통한 protected변수 접근하기
 		p.output();
 		
 		Books book = new Books("토지"); // 생성자 protected이고 다른 패키지에 있으므로 객체를 생성할 수 없다. 
 		
 		// bookName 변수는 상속받아서 사용해야 한다.
 		// String bookname = book2.bookName;
 		
 		System.out.println("book2. bookName=>" + book.getBookName());
 		
 		// book2.getprice();
 		
	}

}
