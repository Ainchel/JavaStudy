package ch08.sec08;

public class MultiInterfaceInplExample {

	public static void main(String[] args) {

		//RemoteControl 인터페이스 변수 선언 및 객체에 대입
		RemoteControl rc = new SmartTelevision();
		//위 인터페이스 대입 중에는, 위 인터페이스의 추상 메소드만 호출 가능.
		rc.turnOn();
		rc.turnOff();
		//rc.search("abc"); 다른 인터페이스의 추상 메소드는 호출할 수 없다.
		
		//Searchable 인터페이스 변수를 선언한 후, 동일한 객체에 대입

		Searchable searchable = new SmartTelevision();
		searchable.search("https://youtube.com"); // 현재 인터페이스 타입에 선언된 추상 메소드만 호출 가능하다.
		//searchable.turnOn();
		//searchable.turnOff(); 다른 인터페이스의 추상메소드는 호출 불가능.
	}

}
