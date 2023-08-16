package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	//복수 개의 인터페이스 구현 시, 위와 같이 각 인터페이스를 컴마로 구분하여 기재한다.
	
	//또한, 위 인터페이스들의 추상 메소드들을 전부 오버라이딩하여야 한다.
	
	//아래 두 메소드는 RemoteControl의 추상 메소드.
	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV를 끕니다.");
	}
	//아래 메소드는 Searchable의 추상 메소드.
	@Override
	public void search(String url) {
		System.out.println("스마트TV로 입력하신 URL을 검색합니다.");
	}
	
}
