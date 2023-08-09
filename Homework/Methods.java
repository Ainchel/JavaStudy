package com.jaco.aug091.main;

import java.util.ArrayList;

public class Methods {

	public static void activate() {
		int selNum = 0;

		while(true) {
		System.out.println(EMain1.scoreList);
		System.out.println("번호를 입력해 주세요(1~5)");
		System.out.println("1. 학생 수 입력 | 2. 학생 점수 입력 | 3. 학생 점수 리스트 출력");
		System.out.println("4. 학생 최고 점수 및 전체 평균 출력 | 5. 프로그램 종료");
		System.out.print(">>> : ");
		
		selNum = EMain1.sc.nextInt();
		
		if(selNum == 1) {
			EMain1.scoreList = Methods.inputStudentNumber(EMain1.scoreList);
		}
		
		else if(selNum == 2) {
			Methods.inputScores(EMain1.scoreList);
		}
		
		else if(selNum == 3) {
			Methods.printScores(EMain1.scoreList);
		}
		
		else if(selNum == 4) {
			Methods.calculSumAvg(EMain1.scoreList);
		}
		
		else if(selNum == 5) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(1);
		}
			
		else {
			System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			continue;
		}
		
		}//while(true) end
	
	}//activate end
	
	public static int[] inputStudentNumber(int[] scoreList) {
		if(scoreList == null) {
			int checkNum = -1;
			System.out.print("학생 수를 입력해 주세요 : ");
			checkNum = EMain1.sc.nextInt();
			
			if(checkNum > 0) {
			scoreList = new int[checkNum];
			System.out.printf("%d명의 학생 리스트가 생성되었습니다.\n\n", checkNum);
			return scoreList;
			} else {
			System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			return null;
			}
		}
		else {
			System.out.println("이미 생성된 리스트가 존재합니다. 처음으로 돌아갑니다.");
			return null;
		}
	
	}
	
	public static void inputScores(int[] scoreList) {
		
		if(scoreList == null) {
			System.out.println("점수 리스트가 비어 있습니다. 처음으로 돌아갑니다.");
			return;
		}
		
		for(int i = 0; i < scoreList.length; i++) {
			int CheckNum = -1;
			System.out.printf("%d번째 학생 점수 입력 (0 ~ 100) : ", i+1);
			CheckNum = EMain1.sc.nextInt();
			if(0 <= CheckNum && CheckNum <= 100) {
			scoreList[i] = CheckNum;
			} else {
			System.out.println("점수를 잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			return;
			}
		}
		EMain1.isInputScore = true;
	}
	
	public static void printScores(int[] scoreList) {
		if(scoreList == null) {
			System.out.println("점수 리스트가 비어 있습니다. 처음으로 돌아갑니다.");
			return;
		}
		
		if(EMain1.isInputScore == false) {
			System.out.println("아직 점수를 입력하지 않았습니다. 처음으로 돌아갑니다.");
			return;
		}

		for(int i = 0; i < scoreList.length; i++) {
			System.out.printf("%d번째 학생 점수 : %d점\n", i+1, scoreList[i]);
		}
	}
	
	public static void calculSumAvg(int[] scoreList) {
		if(scoreList == null) {
			System.out.println("점수 리스트가 비어 있습니다. 처음으로 돌아갑니다.");
			return;
		}
		
		if(EMain1.isInputScore == false) {
			System.out.println("아직 점수를 입력하지 않았습니다. 처음으로 돌아갑니다.");
			return;
		}
		
		int highestScore = -999;
		double scoreAvg = 0.0;
		
		for(int i = 0; i < scoreList.length; i++) {
			if(highestScore < scoreList[i]) {
				highestScore = scoreList[i];
			}
			scoreAvg += scoreList[i];
		}
		scoreAvg /= scoreList.length;
		
		System.out.printf("학생 최고 점수 : %d || ", highestScore);
		System.out.printf("학생 점수 평균 : %.2f\n", scoreAvg);
	}
	
}
