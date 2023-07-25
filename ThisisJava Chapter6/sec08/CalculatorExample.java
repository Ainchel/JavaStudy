package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {

		//아래는 Calculator 클래스에서 선언된 메소드 4종을 호출해보는 예제.
		
		//외부 클래스이므로, 메소드 호출을 위해 Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		
		//정수 매개변수를 2개 필요로 하는 plus 메소드를 호출하고, 결과값을 result1 변수에 대입하기.
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		
		//정수 매개변수를 2개 필요로 하는 divide 메소드를 호출하고, 결과값을 result2 변수에 대입
	
		double result2 = myCalc.divide(x, y); // divide의 리턴 타입이 double이므로, result2도 double 타입이다.
		System.out.println("result2 : " + result2);
		
		//리턴값 없는 powerOff() 메소드 호출
		myCalc.powerOff();
		
	}

}
