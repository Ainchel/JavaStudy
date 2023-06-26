package ch02.sec07;

public class PromotionExample 
{
	//자동 타입 변환(타입 변환) 예제.
	//자동 타입 변환은 영어로 Promotion이라고 한다. 수동 타입 변환인 Casting과 단어가 다름에 주의.	
	//자동 타입 변환은 값의 허용 범위가 작은 타입에서 -> 허용 범위가 큰 타입으로 대입될 때 발생한다.
	//등호(= : 대입 연산자)를 두고 있을 때, = 왼쪽의 타입이, = 오른쪽의 타입보다 큰 데이터 타입일때 발생한다.
	
	//아래는 기본 타입들을 허용 범위(데이터 타입 크기 순 + 정수->실수) 순으로 나열한 결과.
	//byte(1byte) < short / char(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte).
	//정리하면, 정수 내에서 먼저 크기 순(byte - long까지)으로, 정수 후 실수 + 크기 순으로(float - double) 정렬한다.
	//정수 타입이 실수 타입에 대입되는 경우에는, 크기 상관 없이 무조건 실수로 자동 자동 타입 변환된다.
	
	//char타입 -> int타입으로 자동 타입 변환될 경우, 입력한 문자의 유니코드 값이 대입된다.
	//**위 규칙에서, byte타입 -> char타입으로의 변형은 불가능한 예외이다. (char형의 범위에 음수가 없어, byte 값을 담을 수 없는 경우가 생기기 때문이다.)
	
	
	public static void main(String[] args) 
	{
		//아래는 정수 자동 타입 변환 예제.
		byte byteValue = 10;
		int intValue = byteValue; // 이 경우 우측 byte가 좌측 int로 자동 타입 변환된다. (허용범위 더 큼)
		//위와 같은 자동 타입 변환이 이루어질 때, 내부 메모리에서 값이 복사되는 과정은 다음과 같다.
		//intValue의 00000000 00000000 00000000 00000000에 byteValue의 00001010가 대입.
		//intValue의 가장 오른쪽 00000000에 byteValue의 00001010이 대입된다.
		
		//아래는 실수 타입 변환의 예시.
		long longValue = 5000000000L; // 정수형 long으로 선언
		float floatValue = longValue; // long -> float으로 타입 변환(5.0E9f)
		double doubleValue = longValue; // float -> double로 타입 변환(5.0E9)

		//아래는 char -> int로의 타입 변환 예시.
		char charValue = 'A';
		intValue = charValue; // A의 유니코드인 65 값이 대입됨.
		
		//아래는 byte -> char로의 타입 변환 **불가** 예외의 예시.
		byteValue = 65;
		//charValue = byteValue; // 컴파일 에러 발생. 타입 변환 불가로 인한 타입 미스매치 오류가 뜬다.
		
		//아래는 다양한 자동 타입 변환 예시.
		
		intValue = byteValue;
		System.out.println("intValue : " + intValue); //65 출력
		
		charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);// 44032 출력
		
		intValue = 50;
		longValue = intValue; // 50 출력
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		floatValue = longValue; // 100.0 출력
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		doubleValue = floatValue;
		System.out.println(doubleValue);
		
	}

}
