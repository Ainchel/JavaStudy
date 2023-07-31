package ch06.sec14;

//Getter와 Setter에 대하여.

//접근제한자에서도 적었듯, 객체의 필드(데이터)를 클래스 외부에서 마음대로 읽거나 변경할 경우 객체의 무결성(결점이 없는 성질)이 꺠질 수 있다.
//예를 들어, 차 클래스에서 속도의 필드값이 음수가 된다면 해당 필드의 무결성은 깨지는 것이다.

//위 문제로 인하여, 자바에서는 직접적인 필드 접근 대신 메소드를 통한 필드 접근을 선호한다.
//그 이유는, 메소드를 통하는 과정에서 데이터를 검증하여 유효한 값만 저장할 수 있기 때문이다.
//위 역할(데이터를 먼저 검증한 후 필드 값을 변경해주는)을 수행하는 메소드가 Setter이다.

//Setter 메소드를 사용하는 상황에서, 필드는 private로 선언하여 외부로부터의 접근을 차단한다.
//이 경우, private인 필드로 접근하려면 같은 클래스의 public인 Setter 메소드를 이용해서만 접근할 수 있다.
//이 과정에서, 메소드를 통해 필드에 대입할 값을 if문 등을 통해 검증한 후 필드 값을 대입시킬 수 있다.

//외부에서 필드에 값을 대입할 때 말고도, 외부에서 해당 필드 값을 읽어오는 경우 또한 있다.
//이럴 때 메소드를 사용한다면, 가져올 필드의 값이 외부에서 사용하기 부적절한 경우 가져오지 않거나 적절한 값으로 변경하여 가져올 수 있다.
//이러한 역할을 담당하는 메소드가 Getter이다.

//Getter를 사용하는 상황에서도 필드는 private로 설정하여 접근을 막는다.
//그리고 Getter 메소드를 사용하는 과정에서, 읽어온 필드값을 적절한 값으로 변경시킬 수 있다.
//Getter 메소드의 경우, boolean 데이터 타입을 받아와야 할 경우 메소드 명칭을 get이 아닌 is로 시작하는 것이 관례이다. 

public class Car {

	//Getter, Setter 메소드 설정 예제.
	
	//필드 선언
	private int speed;
	private boolean stop;
	
	//Getter, Setter 메소드 선언
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
	
}
