package ch08.sec04;

//인터페이스로 구현 객체를 선언하려면, 인터페이스 타입 변수를 선언한 후 구현시킨 클래스의 객체를 대입한다.
//인터페이스 타입 변수는 참조형이므로, 객체가 대입되면 주소값을 저장한다.

//구현객체를 대입한 타입 변수를 통해서, 해당 객체가 가진 클래스의 오버라이딩된 인터페이스쪽 메소드를 사용할 수 있다.
//어떤 클래스의 객체를 대입했느냐에 따라, 오버라이딩된 메소드는 다른 실행을 할 것이다.

public class RemoteControlExample {

	public static void main(String[] args) {

		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성한 후, 인터페이스 변수에 대입
		rc = new Television(); // 인터페이스 변수에 Television 대입 - 메소드 실행 시, Television의 오버라이딩된 메소드 호출
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//인터페이스 변수를 Audio 클래스 객체로 바꿔끼기
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
