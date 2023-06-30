package ch03.sec07;

public class LogicalOperatorExample 
{
	// 논리 연산자에 대하여.
	// 논리 연산자는 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리 부정(!) 연산을 수행한다.
	// 위 논리 연산자는 흐름 제어문인 조건문(if), 반복문(for / while) 등에서 주로 사용한다.
	
	// 논리곱은 AND 연산이며, 두 피연산자가 모두 true일 때에만 true로 연산된다.
	// && 또는 &로 논리곱 연산을 표현한다.
	
	// 논리합은 OR 연산이며, 두 피연산자 중 하나만 true이면 true로 연산된다.
	// || 또는 |로 논리합 연산을 표현한다.
	
	// 배타적 논리합은 XOR 연산이며, 한 쪽이 true이고 다른 한쪽이 false일 때에만 true로 연산된다.
	// ^로 배타적 논리합 연산을 표현한다.
	
	// 논리 부정은 NOT 연산이며, 현재 논리값(true/false)의 값을 바꾼다.
	
	//논리곱과 논리합에서, 부호 하나를 쓰는 연산(&/|)과 부호 두개를 쓰는 연산(&&/||)은 결과는 같지만 과정이 살짝 다르다.
	//부호 두 개를 쓰는 연산의 경우, 첫 연산자에서 false/true가 확정되는 경우 두 번째 연산자를 보지 않고 곧바로 그 결과를 산출한다.
	//예시 1) && 연산자의 경우, AND 연산자이므로 첫 연산자에서 false일 경우, false가 확정이므로 두 번째 연산자를 볼 필요 없이 false를 산출한다.
	//예시 2) || 연산자의 경우, OR 연산자이므로 첫 연산자에서 true일 경우, true가 확정이므로 두 번째 연산자를 볼 필요 없이 true를 산출한다.
	//반면, 부호 하나를 쓰는 연산의 경우, 무조건 두 피연산자를 모두 확인한 후 결과를 산출한다.
	//따라서, 성능적으로는 부호 두개를 쓰는 연산자가 더욱 효율적이라고 할 수 있다.
	
	public static void main(String[] args) 
	{
		//아래는 다양한 논리 연산자 사용 예제.
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if((65 <= charCode) & (charCode) <= 90) 
		{
			System.out.println((int)charCode);
			System.out.println("대문자입니다.");
		}
		
		if((97<=charCode) && (charCode <= 122)) 
		{
			System.out.println((int)charCode);
			System.out.println("소문자입니다.");
		}
		
		if((48 <= charCode) && (charCode <= 57)) 
		{
			System.out.println((int)charCode);
			System.out.println("0 ~ 9 사이의 숫자입니다.");
		}
		
		int value = 6;
		//int value = 7;
		
		if(value % 2 == 0 | (value % 3 == 0)) 
		{
			System.out.println("value : " + value);
			System.out.println("2 또는 3의 배수입니다.");
		}

		boolean result = (value % 2 == 0) || (value % 3 == 0);
		
		if(!result) 
		{
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}		
		
//		String abc = "aiqgaaskbnbkaa";
//		int idxCount = 0; 
//		int idx = 0;
//		System.out.println("골라내기 전 : " + abc);
//		
//		char[] ABC = abc.toCharArray();
//		
//		for(int i = 0; i < ABC.length; i++)
//		{
//			if(ABC[i] == 'a') idxCount++;
//		}
//		
//		char[] aaa= new char[idxCount];
//		
//		for(int i = 0; i < ABC.length; i++)
//		{
//			if(ABC[i] == 'a')
//			{
//				aaa[idx] = ABC[i];
//				idx++;
//			}
//		}
//		
//		String copy = String.valueOf(aaa);
//			
//		System.out.println(copy);
//		
	}

}