package ch07.sec08.exam02;

public class Taxi extends Vehicle {

	//부모 클래스 메소드 오버라이딩.
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}
