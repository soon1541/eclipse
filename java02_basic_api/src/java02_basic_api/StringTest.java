package java02_basic_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// String의 비교
		String name1 = "홍길동"; // 200번지
		String name2 = "홍길동"; // 200번지
		
		String username1 = new String("세종대왕"); // 300번지
		String username2 = new String("세종대왕"); // 400번지
		
		int a = 250;
		
		if(name1 == name2) {
		System.out.println("name1과 name2는 같다.");	
		}else {
			System.out.println("name1과 name2는 다르다.");
		}
		
		if(username1 == username2) {
			System.out.println("username1과 username2는 같다.");
		}else {
			System.out.println("username1과 username2는 다르다.");
		}
		
		if(username1.equals(username2)) {
			System.out.println("username1과 username2는 같다.");
		}else {
			System.out.println("username1과 username2는 다르다.");
		}
		
		name1 = name1 + "입니다.";
		name1 = name1 + "문자열확인중";
		//			  012345678901234567890
		String str = "java programing String Test.....";
		System.out.println("charAt()=" + str.charAt(5)); // index 5번째 문자를 반환한다.
		System.out.println(str.concat(name1)); // 문자열의 연결 + 
		
		byte[] ascii = str.getBytes(); // 문자열을 아스키코드를 구하여 배열로 리턴해준다.
		System.out.println("ascii ->" + Arrays.toString(ascii));
		
		// 찾는 문자가 없으면 -1
		System.out.println("indexOf ->" + str.indexOf("a")); // 처음만나는 문자위치 index
		System.out.println("lastIndexOf ->" + str.indexOf("a")); // 뒤에서 처음만나는 문자위치 index
		System.out.println("indexOf ->" + str.indexOf("z"));

		System.out.println("length ->" + str.length()); //글자 수
		
		//문자치환 -> a -> 에이
		String str2 = str.replaceAll("a", "에이");
		System.out.println("replaceAll() ->" + str2);
		
		String tel = "010-1234-5678";
		String phone[] = tel.split("-"); // 0 -> 010, 1 -> 1234, 2 -> 5678
		for(String p : phone) {
			System.out.println(p);
			}
	
	//대소문자 변환
		System.out.println(str.toLowerCase() + ", " + str.toUpperCase());
		//				 01234567890123456789012345678901							
		// String str = "JAVA PROGRAMING STRING TEST.....";
		
		// 일부문자열 얻어오기
		System.out.println("substring->" + str.substring(7)); // index가 7인 위치부터 끝까지의 문자열을 구한다.
		System.out.println("substring->" + str.substring(7, 12)); // 첫번째 index부터 2번째 index앞문자까지의 문자열을 구한다.
		
		// 양쪽의 공백문자를 지운다.
		String txt = "     자바   프로     그래밍     ";
		System.out.println("trim ->" + txt.trim() + "*");
		
		// 문자열의 비교 : equals() -> 대소문자구별, equalsIgnoreCase() -> 대소문자 구별안함
		String data1 = "JAVA"; // 65 - 97
		String data2 = "Jcmes"; // 
		
		System.out.println("equals() ->" + data1.equals(data2)); // false
		System.out.println("equalsIgnoreCase() ->" + data1.equalsIgnoreCase(data2)); // false
		
		//문자열의 크기비교 : comparaeTo() -> 대소문자 구별, compareToIgnoreCase() -> 대소문자 구별안함
		// 결과 - 이면 오른쪽의 변수의 문자열이 크다
		// 결과 + 이면 오른쪽의 변수의 문자열이 작다
		//     0 이면 같다.
		System.out.println("compareTo ->" + data1.compareTo(data2));
		if(data1.compareTo(data2)>0) {
			System.out.println(data1+ "이 " + data2 + "보다 크다.");
		}else if(data1.compareTo(data2) < 0) {
			System.out.println(data2 + "가 " + data2 + "보다 크다.");
		}else {
			System.out.println("같다.");
		}
		
		int num = 1234; // "1234"
		String result = num + "";
		String result2 = String.valueOf(num); // "1234"
		
		char[] charArr = {'객', '체', '지', '향'}; // "객체지향" 으로 바꾸기
		System.out.println("charArr ->" + String.valueOf(charArr));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
