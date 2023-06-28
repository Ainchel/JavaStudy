package ch03.sec03;

public class OverflowUnderflowExample {
	//오버플로우와 언더플로우에 대하여.
	//어떤 타입이 가질 수 있는 최대/최소값을 벗어나게 되면, 에러가 나지 않고 오버/언더플로우가 발생한다.
	//오버플로우는 최대값 범위보다 값이 커졌을 때 최소값으로 돌아가는 것을 의미한다.
	//언더플로우는 최소값 범위보다 값이 작아졌을 때 최대값을 돌아가는 것을 의미한다.
	//정수 타입 모두 값의 범위만 다를 뿐, 위와 같은 규칙을 따른다.
	//오버, 언더플로우의 경우, 에러 발생 없이 값이 예측 불가능한 값으로 변하므로 주의해야 한다.
	//이를 예방하기 위해, 더 큰 범위의 데이터 타입으로 연산을 하는 것도 하나의 방법이다.
	
	//**추가 : 산술 연산을 정확하게 하고 싶다면, 실수보다 정수 연산을 하는 것이 더욱 좋다(부동 소수점 방식으로 인한 현상). 아래 예제 참고.
	//부동소수점 오류 예시 : 0.1은 이진수로 변환하면 무한히 이어지는 값이라, 데이터 타입에 할당된 메모리를 넘어서면 값을 잘라내어 오차가 생겨나게 된다.
	
	public static void main(String[] args) {
	//아래는 오버플로우, 언더플로우 각 예시.
		byte value = 127;
		value++;
		System.out.println("Overflowed value : " + value); // -128 출력
		
		value = -128;
		value--;
		System.out.println("Underflowed value : " + value); // 127 출력
		
	//아래는 for문을 통해 오버/언더플로우가 발생하는 시점을 출력하는 예제.
		
		value = 125;
		for(int i =0; i < 5; i++)
		{
			value++;
			System.out.println("value : " + value);
			
		}
		
		System.out.println("---------------------");
		
		byte value2 = -125;
		for(int i = 0; i < 5; i++)
		{
			value2--;
			System.out.println(value2);
		}
	
	//아래는 int 타입에서의 오버플로우 발생 예시.
		int a = 1000000;
		int b = 1000000;	
		int c = a * b;
		System.out.println("c : " + c);
		
	//아래는 위 오버플로우된 a * b를 long 데이터 타입에 담아보는 예제.	
		long d = (long)a * b;
		System.out.println("d : " + d);
		
	//아래는 실수 연산에서의 정확도 문제에 대한 예시.
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 남은 양 : " + result);
		
	//아래는 위 실수 연산을 정수로 변환하여 정확도 문제를 해결하는 예시.
		apple = 1;
		int totalPieces = apple * 10;
		number = 7;
		result = totalPieces - number;
		System.out.println("사과 남은 양 : " + result / 10.0);
	}

}
