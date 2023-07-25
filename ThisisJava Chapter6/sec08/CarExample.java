package ch06.sec08;

public class CarExample {

	//Car 클래스에서 선언한 메소드들을, 매개변수 넣어서 실행하고 리턴값 받아보기.
	
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//리턴 값이 없는 가스 필드값 입력 메소드 호출
		myCar.setGas(5);
		
		//입력한 가스 필드값을 확인해주는 isLeftGas()를 if문의 조건식으로 호출.
		//호출한 뒤에 return해주는 boolean 값을 if문에서 조건으로 사용한다.
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run(); // 가스가 있는 동안, 가스 값을 깎고 운전하는 메소드
		}
	
		System.out.println("gas를 주입하세요.");
		
	}//main

}//class end
