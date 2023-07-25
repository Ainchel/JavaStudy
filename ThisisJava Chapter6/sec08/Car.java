package ch06.sec08;

	//메소드 내 return 문에 대하여.
	//return문은 메소드의 실행을 강제로 종료하고, 메소드를 호출시킨 코드로 돌아가는 것을 의미한다.
	//메소드 선언 시에 리턴 타입이 있었을 경우, return문을 통해 호출시킨 위치에 돌려줄 결과값을 지정해야만 한다.
	
	//return문 이후에 코드를 작성하면, "Unreachable code" 라는 컴파일 에러가 발생한다.
	//"코드가 닿지 않는다" 라는 뜻으로, return 이후의 코드가 실행되지 않기 때문이다.

	//하지만 메소드 내에서 if문 등의 조건식이 있을 경우, 조건 내 코드에 따라 특정 return문은 실행되지 않을 수도 있다.
	//따라서, 메소드 구성에 따라 return문 이후에 코드가 있어도, 위 컴파일 오류가 발생하지 않는 경우도 있다.

	public class Car {
	//다양한 조건에 따라 서로 다른 return문을 작동시키는 메소드 구성 예제.
	
		//필드 선언
		int gas;
		
		//리턴 값이 없는 메소드로 gas 필드값을 변경
		void setGas(int gas) {
			this.gas = gas; // 좌측 gas는 필드. 우측 gas는 매개변수.
		}

		//리턴값이 boolean인 메소드로, gas 필드값에 따라 false와 true를 분기하여 반환
		boolean isLeftGas() {
			if(gas == 0) {
				System.out.println("가스가 없습니다.");
				return false; //가스 값이 0이라면, 호출된 위치에 false값을 반환하고 메소드 종료
			}
			System.out.println("gas가 있습니다.");
			return true; // 가스 값이 0이 아니라면, true를 반환하고 메소드 종료
		}
		
		//리턴값 없이, gas 필드값에 따라 while문을 돌다가, 조건을 만족하면 return으로 메소드 종료
		void run() {
			while(true) {
				if(gas > 0) {
					System.out.println("달립니다. (gas 잔량 : " + gas + ")");
					gas -= 1;
				} else {
					System.out.println("가스가 없어 멈춥니다.(gas잔량" + gas + ")");
					return; //메소드 종료
				}
			}
		}//void run()
	
	}//class Car end
