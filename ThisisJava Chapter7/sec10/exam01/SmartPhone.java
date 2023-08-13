package ch07.sec10.exam01;

//추상 클래스를 상속받은 자식 클래스는, 추상 클래스(즉, 부모 클래스)의 공통 필드와 메소드를 물려받는다.
//이후, 추가적인 필드와 메소드를 작성하여 특화된 클래스로 만들어낼 수 있다.

//추상클래스는 객체를 직접 생성할 수 없지만, 해당 클래스를 상속받은 자식 클래스는 new 연산자로 객체 생성이 가능하다.
//이렇게 생성된 객체는, 부모 클래스로부터 상속받은 멤버(turnOn과 turnOff 메소드 등)를 호출할 수 있다.

public class SmartPhone extends Phone { // 추상클래스를 상속한 자식 클래스

	//생성자 선언
	SmartPhone(String owner){
		super(owner); // 부모 클래스의 생성자를 반드시 호출해주어야 한다. (이번 부모 클래스는 매개인자도 가지고 있어서 반드시 명시해야 함)
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
	
}
