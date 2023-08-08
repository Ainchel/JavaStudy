package ch07.sec04.exam02;

//메소드 오버라이딩 후의 부모 메소드 호출에 대하여.

//메소드를 재정의하면, 자식 메소드만 사용되기 때문에 자식 메소드 또한 부모 메소드의 내용을 가지고 있어야 한다.
//이럴 경우, 자식 메소드에서 부모 메소드 코드를 전부 적을 필요 없이, 자식 메소드에서 부모 메소드를 호출하면 된다.
//자식 메소드 내에서, super 키워드와 .연산자를 사용하여 부모 메소드를 호출할 수 있다.
//위 방법을 통해, 새로 처리해야 할 분기나 조건에 따라 자식 쪽에서만 추가된 코드를 실행하면 코드 작성을 아낄 수 있다.

public class Airplane { // 부모 클래스

	//메소드 선언
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
