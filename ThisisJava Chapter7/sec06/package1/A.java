package ch07.sec06.package1;

//상속 상황에서의 protected 접근 제한자에 대하여.

//이전 6장 13절에서, 접근 제한자 private, public에 대해 살펴보았다.
//이번에는 상속과 연관이 있는 접근 제한자 protected에 대해 알아본다.
//protected는 public과 default의 중간 정도에 해당하는 접근 제한을 가진다.

//protected는 같은 패키지 내에서는 default처럼 접근이 가능하다.
//하지만 다른 패키지에서는, 자신의 자식 클래스까지만 접근을 허용한다.
//protected 접근 제한자는 필드, 생성자, 메소드에 사용 가능하다.

public class A {

	//protected 제한자로 필드, 생성자, 메소드 선언하기.
	
	//필드 선언
	protected String field;
	
	//생성자 선언
	protected A() {}

	//메소드 선언
	protected void method() {
		
	}
}
