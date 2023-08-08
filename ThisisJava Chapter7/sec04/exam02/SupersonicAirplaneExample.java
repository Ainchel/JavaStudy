package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	//실행 메소드 - 상태값 별로 오버라이딩 된 자식 메소드 / 부모 메소드 호출시켜보기.
	
	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
