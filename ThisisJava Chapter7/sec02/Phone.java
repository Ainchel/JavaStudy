package ch07.sec02;

//상속에 대하여.
//상속의 원래 의미란, 부모가 자식에게 무언가를 물려주는 것이다.
//자바의 상속 또한, 부모 클래스와 자식 클래스를 두고, 부모가 자식에게 필드와 메소드를 물려주는 것이다.
//상속은 이미 잘 개발되어 있는 클래스를 재사용하여 새로운 클래스를 만들 때 사용한다.
//이렇게 하면, 중복되는 코드를 줄여 개발 시간을 줄일 수 있고, 기존 클래스에서 확장된 기능을 가진 클래스를 만들어나갈 수 있다.
//또한, 다수의 클래스를 수정해야 할 필요가 있을 때, 부모 클래스만 수정해도 자식이 따라 수정되어 클래스의 수정을 최소화할 수도 있다.

//자바에서의 상속은, 부모 클래스가 아닌 자식 쪽에서 부모를 언급하는 방식으로 실행된다.
//상속 방법 : 자식 클래스를 선언할 때, 클래스명 뒤에 "extends 부모클래스명" 을 기재한다.
//예시) public class Son extends Parent
//                자식클래스명 + extends + 부모클래스명
//자바에서는 다중 상속이 불가능하므로, extends 뒤에는 하나의 클래스만 와야 한다.

//이후는 여기 클래스를 상속한 "SmartPhone" 클래스 참조.

//자바에서는 자식 객체를 생성하면 부모 객체를 먼저 생성한 후 자식 객체를 생성한다.
//즉, 자식 클래스로 new 연산자를 통해 자식 객체를 생성해도, 부모 객체가 먼저 생성되는 것이다.
//그리고 모든 객체는 생성자를 통해서 생성되므로, 위 시점에서 부모 생성자도 호출된다.
//부모 생성자 호출은, 자식 생성자가 호출되는 시점에 자식 생성자 맨 윗줄에 숨겨져있는 super();에 의해 실행된다.

//위 숨겨져있는 super()는 컴파일 과정에서 추가되며, 이는 부모 클래스의 기본 생성자를 의미한다.
//만일 부모 클래스에 기본 생성자가 없다면(특정 경우에서 발생 가능하다) 컴파일 에러가 발생한다.
//경우 1) 부모 클래스에서 매개변수를 갖는 생성자를 만들었다면, 자동으로 기본 생성자를 만들지 않아 없을 수 있다.
//위 경우 1의 상황에서는, 부모 클래스에서 기본 생성자를 선언하거나, 자식 클래스에 매개변수를 갖는 부모 생성자에 맞게 super()를 맞춰 호출해줘야 한다.

public class Phone {

	//필드 선언
	public String model;
	public String color;
	
	//부모 클래스에서 기본 생성자 선언
//	public Phone() {
//		System.out.println("부모 클래스 Phone의 기본생성자 실행됨");
//	}
	
	//부모 클래스에서 매개인자가 있는 생성자를 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모 클래스의 매개변수 있는 생성자가 실행되었습니다.");
	}
	
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangup() {
		System.out.println("전화를 끊습니다.");
	}
	
}
