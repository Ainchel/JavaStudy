package ch07.sec10.exam02;

//추상 메소드와 오버라이딩의 관계에 대하여.

//추상 클래스에서 자식들이 가질 공통 메소드를 작성할 때, 메소드 선언부는 같되 실행 내용(코드)는 자식 클래스마다 다를 경우가 많을 것이다.
//예시 : 추상 클래스 Animal에서 소리를 내는 sound() 메소드가 있다면, 그 자식 클래스들은 코드가 다른(실행 내용이 다른) sound() 메소드를 가질 것이다.

//위와 같은 상황에서, 추상 클래스는 추상 메소드를 선언할 수 있다.
//추상 메소드란, 일반 메소드의 선언과 같되, abstract 키워드가 붙어있고 코드 내용(중괄호 블록)이 존재하지 않는 메소드이다.
//추상 메소드는, 자식들이 오버라이딩해서 사용하는 것이 목적일 것이기 때문에 코드 블록을 필요로 하지 않는 것이 당연하다.

//추상 메소드는 자식 클래스의 공통 메소드라는 것만 정의한다.
//형식 : abstract 리턴타입 메소드명(매개변수, ...);  <<< abstract가 붙는 것과, 중괄호가 없는 것에 주목.

//위에서 적었듯, 추상 메소드는 자식 클래스에서 반드시 오버라이딩(재정의)을 통하여 실행 내용을 채워야만 한다.
//그렇기 때문에, 추상 메소드가 있는 클래스를 상속받은 자식 클래스는, 해당 추상메소드를 오버라이딩하지 않으면 에러가 발생한다.


public abstract class Animal { // 추상 클래스 Animal 선언
	
	//메소드 선언
	public void breathe() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	public abstract void sound(); // abtsract 키워드가 붙고, 중괄호가 존재하지 않는 추상 메소드 선언
							      // 이걸 선언할 때 클래스가 추상 클래스가 아닐 경우 에러 발생.
	
	

}
