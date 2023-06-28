package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	//문자열을 기본 타입으로 변환하는 방법에 대해서.
	
	//자바에서 문자열을 각종 기본 타입으로 변환하는 방법은 아래와 같다.
	//----리터럴은 그냥 입력하면 되고, str이라는 문자열이 있다고 한다면,
	//1)byte로 변환 : Byte.parseByte(str) 사용
	//2)short로 변환 : Short.parseShort(str) 사용
	//3)int로 변환 : Int.parseInt(str) 사용
	//4)long으로 변환 : Long.parseLong(str) 사용
	//5)float으로 변환 : Float.parseFloat(str) 사용
	//6)double로 변환 : Double.parseDouble(str) 사용
	//7)boolean으로 변환 : Boolean.parseBoolean(str) 사용
	//요약 : 각 데이터 타입 명의 기본 정의 클래스의, parse"데이터타입명"(해당 데이터 변수 이름) 메소드를 사용하면 된다.
	
	//각종 기본 타입을 문자열(String)으로 변경하려면, String.valueOf(기본 타입 변수) 메소드를 사용하면 된다.
	
	public static void main(String[] args) 
	{
		//아래는 각종 기본 타입을 문자열로 변환하는 예제.
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}

}

