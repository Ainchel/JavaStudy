package ch08.sec10.exam02;

public class Bus implements Vehicle {

	@Override
	public void run(){
		System.out.println("버스가 달립니다.");
	}
	
	//클래스의 추가 메소드 선언
	
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
	
}
