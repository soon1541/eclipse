
public class ForEx03 {

	public static void main(String[] args) {

		for(int n=1; n<=100;  n++) {
			if(n%3 != 0 && n%5 !=0 ) {
				System.out.println(n);
			}
		}
	}
}

/*
 1~100 사이의 값중 다음 값을 출력하라.
 실행
 1
 2
 4
 7
 8
 11
 13
 14
 16
 17
 19
 22
 :
 :
 99 ?
 100 ?
 
*/