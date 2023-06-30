package ch03.sec08;
	
public class BitLogicExample {
	//비트 논리 연산자에 대하여.
	//비트 논리 연산자는 bit(0과 1) 단위로 논리 연산을 수행한다.
	//0과 1로 성립이 가능한 정수 타입(byte, short, int, long)에만 해당 연산이 가능하다.
	//실수는 부동소수점 방식을 사용하기 때문에 비트 논리 연산자를 사용할 수 없다.
	//1을 true로, 0을 false로 생각한다면 논리 연산자의 계산과 차이가 없다.
	
	//비트 논리 연산자의 종류도, 논리 연산자와 같이 아래 4가지 있다.
	//1) 논리곱(AND) : 두 연산자가 모두 1일 때에만 1을 산출한다.
	//2) 논리합(OR) : 두 연산자 중 하나가 1이라면 1을 산출한다.
	//3) 배타적 논리합(XOR) : 두 연산자 중 하나는 1, 하나는 0일 때 1을 산출한다.
	//4) 논리 부정(NOT) : 해당 이진수의 연산자의 값(1 및 0)을 서로 바꾼다(1 -> 0, 0 -> 1)
	
	//비트 논리 연산자는 int 타입으로 자동 변환한 후 연산을 수행한다.
	//따라서 연산 결과 또한 int 타입 변수로 받아와야 한다.
	
	//비트 논리 연산자를 사용하는 이유는, 서로 다른 언어의 다른 데이터 타입 간 계산을 이진수로 수행해야 하기 때문이다.
	//예시) C언어의 uint8_t(1byte) 값을 자바의 byte로 받아오면 값 범위 차이로 인해 값이 달라져, 달라진 값을 비트 논리 연산자로 복원한다.
	//예시) uint8_t의 136은 Java에서 -120으로 바뀌는데, 이에 255를 비트 논리 연산자로 곱하면 값이 복원된다.
	
	//위 비트 논리 연산이 어려워, 위와 같은 값 변환을 Byte.toUnsignedInt()로도 지원한다.
	
	public static void main(String[] args) 
	{	
		//아래는 비트 논리 연산 결과 변수를 int로 설정하지 않았을 때의 예제.
		byte num1 = 45;
		byte num2 = 25;
		//byte result = num1&num2; 컴파일 에러. 결과 변수가 int가 아니라서 발생.
		int result = num1 & num2;
		
		//아래는 비트 논리 연산을 통한 서로 다른 데이터타입 값을 복원하는 예제.
		
		byte receivedData = -120;
		
		//방법 1) 비트 논리곱 연산을 이용하여 Java언어 Byte -> C언어 Unsigned int로 복원하기
		
		int uint1 = receivedData & 255;
		System.out.println("uint1 : " + uint1);
		
		//방법 2) Java에서 지원하는 Unsigned int로의 변환 메소드 사용하기.
		int uint2 = Byte.toUnsignedInt(receivedData);
		System.out.println("uint2 : " + uint2);
		
		//아래는 Java언어 Byte에 uint값을 넣었을 때 출력되는 값.
		int test = 136;
		byte btest = (byte)test;
		System.out.println("uint->Byte 변환 값 : " + btest);
		
	}

}
