package ch08.sec02;

//어떤 객체 A가 인터페이스의 추상 메소드를 호출하면, 인터페이스는 연결된 객체 B의 메소드를 실행한다.
//그렇다면, 객체 B에는 인터페이스의 추상 메소드를 오버라이딩한 메소드를 가지고 있을 것이다.
//이 때 객체 B는, 인터페이스를 구현한 객체라고 한다. 상속과 비슷하게, 인터페이스의 구현은 해당 객체의 클래스에 명시되어야 한다.
//인터페이스 구현을 명시하는 형식은 아래와 같다.
//public class B implements 인터페이스명 {...}

//implements 키워드는 이름을 입력한 인터페이스를 사용하겠다는 표시이며, 인터페이스의 추상메소드를 오버라이딩하겠다는 뜻이기도 하다.

public class Television implements RemoteControl { // 인터페이스 RemoteControl을 구현한 Television 클래스 선언

	@Override
	public void turnOn() { //RemoteControl 인터페이스의 turnOn() 메소드를 오버라이딩
		System.out.println("TV를 켭니다.");
	}
	
}
