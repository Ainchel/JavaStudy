package ch08.sec06;

//정적 메소드에 대하여.

//인터페이스 내에서 정적 메소드 또한 선언이 가능하다.
//정적 메소드는, 객체 없이 인터페이스만으로도 호출이 가능하다.
//선언 및 정의 방법은 클래스의 정적 메소드와 완전히 동일하다.
//다만, 인터페이스에서는 public 제한자를 생략해도, 컴파일 과정에서 자동으로 붙여준다.

public interface RemoteControl {

	//인터페이스에서 정적 메소드를 선언해보기.
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 선언
	void turnOn();
	void tirnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute == true) {
		System.out.println("mute로 설정합니다.");
		} else {
		System.out.println("mute설정을 해제합니다.");
		}
		//내부 코드는 생략
	}
	
	//정적 메소드 선언
	static void changeBattery() { // public은 생략해도 붙여준다.
		System.out.println("리모콘 배터리를 교체합니다.");
	}
	
}
