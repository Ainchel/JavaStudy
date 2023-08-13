package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {

		//Driver 객체 생성
		Driver driver = new Driver();
		
		//매개값으로 서로 다른 객체(부모자식관계)를 넣어 drive() 실행해보기.
		Bus bus = new Bus();
		driver.drive(bus); // driver.drive(new Bus()); 로도 같은 결과를 얻을 수 있다.
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);//driver.drive(new Taxi()); 로도 같은 결과를 얻을 수 있다.
	}
}
