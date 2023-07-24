package ch06.sec07;

public class Car {
		
	//필드 선언
	String company = "횬다이지도우샤";
	String model = "";
	String color = "";
	int maxSpeed = 0;
	int speed = 0;
	
	//생성자를 오버로딩하여 선언 + this()를 사용한 생성자 내에서 생성자 호출하기.
	
	Car(){}
	
	Car(String model){
		this(model, "은색", 250); // 24행의 생성자 호출. 이 생성자의 model만 추가로 초기화.
	}
	
	Car(String model, String color){
		this(model, color, 250); // 24행의 생성자 호출. 이 생성자의 model, color만 추가로 초기화
	}
	
	Car(String _model, String _color, int _maxSpeed){
		model = _model;
		color = _color;
		maxSpeed = _maxSpeed;
	}

}
