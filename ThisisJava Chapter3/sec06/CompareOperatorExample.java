package ch03.sec06;

public class CompareOperatorExample 
{
	//비교 연산자에 대하여.
	//비교 연산자란, 동등(==, !=) 혹은 크기(<, <=, >, >=)에 따른 결과를 true/false로 결정하는 연산자이다.
	//흐름 제어문인 조건문(if), 반복문(for) 등에서 실행 분기를 제어할 때 많이 사용된다.
	//1) 동등 비교 연산자 == : 두 피연산자의 값이 같은지를 검사한다.
	//2) 동등 비교 연산자 != : 두 피연산자의 값이 다른지를 검사한다.
	//3) 크기 비교 연산자 > : 연산자 좌측의 값이 우측의 값보다 큰지 검사한다.
	//4) 크기 비교 연산자 >= : 연산자 좌측의 값이 우측의 값보다 크거나 같은지 검사한다.
	//5) 크기 비교 연산자 < : 연산자 좌측의 값이 우측의 값보다 작은지 검사한다.
	//6) 크기 비교 연산자 <= : 연산자 좌측의 값이 우측의 값보다 작거나 같은지 검사한다.
	
	//피연산자의 타입이 서로 다르다면, 비교 연산 전에 타입을 일치시킨다.
	//예시) 정수 65와 'A' 값을 비교한다면, 'A'를 유니코드 값 65로 변환한 후 비교 연산한다.
	//예시) 정수 3과 실수 3.0 값을 비교한다면, 정수를 실수 타입으로 변환한 후 비교 연산한다.
	//예외로, 실수 중 double인 0.1과 float인 0.1을 비교 연산하면 false가 된다. (부동소수점으로 인하여 값이 일치하지 않는다.)
	
	//문자열 간의 동등 비교 연산은 ==나 !=가 아닌 equals()와 !equals()를 사용한다.
	
	public static void main(String[] args) 
	{
		//아래는 다양한 동등/비교 연산자 사용 예시
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5 : " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8 : " + result8);
		System.out.println("result9 : " + result9);
	}
}
