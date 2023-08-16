package ch08.sec03;

//인터페이스의 상수 필드에 대하여.

//인터페이스는, public static final 속성으로 선언된 상수 필드를 가질 수 있다.
//인터페이스의 필드는 반드시 위 속성을 가져야하므로, 적지 않아도 컴파일 단계에서 위 속성을 붙여준다.

//상수 필드는 대문자로 작성하되, 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로 구분해준다.

public interface RemoteControl {

	//인터페이스의 상수 필드 선언해보기.
	int MAX_VOLUME = 10; // 상수 필드는 선언과 동시에 초기화해야 한다.
	int MIN_VOLUME = 0;
	
}