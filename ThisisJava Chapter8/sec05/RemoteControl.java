package ch08.sec05;

//디폴트 메소드에 대하여.

//인터페이스 내에, 완전한 실행 코드를 가진 디폴트 메소드를 선언할 수 있다.
//추상 메소드와 다르게, 디폴트 메소드는 실행 블록과 코드가 있다.
//클래스의 메소드와 선언 방법은 동일하며, default 키워드를 리턴 타입 앞에 붙여줘야 한다.
//인터페이스에서 실현부까지 있는 메소드이므로, 별도로 오버라이딩 하지 않으면 인터페이스 고유의 메소드로 사용 가능할듯.

//디폴트 메소드의 실행부에는 상수 필드를 읽거나, 추상 메소드를 호출하는 코드를 작성할 수 있다.

//디폴트 메소드는 구현 객체가 필요한 메소드이다. 즉, 인터페이스를 구현한 클래스 객체를 생성한 후 호출해야 한다.



public interface RemoteControl {

	//상수 필드 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드 선언
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메소드 호출과 동시에 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음모드를 해제합니다.");
		}
		
	}
	
	
}
