package ch04.sec03;

public class SwitchExample {

	//switch 문에 대해.
		//if문의 경우, 경우의 수가 많아질 수록 else if문을 반복해서 추가해야 하므로 코드가 복잡해진다.
		//이럴 때, switch 문을 사용하면 변수 값에 따른 케이스를 모두 설정할 수 있어 코드가 간결해진다.
		//switch 문은 괄호 안의 변수 값에 따라 해당 값의 case에 해당하는 코드를 실행한다.
		//만약 switch에 해당하는 변수가 case 중 없을 경우, default에 해당하는 코드를 실행시킨다.
		//default 구문은 필요가 없다면 생략할 수 있다.
	
		//각 case의 코드 마지막에 break;를 붙이는 이유는, 해당 case 이후의 코드 실행을 막기 위해서이다.
		//break; 문이 없다면, 현재 case 이후의 case가 연달아 실행된다.(case에 해당하는 조건 상관 없이 실행된다.)

		//switch의 괄호에는 정수 타입(byte, "char", short, int, long), 문자열 타입(String)
		
		//Java 12 버전 이후에서는 switch 문에서 표현식(Expressions)을 사용할 수 있다.
		//표현식이란, break; 문을 없애고 화살표(->)와 중괄호를 사용하는 방식이다.
		//또한, 표현식을 사용하여 어떤 변수에 switch에 따른 case의 초기화 구문의 값을 대입할 수도 있다.
		//이 때, 화살표와 중괄호를 동시에 쓸 경우 변수에 대입할 값은 yield 값; 처럼 작성한다.
		//이럴 경우, 반드시 default 구문이 존재해야 한다.
	
	public static void main(String[] args) {
		//아래는 switch - case - default(생략 가능)문 예제.
		
		int num = (int)(Math.random() * 6) + 1; // 1 ~ 6까지의 랜덤값 구문.
		
		switch(num) {
		
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
			
		case 3:	
			System.out.println("3이 나왔습니다.");
			break;
			
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
			
		default: // 1,2,3,4,5가 아닐 때이므로 6일 때
			System.out.println("6이 나왔습니다.");
			
			
			
		} // switch 첫번째
		
		//아래는 break;문을 사용하지 않은 case의 처리 예제.
		//case가 정해진 후, 그 뒤의 case문을 전부 실행하게 된다.
		//ex) time이 8이 나왔다면, case 9, 10, 11의 코드가 전부 실행된다.
		
		int time = (int)(Math.random() * 4) + 8; // 8 ~ 11 사이의 랜덤값 획득
		System.out.printf("현재 시각 : %d시", time);
		
		switch(time) {
		
		case 8:
			System.out.println("출근합니다");
			
		case 9:
			System.out.println("회의를 합니다.");
			
		case 10:
			System.out.println("업무를 봅니다.");
			
		case 11:
			System.out.println("외근을 나갑니다.");
		
		} // switch 두번째
		
		//아래는 switch에 char형(문자) 데이터를 넣어 case를 실행시키는 예제.
		
		char grade = 'B';
		
		switch(grade) {
		
			case 'A':
			case 'a':
				System.out.println(grade + "등급 회원입니다.");
				break;
				
			case 'B':
			case 'b':
				System.out.println(grade + "등급 회원입니다.");
				break;
				
			default:
				System.out.println("손님입니다.");

		} // switch 세번째
		
		//아래는 세번째 switch-case 문을 표현식(break 없이, 화살표 ->와 중괄호{}로 표현하는 것)으로 작성한 예제.
		//버전이 안 맞아 예제 작성만 하고 주석 처리할 예정.
		
		/*switch(grade) {
			case 'A', 'a' -> {
				System.out.println(grade + "등급 회원입니다.");
			}
		
			case 'B', 'b' ->{
				System.out.println(grade + "등급 회원입니다.");
			}
		
			default ->{
				System.out.println("손님입니다.");
			}
			
		} // switch 네번째(표현식 사용 예제)
		*/
		
		//아래는 표현식을 사용하여, 변수에 switch-case문의 구문 값을 대입하는 예제.
		//비교를 위해 기존 버전에서의 같은 작동의 코드도 작성.
		//버전이 안 맞아 예제 작성만 하고 주석 처리할 예정.
		
		//아래가 기존 버전(Java 11 이전)
		int score1 = 0;
		switch(grade) {
		case 'A':
			score1 = 100;
			break;
		
		case 'B':
			int result = 100 - 20;
			score1 = result;
			break;
		
		default:
			score1 = 60;
		} // switch 다섯번째

		//아래가 Java 12부터 적용되는 표현식 예제.
		
		/*int score2 = switch(grade) {
			
		case 'A' -> 100; // grade가 "A" 라면 score2 = 100;
		
		case 'B' ->{
			int result = 100 - 20;
			yield result;
		} //case 'B'
		
		default -> 60; // grade가 위 case에 없다면 score2 = 60;
		
		} // switch 다섯번째(표현식 버젼)
		*/
	}
	
}
