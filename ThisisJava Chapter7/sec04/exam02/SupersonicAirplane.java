package ch07.sec04.exam02;


public class SupersonicAirplane extends Airplane { // 자식 클래스

	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//상태를 가리키는 필드 선언
	public int flyMode = NORMAL;
	
	//메소드 오버라이딩
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//부모 클래스에서 보고 있는 상황/조건이면, 그냥 부모꺼 호출
		  super.fly();
		}
	}
}
