package ch06.sec08;

public class Calculator_2_Example {

	//Calculator_2 클래스에서 오버로딩한 메소드를 호출해보기.
	
	public static void main(String[] args) {
	
	//Calculator_2 객체를 생성하기.
	Calculator_2 myCalcu = new Calculator_2();
	
	//정사각형의 넓이 구하기.(매개변수 하나만 넣기)
	double result1 = myCalcu.areaRectangle(10);
	
	//직사각형의 넓이 구하기.(매개변수 두 개 넣기)
	double result2 = myCalcu.areaRectangle(10, 20);
	
	System.out.println("정사각형의 넓이 : " + result1);
	System.out.println("직사각형의 넓이 : " + result2);
	
	}

}
