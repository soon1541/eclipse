import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
       
		System.out.println("0보다 큰 홀수를 입력 ->");
		int max = scan.nextInt();
		char p = 'A';
		
	    
			
		for(int i = 1; i<=max; i+=2) { // 1,3,5,7,9 > 1줄 출력할 문자의 수
			
			//여백
			for(int s = 1; s <= (max-i)/2; s++) {
				System.out.print(" ");
				}
			
			
			
			
			
			for(int c = 1; c <= i; c++) {
				
				System.out.print(p);
				p = (char)(p+1);
				if(p>90) {
					p = 'A';
					
				}
			   }
				System.out.println();
			
			
			
			
			
			if ( i == max) {
		    	
		    	
		    	for (int i1 = (max-2); i1 >= 1; i1-=2) { // 5, 4, 3, 2, 1
					// 공백              0
					for(int k = 1; k <= ((max-i1)/2) ; k++) {
						System.out.print(" ");
					}
					for ( int j = 1; j <= i1 ; j++) { 
						
						System.out.print(p);
						p = (char)(p+1);
						if(p>90) {
							p = 'A';
							
						}
					}
					 System.out.println();
					 
				
		    	
		    	
		    	}
		    	
		    	
		    	
		    	
		    	}
		    	
		    } 
		    	
		    
		
		}
		
	}


