package ch04.sec02_2;

public class IfElseExample {
	//if - else / if - else if 문, if문 중첩에 대해.
	//if를 사용할 때 else를 함께 사용할 수 있는데, if문의 조건이 true라면 if의 블록을, false라면 else의 블록을 실행한다.
	//조건이 2개 있을 때라면, if를 2개 사용하는 것보다 if와 else로 처리하는 것이 간결한 코딩이 된다.
	
	//if문에서 조건을 여러 개 걸어야 할 때에는 else if문을 사용한다.
	//else if는 자신보다 위에 있는 조건이 false일 때 자신의 조건식을 평가하며, 자신의 조건식이 true일 때 자신의 블록을 실행한다.
	//else if의 작성 수에는 제한이 없으며, 여러 개의 조건 중 하나가 true로 실행되면 if문 전체를 벗어난다.
	//if - else if문의 마지막에는 else를 추가할 수 있으며, 위의 if 및 else if가 모두 false일 경우 실행된다.
	
	//if문 내에서 추가로 조건을 걸어 if문을 작성할 경우 중첩 if문이 된다.
	//if문이 중첩될 경우 코드의 흐름이 복잡해지며, 이를 이해하지 못할 경우 분석 및 추가 작성이 어려워진다.
	
	public static void main(String[] args) 
	{
		//아래는 if - else문 예제.
		
		int score = 85;
		
		if(score >= 90) { // score가 90보다 크거나 같다면(true) 이 블록 실행.
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { // 위 if문의 결과가 false(90보다 작다면) 이쪽 블록을 실행한다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		//아래는 여러 개의 조건식을 건 else if 사용 예제.
		score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90 ~ 100입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80 ~ 89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70 ~ 79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		//아래는 랜덤 숫자 획득 메소드를 이용한 주사위 뽑기 예제.
		//주사위의 눈이 1 ~ 6까지 있다고 할때, 아래와 같이 랜덤 수를 획득한다.
		int num = (int)(Math.random() * 6) + 1; // Math.random은 0.0 <= a < 1.0 사이의 값을 반환한다.
		//6을 곱하면 0 ~ 5.99...의 범위가 되며, 1을 더한 후 int로 형변환하면 1 ~ 6까지의 값을 얻을 수 있다. 
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		//아래는 if - else문의 각 블록에 추가로 조건을 작성한 예제.
		score = (int)(Math.random() * 20 + 81); // 81 ~ 100점까지의 점수를 랜덤으로 산출
		System.out.println("점수 : " + score);
		
		String grade;
		
		if(score >= 90) {
			if(score>= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
			
		}
			
		System.out.println("학점 : " + grade);
	}// main
		
		
}

