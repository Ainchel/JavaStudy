package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	//열거형 참조 타입에 대하여.
	//한정된(정해진) 개수의 값을 가지는 타입을 열거 타입이라고 한다.
	
	//열거 타입을 사용하려면, 먼저 별도의 java 파일을 만들어 한정된 값을 정의해야 한다.
	//열거 타입의 명칭은 캐멀 스타일(첫 문자를 대문자로, 이후 단어의 구분마다 대문자로)로 짓는 것이 관례이다.
	
	//생성이 완료된 enum형 또한 하나의 데이터 타입이므로, 변수를 선언하고 사용해야 한다.
	//선언한 변수에는 열거 상수를 대입할 수 있으며, 타입명.상수명 형태로 작성한다.
	
	//enum형 또한 참조 타입이기 때문에, 상수가 아닌 null(빈 값) 대입이 가능하다.
	
	//열거형 변수의 값이 어느 열거 상수인지 비교할 때에는 ==, !=를 사용한다. (SUNDAY인지 확인하려면 ==, !=를 사용하면 된다.)
	
	//열거형을 사용하는 클래스의 예시로는 Calendar가 있다.
	
	
	public static void main(String[] args) {
		
		//열거 타입 변수 선언
		Week today = null;
		Week reservationDay;
		
		today = Week.SUNDAY;
		
		//아래는 Calendar를 사용하여 오늘의 요일을 얻는 예제.
		
		Calendar cal = Calendar.getInstance(); // Calendar 객체를 생성하고, 주소를 cal에 대입
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.THURSDAY; break;
		case 5: today = Week.FRIDAY; break;
		case 6: today = Week.SATURDAY; break;
		case 7: today = Week.SUNDAY; break;
		
		}//switch
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
	}//main

}//class
