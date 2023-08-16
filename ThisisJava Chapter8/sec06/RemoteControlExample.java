package ch08.sec06;

//인터페이스에 선언된 정적 메소드는 객체 없이 인터페이스명만으로도 접근/호출이 가능하다.

//정적 메소드의 실행부(블럭에 있는 코드)를 작성할 떄의 주의점은, 객체가 필요한 메소드(추상 메소드, 디폴트 메소드, private 메소드) 등을 호출할 수 없다는 것이다.
//왜냐하면, 정적 메소드는 객체 없이 호출하는 메소드라서, 객체를 필요로 하는 메소드와 호출 방식이 다르기 때문이다.

public class RemoteControlExample {

	public static void main(String[] args) {

		//인터페이스의 정적메소드 사용 예제
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 인터페이스 변수에 대입 - 생략
		//Audio 객체를 생성 후 인터페이스 변수에 갈아끼기 - 생략
		//Default 메소드 호출 - 생략
		
		//정적 메소드 호출해보기
		RemoteControl.changeBattery();
		
	}

}
