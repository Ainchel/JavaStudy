package ch07.sec11;

//봉인된(Sealed) 클래스에 대하여.

//기본적으로 final 키워드를 붙인 클래스 외에는, 모든 클래스가 부모 클래스가 될 수 있다.
//하지만, 무분별한 자식 클래스 생성을 방지하기 위해, Java 15부터는 봉인된(sealed) 클래스가 도입되었다.

//아래 방법과 같이, 지정한 이름의 클래스만 자식 클래스가 가능하고, 그 외에는 불가능하게끔 부모 클래스를 선언할 수 있다. (아래 클래스명 참조)
//버전이 낮아, 실제 코드가 아닌 아래 형식 참조.
//형식 : public sealed class Person permits Employee, Manager {...}

//sealed 키워드를 사용하면, permits 키워드로 상속 가능한 자식 클래스명을 반드시 지정해야 한다.
//지정된 자식 클래스는, final 혹은 non-sealed 키워드를 사용하여 그 자식 클래스를 상속할 수 있는지의 여부를 다시 설정해야 한다.
//혹은, 다시 sealed 키워드를 사용하여, 상속 가능한 자식의 자식 클래스 명칭을 지정해도 된다.

//final 키워드는 알다시피, 이후의 상속을 금지한다.
//non-sealed 키워드는 봉인을 해제한다는 뜻이며, 이 키워드를 쓴 클래스는 이후 상속이 가능하다.

//버전이 맞지 않으므로, 실제 코드는 그대로 두고 주석 상으로만 예제를 작성한다.

// public sealed class Person permits Employee, Manager{
//
// 	//필드 선언
// 	public String name;
//
//	//메소드 선언
//	public void work{
//
//	System.out.pruntln("하는 일이 결정되지 않았습니다.");
//
//	}
//

public class Person {

}
