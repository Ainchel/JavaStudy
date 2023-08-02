package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {

	//메인 메소드에서 Singleton 클래스 객체 생성 시도시, private로 설정되어 있어 생성할 수 없다.
	//에러 내용 : 대충 Singleton 클래스의 생성자 메소드가 private라 안 보인다(접근할 수 없다)는 뜻.
	//Singleton obj1 = new Singleton();	
		
	//Singleton 클래스의 정적 메소드(주소값만 넘겨주던 그거)를 호출하여 싱글톤 패턴 활용
	Singleton obj1 = Singleton.getInstance(); // Singleton 클래스의 하나 있는 객체 singleton과 같은 주소 공유
	Singleton obj2 = Singleton.getInstance(); // Singleton 클래스의 하나 있는 객체 singleton과 같은 주소 공유
	
	//위 주소만 받아온 두 객체의 주소가 같은지 실제로 확인하기.
	if(obj1 == obj2) { // 참조형 변수의 == 연산자는 참조 주소가 같은지 확인함.
		System.out.println("두 객체는 같은 주소를 참조합니다.");
	} else {
		System.out.println("두 객체는 다른 주소를 참조합니다.");
	}
	
	}//main end
}//class end
