package ch02.sec13;

import java.util.Scanner;
//Scanner를 쓰기 위해 필요한 import. 6장에서 설명할 예정

public class ScannerExample {
	//키보드로 입력한 데이터를 변수에 저장하는 방법.
	//다양한 방법이 있지만, 코테 문제에서의 빈도나 간단한 사용법을 감안하면 Scanner를 쓰는 것이 무난하다.
	//Scanner 타입 변수를 선언하려면 아래와 같이 적자. new 구문은 6장에서.
	//Ex)Scanner sc = new Scanner(System.in);
	//위 구문에서 변수명(sc)을 제외한 부분은 약속과 같으니 일단 외워도 무방.
	//이후, String str = sc.nextline() 방식으로 String 변수에 초기화해주면 키보드로 입력받은 값을 String 타입으로 저장한다.
	
	//sc.nextline()메소드는 Enter 키가 입력되기 전까지 대기상태가 되며, Enter가 입력된 후 그동안 입력된 내용을 문자열로 읽어온다. 
	public static void main(String[] args) 
	{
		//아래는 Scanner를 통해 문자열을 입력받는 예제. feat(while문)
		//while문은 4장에서 다룰 예정.
		//예제 내 String변수.equal() 메소드는 String의 내용이 같은지 확인하는 메소드이다.
		//왜 다른 기본 타입과 같은 "=="를 쓰지 않는지는 5장에서 설명 예정.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result + "\n");
		//System.out.println(); 요 줄은 위에서 \n 처리해서 생략.
		
		while(true)
		{
			System.out.print("입력 문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("q"))
			{
				break;
			}
			System.out.println("출력 문자열 : " + data + "\n");
		}
		
		System.out.println("종료");
		
	}

}
