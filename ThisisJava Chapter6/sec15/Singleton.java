package ch06.sec15;

//싱글톤 패턴에 대하여.

//애플리케이션(프로그램 등등) 전체에서 객체 하나만 생성해서 끝까지 사용한다면 싱글톤 패턴을 적용할 수 있다.
//싱글톤 패턴의 핵심은, 내가 하나 만드는 게 아니라 앞으로도 못 만들게 막는 것이다.
//이를 위해, 클래스 내에서 객체를 하나만 생성하고 이후로 생성을 못하게끔, 생성자를 private로 설정해버린다.
//이렇게 되면 신규 생성을 하지 못하는 대신, 하나 있는 객체의 주소값을 넘겨주는 식으로 간접적인 객체 생성이 가능하다.

//싱글톤 패턴을 위한 형식은 다음과 같다.
// public class 클래스 {
// 
// 		private static 클래스명 singleton = new 클래스명()   : 정적 필드로 프로그램 시작하자마자 객체를 뽑는다.
//
// 		private 클래스명(){}     : 그 후, 생성자를 private로 쳐버려서 호출을 못하게 한다. >> 객체 생성이 불가능.
//
// 		public static 클래스명 getInstance(){
//  		return singleton; // 참조형 변수이므로, 하나 만든 객체의 주소값을 넘김 
//							  // 이 메소드를 통해 다른 객체가 하나 만든 위 singleton을 참조하므로, 반드시 public으로 설정.
//	    }
//}

//위와 같이 싱글톤 패턴을 작성할 경우, 클래스 객체인 singleton을 참조하는 방법은 getInstance()을 호출하는 것 하나뿐이다.
//그리고 메소드 구조 상 객체 생성이 아닌 하나 있는 객체의 주소값만 던져주므로, 저걸 받은 객체들은 모두 객체 하나만 바라보는 셈이다.

public class Singleton {
	//private 접근 권한을 갖는 클래스의 객체를 정적 변수로 시작부터 생성+초기화.
	private static Singleton singleton = new Singleton();
	
	//생성자를 private로 막아버려, 객체 생성을 방지
	private Singleton() {}
	
	//위에 하나 생성한 객체의 주소값만 던져주는 메소드를 "public" + "static"으로(객체 접근 불가능하니까) 선언
	public static Singleton getInstance() {
		return singleton;
	}
} // class Singleton end
