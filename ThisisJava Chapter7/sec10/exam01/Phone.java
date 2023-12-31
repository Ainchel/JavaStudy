package ch07.sec10.exam01;

//추상 클래스에 대하여.

//추상 클래스란? 객체를 생성할 수 있는 실체 클래스들의, 공통적인 필드나 메소드를 추출해서 선언만 해둔 클래스를 추상 클래스라고 한다.
//예를 들면 : 새, 곤충, 물고기, 닭, 고양이 등의 실체 클래스가 있다면, 공통적인 필드나 메소드를 가지는 "동물" 이라는 추상 클래스가 존재할 수 있다.

//즉, 추상 클래스는 실체 클래스에 공통적인 필드나 메소드를 상속시켜주는 역할을 할 수 있다.
//다시 예를 들면 : Animal이라는 추상 클래스를 상속받은 Bird, Insect, Fish를 만들 수 있다.

//추상 클래스는 실체를 만들수 없기 때문에, new 연산자를 통하여 객체를 만들 수 없다.
//즉, 추상 클래스는 부모 클래스로만 사용할 수 있으며, extends 뒤에만 올 수 있다.

//추상 클래스의 선언 방법 : 클래스 선언 시, 클래스명 앞에 abstract 키워드를 붙인다.
//즉, abstract 키워드가 붙은 클래스는 부모일 수만 있으며, 자식클래스를 만들 수만 있다.

//추상 클래스도 필드, 메소드를 선언할 수 있다. 그리고 자식객체가 생성될 때 부모 생성자를 반드시 호출하므로 생성자도 있어야만 한다.

public abstract class Phone { // "abstract" 키워드를 사용하여 추상 클래스 선언 : 얘는 부모만 됨.

	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
