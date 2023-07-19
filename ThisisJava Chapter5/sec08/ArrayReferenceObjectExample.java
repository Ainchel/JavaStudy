package ch05.sec08;

public class ArrayReferenceObjectExample {

	//객체를 참조하는 배열에 대하여.
	//참조 타입 변수는, 해당 변수의 메모리 공간에 값이 아닌 해당 객체의 번지(주소)가 저장된다.
	//그런 참조 타입 변수들로 배열을 만들었을 떄의 구조에 대해 알아본다.
	
	//간단히 요약하자면, 배열의 인덱스로 설정된 변수 또한 참조 타입 변수로 취급된다.
	//그래서 ==, != 연산자를 사용해 같은 객체를 참조 중인지 아닌지 확인할 수 있
	
	
	
	public static void main(String[] args) {

		//아래는 String 타입의 배열을 통한 객체 타입 인덱스 예제.
		
		String[] languages = new String[3];
	
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");
		
		System.out.println(languages[0] == languages[1]);
		System.out.println(languages[0] == languages[2]);
		System.out.println(languages[0].equals(languages[2]));
		
	}

}
