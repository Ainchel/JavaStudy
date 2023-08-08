package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
	int r = 10;
	
	Calculator calculator = new Calculator(); // 부모 클래스
	System.out.println("부모클래스의 원 면적 : " + calculator.areaCircle(r));
	System.out.println();
	
	Computer computer = new Computer();
	System.out.println("자식클래스의 원 면적 : " + computer.areaCircle(r));
	
	}

}
