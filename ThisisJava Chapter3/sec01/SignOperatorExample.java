package ch03.sec01;

public class SignOperatorExample 
{
	//부호 연산자, 증감 연산자에 대하여.
	//부호 연산자는 변수 값의 부호를 유지/변경하는 데 쓴다.
	//+ : 해당 값의 부호를 유지. 잘 안 쓴다.
	//- : 해당 값의 부호를 변경(+에서 -로, -에서 +로)한다.
	//해당 연산자를 사용하는 것도 연산이므로, 변경된 값은 수의 종류 별 기본 타입(정수 - int, 실수 - double)을 따라야 한다.
	//예시) byte b = 100;일 때, byte result = -b; 처럼은 갈 수 없으며, int result = -b; 와 같이 가야 한다.
	
	//증감 연산자는 변수의 값을 1 증가시키거나 감소시키는 연산자이다.
	//++과 --가 있으며, 변수 단독으로만 사용될 때에는 피연산자 앞이냐 뒤냐 관계없이 결과가 같다.(i++나 ++i나 같음.)
	//하지만 연산자가 여러개 존재할 때에는 피연산자 앞에 붙냐 뒤에 붙냐로 증감 순서가 달라질 수 있다. 예제 참조.
	//간략히 정리하면, 변수 앞에 증감연산자가 오면 먼저 증감을, 변수 뒤에 오면 모든 연산을 마친 후 증감을 수행한다.
	
	public static void main(String[] args) 
	{
		//아래는 부호 연산자를 통해 값의 부호를 바꾸는 예제.
		int x = -100;
		x  = -x;
		System.out.println("x : " + x); // 100 출력
		
		byte b = 100;
		int y = -b;
		System.out.println("y : " + y); // -100 출력

		//아래는 여러 개의 연산자가 있을 때 증감연산자 처리 순서.
		x = 1;
		y = 1;
		int result1 = ++x + 10; // 먼저 x 변수의 값을 1 증가시킨 후 연산을 진행한다.
		int result2 = y++ + 10; // 먼저 y + 10을 한 후, y 변수를 1 증가시킨다.
		//위 두 식을 진행하고 나면, x와 y는 모두 2가 되지만 y++ + 10의 값은 11이 된다.(덧셈 연산 후 y값을 1 증가시켰으므로.)
		
		//아래는 증감연산자의 다양한 사용 예제.
		
		x = 10; y = 10; int z;
		x++;
		++x;
		System.out.println("x : " + x); // x : 12 출력
		System.out.println("------------------------------");
		
		y--;
		--y;
		System.out.println("y : " + y); // y : 8 출력
		System.out.println("------------------------------");
		
		z = x++;
		System.out.println("z : " + z); // ++가 뒤에 왔으므로, z에 x값이 먼저 들어가고 x에 1을 더한다. z : 12 출력
		System.out.println("x : " + x); // x : 13 출력
		System.out.println("------------------------------");
		
		z = ++x;
		System.out.println("z : " + z); // ++가 앞에 왔으므로, x에 1을 먼저 더한 후 z에 값이 들어간다. z : 14 출력
		System.out.println("x : " + x); // x : 14 출력
		System.out.println("------------------------------");
		
		z = ++x + y++;
		System.out.println("z : " + z); // x에 1을 더한 후 x + y를 하고 나서 y에 1을 더하므로 15 + 8, z : 23이 출력된다.
		System.out.println("x : " + x); // x : 15 출력
		System.out.println("y : " + y); // y : 9 출력
				
	}

}
