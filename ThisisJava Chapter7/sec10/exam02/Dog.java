package ch07.sec10.exam02;

public class Dog extends Animal {

	//추상 클래스의 추상 메소드를 재정의 (반드시 해야 한다. 안할 시 에러)
	@Override
	public void sound() {
		System.out.println("강아지는 멍멍 하고 웁니다.");
	}
}
