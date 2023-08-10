package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A { // 다른 패키지의 A 클래스 상속

	//다른 패키지의 클래스 A를 상속받은 후, protected 멤버에 접근해보기.
	
	public D() { // 접근 가능.
		super();
		//상속되었으므로, 이거 쓰면 부모(A) 생성자 호출됨. 
	}
	
	
	public void method1() {
		
		//상속한 타 패키지 A 클래스의 protected 필드 접근 가능.
		this.field = "value";
		
		//상속한 타 패키지 A 클래스의 protected 메소드 접근 가능.
		this.method();
	}
	
	public void method2() {
		A a = new A(); // 상속한 상태가 아닌, 객체 생성을 통한 접근은 모두 막힘. 생성자 접근 불가.
		a.field = "value"; // 객체 생성도 안됐지만, 아무튼 접근 불가.
		a.method(); // 메소드도 접근 불가.
	}
	
}
