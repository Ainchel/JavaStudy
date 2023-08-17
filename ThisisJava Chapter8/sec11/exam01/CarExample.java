package ch08.sec11.exam01;

public class CarExample {

	//두 개의 인터페이스를 구현한 클래스에서, 인터페이스 갈아끼우며 메소드 호출해보기.
	
	public static void main(String[] args) {

		//Car 객체 생성
		Car myCar = new Car();
		
		//구현한 인터페이스의 메소드를 호출하는 자기 자신 메소드 호출 
		myCar.run(); // 필드로 선언한 인터페이스에 끼워져 있는 자식 클래스의 메소드를 호출함.
		
		//자기자신의 인터페이스 필드에, 장착되어있는 클래스를 교체
		myCar.tire1 = new KumhoTire(); 
		myCar.tire2 = new KumhoTire();
		
		//장착되어있는 클래스를 교체했으므로, 클래스에서 오버라이딩한 다른 내용의 인터페이스산 추상메소드가 동작할 것이다.
		myCar.run();
	}

}
