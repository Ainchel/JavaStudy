package ch06.sec11;

//세상에는 불변의 값이 있으며, 이런 값들을 저장하는 필드를 상수라고 한다.
//상수는 객체마다 저장할 필요가 없고, 여러 값을 가져서도 안 된다.
//따라서 static이며(객체마다 저장할 필요가 없으니 정적으로) final(값 변경 없이 하나로 가야 하니까) 속성이어야 한다.
//static과 final을 동시에 적용하는 필드 선언법은 아래와 같다.
// static final 타입명 변수명    <<<초기화 방법은 아래에.
// static final 변수는 선언 과 동시에 초기화가 일반적이지만, 초기화가 복잡할 경우에는 정적 블록을 사용할 수 있다.
//상수 필드명은 전부 대문자로 적는 것이 관례이며, 단어 구분은 언더바(_)로 한다.
//또한 상수는 정적 필드(static)이므로 객체 없이 클래스로 접근해서 읽을 수 있다.



public class Earth {
	//아래는 클래스에서 상수 필드를 선언 및 초기화하는 예제.
	
	//상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	//정적 블록에서 초기화할 상수 선언
	static final double EARTH_SURFACE_AREA;
	
	//정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		//Math.PI는 마침 자바에서 제공해주는 실수 상수이다. 클래스로 접근 가능한 것에 주목.
	}
}
