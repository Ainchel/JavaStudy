package ch07.sec06.package1;

public class B {

	//같은 패키지에서 선언한 A 클래스의 protected 제한자에 접근해보기.
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		}
	}
	
