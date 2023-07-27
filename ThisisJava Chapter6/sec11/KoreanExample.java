package ch06.sec11;

public class KoreanExample {

	//final 변수를 통해 상수화(변하지 않는 값) 시켜버린 값 사용 및 변경 시도 예제.
	//상수화된 필드의 값 변경 시도 코드는 에러가 뜨므로 주석 처리 예정이다.
	
	public static void main(String[] args) {
		
		//생성자 오버로딩을 통해 객체 생성과 동시에 초기화.
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		//객체 필드값 읽어오기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 속성인 필드 값 변경 시도 - 에러 뜨므로 주석 처리
		//k1.nation = "일본"; "The final field Korean.nation cannot be assigned" 에러가 발생함.
		
		//final 속성이 아닌 필드의 값 변경 시도
		k1.name = "김자반";
	}

}
