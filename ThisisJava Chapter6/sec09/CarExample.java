package ch06.sec09;

public class CarExample {

	
	public static void main(String[] args) {
	//인스턴스 멤버 및 this문법으로 설계한 클래스로 객체 생성 및 멤버 메소드 호출 예제.

	Car myCar = new Car("포르쉐");
	Car yourCar = new Car("벤츠");
		
	myCar.run();
	yourCar.run();
	}

}
