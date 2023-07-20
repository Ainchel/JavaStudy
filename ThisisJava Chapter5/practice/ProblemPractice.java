package ch05.practice;

import java.util.Scanner;

public class ProblemPractice {

	//확인 문제. 코드 작성이 필요한 문제들의 해결 코드만 있음.
	
	public static void main(String[] args) {

		//아래 배열에서 최대값을 출력하는 코드 작성하기.
		
		int[] array1 = {66, 23, 85, 64, 10};
		int max = -999;
		
		for(int i = 0; i < array1.length; i++) {
			if(max < array1[i]) {
				max = array1[i];
			}
		}
		
		System.out.println("배열 내 최대값 : " + max);
		
		//주어진 배열의 전체 합과 평균을 구해 출력하는 코드 작성하기.
		
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int array2Sum = 0;
		float array2Avg = 0.0f;
		int divisionCount = 0;
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				array2Sum += array2[i][j];
				divisionCount++;
			}
		}
		
		array2Avg = array2Sum / divisionCount;
		
		System.out.println("배열 항목의 전체 합 : " + array2Sum);
		System.out.println("배열 항목의 평균 : " + array2Avg);
		
		//학생들의 점수를 분석하는 프로그램 만들기.
		//while과 Scanner를 사용하여 최고 점수 및 평균 점수를 출력하기.
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		int scoreSum = 0;
		int maxScore = -999;
		float scoreAvg = 0.0f;
		int[] scoreList = null;
		boolean isOver = false;
		
		while(true) {
			
			if(isOver == true) {break;}
			
			
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("번호를 입력해 주세요 : ");
			
			inputNum = sc.nextInt();
			
			switch(inputNum) {
			
			case 1:
			System.out.print("학생 수 > ");
			inputNum = sc.nextInt();
			scoreList = new int[inputNum];
			break;
				
			case 2:
			for(int i = 0; i < scoreList.length; i++) {
			System.out.printf("scores[%d] : ", i);
			scoreList[i] = sc.nextInt();
			}
			break;
			
			case 3:
			for(int i = 0; i < scoreList.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scoreList[i]);	
			}
			break;
				
			case 4:
			maxScore = -999;
			scoreSum = 0;
			for(int i = 0; i < scoreList.length; i++) {
				if(maxScore < scoreList[i]) {
					maxScore = scoreList[i];
				}
				scoreSum += scoreList[i];
			}
			scoreAvg = (float)scoreSum / scoreList.length;
			System.out.println("최고 점수 : " + maxScore);
			System.out.println("평균 점수 : " + scoreAvg);
			break;	
			
			case 5:
			System.out.println("프로그램 종료");
			isOver = true;
			break;
			}//switch
		}//while(True)
	} // main

} //class
