package ch06.sec10;

//정적 멤버(필드 + 메소드)에 대하여.
//자바는 클래스 로더를 이용해서 클래스를 메소드 영역에 저장하고 사용한다.
//정적 멤버란, 위의 메소드 영역의 클래스에 고정적으로 위치하는 멤버를 말한다.
//위 특징 덕분에, 정적 멤버는 객체를 사용하지 않아도 클래스를 통해 바로 사용할 수 있다.

//필드와 메소드 모두 정적 멤버가 될 수있다.
//정적 멤버로 만들려면 멤버 앞에 static 키워드를 추가해야 한다.
//static 키워드를 추가한 멤버 선언 양식은 아래 참조.
//static 타입 필드명 / static 리턴타입 메소드(매개변수, ...){실행문...}

//1)정적멤버는 모든 멤버가 가지는 공통적인 필드로 선언하는 것이 좋다.
//예시)원의 넓이나 둘레를 구하는 클래스가 있다면, PI 값은 객체마다 공통적으로 쓰는 고정된 값이므로 정적 필드로 선언한다.

//2)정적 메소드는 클래스의 인스턴스 필드를 사용하지 않는 메소드로 선언하는 것이 좋다.
//예시)두 수의 합을 구하는 메소드가 있다면, 내부 필드가 아닌 매개값을 받아 처리할 확률이 높으므로, 정적 메소드로 선언한다.
//예시2)반면, 내부의 필드 값을 변경하는 setter류 메소드는 인스턴스 메소드를 사용하므로, 정적 메소드로 선언하기 부적절하다.

//클래스가 메모리로 로딩된 후에는 정적 멤버들을 바로 사용할 수 있다.
//클래스명에 .을 찍으면 정적 멤버들로 바로 접근할 수 있다.
//클래스 객체 변수에 .을 찍어서도 정적 멤버에 접근할 수 있지만, 클래스 명으로 접근하는 것이 정석이다.
//이클립스에서는 객체 변수를 통해 정적 멤버에 접근하면 경고 표시를 낸다고 한다.

public class Calculator {

	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
	
}
