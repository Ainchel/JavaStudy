package ch01.sec03;
//문자 리터럴은 하나의 문자를 작은따옴표('')로 감싼 것을 가리킨다.
//문자 리터럴은 내부적으로는 정수 값이며, 0~65535까지의 정수 키를 세계 각국의 문자 밸류로 매핑(키 값 별 지정된 밸류 값으로 연결)한 유니코드로 변환된다.
//문자 데이터 char 타입은 해당 유니코드 값을 저장하며, 해당 값에 해당하는 문자를 출력시켜준다.
//위 특징으로 인해, char 타입에는 문자를 입력하거나, 0~65535 사이의 숫자값을 입력할 수도 있다.

//char 데이터형을 빈 값으로 초기화하려고 ''; 로 초기화할 경우 컴파일 에러가 발생함.
//따라서, char 데이터의 초기화는 기본적으로 ' '; (공백 - 유니코드 32)로 초기화한다.

public class charExample {

	public static void main(String[] args) 
	{
		//아래는 char형 데이터에 문자 및 유니코드 값을 넣어보는 예제.
		char c1 = 'A'; // 'A' 문자와 매핑되는 정수 키값 65가 들어간다.
		char c2 = '가'; // '가' 문자와 매핑되는 정수 키값 44032가 들어간다. 
		char c3 = 65; // 문자 'A' 에 해당하는 유니코드 65 입력
		char c4 = 0x0041;// 문자 'A' 에 해당하는 65 정수값을 0x0041(16진수)로 입력.
		char c5 = 44032; // '가' 에 해당하는 유니코드 값 44032 입력
		
		System.out.println(c1); //A 출력
		System.out.println(c2); //가 출력
		System.out.println(c3); //A 출력
		System.out.println(c4); //A 출력
		System.out.println(c5); //가 출력
		
		//아래는 char형 데이터의 기본값 초기화 예제.
		//char blankChar = ''; 컴파일 에러 발생.
		char blankChar = ' '; // 기본값을 넣고 싶으면 공백을 하나 넣어 초기화한다.
		
	}

}