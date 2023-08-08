package ch07.sec02;

//Phone 클래스를 상속한 SmartPhone 클래스 선언.
//이후 main메소드가 있는 실행클래스는 SmartPhoneExample 클래스 참조.

public class SmartPhone extends Phone {

	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		//자식 클래스쪽에서 부모의 기본생성자인 super() 호출
		//부모 클래스에 기본 생성자가 존재하지 않을 경우, 기본생성자 super();는 컴파일 에러가 발생한다.
		//super(); // 생략 가능하며, 생략 시 컴파일 시점에서 자동으로 추가된다.
		super(model, color); // 부모 클래스에 매개인자 있는 생성자가 있을 경우, 자식 클래스에서 그와 같은 매개인자로 생성자를 호출해야 한다.
							 // 아니면, 부모 클래스에 기본 생성자 메소드를 명시해서 적어두던가.
		
		this.model = model;
		this.color = color;
		System.out.println("자식 클래스의 매개변수 있는 생성자가 실행되었습니다.");
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경하였습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
}
