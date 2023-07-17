
public class VariableTest {

	public static void main(String[] args) {
		// 한줄주석 
				/*
				   여러줄의 설명을 표기할 수 있다.
				*/
				
				// 변수 : 값을 보관하는 것
				
				// 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
				int age = 0; // 변수선언
				int age2 = 25; //변수선언, 초기값
				
				byte kor = 50;
			    //byte mat = 130; // byte는 -128~127의 범위를 벗어남.
				
			    long maxData = 2132548565236547L;// 정수형 살수(리터널)는 int 형이기 때문에 int 형 크기보다 큰 경우 L을 붙인다.
			    
			    System.out.println("age = 10" + age ); 
			    // "문자열" 과 숫자형변수를 + 연산을 하면 연결된다.
			    // System.out.println("age2=" + age2); 
				   
			    System.out.println("Kor->" + kor + " maxData-> + maxData");
			    
			    //실수 : float(4nyte), double(8byte)
			    float height = 175.6f;
			    double key = 175.6;
			    
			    System.out.println("height=" + height);
			    System.out.println("key=" + key);
			    
			    //논리 " boolean -> true, false;
			    boolean boo = false;
			    System.out.println("boo=" + boo);
			    
			    //문자 : char(2byte) : 1개의 문자만 보관할 수 있다. "컴퓨터"
			    
			    char c1 = 'A'; // 반드시 ' ' 사용해야 함
			    char c2 = '컴';
			    // char int int
			    // 'A' + 1 = 66
			    int r1 = c1 +1; // 8
			    System.out.println("r1=" + r1);
			    
			    char r2 = (char)(c1+1); // 강제 형 변환 : type casting
			    System.out.println("r2=" + r2);
			    
			    int keyInt = (int)key;
			    System.out.println("keyint=" + keyInt);
			    
			    // 작은데이터형을 큰 데이터형에 대입할때는 자동으로 형변환이 된다.
			    double data1 = 2356;
			    System.out.println("data1=" + data1);
			    
			    String name = "홍길동";
			    System.out.println("name=" + name);
			    
			    
			    
			  
			   
			     ///////////////////////////////////////////////////////////
			    		byte num1 = (byte)130;
			    		  System.out.println("num1=" + num1); //
			    		    
			    
			}
		}