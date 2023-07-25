package ch06.sec08;

public class ComputerExample {

	//Computer 클래스의 객체를 생성한 후, 다양한 방법으로 가변길이 매개변수 메소드 호출해보기.

	public static void main(String[] args) {

		//Computer 객체 생성
		Computer myCom = new Computer();
		
		//가변길이 매개변수 메소드에 매개값 제공 및 결과값 받기
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		
		//이번에는 다른 갯수의 매개값을 제공하고 결과값 받기
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		//이번에는 배열 생성 후, 배열 째로 매개값으로 넘겨버리기.
		int[] values = {1, 2, 3, 4, 5, 6, 7};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		//이번에는 매개값 넣는 시점에 배열을 생성해서 넘겨버리기.
		int result4 = myCom.sum(new int[] {1,2,3,4,5,6,7,8,9});
		System.out.println("result4 : " + result4);
		
	}

}
