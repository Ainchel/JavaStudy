package ch08.sec10.exam1;

public class PromotionExample {

	public static void main(String[] args) {

		//직or간접적으로 구현 상태인 클래스들을, 인터페이스 타입으로 자동 변환 시켜보는 예제.
		
		//구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a;
		
		//인터페이스 변수에 위 객체들 대입(할 시 자동 타입변환됨)
		
		a = b; // A -> B
		a = c; // A -> C
		a = d; // A -> B -> D
		a = e; // A -> C -> E
	}
}
