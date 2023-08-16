package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {

		//상속된 인터페이스를 구현한 클래스 객체를 생성해서 메소드 호출해보기.
		
		InterfaceCImp1 imp1 = new InterfaceCImp1();
		
		//상속된 부모 인터페이스 변수에 구현된 클래스 객체 대입
		InterfaceA ia = imp1;
		ia.methodA(); // 자기자신 메소드 호출 가능.
		//ia.methodB(); // 상속 관계가 아닌 인터페이스 및 부모 입장에서 자식 메소드는 호출 불가.
		System.out.println();
		
		//상속된 다른 부모 인터페이스 변수에 클래스 객체 대입
		InterfaceB ib = imp1;
		ib.methodB(); // 위에서 호출 안됐던 메소드 호출 가능.
		//ib.methodA(); //상속 관계가 아닌 인터페이스 및 부모 입장에서 자식 메소드는 호출 불가.
		System.out.println();
		
		//상속된 자식 인터페이스 변수에 클래스 객체 대입
		InterfaceC ic = imp1;
		ic.methodA(); // 자식 인터페이스 변수일 때에는, 부모 인터페이스의 메소드까지 호출 가능.
		ic.methodB(); // 자식 인터페이스 변수일 때에는, 부모 인터페이스의 메소드까지 호출 가능. 
		ic.methodC(); // 
	}
}
