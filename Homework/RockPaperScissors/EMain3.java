package com.jaco.aug091.main;

import java.util.Scanner;

//가위바위보 게임 만들기 (메소드 활용)
// 1. 가위 -> 콘솔에 1을 입력하면 가위
// 2. 바위 -> 콘솔에 2를 입력하면 바위
// 3. 보 -> 콘솔에 3을 입력하면 보

public class EMain3 {

	public static Scanner sc = new Scanner(System.in);
	public static EMain3 main = new EMain3();
	int comSel;
	int mySel;
	int result;
	int winCount;
	
	static final int SCISSOR = 1;
	static final int ROCK = 2;
	static final int PAPER = 3;
	
	static final int WIN = 1000;
	static final int DRAW = 1001;
	static final int LOSE = 1002;
	
	public static void activate() {
		main.showIntro(); // 초기 화면
		main.showRule();  // 룰 설명
		
		while(true) {
		main.inputRCP(); // 유저가 뭐 낼지 결정
		main.createComSel(); // 컴퓨터가 뭐 낼지 결정
		main.judgeWinLose(); // 유저와 컴퓨터의 승패 판정
		main.showEachRCP();  // 유저와 컴퓨터가 뭘 냈는지 출력
		main.showResult();   // 승패 판정 결과 출력
		main.isContinue();   // 승무패에 따라 게임을 계속하거나, 연승 수를 출력하고 프로그램 종료
		}
	}
	
	public void showIntro() {
		System.out.println("================가위바위보 게임================");
		System.out.println("먼저 룰에 대해 설명 드리겠습니다.");
	}
	
	public void showRule() {
		System.out.println("컴퓨터에게 가위바위보를 질 때까지, 가위바위보를 반복합니다.");
		System.out.println("패배했을 경우, 몇 연승 후 패배하셨는지 출력해 드립니다.");
		System.out.println("==========================================");
	}
	
	public void inputRCP() {
		try {
		System.out.println("1을 입력하여 가위, 2를 입력하여 바위, 3을 입력하여 보를 내세요.");
		System.out.print("입력 >>> :  ");
		mySel = sc.nextInt();
		} catch(Exception e) {
			System.out.println("숫자가 아닌 값을 입력하셨습니다. 다시 입력해 주세요 : ");
			mySel = sc.nextInt();
			inputRCP();
		}
		if(mySel < 1 || mySel > 3) {
			System.out.println("1 ~ 3 사이의 숫자를 입력하지 않았습니다. 다시 입력해 주세요.");
			inputRCP();
		}
	}
	
	public void createComSel() {
		comSel = (int)(Math.random() * 3 + 1);
	}
	
	public void judgeWinLose() {
//		//번외편으로, 내가 낸 것과 컴퓨터가 낸 것의 값을 빼서 승패 판별해보기.
//		int game = mySel - comSel;
//		if(game == 0) { // 같은 수 == 비겼을 떄
//		System.out.println("무승부입니다.");
//		//return 0; 이 방식으로 쓸거면 리턴타입 int로 바꿔야 됨.
//		} else if(game == -1 || game == 2) {
//			System.out.println("패배했습니다.");
//		//	return -55555; 이 방식으로 쓸거면 리턴타입 int로 바꿔야 됨.
//		} else {
//			System.out.println("승리했습니다.");
//		//	return 1; 이 방식으로 쓸거면 리턴타입 int로 바꿔야 됨.
//		}
		
		if(mySel == SCISSOR) {
			if(comSel == SCISSOR) {
				result = DRAW;
			}
			else if(comSel == ROCK) {
				result = LOSE;
			}	
			else if(comSel == PAPER) {
				result = WIN;
			}
		}
		else if(mySel == ROCK) {
			if(comSel == SCISSOR) {
				result = WIN;
			}
			else if(comSel == ROCK) {
				result = DRAW;
			}	
			else if(comSel == PAPER) {
				result = LOSE;
			}
		}
		else if(mySel == PAPER) {
			if(comSel == SCISSOR) {
				result = LOSE;
			}
			else if(comSel == ROCK) {
				result = WIN;
			}	
			else if(comSel == PAPER) {
				result = DRAW;
			}
		}
		
		if(result == WIN) {winCount++;}
	}
	
	public void showEachRCP() {
		if(mySel == SCISSOR) {
		System.out.print("당신은 가위를 내셨습니다.");
		} else if(mySel == ROCK) {
		System.out.print("당신은 바위를 내셨습니다.");
		} else if(mySel == PAPER) {
		System.out.print("당신은 보를 내셨습니다.");	
		}
		
		System.out.print(" ");
		
		if(comSel == SCISSOR) {
		System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if(comSel == ROCK) {
		System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if(comSel == PAPER) {
		System.out.println("컴퓨터는 보를 냈습니다.");
		}
	}
	
	public void showResult() {
		if(result == WIN) {
		System.out.println("승리하셨습니다! 계속해서 게임을 진행합니다.");
		System.out.println();
		return;
		} else if(result == DRAW) {
		System.out.println("비기셨습니다. 계속해서 게임을 진행합니다.");	
		System.out.println();
		return;
		} else if(result == LOSE) {
		System.out.println("패배하셨습니다. 게임을 중단하고, 연승 수를 표시합니다.");
		}
	}
	
	public void isContinue() {
		if(result == WIN || result == DRAW) {
			return;
		} else {
			System.out.printf("패배까지 연승하신 횟수 : %d", winCount-1);
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
	activate();
	}
	
}
