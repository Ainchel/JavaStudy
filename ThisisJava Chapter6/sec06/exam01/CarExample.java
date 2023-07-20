package ch06.sec06.exam01;

//import ch06.sec06.exam01.Car;

public class CarExample {

	//클래스의 구성 멤버에 대하여.
	//클래스를 선언한다는 것은, 객체의 초기화를 담당하는 생성자, 객체에 포함된 필드와 메소드를 선언한다는 것이다.
		
	//필드는 객체의 데이터를 저장하는 역할을 한다.
	//필드를 선언하는 방법은 변수를 선언하는 방법과 동일하지만, 클래스 블록에서 선언되어야 필드 선언이 된다.
	
	//필드는 클래스 블록 내에서 선언하고, 객체 내/외부에서 사용이 가능하며, 객체가 존재하는 동안 계속 살아있는다.
	//클래스 내 로컬 변수는 클래스의 생성자와 메소드 블록에서 선언하고, 해당 블록 내에서만 사용이 가능하며, 해당 블록이 끝나면 소멸된다.
	//필드에 사용하는 데이터 타입은 기본타입 및 참조타입(배열, 클래스, 인터페이스) 모두 가능하다.
	//필드명은 첫글자를 소문자로 하는 캐멀 스타일로 작성하는 것이 관례이다.
	
	//필드는 선언하면서 초기값을 제공하지 않을 경우 정해진 기본값으로 초기화된다.
	//대략 기본타입은 모두 0 혹은 false, 참조타입은 null로 초기화된다.
	
	//필드를 사용하려면, 해당 클래스의 객체를 생성해야만 한다.
	//객체를 생성한 후의 필드는 객체 내부에서도, 외부에서도 접근해서 사용할 수 있다. << 캡슐화를 해야하는 이유
	//외부에서 해당 필드에 접근하려면 객체 변수명에 '.'을 붙여 접근할 수 있다.
	
	//아래는 필드 선언 예시 : 생성자나 메소드가 아닌, 클래스 블록에서 선언해야 한다.
	String model = "그랜저";
	int Speed = 300;
	boolean start = true;
	
	public static void main(String[] args) {

		//Car 객체 생성
		Car myCar = new Car();
		
		//Car 객체의 필드 읽어오기
		System.out.println("제작회사 : " + myCar.model);
		System.out.println("모델명 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		
		//필드 값 접근해보기
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		//아래는 Car 클래스의 객체를 뽑아, 필드 값을 읽고 변경해보는 예제.
		
		
	}

}
