package ch08.sec11.exam02;

//구현을 시킬 클래스 쪽에서, 다양한 인터페이스로 갈아낄 인터페이스 매개변수의 메소드를 선언할 예정.
//이 Bus가 인터페이스를 구현하는 클래스라면, 구현 중인 인터페이스가 매개변수인 메소드에 이 클래스의 객체를 넣을 수 있다.
//해당 인터페이스를 구현중인 타입이라면 무엇이든 매개값으로 줄 수 있으며, 이때 다른 타입마다 오버라이딩된 메소드라면 실행이 달라질 것이다.
//이를 인터페이스에 있어서, 매개변수의 다형성이라고 일컫는다.

public class Bus implements Vehicle {
	
	//인터페이스의 추상메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
