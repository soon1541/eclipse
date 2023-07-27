import com.campus.Car;

public class SportsCar extends Car {

	public SportsCar() {
		
		System.out.println("브랜드->" + brand);
		
		// 속도 증가
		speedUp();
		System.out.println("Speed ->" + speed);
		
		
	}
		
	
	
	/////////////////////////////////////////////////////
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		System.out.println("brand=" + sc.brand);

		// 다른 패키지에 있는 Car클래스
		// Car car = new Car(); // protected 생성자는 다른 패키지일때 객체 생성 불가
		
		
		Car car = new Car();
		// car.speedUp(); // protected메소드는 상속받지 않으면 사용 불가
		
		
	}

}
