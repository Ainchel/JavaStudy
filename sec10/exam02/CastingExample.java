package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {

	//인터페이스 변수 선언 + 구현한 클래스 객체 대입
		Vehicle vehicle = new Bus(); // 여기서 강제 타입 변환 일어남
		
		//인터페이스의 메소드 호출
		vehicle.run();
//		vehicle.checkFare(); 호출 불가능. 현재 vehicle이 Vehicle 타입으로 강제 변환 되어있기 떄문.
		
		//Bus 타입으로 강제 타입 변환 후, 위의 호출안되던 메소드를 다시 불러보기.
		Bus bus = (Bus)vehicle; // 인터페이스 타입 변수를 구현된 클래스 타입으로 강제 변환
		bus.run();
		bus.checkFare(); // 구현된 클래스 타입으로 변환 후, 클래스의 메소드 호출이 가능해지는 것을 확인.
	}
}