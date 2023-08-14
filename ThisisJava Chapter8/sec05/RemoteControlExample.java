package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {

		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성 후, 인터페이스 타입 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드를 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//디폴트 메소드를 오버라이딩한 Audio로 객체 갈아끼우고 메소드 호출해보기
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5); 
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false); // 얘가 오버라이딩한 메소드
		
	}

}
