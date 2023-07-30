package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {// A클래스와 다른 패키지의 클래스

	public C() {
		//생성자에서 A클래스 객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1; // public 접근제한자 필드는 다른 패키지에서 필드 변경 가능
		a.field2 = 1; // default 접근제한자 필드는 다른 패키지에서 필드 변경 불가
		a.field3 = 1; // private 접근제한자 필드는 다른 패키지에서 필드 변경 불가
		
		//메소드 호출
		a.method1(); // public 접근제한자 메소드는 다른 패키지에서 메소드 호출 가능
		a.method2(); // default 접근제한자 메소드는 다른 패키지에서 메소드 호출 불가능
		a.method3(); // private 접근제한자 메소드는 다른 패키지에서 메소드 호출 불가능
		
	}
	
}
