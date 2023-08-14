package ch08.sec04;

//인터페이스의 추상 메소드에 대하여.

//인터페이스는, 구현 클래스가 오버라이딩해야만 하는 멤버 메소드를 추상 메소드로 가질 수 있다.
//추상 메소드란, 중괄호가 기재되지 않는 메소드를 선언만 하는 것이다.
//인터페이스 내에선, 추상 메소드에 public와 abstract를 생략해도 컴파일 때 자동으로 붙여준다.

//추상 메소드는, 해당 인터페이스를 통해 어떤 메소드들을 호출할 수 있는지 알려준다.
//인터페이스를 구현한 객체는, 반드시 그 추상 메소드를 오버라이딩한 메소드를 가지고 있을 것이기 때문이다.
//RemoteControl 인터페이스를, 이따가 Television과 Aidio 클래스에서 구현해볼 예정이다.

//인터페이스의 추상메소드는, 기본적으로 public 접근 제한자를 가지기 때문에, 오버라이딩할때 이보다 낮은 접근제한으로는 설정할 수 없다.
//즉, 추상메소드를 오버라이딩한 메소드들도 모두 public 속성이어야 한다.

public interface RemoteControl {

	//상수 필드 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
