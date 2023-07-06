package oop20230705;

public class VariableEx3 {
	// 3개의 정해진 점수의 합과 평균을 구하는 코드 작성하기.
	// 원래는 변수와 간단한 사칙연산 수준의 수업에서 받은 과제였다.
	// 하지만 클래스 사용 연습을 위해, 아래와 같이 클래스와 메소드 형식으로 구현해보았다.
	
	// 실수했던 내용 1) CalAndPrint 함수 설계할 때, 평균 점수를 출력하는 부분에서 평균 점수 변수명(avg)과 패러미터로 들어오게 설계한 평균 점수(지금은 삭제되어서 없음)의 이름이 같아서, 저장된 멤버 변수(필드) 값을 불러오지 못했음.
	//			 2) avgCalculation 함수 설계할 때, double avg에 넣을 두 값 연산할 때 형변환 안해서 소수값 소실됨.
	
	// 몰랐던 내용 : 현재 VariableEx3 클래스 내에 ScoreCalculation 클래스를 만들었는데, static을 붙이지 않으면 main 메소드에서 객체를 생성할 수 없었다.
	// 해결 방법 1) ScoreCalculation 클래스가 VariableEx3안에 있을 때, static을 붙이면 객체 생성 가능.
	// 해결 방법 2) ScoreCalculation 클래스를 VariableEx3 밖으로 빼고, 그냥 class ScoreCalculation로 선언하면 객체 생성 가능.
	// 해당 오류 관련하여 참조한 링크 : https://mainia.tistory.com/2675
	// 하지만 이유를 완벽하게 이해하지는 못해서, 추가로 질문 드려야 함.
	
	public static void main(String[] args) {
		ScoreCalculation result = new ScoreCalculation();
		result.CalAndPrint(result.koreanScore, result.englishScore, result.mathScore);
	}
	
}

class ScoreCalculation{
	
	int koreanScore = 100;
	int englishScore = 25;
	int mathScore = 84;
	int total = 0;
	double avg = 0.0;
	
	void totalCalculation(int kScore, int eScore, int mScore){
		total = kScore + eScore + mScore;
	}
	
	void avgCalculation(int total, int avgCount) {
		avg = (double)total / avgCount;
	}

	void CalAndPrint(int kScore, int eScore, int mScore)
	{
		totalCalculation(kScore, eScore, mScore);
		avgCalculation(total, 3);
		System.out.println("3과목의 총점 : " + total + "점");
		System.out.printf("3과목의 평균 : %.1f점", + avg);
	}
	
}
		
	}
}
