package ch07.sec08.exam01;

public class Car {

	//자식클래스를 상속 + 오버라이딩된 메소드가 있는 Tire 클래스 필드를 선언
	public Tire tire;
	
	//메소드 선언
	public void run() {
		//tire 필드로 선언한 객체(자식클래스 있음)의, 오버라이딩된 roll() 메소드를 호출
		tire.roll();
	}
}
