package ch06.sec13.exam01.package1;

public class B { //default 접근제한자인 A와 동일 패키지 내에 있는 클래스 B
	
	A a ; // default 접근제한자인 A는 동일 패키지인 B에서 접근이 가능하다.

	//필드 선언
	
	A a1 = new A(true); // public 접근제한자인 생성자는 동일 클래스에서 사용 가능
	A a2 = new A(1); // default 접근제한자인 생성자도 동일 클래스에서 사용 가능.
	//A a3 = new A("문자열"); // private 접근제한자인 생성자는 동일 패키지에서 사용 불가능함.
	
}
