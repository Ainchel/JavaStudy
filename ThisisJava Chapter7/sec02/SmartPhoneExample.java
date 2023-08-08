package ch07.sec02;

//실행 메소드.

public class SmartPhoneExample {

	public static void main(String[] args) {

		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//Phone으로부터 상속받은 필드를 SmartPhone에서 참조해보기.
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone 본인의 필드 참조해보기.
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출해보기.
		myPhone.bell();
		myPhone.sendVoice("もしもし");
		myPhone.receiveVoice("はい、こちら○○です。");
		myPhone.sendVoice("ありがとうございます。");
		myPhone.hangup();
		
		//SmartPhone 본인의 메소드 호출해보기.
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
