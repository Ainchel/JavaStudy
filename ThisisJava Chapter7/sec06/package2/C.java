package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {

	//다른 패키지에서 A 클래스의 protected 멤버들 접근해보기.
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	
	
}
