package com.jaco.aug091.main;

// 메소드의 재귀적 호출에 대하여.
// 메소드 속에서 자기 자을 반복하여 호출하는 것.

// 메소드를 호출한다는 것은 비교적 느린 작업에 속한다.
// 재귀적 호출은 코테 볼때 알고리즘으로 내는 경우가 있으니 알면 좋다.

// 등차수열 메소드 만들기 - 정수를 넣으면, 1부터 그 숫자까지 전부 더해주는 메소드.



public class EMain2 {

	public static int arithmetic(int i) {
		if(i != 1) {
		return i + arithmetic(i-1);
		}
		
		else {
		return i;
		}
		//5일 때, return 5 + arithmetic(4) -> 메소드 다시 실행
		//4일 때, return 5 + 4 + arithmetic(3) -> 메소드 다시 실행
		//3일 때, return 5 + 4 + 3 + arithmetic(2) -> 메소드 다시 실행
		//2일 때, return 5 + 4 + 3 + 2 + arithmetic(1) -> 메소드 실행 끝(1일땐 호출 안시킴)
		//1일 때, return 5 + 4 + 3 + 2 + 1 -> 메소드 호출이 끝났으므로, 대기중이던 누적된 return들 연산.
		//순서대로면 이렇게 추정되는데, 왜 값이 누적되어 있는가?
		//return 값들이 마지막까지 남아 더해지는 이유는, 재귀호출의 각 호출들이 서로 다른 메모리에서 각자 진행되며 대기하고 있기 때문이다.
		//재귀가 끝날 때까지 메모리에서 쭉 대기하던 메소드들은, 마지막 호출이 끝나면 순차적으로 return시키며 쌓인 연산들을 해버린다.
	}
	
	public static int factorial(int i) {
		if(i != 1) {
			return i * factorial(i-1);
		} else {
			return i;
		}
	}
	
	public static int fibonacci(int i) {
		//x(5)라면, x(3)과 x(4)의 합.
		//x(4)라면, x(2)와 x(3)의 합.
		//x(3)라면, x(1)과 x(2)의 합 == 2
		if(i > 2) {
			return fibonacci(i-1) + fibonacci(i-2);
		} else {
			return 1;
		}
		//9일 때 : return fibonacci(8) + fibonacci(7)
		//8일 때 : return fibonacci(7) + fibonacci(6) + fibonacci(6) + fibonacci(5)
		//7일 떄 : return . . . . . . . . . .
		//반복하면, fibonacci(2)와 fibonacci(1)이 대략 34개 나온다. 재귀 끝난 후 전부 더하면 34가 나옴.(왜???)
		
	}
	
	public static void main(String[] args) {
		System.out.println(arithmetic(10));
		System.out.println(factorial(5));
		System.out.println(fibonacci(9));
	}
	
}
