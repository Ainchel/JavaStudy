package ch02.sec06;

public class StringExample {

	public static void main(String[] args) 
	{
		//char c1 = "A"; 큰 따옴표로 닫는 경우, 문자열 처리되어 char의 방식인 유니코드로 변환되지 않는다.
		//char c2 = "홍길동" 
		//참고 : 문자열 내부에 역슬래시(\)가 있을 경우, 다음 문자 하나까지 합쳐 이스케이프 문자라고 칭한다.
		//이스케이프 문자를 통해 기존에 명령어로 취급되는 문자를 표시하거나, 특정 이스케이프 문자를 통해 문자열의 출력에 영향을 미칠 수 있다.
		
		//아래는 String 출력 및, 이스케이프 문자를 포함한 문자열 출력 예제.
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
		//아래는 큰따옴표 3개를 사용한 문자열 출력을 원본 출력 문법과 비교한 예제.
		
		String str1 = "" + 
		"{\n" + 
		"\t\"id\":\"winter\", \n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String str2 = """
			{
					"id" : "winter",
					"name" : "눈송이"
			}
			""";
		
		
		System.out.println(str1);
		System.out.println("-------------------------------");
		System.out.println(str2);
	}
}
