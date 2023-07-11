package ch05.sec04;

public class NullPointerExceptionExample {

	//null과 NullPointerException에 대하여.
	
	//참조 변수는 아직 주소값을 가지지 않다는 뜻으로 null 값을 가질 수 있다.
	//null 또한 초기화 값으로 사용할 수 있기 때문에, null로 초기화한 변수도 stack에 생성된다.
	//참조 타입의 변수가 현재 null값을 가지는지 아닌지는 ==, != 연산으로 확인이 가능하다.
	
	//참조 변수를 사용하면서, 변수가 null인 상태에서 데이터나 메소드를 사용하려 하면 NullPointerException 오류가 발생한다.
	//그러므로, NullPointerException 오류가 발생하면 null값인 참조 변수를 사용하려는 것이 아닌지 확인해야 한다.
	
	//어떤 참조 변수에서도 참조하고 있지 않은 객체는 쓰레기 객체가 된다.
	//null이 객체를 참조하고 있지 않은 상태라는 점을 이용하여, 메모리 정리(가비지 컬렉팅)를 위해 null값을 이용할 수 있다.
	//예시로, String 변수에 기존 문자열에서 새로운 문자열을 대입할 경우, 기존 문자열 객체는 쓰레기 객체가 된다.
	//새로운 문자열을 대입한 순간, String 변수는 새 문자열의 주소를 참조하여 기존 문자열의 주소를 잃어버리기 때문이다.
	
	
	void main(String[] args) {

		//아래는 객체에 실제 값을 넣었을 때와 null값을 넣었을 때의 차이에 대한 예제.
		
		String refVar1 = "자바"; // 스택 영역에 변수가, 힙 영역에 객체가 생성됨
		String refVar2 = null; // 스택 영역에 변수는 있지만, 힙 영역에 객체는 없음(null이므로)
		
		System.out.println(refVar1 == null); // false
		System.out.println(refVar1 != null); // true
		
		System.out.println(refVar2 == null); // true
		System.out.println(refVar2 != null); // false

		//아래는 null값인 객체를 참조하려 하여 NullPointerException 오류가 발생하는 예제.
		
		int[] intArray = null;
		//intArray[0] = 10; NullPointerException 발생. null이라 참조할 객체가 없음.
		String str = null;
		//System.out.println("총 문자 수 : " + str.length()); NullPointerException 발생. 참조하는 객체가 없는데 길이를 구할 수가 없음.
		
		//아래는 null 대입 및 참조 변경으로 인한 쓰레기 객체 발생에 대한 예제.
		
		String hobby = "게임";
		hobby = null; // "게임" 에 해당하는 String 객체는 이 시점에서 쓰레기가 됨(참조 중인 변수가 없으므로)
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1의 주소를 kind2에 대입
		kind1 = null; // 이렇게 해도, "자동차" 스트링 객체는 쓰레기가 되지 않는다.
		System.out.println("kind2 : " + kind2); // kind2가 "자동차" 스트링 객체를 참조하기 때문이다.
		
	}

}
