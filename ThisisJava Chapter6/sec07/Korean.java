package ch06.sec07;

public class Korean {
	//필드 선언
	String nation = "대한민국"; //객체 별 공통된 값이므로 초기값을 넣어버린다.
	String name;			  //객체마다 다른 값이므로 생성자에서 초기화한다.
	String ssn;				  //객체마다 다른 값이므로 생성자에서 초기화한다.
	
	//생성자 선언 + 생성자 매개변수와 필드명 동일하게 하고, this로 필드 접근
	public Korean(String name, String ssn) {
		this.name = name; // 좌측 name은 현재 객체의 필드, 우측 name은 매개변수.
		this.ssn = ssn;
	}
}
