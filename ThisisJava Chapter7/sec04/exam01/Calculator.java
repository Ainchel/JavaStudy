package ch07.sec04.exam01;

//메소드의 재정의(오버라이딩)에 대하여.

// 자식 클래스는 부모 것을 상속받아서 쓰지만, 어떤 부모의 메소드는 자식 클래스에서 사용하기 적절하지 않을 수 있다.
// 이런 경우, 자식 클래스에서 부모 클래스의 메소드를 재정의하여 사용할 수 있으며, 이를 메소드 오버라이딩이라고 한다.

// 메소드 오버라이딩이란, 상속된 메소드를 자식 클래스에서 재정의하는 것이다.
// 자식 클래스에서 오버라이딩된 메소드가 있다면, 자식 클래스에서 부모의 원래 메소드는 숨겨지고, 자식 클래스의 메소드가 우선적으로 실행된다.

// 메소드를 오버라이딩할 때에는 아래의 규칙을 따라야 한다.
// 1) 선언(리턴 타입, 메소드 이름, 매개변수)이 부모의 원본 메소드와 동일해야 한다.
// 2) 부모의 원본 메소드가 가진 접근제한보다 더 좁은 범위로는(public -> private) 오버라이딩할 수 없다.
// 3) 새로운 예외를 throws할 수 없다 (10장에서 추가 설명)

// 자바에서는 메소드 오버라이딩을 했을 경우, 제대로 되었는지 확인하는 어노테이션?을 제공한다.
// 해당 어노테이션 : 오버라이딩할 메소드 위에 @Override 기재.
// @Override가 있을 경우, 오버라이딩에 문제가 있을 시 컴파일 오류를 출력시켜준다.



public class Calculator {

	//원주율 값으로 원의 넓이를 구하는 메소드 선언
	public double areaCircle(double r) {
		System.out.println("부모 클래스의 areaCircle 메소드 실행");
		return 3.14159 * r * r;
	}
	
}