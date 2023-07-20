import java.util.Scanner;

public class GuguDan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("       구구단       ");

	
		  for (int sdan=1; sdan<=9; sdan+=3) { // 1, 4, 7
			  // 단 제목
			  for (int dan = sdan; dan < sdan+3; dan++ ) { 
				  System.out.print("="+dan+"단=\t");
			  	 }
			  System.out.println(); //줄바꿈
		
			  //구구단 출력
			  for(int i=2; i<=9; i++) { // 2, 3, 4, 5, 6, 7, 8, 9
			      
				  for (int dan = sdan; dan <sdan+3; dan++) {
					  int r = dan * i;
					  System.out.print(dan+"*"+i+"="+r+"\t");
				  }
				  System.out.println(); // 줄바꿈
			  }
		}
			
		
		
		
	}

}
