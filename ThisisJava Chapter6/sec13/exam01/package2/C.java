package ch06.sec13.exam01.package2;

import ch06.sec13.exam01.package1.*;

public class C { // A,B 클래스와 패키지가 다른 클래스 C
	
	//필드 선언
	A a; // A 클래스가 default로 설정되어 있을 때, 다른 패키지에서 사용할 수 없음.
	B b; // b 클래스는 public으로 설정되어 있어, 다른 패키지에서도 사용할 수 있음.
	
	A a1 = new A(true); // public 생성자는 다른 패키지에 있어도 접근 가능
	A a2 = new A(1); // default 생성자는 다른 패키지에 있다면 접근 불가
	A a3 = new A("문자열"); // private 생성자도 다른 패키지에 있다면 접근 불가
}
