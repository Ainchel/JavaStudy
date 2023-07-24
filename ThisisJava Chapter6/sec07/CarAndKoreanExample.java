package ch06.sec07;

public class CarAndKoreanExample {

	//생성자 선언과 호출에 대하여.
	//new 연산자는 객체를 생성한 후, 이어서 객체를 초기화하는 "생성자"를 호출한다.
	//객체의 초기화란, 객체 내의 필드를 초기화하거나 메소드를 호출하는 것을 말한다.
	//형식 : 클래스명 변수명 = new 클래스명();
	//생성자가 성공적으로 호출이 끝나면, new 연산자가 객체의 주소를 변수에 리턴해준다.
	//이후 변수를 통해 객체의 필드나 메소드에 접근할 수 있게 된다.
	
	//기본 생성자 : 모든 클래스는 생성자가 존재해야 한다.
	//그래서 별도로 선언한 생성자가 없다면, 컴파일러는 자동으로 바이트코드에 "기본 생성자" 를 추가한다.
	//형식 : [(특정 상황)public] 클래스명(){}
	//위 기본 생성자에서 public이 붙는 조건은, 해당 클래스가 public으로 선언되었는지 아닌지이다.
	//만약 명시적으로 생성자를 선언해 두었다면, 기본 생성자는 추가되지 않는다.
	//그 이유는, 생성자를 별도로 선언한다는 것 자체가 객체를 다양하게 초기화하기 위함이기 때문이다.
	
	//객체를 다양하게 초기화하기 위해, 생성자를 다음과 같이 직접 선언할 수 있다.
	//형식 : 클래스명(매개변수, ...){
	// 객체 생성 시 초기화시킬 코드
	//}
	
	//생성자는 메소드와 비슷한 양식을 가지나, 리턴 타입이 없으며 이름이 반드시 클래스 명과 동일하다.
	//매개변수의 경우, 입력된 값이 생성된 객체의 필드로 생성 직후 바로 입력된다.
	//객체들이 같은 값을 가져야할 경우 필드에 초기값을 넣는 것이 좋다.
	//하지만 객체들마다 다른 값을 가져야 한다면, 생성자에서 필드를 초기화하는 것이 좋다.
	//예시1)한국사람이라면 "국적" 이라는 필드는 모두 "대한민국" 이라는 같은 값을 가지므로, 초기값으로 넣는 게 좋다.
	//예시2)하지만 한국사람마다 "이름" 및 "주민등록번호" 필드는 각자 다를 것이므로, 생성자에서 필드를 초기화하는 것이 좋다.
	
	//생성자의 매개값은 new 연산자를 사용할 때 입력하고 주어진다.

	//생성자를 선언할 때, 매개변수의 이름은 필드의 이름과 같거나 비슷하게 짓는 것이 좋다.
	//매개변수의 이름을 필드명과 같게 지을 경우, 매개변수와 필드명을 구분하기 위해, 필드명앞에 "this."을 붙인다.
	//this는 현재 객체를 가리키며, this.name은 현재 객체의 name이라는 필드를 가리킨다.
	
	//객체를 생성할 때 필드를 다양하게(서로 다른 매개변수 초기화 양식) 초기화하려면, 생성자를 오버로딩 해야한다.
	//방식은 메소드 오버로딩과 동일하게, 매개변수 형식이 다른 동일 명(== 클래스 명)의 생성자를 여러개 선언하면 된다.
	//오버로딩을 마친 생성자는, 해당 매개변수 형식에 맞는 생성자로 실행된다.
	
	//생성자를 여러개 생성할 경우, 코드의 중복이 생길 수 있다.(초기화 코드들 자꾸 겹침)
	//이럴 경우, 공통으로 초기화시킬 생성자를 하나 선언하고, 다른 생성자에서 this(공통초기화 오버로딩 매개변수)를 사용하면 초기화 코드를 줄일 수 있다.
	//생성자 내에서 사용되는 this(공통초기화할 오버로딩된 생성자의 매개변수)는 다른 생성자의 첫줄에 작성되어야 한다.
	//첫줄에 this()를 쓴 이후, 추가로 아랫줄에 코드를 작성할 수 있다.
	
	
	public static void main(String[] args) {

		//아래는 별도로 선언한 생성자 호출 예제. Car 클래스 및 Korean 클래스 참고.
		Car myCar = new Car("그랜저", "검정", 250); //myCar 객체의 필드를 생성자에서 초기화.
		Korean k1 = new Korean("소라사키 히나", "050122-4234567");
		
		//아래는 별도로 선언한 생성자를 통해, 필드값을 다르게 초기화하는 예제.
		Korean k2 = new Korean("소라이 사키", "060816-4561224");
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
		Korean k3 = new Korean("쿠로미 세리카", "070623-4625661");
		System.out.println("k3.nation : " + k3.nation);
		System.out.println("k3.name : " + k3.name);
		System.out.println("k3.ssn : " + k3.ssn);
		
		//아래는 생성자 오버로딩을 시킨 클래스로, 다양한 생성자를 사용한 객체 생성 예제.
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		
		Car car2 = new Car("자가용");		
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
