package ch03.sec05;

public class InfinityAndNanCheckExample {
	//나눗셈 연산 시의 NaN과 Infinity 처리에 대하여.
	//나눗셈 혹은 나머지 연산식의 오른쪽 피연산자(나누는 수)가 0일 경우 예외가 발생한다.
	//어떤 수를 0으로 나눈 값은 무한대이기 때문이다.
	//이런 경우, 연산 결과값이 Infinity 혹은 NaN(Not a Number)가 된다.
	//위 두 값이 발생한 상태에서 연산을 수행하면 데이터가 엉망이 될 수 있으므로 주의.
	//연산의 결과가 위 두 값인지 먼저 확인하고 연산을 수행하는 것이 안전하다.
	//무한 혹은 NaN 값이 나오는지는 아래의 두 메소드가 필요하다.
	//1)Double.isInfinite() : 인자로 들어간 변수가 Infinity일 때 true, 아닐 떄 false를 반환.
	//2)Double.isNaN() : 인자로 들어간 변수가 NaN일 때 true, 아닐 때 false를 반환한다.
	
	public static void main(String[] args) 
	{
		//아래는 Infinity와 NaN이 발생하는 연산 예시.
		int x = 5;
		double y = 0.0;
		//double z = x / y;
		double z = x % y;
		
		System.out.println(z + 2); // 나눗셈 출력 시 Infinity 값 발생, 나머지 출력 시 NaN 
		
		if(Double.isInfinite(z) || Double.isNaN(z))
		{
			System.out.println("값 산출 불가");
		}
		
		else System.out.println(z);
	
	}

}
