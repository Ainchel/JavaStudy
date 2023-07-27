package ch06.sec11;

public class EarthExample {

	//Earth 클래스에서 선언한 상수 필드 읽어서 사용해보는 예제.
	
	public static void main(String[] args) {
		//상수 필드 읽기
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
	}
}