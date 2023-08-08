package ch07.sec04.exam01;

public class Computer extends Calculator { //Calculator 클래스를 상속
						//이후, 원주율 값을 더욱 정교하게 바꾼 넓이 메소드로 오버라이딩.
	
	//부모의 메소드를 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("자식 클래스의 areaCircle 메소드가 호출되었습니다.");
		return Math.PI * r * r;
	}
}
