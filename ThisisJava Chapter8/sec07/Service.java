package ch08.sec07;

//private 메소드에 대하여.

//인터페이스 내 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드는 모두 public 접근제한자를 가진다.
//하지만, 인터페이스에는 외부에서 접근이 불가능한 private 속성의 메소드 또한 선언이 가능하다.

//private 메소드는 구현 객체가 필요하며, 디폴트 메소드 안에서만 호출이 가능하다.
//private 정적(static) 메소드는 구현 객체가 필요없으며, 디폴트 메소드 + 정적 메소드 내에서 호출이 가능하다.
//private 메소드의 용도는, 디폴트와 정적 메소드의 중복 코드를 줄이기 위해서이다.

//아래 예제로 사용 용도를 이해해보자.
//2개의 디폴트 메소드와 2개의 정적 메소드에서, 중복 코드 부분을 private, private static 메소드로 따로 빼는 예제.

public interface Service {

	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1의 코드입니다.");
		defaultCommon(); // 공통 코드를 private 메소드로 선언하여, public에서 호출
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2의 코드입니다.");
		defaultCommon(); // 공통 코드를 private 메소드로 선언하여, public에서 호출
	}
	
	//private 메소드
	private void defaultCommon() { //Common은 공통이라는 뜻. 공통 코드를 집어넣자.
		System.out.println("defaultMethod의 공통 코드 A입니다.");
		System.out.println("defaultMethod의 공통 코드 B입니다.");
	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1의 코드입니다.");
		staticCommon(); // 공통 코드를 private 메소드로 선언하여, public에서 호출
	}
	static void staticMethod2() {
		System.out.println("staticMethod2의 코드입니다.");
		staticCommon(); // 공통 코드를 private 메소드로 선언하여, public에서 호출
	}
	
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("staticMethod의 공통 코드 C입니다.");
		System.out.println("staticMethod의 공통 코드 D입니다.");
	}
}
