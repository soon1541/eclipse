
public class Array04 {

	public static void main(String[] args) {
		// 향상된 for문
		// index를 이용하지 않고 순서대로 배열에 데이터에 접근이 가능하다.
		
		int[] scores = {89, 23, 58, 98, 78, 45};
		
		int tot = 0;
		for(int s:scores) {
			tot = tot + s;
			
		}
		System.out.println("tot=" +tot);
	}

}
