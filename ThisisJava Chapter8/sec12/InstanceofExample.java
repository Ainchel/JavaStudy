package ch08.sec12;

//객체 타입 확인에 대하여.

//상속에 대해 배울 떄, 객체 타입 확인을 위해 Instanceof 연산자를 사용했었다.
//인터페이스에서도 저 연산자를 사용할 수 있으며, 인터페이스 변수에 대입되어 있는 객체가 무엇인지, 어떤지를 확인한다.
//확인을 위한 형식은 아래와 같다.
//if (인터페이스명 instanceof 클래스명)
//위와 같이 적으면, 인터페이스 타입 변수에 대입되어있는 객체가 클래스명의 클래스인지 if로 확인한 후 동작한다.

//메소드의 매개변수가 인터페이스 타입일 경우, 매개변수로는 해당 인터페이스를 구현 중인 모든 클래스의 객체가 들어갈 수 있다.
//이럴 경우, 객체 타입 확인을 통해 특정 클래스의 객체일 때에만 강제 타입 변환 등을 실행하고 싶다면, 위 객체 타입 확인 절차를 밟아야 한다.

//Java12부터는 instanceof 연산 결과가 true일 때, 연산자 우측의 타입 변수를 곧바로 사용할 수 있다(예제 참고. 버전은 안맞아 주석으로만 남길 예정.)

public class InstanceofExample {

	public static void main(String[] args) {
		
		//아래는, 객체 타입 확인을 통해 특정 클래스의 객체가 들어갔을 때에만 특정 메소드를 호출하게끔 하는 예제.
		//인터페이스를 구현 중인 클래스의 객체를 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride 메소드를 호출하면서, 인터페이스를 구현 중인 서로 다른 객체들을 넣어보기.
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		
		//인터페이스 매개변수를 갖는 메소드 생성
		
		//객체 타입을 사용해서, Bus 클래스 객체일 때에만 강제 타입 변환 후 Bus클래스의 메소드를 호출.
		//아래는 방법 1
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		//아래는 방법 2(Java12부터 지원하는 instanceof 연산 우측에 변수를 생성하는 방식)
		// if(vehicle instanceof Bus bus){
		//	bus.checkFare(); // instanceof 연산이 true라면, bus 객체를 생성할 필요 없이 곧바로 사용 가능하다.
		// }

		vehicle.run();
		
	}
	
}
