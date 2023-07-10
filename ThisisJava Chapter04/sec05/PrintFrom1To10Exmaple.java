package ch04.sec05;

import java.util.Scanner;

public class PrintFrom1To10Exmaple {
	//while 문에 대해.
	
	//for문이 정해진 횟수만큼 반복한다면, while은 조건식이 true인 동안 계속 반복하며, false일 때 반복을 종료한다.
	//while문의 구성은 아래와 같다.
	
	//while(조건식){
	//
	//
	//실행문
	//
	//
	//}
	
	//while 문의 실행 방식은 아래와 같다.
	//1)while문이 처음 실행될 때, while의 괄호 내 조건식을 평가한다.
	//2)평가 결과가 true라면 실행문을 실행한다.
	//3)실행문이 전부 실행되고 나면, 조건식을 다시 평가한다.
	//4)조건식이 true라면 2) ~ 3)을 반복, false라면 while문을 종료한다.
	
	//while의 조건식에 true를 넣을 경우, 무한히 반복하게 된다.
	//이럴 경우, while 문을 빠져나갈 코드를 작성해 두어야 한다. 아래 예제 참고.
	
	public static void main(String[] args) {

		//아래는 while문을 통한 1 ~ 10 출력 예제.
		
		int i = 1;
		while(i <= 10){
			System.out.print(i + " ");
			i++;
		}//while
		
		//아래는 while문을 통해 1 ~ 100까지의 합을 구하는 예제.
		//합계 값을 담을 변수는 while문 밖에 선언해야 한다.
		
		System.out.println();
		
		i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.printf("1부터 %d까지 더한 값은 %d입니다", i-1, sum);
		
	
		//아래는 특정 값(3)을 입력하기 전까지 무한히 반복되는 while문 예제.
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 종료");
			System.out.println("--------------------------");
			System.out.print("선택 : ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("3")) {
				run = false; // 3을 입력받을 경우 while의 true였던 조건식을 false로 변경
			}
			
		} //while
		
		System.out.println("3번을 입력하여 프로그램을 종료합니다.");

	}//main

}//Class
