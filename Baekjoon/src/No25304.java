import java.util.Scanner;

public class No25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tot = scan.nextInt(); // 총금액
		int count = scan.nextInt(); // 물건 개수
		
		int sum = 0;
		
		for (int i = 1; i <= count; i++) {
			int price = scan.nextInt();
			int num = scan.nextInt();
			
			sum += (price * num);
		}
		
		if(tot == sum) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
			
		
		
	}

}
