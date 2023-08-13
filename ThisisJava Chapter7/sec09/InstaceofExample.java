package ch07.sec09;

//다형성 사용 중, 변수가 참조하는 객체의 타입을 확인하는 방법에 대해.

//"instanceof" 연산자를 사용하면, 좌항의 객체가 우항의 타입이라면 true를, 아니라면 false를 산출한다.
//형식 : boolean result = 객체 instanceof 타입;

//Java 12 버전부터는 instanceof 연산의 결과가 true일 경우, 우측 변수를 사용할 수 있어 강제 타입 변환을 하지 않아도 된다(고 한다.)
//형식 : if(parent instanceof Child child){
//
//child 변수를 강제 타입 변환 없이 사용 가능.
//
//}

public class InstaceofExample {
	
	//main에서 객체 없이 쓰기 위해 정적으로 메소드 선언
	
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		//person 매개인자가 참조하는 객체가 Student인지 확인해보기.
		
		if(person instanceof Student) {
			//Student 객체라면 person 객체를 강제 타입 변환한 객체를 새로 생성
			Student student = (Student) person;
			//Student 클래스가 가지는 필드 및 메소드를 사용
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}

//		//person 매개인자가 Student 타입일 경우 student 변수에 대입
//		if(person instanceof Student student) { // person이 Student 타입이라면 student 객체를 사용 가능.
//												// 다만 이 문법은 Java12부터 사용 가능.
//		System.out.println("studentNo : " + student.studentNo);
//		student.study();
//		}
	}
	
	public static void main(String[] args) {
		
		//Person 객체를 매개값으로 제공한 후 personInfo() 메소드를 호출.
		Person p1 = new Person("홍길동");
		personInfo(p1); // p1은 Person 객체를 넣었으므로, 타입이 Student인지 확인인한 후 실행하는 if문을 실행하지 않는다.
		
		System.out.println();
		
		//Student 객체를 매개값으로 제공한 후 personInfo() 메소드를 호출
		Person p2 = new Student("김길동", 10); // Person 타입 변수여도, 자기가 안갖고있는 자식 클래스의 멤버는 생성자로 초기화 가능하다.
		personInfo(p2); // p2는 Student 객체를 넣었으므로. 타입이 Student인지 확인한 후 실행하는 if문을 실행한다.
	}
}
