package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {

		//Car 객체 생성
		Car myCar = new Car();
		
		//생성한 Car 객체의 필드인 Tire를 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//생성한 Car 객체의 필드 Tire의 자식인 HankookTire를 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//이번에는 Tire의 자식인 KumhoTire를 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
