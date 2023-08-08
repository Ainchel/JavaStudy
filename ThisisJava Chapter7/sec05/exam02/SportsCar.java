package ch07.sec05.exam02;

public class SportsCar extends Car {

	//오버라이드 메소드 선언
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//아래 함수는 부모에서 final로 설정해둬 오버라이딩 불가능.
	//주석을 제거할 경우, "Car 클래스에서 final 메소드인 stop을 오버라이드 할 수 없습니다" 라고 에러뜸.
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춥니다.");
//		speed = 0;
//	}
	
	
}
