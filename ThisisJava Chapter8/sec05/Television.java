package ch08.sec05;

public class Television implements RemoteControl {

	private int volume;
	
	//인터페이스꺼 추상 메소드들 오버라이딩
		@Override
		public void turnOn() {
			System.out.println("Television을 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("Television을 끕니다.");
		}
		
		@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 Television의 볼륨 : " + this.volume);
		}
	
}
