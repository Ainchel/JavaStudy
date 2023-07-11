package ch04.sec07;

public class BreakOutterExample {
	//break 문과 continue 문에 대하여.
	
	//break 문은 현재 반복이 진행 중인 for, while, do-while, switch문을 즉시 종료시킬 때 사용한다.
	//break;의 실행 구조는 아래와 같다.
	
	//for/while/do-while/switch(){
	//
	// 실행문
	//  .
	//  break; 여기에서 즉시 반복문/제어문이 종료된다.
	//  .
	//  .
	//}
	
	//break문은 제어문/반복문에서 사용되며 특정 조건에 따라 반복문을 종료시킨다.
	//반복문이 중첩되어 있는 상황(ex - 이중 for문)일 경우, break; 문은 가장 가까운 반복문만을 종료시킨다.
	//바깥쪽 반복문까지 종료시키려면, 바깥쪽 반복문과 break; 문에 사용할 레이블을 붙여야 한다.
	
	// Label: for(int a = ~~~){ 바깥쪽 for문 앞에 Label 붙이고
	//
	//	for(int b = ~~~){
	//		break Label; break 뒤에 Label을 다시 붙인다.
	//	}
	//}
	
	//continue 문은 반복문인 for문, while,문, do-while문에서 사용된다.
	//contunue 문이 실행되면, 즉시 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다.
	//위 설명을 정리하자면, 현재 반복을 즉시 종료하고 다음 반복을 시작하는 시점으로 이동하게 된다.
	
	//continue;의 실행 구조는 아래와 같다.
	//for/while(...){
	// 실행문
	//	.
	//	.
	//	continue; // 이 시점에서 현재 반복 즉시 종료. 다음 반복 시작 시점(for문은 증감식, while문은 조건식)으로 건너뛴다.
	//	.
	//	.
	//}
	
	//continue가 break와 다른 점은, 반복문을 종료하지 않고 현재 반복만 종료한다는 것이다.
	//반복문 진행 도중 특정 조건을 만족하는 경우에만 continue 시켜, 다음 반복으로 넘어갈 수 있다.
	
	public static void main(String[] args) {
		
		//아래는 while문을 통해 주사위 값을 돌리다가, 6이 나오면 종료시키는 예제.
		int num; // 1 ~ 6까지의 랜덤 수.
		int count = 0;
		
		while(true) {

			count++;
			num = (int)(Math.random() * 6) + 1;
			
			if(num == 6) {break;}
			
		}
		
		System.out.printf("%d번 시행 후 6이 나왔습니다.\n\n", count);
		
	//아래는 레이블을 이용하여 바깥쪽 반복문까지 한번에 break 시키는 예제.
		
			Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
				for(char lower = 'a'; lower <= 'z'; lower++) {
					
					System.out.printf("%s - %s\n", upper, lower);
	
					if(lower == 'g') {
						break Outter;
						}
				}
				
			}
		System.out.println("lower가 g일 때 프로그램을 종료합니다.");
		
	//아래는 continue문을 이용하여, 짝수는 출력하고 홀수는 건너뛰는 출력 예제.
		
		for(int i = 0; i <= 10; i++) {
			
			if(i % 2 != 0) { // 홀수일 때
				continue;
			}
			
			System.out.println("i : " + i);
		}
		
		
		
	} // main end

}//class end
