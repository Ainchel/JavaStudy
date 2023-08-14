package ch08.sec02;

//인터페이스도 하나의 타입이라, 변수 타입으로 선언 및 사용할 수 있다.
//인터페이스는 참조 타입에 속하여, null을 대입할 수 있다.

//인터페이스를 통해 구현 객체를 쓰려면, 해당 인터페이스를 구현 중인 클래스의 객체를 대입해야 한다.
//인터페이스를 구현한 객체를 인터페이스 타입 변수에 대입하고 나면, 해당 객체의 오버라이딩된 메소드를 호출할 수 있게 된다.
//인터페이스 타입 변수 또한, 선언과 동시에 초기화(구현된 클래스의 객체일 것이다)가 가능하다.

//인터페이스 타입 변수에는, 여러개의 구현된 클래스가 있을 경우 그 객체를 자유롭게 바꿔낄 수 있다.
//예시) 인터페이스 타입 변수 a에, 구현된 클래스 b와 c가 있다면, a = b 혹은 c 객체로 얼마든지 바꿔끼는 게 가능하다.

public class RemoteControlExample {

	public static void main(String[] args) {

		//인터페이스 타입 변수 생성 및 구현된 객체를 대입
		RemoteControl rc;
		rc = new Television(); // 인터페이스 타입 변수에, 구현된 클래스 Television 객체를 대입
		rc.turnOn(); // 이럴 경우, 구현된 객체에 오버라이딩된 메소드를 호출한다.

		//인터페이스 타입 변수의 선언과 동시에 초기화 예제.
		RemoteControl rc2 = new Television();
		rc2.turnOn(); // Television 클래스의 turnOn() 호출.
		//기존 인터페이스 타입 변수에, 구현된 클래스의 새 객체를 대입 (가능)
		rc2 = new Audio();
		rc2.turnOn(); // Audio 클래스의 turnOn() 호출.
		
	}

}
