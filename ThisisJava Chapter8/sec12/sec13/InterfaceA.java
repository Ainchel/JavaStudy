package ch08.sec13;

//봉인된 인터페이스에 대하여.

//Java 15버전에서부터는 인터페이스 또한 클래스와 동일하게, "봉인된" 키워드를 지원한다.
//어떤 인터페이스에 sealed 키워드를 붙이면, 지정한 이름의 인터페이스만 상속시킬 수 있다.
//sealed 키워드로 인터페이스 봉인을 지정하며, permits 키워드로 상속가능한 인터페이스명을 지정한다.
//permits 키워드로 상속 지정이 된 인터페이스들은, 이후 non-sealded 키워드를 사용하여 자식 인터페이스를 상속시킬 수 있다.
//현재 버전에서는 사용이 불가능하므로, 주석에 예제만 적어둘 예정.

//public sealed interface InterfaceA permits InterfaceB{ InterfaceB 이름의 인터페이스만 상속 가능하게, sealed 인터페이스 선언
//
//	void methodA();
//	
//}
