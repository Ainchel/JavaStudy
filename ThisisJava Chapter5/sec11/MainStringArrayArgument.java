package ch05.sec11;

public class MainStringArrayArgument {

	//main 메소드에 있는 String[] 인자의 용도에 대하여.
	//IDE가 아닌 cmd(명령 프롬포트)에서 프로그램을 시작할 때, 매개인자를 필요로 하는 경우가 있다.
	//예를 들어, cmd에서 sum이라는 프로그램을 시작한다면, 두 수를 더하는 sum이므로 두 숫자가 매개인자로 필요하다.
	//이 때, cmd 상에서 매개인자를 적으면 String 배열인 args에 문자열로 저장된다.
	//이렇게 args에 저장된 문자열 배열은 main 메소드가 호출될 때 인자로 전달된다.
	//인자로 전달된 것이 없다면 빈 배열로 남는다.(args.length = 0;)
	
	//이클립스에서 해당 args에 인자를 넘기려면 책의 192~193 페이지를 참조하자.
	
	public static void main(String[] args) {

		//아래는 args에서 인자를 받아왔을 경우에만 코드가 실행되게끔 작성한 예제.
		if(args.length != 2 ) { //
		System.out.println("프로그램 입력값이 부족합니다.");
		System.exit(0); // 프로그램을 강제로 종료한다.
		}	
			
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, result);
		
	}

}
