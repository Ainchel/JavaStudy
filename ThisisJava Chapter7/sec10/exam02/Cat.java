package ch07.sec10.exam02;

public class Cat extends Animal {

	//추상 클래스의 추상 메소드 재정의(반드시 해야 함)
	@Override
	public void sound() {
		System.out.println("고양이는 야옹 하고 웁니다.");
	}
	
}
