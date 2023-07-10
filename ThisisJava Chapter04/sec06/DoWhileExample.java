package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	//do - while 문에 대하여.
	//while문은 while 내의 블록을 실행시키려면 반드시 조건식을 평가해야 한다.
	//하지만 while 블록을 먼저 실행시키고, 반복실행을 할지 결정하는 경우도 있을 것이다.
	//그런 경우 do - while 문을 사용한다.

	//do - while문의 경우, 아래와 같은 구조를 가진다.
	
	//do{
	//
	//
	//실행문
	//
	//
	//} while (조건식);
	
	//위와 같이 do - while 문을 구성했을 경우의 실행 순서는 아래와 같다.
	//1)do - while문이 처음 실행되면, 실행문을 우선 실행시킨다.
	//2)실행문을 처음 완료하고 나면, while 내의 조건식을 평가한다.
	//3)while의 조건식이 true라면 실행문을 다시 실행하고 2)로 돌아간다.
	//4)while의 조건식이 false라면 do-while문을 종료한다.
	
	//do-while문 내의 while 부분에서, 세미콜론을 반드시 붙여야 한다.
	
	public static void main(String[] args) {
	
		//아래 예제는 키보드로 입력받은 값을 조건으로 반복여부를 확인하는 예제.
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("입력 키 : ");
			inputString = sc.nextLine();
			System.out.println("입력하신 키 : " + inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("q키를 입력하여 프로그램을 종료합니다.");
		
	}

}