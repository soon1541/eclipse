
public class Array01 {

	public static void main(String[] args) {
		//배열형 변수 선언 - 같은데이터타입 변수가 여러개 필요할 때
		//				배열크기가
		
		int num = 10;
		
		int[] dataInt; // null
		int numArr[]; // null
		
		// 배열은 객체가 생성되면 초기값이 기본으로 설정되어 있다.
		// 정수(byte, short, int, long) : 0, 실수(float, double) : 0.0,  String : null
		
		numArr = new int[num];
		
		String name[] = new String[5];
		
		numArr[1] = 90;
		System.out.println("numArr[1]=" + numArr[1]);
		
		// length : 배열의 크기를 구한다.
		//                           10
		for(int idx = 0; idx < numArr.length ; idx++) { // idx=0, 1, 2, 3, 4
			System.out.println("numArr["+idx+"]=" + numArr[idx]);
		}
		
		name[1] = "홍길동";
		name[3] = "이순신";
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("name["+i+"]=" +name[i]);
		}
		
		
		
		
		
		
		
		
	}

}
