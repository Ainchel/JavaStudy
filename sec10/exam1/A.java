package ch08.sec10.exam1;

//인터페이스의 타입 변환에 대하여.
//인터페이스의 타입 변환은 인터페이스와 구현 클래스 사이에서 발생한다.
//인터페이스 변수에 구현 객체를 대입하면, "객체"가 "해당 인터페이스 타입으로" 자동 변환된다.
//반대로 인터페이스 타입을 구현 클래스 타입으로 변환시키려면 강제 타입 변환이 필요하다.

//인터페이스 자동 타입 변환은, 상기했듯 인터페이스 타입 변수에 객체를 대입하면, 객체가 인터페이스 타입으로 자동 변환된다.
//따라서, 부모 클래스가 인터페이스를 구현하고 있다면, 자식 클래스 객체 또한 부모의 인터페이스 타입으로 자동변환될 수 있다.
//즉, 직or간접적으로 구현된 상태의 모든 클래스 객체는, 인터페이스 타입 변수로 자동변환될 수 있다는 뜻이다.

//아래 ABCD들 관계도 정리
//A - B(구현) - D(상속)
//A - C(구현) - E(상속)

public interface A {

}
