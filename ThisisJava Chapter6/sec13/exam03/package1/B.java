package ch06.sec13.exam03.package1;

public class B { // A와 동일한 패키지에 있는 다른 클래스

	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1; // public 접근제한자 필드는 동일한 패키지에서 변경 가능
		a.field2 = 1; // default 접근제한자 필드도 동일한 패키지에서 변경 가능
		a.field3 = 1; // private 접근제한자 필드는 동일 패키지에서 변경 불가능
			
		//메소드 호출
		a.method1(); // public 접근제한자 메소드는 동일 패키지에서 호출 가능
		a.method2(); // default 접근제한자 메소드도 동일 패키지에서 호출 가능
		a.method3(); // private 접근제한자 메소드는 동일 패키지에서 호출 불가능.
		
	}
	
	
}
