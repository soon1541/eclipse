package java07_collection;


// 1명의 학생정보를 보관할 수 있는 객체
// 학년(int), 이름(String), 연락처(String), 국어(int), 영어(double), 수학(int) 


//	DTO, VO
public class Student extends Object{

	// 캡슐화된 변수
	private int grade; // 0
	private String name; // null
	private String tel;
	private int kor;
	private double eng; // 0.0
	private int math;
	private boolean pass; // false
	
	
	public Student() {} // Student s = new Student();
	public Student(int grade, String name, String tel, int kor, double eng, int math) {// new Student(2,"홍길동", "010-2345-3245", 60, 25.3, 50);
		this.grade = grade;
		this.name = name;
		this.tel = tel;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
			
	}
	// 오버라이딩
	@Override
	public String toString() {
		return "grade=" + grade + ", name=" + name + ", tel=" + tel + ", kor=" + kor + ", eng=" + eng +  ", math=" + math;
	}
	
	// 클래스 외부로 값을 내보내는 메소드 : getter()
	public int getGrade() {
		// 기능구현
		return grade;
	}
		// 클래스 외부에서 값을 변경할 수 있는 메소드 : setter()
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.kor = kor;
	}
	public int getMath() {
			return math;
	}
	public void setMath(int math) {
			this.math = math;
	}
	public boolean ispass() {
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

