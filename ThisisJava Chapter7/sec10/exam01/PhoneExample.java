package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {

		SmartPhone smartPhone = new SmartPhone("홍길동"); //자식클래스 객체 생성
		
		smartPhone.turnOn(); // 부모 클래스의 메소드를 물려받았으므로 호출 가능.
		smartPhone.internetSearch(); // 자기 자신의 메소드 호출
		smartPhone.turnOff(); // 부모 클래스의 메소드를 물려받았으므로 호출 가능.
	}
}
