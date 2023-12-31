package ch04.sec04;

public class PrintFrom1To10Example {

	//for문에 대하여.
	//프로그래밍을 하면서, 똑같은 실행문을 반복하여 실행해야 할 경우가 있다.
	//이 때 for문을 사용하지 않으면, 실행문을 실행 횟수만큼 반복해야 한다.
	//이 때 for문을 사용하면 실행문의 반복 횟수와 상관없이, 코드를 획기적으로 줄여서 반복 실행이 가능하다.
	
	// for(초기화식, 조건식, 증감식){
	// 실행문
	// }
	
	// 위 구문으로 작동하며, 작동 방식은 아래와 같다.
	// 1)for 괄호 내의 초기화 식을 먼저 실행한다.
	// 2)초기화된 식이 조건식에 맞는지 평가한다.
	// 3)조건식을 만족했을 경우(true) 실행문을 실행한다.
	// 4)조건식을 만족하지 않았을 경우(false) for문을 종료하고 블록을 건너뛴다.
	// 5) 3)에 따라 블록 내의 실행문을 전부 실행하면, 증감식을 실행한다.
	// 6)증감식이 적용된 초기화식으로 2)의 조건식 평가를 다시 실행한다.
	// 7)조건식의 평가 결과가 false가 될 때까지 3 ~ 6번의 과정을 반복한다.
	
	// 초기화 식이란, 조건식 및 실행문, 증감식에서 사용할 변수를 초기화하는 것이다.
	// 초기화식과 조건식, 증감식 모두 여러 개의 조건을 걸 수 있으며, 이 경우 콤마(,)로 구분한다.
	// for문 초기화식에서 선언된 변수는 for문 블록에서만 사용된다.
	// for문이 끝나고도 변수를 사용해야 한다면, for문 밖에서 선언해야 한다.
	// for문의 초기화식으로 실수 타입은 사용하면 안된다. (부동소수점 방식으로 인한 값 오차 때문)
	
	// for문 내에서 for문을 작성할 수 있으며, 이를 중첩 for문이라고 한다.
	// 이 경우, 바깥의 for문의 한 번 반복 동안, 안쪽의 for문은 지정 횟수만큼 계속 반복된다.
	
	public static void main(String[] args) {
		
		//아래는 for문을 통해 1 ~ 10까지 출력하게끔 하는 예제.
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//아래는 for문 밖에서 선언한 변수를 for문 괄호에서, 실행문에서 사용하는 for문 예제.
		
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d까지의 합 : %d", i, sum);
		
		//아래는 for문 괄호에 실수를 사용한 예제(부동소수점 방식으로 인한 오차가 발생하므로 사용 금지)
		
		for(double x = 0.1; x <= 1.0; x += 0.1){
			System.out.println(x);
		}
		
		// 아래는 중첩 for문(이중 for문)을 통한 구구단 출력 예제.
		// 결과적으로, m의 반복을 한 번 실행할 때마다 n의 반복은 전체 실행된다.
		// 따라서, n 전체를 m * n번만큼 반복하는 것과 같다.
		
		for(int m = 2; m <= 9; m++) { // 안쪽의 for문이 전부 반복될 때 증감식 한 번 증가.
			System.out.println("---구구단 " + m + "단 :---");
			for(int n = 1; n <= 9; n++) { // 바깥쪽의 증감식이 한 번 증가할 때 for문을 한번씩 전부 반복.
				System.out.printf("%d X %d = %d\n", m, n, m*n);
			}
			
		}
		
	}

}
