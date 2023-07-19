import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이=");
		double a = scan.nextInt();
		System.out.println("성별=");
		double b = scan.nextInt();
		System.out.println("키=");
		double c = scan.nextInt();
		System.out.println("체중=");
		double d = scan.nextInt();
		
		//표중체준 기준 i
		//표준체중 지수 j
		//표준체중 지수 평가기준 k
		
		double i = 0;
		
		if (a<=35 && b == 1) {
			i = (c-100)*0.90;
		} else if (a<=35 && b == 2) {
			i = (c-100)*0.85;
	    } else if (a>=35 && b == 1) {
	    	i = (c-100)*0.95;
        } else if (a>=35 && b == 2) {
        	i = (c-100)*0.90;
        }
		
		double j = (d/i)*100;
		//평가기준
		String grade = "";
		 if (j <= 85); {
			grade = "마른형";
		}if (j>=86 && j<=95) {
			grade = "조금마른형";
	    }if (j>=96 && j<=115) {
			grade = "표준형";
        }if (j>=116 && j<=125) {
			grade = "조금 비만형";
		}if (j>=126) {
			grade = "비만형";
		}
		
		System.out.println("표준체중=" +i);
		System.out.printf("당신의 표준체중지수는 %.2f",j);
		System.out.println("으로 " + grade +"입니다");
				
	
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*double sw1 = (c-100)*0.90;
		double sw2 = (c-100)*0.85;
		double sw3 = (c-100)*0.95;
		double sw4 = (c-100)*0.90;
		double i = (d/sw1)*100.00;
		double j = (d/sw2)*100.00;
		double k = (d/sw3)*100.00;
		double l = (d/sw4)*100.00;
		
		if (i <=85) {
			System.out.println("표준체중=" + sw1);
			System.out.printf("당신의 표준체중지수는 %.2f" ,i);
			System.out.println(" 으로 마른형입니다.");
		} else if (i>=86 && i<=95) {
			System.out.println("표준체중=" + sw2);
			System.out.printf("당신의 표준체중지수는 + %.2f" ,j);
			System.out.println(" 으로 조금마른형 입니다.");
		}else if (a>=35 && b == 1) {
			System.out.println("표준체중=" + sw2);
			System.out.printf("당신의 표준체중지수는 + %.2f" ,i);
			System.out.println(" 으로 조금마른형 입니다.");
		}
		*/
		
		
		
	
		}

}

	


