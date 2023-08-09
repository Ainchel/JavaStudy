package com.jaco.aug091.main;

import java.util.Scanner;
import com.jaco.aug091.main.Methods;

public class EMain1 {
	
	//이런저런 메소드들 만들어서 합쳐보기.
	//1번 메뉴 입력 시 학생 수를 입력.
	//2번 메뉴 입력 시 각 학생들의 점수를 입력.(점수범위 예외처리, 범위 벗어나면 다시 입력.)
	//3번 메뉴 입력 시 학생들의 점수 리스트를 출력
	//4번 메뉴 입력 시 학생 중 최고 점수와 학생전체 평균 점수 계산 및 출력.
	//5번 메뉴 입력 시 프로그램 종료.
	
	public static int[] scoreList;
	public static Scanner sc = new Scanner(System.in);
	public static boolean isInputScore = false;
	
	//맨 처음 콘솔에 노출할 화면 - 시작, 종료 같은 느낌
	public static void start() {
		System.out.println("======================");
		System.out.println("\t\t1. 학생수 | 5. 종료");
		System.out.println("======================");
	}
	
	//메뉴 노출 - 1~5번까지.
	public static void showMenu() {
		System.out.println("=================================================");
		System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("=================================================");
	}
	
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.println("선택 > ");
		int selectNo = k.nextInt();
		return selectNo;
	}
	
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.println("학생 수 : ");
		int studentNum = k.nextInt();
		return studentNum;
	}
	
	//학생 개인의 점수를 얻어오는 메소드 작성
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if(score > 100) {
			System.out.println("점수는 100점을 넘을 수 없습니다.");
			System.out.print("다시 입력 : ");
		} else if(score < 0) {
			System.out.println("점수는 0점보다 낮을 수 없습니다.");
			System.out.println("다시 입력 : ");
		}
		return (0 <= score && score <= 100) ? score : getScore(); // 재귀 호출
	}
	
	//학생들의 점수를 입력하는 메소드 작성
	public static int[] getScore(int[] scores) { //메소드 오버로딩
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 점수 입력 : ", i + 1);
			scores[i] = getScore();
		}
		return scores;
	}
	
	//학생들의 점수를 출력하는 메소드 작성
	public static void printScore(int[] scores) {
		int index = 1;
		
		for(int i : scores) {
			System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
		}
	}
	
	//학생들 내 최고 점수와 전체 평균 점수 출력 메소드
	
	public static void printStats(int[] scores) {
		int max = 0;
		int sum = 0;
		for(int i : scores) {
			sum += i;
			max = (max < i) ? i : max;
		}
		double avg = (double)sum / scores.length;
		System.out.printf("최고 점수 : %d점\n", max);
	}
	
	public static void end() {
		System.out.println("\t\t\t종료합니다.");
		System.out.println("===========================================");
	}

	//전체 실행 함수 activate
	public static void activate2() {
		int selectNo = 0;
		int studentNum = -1;
		int[] scores = null;
		
		start();
		selectNo = getSelectNo();
			if(selectNo == 1) {
				studentNum = getStudentNum();
				scores = new int[studentNum];
				while(true) {
					showMenu();
					selectNo = getSelectNo();
					
					if(selectNo == 1) {
						studentNum = getStudentNum();
						scores = new int[studentNum];
					} else if (selectNo == 2) {
						getScore(scores);
					} else if (selectNo == 3) {
						printScore(scores);
					} else if (selectNo == 4) {
						printStats(scores);
					} else if (selectNo == 5) {
						end();
						break;
					}
				}
			}
			else if(selectNo == 5) {
				end();
			}
			else {
				System.out.println("\t입력이 잘못 되었습니다.");
				System.out.println("\t다시 입력하세요.");
			}
		}
	
	//선택할 메뉴의 번호를 입력받기
	
	public static void main(String[] args) {
		activate();
	}	//main end
	
	public static void activate() {
	int selNum = 0;

	while(true) {
	System.out.println("번호를 입력해 주세요(1~5)");
	System.out.println("1. 학생 수 입력 | 2. 학생 점수 입력 | 3. 학생 점수 리스트 출력");
	System.out.println("4. 학생 최고 점수 및 전체 평균 출력 | 5. 프로그램 종료");
	System.out.print(">>> : ");
		
	selNum = sc.nextInt();
		
	if(selNum == 1) {
			scoreList = Methods.inputStudentNumber(scoreList);
		}
		
		else if(selNum == 2) {
			Methods.inputScores(scoreList);
		}
		
		else if(selNum == 3) {
			Methods.printScores(scoreList);
		}
		
		else if(selNum == 4) {
			Methods.calculSumAvg(scoreList);
		}
		
		else if(selNum == 5) {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			System.exit(1);
		}
			
		else {
			System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
			continue;
		}
		
		}//while(true) end
	
	}//activate end
	
}//class end
