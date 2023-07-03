package ch03.sec09;

public class BitShiftExample 
{
	//비트 이동 연산자에 대하여.
	//비트 이동 연산자는 어떤 비트(이진수)의 위치 자체를 좌측 또는 우측으로 밀어서 이동시키는 연산이다.
	
	//1) << 연산자 : a << b라고 할때, a의 이진수 상태의 비트를 b만큼 왼쪽으로 이동시킨다.
	//위 연산자를 쓰면, 오른쪽 빈자리는 0으로 채운다.
	//위 연산의 결과는, a에 2의 b승(2씩 b번 곱해나감)한 결과와 같다.
	
	//2) >> 연산자 : a >> b라고 할때, a의 비트를 b만큼 오른쪽으로 이동시킨다.
	//위 연산자를 쓰면, 왼쪽의 빈자리는 최상위 부호 비트와 같은 값으로 채운다.
	//위 연산의 결과는, a에 2의 b승을 나눈 결과와 같다.
	
	//3) >>> 연산자 : a >>> b라고 할때, 정수 a의 각 비트를 >>와 같이 b만큼 오른쪽으로 이동시킨다.
	// >>와의 차이점은, 왼쪽 빈자리를 최상위 비트 부호가 아닌 0으로 채운다는 것이다.
	
	public static void main(String[] args)
	{
		//아래는 비트 좌측 이동 연산자 사용 예제.
		int a = 1 << 3;
		//위처럼 적으면, 00000000 00000000 00000000 00000001의 비트를 왼쪽으로 세 칸 민다.
		//그럼, 맨 왼쪽의 0 세개를 버리고, 오른쪽 빈자리를 0으로 채운다.
		//결과 : 00000000 00000000 00000000 00001000 (8이 됨)
		//맨 위 설명처럼, << 3은 2의 3승을 곱한 것과 같다.
		
		//아래는 비트 우측 이동 연산자 사용 예제.
		int b = -8 >> 3;
		//위처럼 적으면, 11111111 11111111 11111111 11111000에서 비트를 우측으로 세 칸 민다.
		//가장 오른쪽의 0은 세 칸 버려지고, 왼쪽의 세 칸은 최상위 부호 비트(1)로 채운다.
		//결과 : 11111111 11111111 11111111 11111111 (-1이 됨)
		//위 설명과 같게, >> 3은 2의 3승을 나눈 것과 같다.
		
		//아래는 다양한 비트 이동 연산 예제.
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3);
		//Math.pow 함수는 앞의 인자를 뒤의 인자만큼 제곱하여 double 타입으로 반환한다.
		System.out.println("result1 : " + result1); // 8 출력.
		System.out.println("result2 : " + result2); // 8 출력.
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println("result 3 : " + result3); // -1 출력
		System.out.println("result 4 : " + result4); // -1 출력
		
		//아래는 우측 이동 연산자 >>>를 사용하는 예제.
		int result5 = -8 >>> 3;
		//위처럼 적으면, 왼쪽 빈자리를 0으로 채우며 오른쪽으로 세 칸 민다.
		//결과 : 00011111 11111111 11111111 11111111(536870911)
		
		//아래는 어떤 int 정수를 1byte(8비트 단위)씩 잘라서 읽고, 0~255까지의 수로 출력하는 예제.
		int value = 772; //이진수로는 00000000 00000000 0000011 00000100
		
		byte byte1 = (byte)(value >>> 24); //가장 왼쪽에 있는 바이트를 맨 오른쪽으로 끌어옴
		int int1 = byte1 & 255; // 끌어온 비트에 255를 논리곱하여 Unsigned Int로 변환
		System.out.println("가장 좌측 바이트의 Unsinged Int 값 : " + int1);
		
		byte byte2 = (byte)(value >>> 16); //왼쪽 두번째에 있는 바이트를 맨 오른쪽으로 끌어옴
		int int2 = Byte.toUnsignedInt(byte2); // 끌어온 비트에 Byte.ToUnsignedInt()를 사용하여 변환
		System.out.println("좌측 두번째 바이트의 Unsinged Int 값 : " + int2);
		
		byte byte3 = (byte)(value >>> 8); //왼쪽에서 세번째에 있는 바이트를 맨 오른쪽으로 끌어옴
		int int3 = byte3 & 255; // 끌어온 비트를 Unsigned Int로 변환
		System.out.println("좌측 세번째 바이트의 Unsigned Int 값 : " + int3);

		byte byte4 = (byte) value; //가장 오른쪽 비트이므로 비트 이동 연산자 없음.
		int int4 = Byte.toUnsignedInt(byte4); //Unsigned Int로 변환.
		System.out.println("가장 우측 바이트의 Unsinged Int 값 : " + int4);
		
	}
}
