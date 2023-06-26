package ch01.sec02;

//아래는 정수 타입 5개의 메모리 할당 크기 및 범위값
//1byte = 8bit. 
//1bit는 0 혹은 1을 저장하므로, 개수만큼의 진수 값을 표현 가능.
//byte : 1byte(8bit) => -128 ~ 127까지 
//short : 2byte(16bit) => -32768 ~ 32767까지
//char : 2byte(16bit) => 0 ~ 65535(유니코드)까지. 음수값을 저장하지 않아 양수로 2배값 저장 가능.
//int : 4byte(32bit) => 대략 -21억부터 21억까지.
//long : 8byte(64bit) => -(2의 63승)부터 (2의 63승 - 1)까지.
//정수형 데이터 타입의 최고값 메모리 한 칸은 부호 값이며, 0일 경우 양수, 1일 경우 음수이며, 부호와 값을 동시에 가진다.
//그렇기 때문에, 양수일 경우 음수일 때의 절대값보다 1 작은 값까지만 들어간다(양수이려면 0이 들어가야 하므로)

//참고 : 프로그래머가 코드로 직접 입력한 값을 리터럴이라고 한다.
//정수를 리터럴로 입력할 경우, 각 진법(2, 8, 16, 10진법) 별로 작성법이 다르다.
//2진수 : 앞에 0b/0B를 붙인 후 뒤에 8진수로 작성
//8진수 : 앞에 0을 붙인 후 뒤에 8진수로 작성
//16진수 : 앞에 0x/0X를 붙인 후 뒤에 16진수(1~9+a~f)로 작성

//정수타입 중 long의 경우, 값 마지막에 l 혹은 L을 입력해야 한다.
//컴파일러는 기본적으로 정수 리터럴을 int로 인식하여, int 범위를 초과하는 경우 에러가 발생하기 때문.

public class integerExample 
{
	public static void main(String[] args) 
	{
		//아래는 정수 리터럴 출력 예제.
		int var1 = 0b1011; // 2진수 1011을 10진수로 출력.
		int var2 = 0206; // 8진수 206을 10진수로 출력.
		int var3 = 365; // 그냥 10진수로 365 출력.
		int var4 = 0xB3; // 16진수 B3을 10진수로 출력.
		System.out.println(var1); // 11 출력.
		System.out.println(var2); // 134 출력.
		System.out.println(var3); // 365 출력.
		System.out.println(var4); // 179 출력.
				
		//아래는 데이터 타입 범위값 초과 예제.
		//byte의 범위값은 -128부터 127까지.
		byte byte1 = -128;
		byte byte2 = -30;
		byte byte3 = 0;
		byte byte4 = 30;
		byte byte5 = 127;
		//byte byte6 = 128; // 범위를 초과하여 컴파일 오류가 남.
		//정확히는 byte가 아닌 int형으로 인식하여, 데이터 타입 비일치 오류 메시지가 뜬다.
				
		//아래는 long 데이터를 다룰 때 l 붙이는 예제.
		long long1 = 10;
		long long2 = 20l;
		//long long3 = 10000000000;
		//위 long3은 l을 안붙여서, int 값으로 인식하여 범위 초과 오류 발생.
		long long4 = 10000000000L; // long3과 같은 값에 l을 붙여 long으로 인식하면 오류 발생 안함.		
	}
}