package ch02.sec08;

public class CastingExample {
	//허용 범위가 큰 타입에서 작은 타입으로는 자동 타입 변환이 되지 않는다.
	//강제 타입 변환(Casting)을 사용한다면 큰 타입에서 작은 타입으로 변환이 가능하다.
	//강제 타입 변환은 괄호와 타입을 사용한다.
	//작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입의 형식으로 사용한다.
	//예시 1) int -> byte로 변형할 경우, 4byte -> 1byte로 변환할 경우, 1byte 내 값까지 보존된다.
	//1byte를 넘는 값이 존재할 경우, 넘어가는 부분(나머지 3byte에 해당하는 부분)은 보존되지 않으므로 주의.
	//long -> int 변환, int -> char 변환 등도 마찬가지로, 원래 값을 유지하는 범위의 값까지만 유지된다.
	//실수 -> 정수의 경우, 실수가 항상 큰 범위이므로 강제 타입 변환을 해야하며, 할 경우 정수 부분만 유지된다.
	
	public static void main(String[] args)
	{
		//아래는 정수 단위에서의 강제 타입 변환 예제.
		
		long longValue = 300;
		int intValue = (int)longValue; // long -> int 변환 후 300이 유지됨(int의 범위 내 값)
		
		intValue = 65;
		char charValue = (char)intValue;
		System.out.println(charValue); // int -> char 변환 후, 값 유지 범위 내에 있으므로 'A'(65에 해당하는 문자) 출력.
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); // doubleValue의 정수 부분인 3만 출력
		
		//아래는 다양한 강제 타입 변환 예시.
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2); // byte내 범위의 값이므로 10 값 그대로 유지
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4); // int 범위 내 값이므로 300 그대로 유지
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6); // char 범위 내 값이므로 65에 해당하는 문자 'A' 출력
		 
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8); // 3.14의 정수부분만 입력되어 3 출력
		
	}

}
