import java.io.*;

public class ExQuiz3 {

	public static void main(String[] args) throws IOException {
		// 

		System.out.print("문자 : ");
		int i = System.in.read(); 
		char a;  
		// A(65) ~ Z(90) / a(97) ~ z(122)
		// 대문자에서 소문자로 변환 : 대문자 + 32
		if (i >= 65 && i <= 90);
			i += 32;
			a = (char) i; 
			System.out.print("결과 = " +a);
			
	}

}
