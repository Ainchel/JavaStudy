package ch03.sec02;

public class ArithmeticOperatorExample {
	//산술연산자에 대하여.
	//산술연산자는 +, -, *, /, %로 총 다섯개이다.
	//사칙연산에 나머지 연산자(%)가 하나 더 추가되어 있다.
	//곱셈의 경우 *, 나눗셈의 경우 /를 사용하는 것에 주의.
	//나머지 연산자는 나눗셈 후의 몫이 아닌 나머지 값을 산출하는 연산자이다.
	
	//산술 연산자를 사용할 때의 연산 결과에 대한 규칙은 아래에.
	//1)피연산자가 정수일 경우, 연산의 결과는 아래 예외를 제외하고는 int 타입이다.
	//2)정수 간 연산 중 피연산자에 long이 있을 경우, 연산 결과 타입도 long 타입이어야 한다.
	//3)피연산자 중 실수가 있을 경우, 연산 결과도 실수 타입이어야 한다.
	
	public static void main(String[] args) {
	//아래는 다양한 산술연산자를 통한 연산의 예시.
	byte v1 = 10;
	byte v2 = 4;
	int v3 = 5;
	long v4 = 10L;
	
	int result1 = v1 + v2; // 정수 간 연산이므로, int 타입으로 자동 변환 후 연산된다.
	System.out.println("result1 : " + result1);
	
	long result2 = v1 + v2 - v4; // 피연산자에 long이 있으므로, 모두 long으로 자동 타입 변환 후 연산
	System.out.println("result2 : " + result2);
	
	double result3 = (double) v1 / v2; // double 타입으로 강제 변환된 후, 실수 - 정수 간 연산이므로 실수로 변환되어 연산
	System.out.println("result3 : " + result3);
	
	int result4 = v1 % v2;
	System.out.println("result4 : " + result4);
	
	}

}
