package ch05.sec10;

public class AdvancedForExample {

	//배열 항목 반복이 가능한 향상된 for문에 대하여.
	//자바에서는 배열 처리 목적을 위해, 아래와 같은 for문 형태를 제공한다.
	//인덱스를 카운트할 번호와 증감식 없이, 배열을 넘겨주면 배열 내 항목을 알아서 돌아준다.
	
	//향상된 for문 형식은 아래와 같다.
	//for(타입 변수 : 배열 명){
	//
	//실행문;
	//
	//}
	
	//향상된 for문을 위와 같이 작성하면, 아래와 같이 실행된다.
	//1) 배열 명으로 넘겨준 배열 내에서 타입 변수와 같은 데이터를 인덱스 순서대로 가져온다.
	//2) 가져온 배열의 인덱스를 적용하여 실행문을 실행시킨다.
	//3) 인덱스를 계속 넘겨 타입 변수와 같은 데이터를 받아와 실행문을 반복한다.
	//4) 더이상 받아올 인덱스가 없다면 for문을 종료한다.
	
	
	public static void main(String[] args) {

		//아래는 향상된 for문 예제.
		
		int scores[] = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}

}
