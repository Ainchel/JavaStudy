package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {

		//객체 생성
		Car myCar = new Car();
		
		//잘못된 속도 입력 후, 메소드를 통해 값 조정
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//제대로된 속도 입력
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈추기
		if(!myCar.isStop()) {
		myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
	}

}
