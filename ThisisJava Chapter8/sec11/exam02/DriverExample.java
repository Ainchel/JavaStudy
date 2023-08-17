package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {

	//구현된 클래스 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 인터페이스를 구현한 클래스 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//인터페이스의 메소드에, 위의 구현한 클래스 객체를 대입하여 각 오버라이딩된 메소드 호출
		//이럴 경우 자동 타입변환이 일어나, 구현한 객체의 오버라이딩된 메소드가 실행된다.
		
		driver.drive(bus); // 인터페이스를 구현 중인 클래스 객체를 대입
		driver.drive(taxi); // 인터페이스를 구현 중인 클래스 객체를 대입
	}

}
