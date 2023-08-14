package ch08.sec05;

import java.rmi.Remote;

public class Audio implements RemoteControl {

	//필드 선언
	private int volume;
	
	//인터페이스꺼 추상 메소드들 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio의 볼륨 : " + this.volume);
	}
	
	//추가로 필드 선언해보기
	private int memoryvolume;
	
	//인터페이스의 디폴트 메소드를 오버라이딩
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryvolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(ch08.sec03.RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음을 해제합니다.");
			setVolume(this.memoryvolume); // mute를 해제하면, 설정 시 저장한 볼륨값으로 되돌려주는 코드를 추가 
		}
	}
	
	
	
}
