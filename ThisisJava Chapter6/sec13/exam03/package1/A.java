package ch06.sec13.exam03.package1;

//필드와 메소드 또한 접근 제한자에 따라 호출 가능 범위가 결정된다.

//public 접근제한자일 경우, 모든 패키지에서 필드를 읽고 변경할 수 있으며 메소드를 호출할 수 있다.
//기재하지 않을(default) 경우, 같은 패키지에서만 필드를 읽고 변경할 수 있으며 메소드를 호출할 수 있다.
//private 접근제한자일 경우 해당 클래스 내부에서만 필드를 읽고 변경할 수 있으며 메소드를 호출할 수 있다.

public class A {

	//public 접근제한자를 갖는 필드 선언
	public int field1;
	//default 접근제한자를 갖는 필드 선언
	int field2;
	//private 접근제한자를 갖는 필드 선언
	private int field3;
	
	//생성자 선언
	public A() {
		//클래스 내부일 경우 접근제한자 상관없이 필드 변경 및 메소드 호출 가능
		
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//public 접근제한자를 갖는 메소드 선언
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
}
