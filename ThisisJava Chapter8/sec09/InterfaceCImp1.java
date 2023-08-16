package ch08.sec09;

public class InterfaceCImp1 implements InterfaceC {

	public void methodA() {
		System.out.println("부모 인터페이스 A의 methodA 실행");
	}

	public void methodB() {
		System.out.println("부모 인터페이스 B의 methodB 실행");
	}
	
	public void methodC() {
		System.out.println("자식 인터페이스 C의 methodC 실행");
	}

}
