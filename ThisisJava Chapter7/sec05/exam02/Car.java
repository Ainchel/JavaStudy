package ch07.sec05.exam02;

//final 메소드에 대하여.

//메소드를 선언할 때 final을 붙이면, 메소드의 오버라이딩을 할 수 없게 된다.
//즉, 부모 클래스에 final 메소드가 있을 경우, 자식 클래스에서 이 메소드를 재정의할 수 없다.

public class Car { // 부모 클래스가 될 클래스
	
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed++;
	}

	//final 메소드 선언 : 자식 클래스에서 오버라이딩 되는지 확인해보기.
	public final void stop() {
		System.out.println("차를 멈춥니다.");
		speed = 0;
	}
}
