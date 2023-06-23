package ch02.sec05;
//논리 타입 데이터 boolean 정리.

//boolean 타입 리터럴은 참과 거짓을 가리키는 true, false 두종류이다.
//두 가지 상태를 저장할 때 주로 사용하며, 조건문 및 제어문 등에서 흐름 제어에 유용하다.
//조건문을 작성하여 boolean 변수에 값을 입력할 수 있다. (아래 예제 참고)

public class BooleanExample 
{
	public static void main(String[] args) 
	{
	//아래는 boolean 타입 데이터 리터럴 작성 예제.
		boolean yes = false;
		boolean no = true;
		
	// 아래는 boolean 타입 변수에 값을 입력하는 예제.
		int x = 10;
		boolean result1 = (x == 20); //변수 x가 20인가?
		boolean result2 = (x != 20); // 변수 x가 20이 아닌가?
		boolean result3 = (x > 20); // 변수 x가 20보다 큰가?
	
	// 아래는 stop 변수의 값에 따라 조건문의 분기를 결정하는 예제.
		
		boolean stop = true;
		if(stop){
			System.out.println("중지합니다");
		} 
		else {
			System.out.println("걍 갑니다");
		}
		
	//위 예제의 경우, stop 값이 true이므로 "중지합니다" 출력.
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		//x가 10인 상태에서, x가 20인가? 20이 아닌가? 20보다 큰가? 를 체크한다.
		//따라서 false, true, false 순으로 출력된다.
	}
}
