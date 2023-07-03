package ch03.SolveCheck;

public class PracticeProblems {
	
	public static void main(String[] args) 
	{
		//아래 코드 실행 시 출력결과 맞추기
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31 출력.
		// x값은 먼저 1을 더하고, y는 해당 행 연산을 다 마친 후에 1을 뺀다.
		// 따라서, 11 + 20이므로 z == 31이고, 이후 y가 19가 된다.
		
		//아래 코드 실행 시 출력결과 맞추기.
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);
		
		//아래 괄호에 들어갈 코드 완성하기.
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (pencils / students);
		System.out.println(pencilsLeft);
	
		//아래 괄호를 완성하여, 십의 자리 이하를 버리는 코드 완성하기.
		int value = 356;
		System.out.println((value/100) * 100);
		
		//아래 코드의 출력값 맞추기.
		x = 10;
		y = 5;
		System.out.println((x > 7) && (y <= 5)); // true 출력
		System.out.println((x%3 == 2) || (y%2 != 1)); //false 출력
		
		//NaN 값을 검사할 수 있게끔 if문 괄호의 코드 완성하기.
		double xx = 5.0;
		double yy = 0.0;
		double zz = 5 % yy;
		if(Double.isNaN(zz)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else
		{
			double dresult = zz + 10; 
			System.out.println("drsult 결과 : " + dresult);
		}
		
	}
}
