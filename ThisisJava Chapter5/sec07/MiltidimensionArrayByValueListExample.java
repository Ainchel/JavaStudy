package ch05.sec07;

public class MiltidimensionArrayByValueListExample {

	//다차원 배열에 대하여.
	//배열의 항목으로 배열이 대입될 수 있는데, 이러한 배열을 다차원 배열이라고 한다.
	//다차원 배열은, 즉 1차원 배열들이 서로 연결되어 있는 것이라고 할 수 있다.
	//다차원 배열은, 변수명[1차원인덱스][2차원인덱스]...[n차원인덱스] 와 같은 방식으로 인덱스에 접근이 가능하다.
	
	//다차원 배열을 생성하려면 타입 뒤에 차원 수만큼의 []를 붙인다.
	//변수[][]라는 2차원 배열이 있다면, 값 접근은 아래처럼 한다.
	//변수[0][1] / 변수[0][2] ...... 변수[1][0] 등등.
	
	//다차원 배열을 초기화하기 위해 중괄호를 사용하면, 1차원의 인덱스 개수만큼 중괄호가 중첩되어야 한다.
	
	//new 연산자로 다차원 배열을 생성하려면, 배열 선언할 때의 []를 차원 갯수만큼, new 이후 인덱스 개수를 설정하는 []를 차원 갯수만큼 넣어줘야 한다.
	//2차원 배열의 경우, 2차원 쪽 배열(뒤쪽 인덱스)의 길이를 서로 다르게 줄 수 있다.
	//방법 : 1차원 배열 쪽의 길이를 설정한 후, 2차원 배열 쪽의 길이를 각각 설정해주면 된다. 예제 참고.
	
	
	public static void main(String[] args) {

		//아래는 2차원 배열 생성 및 초기화 예제 - 두 반의 학생 점수를 저장한 배열.
		int[][] scores = {{80, 90, 96}, {76,88}}; // 배열 안에 배열이 들어있다. 1차원은 반, 2차원을 학생 점수라고 생각해보자.
		int score = scores[0][2];
		score = scores[1][0];
		
		//위 예시에서, 1차원 배열의 길이는 반의 개수이며, 2차원 배열의 길이는 학생의 수와 같다.
		int count = scores.length; // 1차원 배열의 길이
		count = scores[0].length; //2차원 배열의 길이
		
		//아래는 다차원 배열 생성 및 길이, 인덱스 접근 및 연산 예제.
		
		System.out.println("1차원 배열 길이(반의 개수) : " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수 : " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수 : " + scores[1].length);
		
		System.out.println("첫 번째 반의 세 번째 학생의 점수 읽기 : " + scores[0][2]);
		System.out.println("두 번째 반의 두 번째 학생의 점수 읽기 : " + scores[1][1]);
		
		int class1Sum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = (double)class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		int class2Sum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double)class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for(int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		
		double totalAvg = (double)totalSum / totalStudent;
		System.out.println("반 전체 평균 점수 : " + totalAvg);

		//아래는 다시 한번, 다차원(이번 경우 2차원) 배열 선언 및 인덱스 접근 / 연산 예제.
		
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				
				System.out.printf("mathScores[%d][%d] : %d", i, j, mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		totalStudent = 0;
		int totalMathSum = 0;
		for(int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for(int j = 0; j < mathScores[i].length; j++) {
				totalMathSum += mathScores[i][j];
			}
		}//for

		double totalMathAvg = (double)totalMathSum / totalStudent;
		System.out.println("전체 반 학생의 수학점수 평균 : " + totalMathAvg);
		System.out.println();
		
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		
		for(int i = 0; i < engScores.length; i++) {
			for(int j = 0; j < engScores[i].length; j++) {
				System.out.printf("engScores[%d][%d] : %d", i, j, engScores[i][j]);
			
			}
			
		}
		
		System.out.println();
		
		engScores[0][0] = 90;
		engScores[0][1] = 91;
		engScores[1][0] = 92;
		engScores[1][1] = 93;
		engScores[1][2] = 94;
		
		totalStudent = 0;
		int totalEngSum = 0;
		for(int i = 0; i < engScores.length; i++) {
			totalStudent += engScores[i].length;
			for(int j = 0; j < engScores[i].length; j++) {
				totalEngSum += engScores[i][j];
			}
		}
		
		double totalEngAvg = (double)totalEngSum / totalStudent;
		System.out.println("전체 학생의 영어 점수 평균 : " + totalEngAvg);
		
	}//main

}//class
