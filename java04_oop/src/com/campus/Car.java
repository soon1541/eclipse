package com.campus;

public class Car {
	protected String brand = "그랜저";
	String color = "white";
	int maxSpeed = 100;
	protected int speed = 0; // public, protected 사용해주면 메인에서 사용가능
	
	//protected Car() {
		public Car() {
		System.out.println("Car()생성자 메소드 실행됨...");
		
	}
	
	protected void speedUp() {
		speed++;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
	public void speedDown() {
		speed--;
		if(speed < 0) {
			speed = 0;
		}
	}
	
	
	
	
}
