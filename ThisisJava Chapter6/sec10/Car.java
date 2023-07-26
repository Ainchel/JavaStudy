package ch06.sec10;

//인스턴스 멤버의 사용 불가 상황에 대해서.
//정적 메소드와 정적 블록은, 객체가 없어도 실행된다.
//그렇기 때문에, 인스턴스 필드와 인스턴스 메소드, this 등 객체가 있어야 가능한 활동을 할 수 없다.

//만약 정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면, 객체를 먼저 생성하고 참조변수로 접근하면 된다.

//main 메소드 또한 static을 사용하는 정적 메소드이므로, 객체 생성 없이는 클래스의 인스턴스 멤버를 사용할 수 없다.

public class Car {
	//아래 + 메인함수까지, 인스턴스 멤버와 정적 멤버를 적절히 섞어서 사용해보는 예제.
	
	//인스턴스 필드 선언.
	int speed;
			
	//인스턴스 메소드 선언.
	void run() {
	System.out.println(speed + "으로 달립니다.");
	}
	
	//정적 메소드 선언
	static void simulate() {
	//정적 메소드 내에서 인스턴스 멤버를 쓰기 위해 객체 생성
	Car myCar = new Car();
	//객체 생성 후 인스턴스 멤버 사용
	myCar.speed = 200;
	myCar.run();
	}
	
	public static void main(String[] args) {
	//정적 메소드 호출 - 클래스 내부이므로 클래스명도 안적어도 됨.
	simulate();
	
	//인스턴스 멤버 사용을 위해 객체 생성
	Car myCar = new Car();
	//인스턴스 멤버 사용
	myCar.speed = 60;
	myCar.run();
	}
}
