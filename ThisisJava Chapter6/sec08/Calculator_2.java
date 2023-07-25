package ch06.sec08;

//메소드의 오버로딩에 대하여.
	//메소드 오버로딩이란, 메소드의 이름은 같되 매개변수의 타입, 개수, 순서가 다른 메소드를 여러 개 선언하는 것이다.
	//메소드 오버로딩의 목적은, 다양한 매개값을 비슷한 동작으로 처리하기 위해서이다.
	
	//메소드 오버로딩을 하지 않을 경우, 한 동작을 하는 메소드의 매개변수를 한 유형으로밖에 선언할 수 없다.
	//예시)두 수를 더하는 plus 메소드가 있을 때, 매개변수를 int로 설정하면, 오버로딩하지 않는 이상 실수 매개변수(double)는 처리할 수 없다.
	//이럴 경우, plus 메소드를 오버로딩하여, 매개변수로 double을 받게끔 오버로딩하면 된다.
	
	//오버로딩된 메소드의 대표적인 예는 우리가 자주 쓰는 System.out.println() 메소드이다.
	//System.out.println() 메소드에 다양한 데이터를 넣어도 전부 출력을 해주는 이유는 다양한 데이터 타입으로 잔뜩 오버로딩 해뒀기 때문이다.

public class Calculator_2 {

	//아래는 사각형의 넓이를 구하는 메소드를, 매개변수 하나일 때 정사각형으로, 두개일 때 직사각형의 넓이로 계산하게끔 오버로딩하는 예제.
	
	//매개변수를 하나만 받아, 정사각형의 넓이(한 변 * 한 변)을 구하기.
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}


