package ch04.practice;

import java.util.Scanner;

public class PracticeProblem {

	//Chapter 4 확인문제 코딩.
	
	public static void main(String[] args) {

		//2번 문제 : 아래 switch 문을 표현식(Expression)으로 변경해보기.
		
		//변경 전
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		
		} // switch
		//변경 후	: 버전이 낮아 주석처리 예정.
//		switch(grade) {
//		
//			case "A" ->{
//			score1 = 100;	
//			}
//			
//			case "B" ->{
//				int result = 100 - 20;
//				score1 = result;
//			}
//			
//			default -> {
//				score1 = 60;
//			}
//		}
		
		//3번 문제 : 1 ~ 100까지의 정수 중, 3의 배수만을 총합하여 출력하는 코드 작성하기.
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			
			if(i % 3 == 0) { // 3의 배수일 때
				sum += i;
			} 
			
		}
		
		System.out.println("1 ~ 100 중 3의 배수의 합 : " + sum);
		
		//4번 문제 : while문과 Math.random() 메소드를 이용해, 1 ~ 6의 주사위 2개로 합이 5가 나오면 멈추는 코드 작성하기.
		
		int dice1 = 0;
		int dice2 = 0;
		
		while(true) {
			
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			
			if(dice1 + dice2 == 5) {
				System.out.printf("(%d, %d)\n\n", dice1, dice2);
				break;
			}
			
		}
		
		//5번 문제 : 중첩 for문을 사용하여, 4x + 5y = 60의 모든 해를 (x, y)형태로 출력하는 코드 작성하기.
		
		int x = 0;
		int y = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if((4 * i) + (5 * j) == 60) {
					x = i;
					y = j;
					System.out.printf("(x = %d, y = %d)일 때, 4x + 5y = 60입니다.\n", x, y);
					break;
				}//if
	
			}//내부for
			
		}//외부for
		
		System.out.println();
		
		//6번 문제 : for문을 이용하여 아래로 1개씩 증가하는 별 5개까지 찍기.
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();;
		}
		
		//7번 문제 : while 문과 Scanner의 nextLine() 메소드로, 입력값에 따라 예금, 출금, 조회, 종료 기능을 제공하는 프로그램 만들기.
		
		//선언
		Scanner sc = new Scanner(System.in);
		int select = 0; // 번호 선택
		int deposit = 0; // 예금 금액
		int withdraw = 0; // 출금 금액
		int balance = 0; // 잔고
		
		while(true) {
		
		//입력
		System.out.println("1 ~ 4까지의 번호를 입력해 주세요.");
		System.out.print("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ::");
		select = sc.nextInt();
		
		//처리
		if(select == 1) {
		System.out.print("예금할 금액을 입력해 주세요 : ");
		deposit = sc.nextInt();
		System.out.printf("%d원이 입금되었습니다.  ", deposit);
		balance += deposit;
		System.out.printf("잔고 : %d원\n\n", balance);
		
		} // if == 1
		
		else if(select == 2) {
		  System.out.print("출금할 금액을 입력해 주세요 : ");
		  withdraw = sc.nextInt();
		  
		  	if(balance > withdraw) {
		  		System.out.printf("%d원을 출금하셨습니다.  ", withdraw);
		  		balance -= withdraw;
		  		System.out.printf("잔고 : %d원\n\n", balance);
		  	} 
		  	
		  	else {
		  		System.out.println("잔고보다 큰 금액을 출금할 수 없습니다. 처음으로 돌아갑니다.\n");
		  	}
		  	
			
		} // else if == 2 
		
		else if(select == 3) {
	  		System.out.printf("잔고 : %d원\n\n", balance);
		} // else if == 3 
		 
		else if(select == 4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} // else if == 4
		
		else {
			System.out.println("잘못된 번호를 입력하셨습니다. 처음으로 돌아갑니다.");
		}
		
		//출력
		}//while(true
		
		sc.close();
		
	} // main end

} // class end
