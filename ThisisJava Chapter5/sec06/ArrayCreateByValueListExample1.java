package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	//참조 타입 중 배열 타입에 대하여.
	//변수는 하나의 값만 저장할 수 있어, 많은 변수가 필요한 경우 전부 선언해야 된다.
	//이런 경우, 배열을 사용하면 연속된 공간에 여러 값을 나열해서 저장한다.
	//또한, 각 값들에 인덱스를 부여하여 for문 등에 이용할 수 있다.
	
	//한 배열은 한 타입의 값만 저장/관리할 수 있다.
	//배열은 생성하고 나서 길이를 늘이거나 줄일 수 없다.
	
	//배열의 선언 방법은 아래 두가지가 있다.
	//1) 타입[] 변수; 2) 타입 변수[];
	//예시) int[] intArray; / double[] doubleArray; / String strArray[];
	
	//배열 변수 또한 참조 변수이다. 실제 배열 객체는 힙에 생성되며, 배열 변수는 배열 객체의 주소를 저장한다.
	//배열 변수는 참조 변수이므로, null 초기화 또한 가능하다.
	//null 초기화가 가능하기 때문에, NullPointerException 오류는 항상 조심해야 한다.
	
	//배열에 저장할 값을 이미 알고 있다면, 아래와 같이 배열을 생성할 수 있다.
	//타입[] 변수 = {값0, 값1, 값2, 값3, ... 값끝};
	//위와 같이 적었을 경우, 중괄호 안에 나열된 값을 가지는 배열을 생성한 후, 변수에 주소를 리턴한다.
	//이후, 배열 변수를 통해 배열 객체를 참조할 수 있다.
	//배열의 각 인덱스에 들어간 값을 바꾸고 싶다면 대입 연산자(=)를 사용하면 된다. 아래 예제 참조.
	
	//주의사항으로, 배열 변수를 선언만 한 상태에서는, {}를 통한 값 초기화가 불가능하다.
	//만일 변수 선언 시기와 값 대입 시점이 다르다면, new 동일 데이터 타입[] {값0, 값1, 값2 ...} 같은 방식으로 초기화해야 한다.
	//이 주의사항은 메소드에 인자를 대입할 때에도 마찬가지이며, "{}"만으로 감싼 배열이 아닌, "new 타입[] {}" 방식의 배열을 넘겨줘야 한다.
	
	//현재 값이 저장되어있지 않지만, 이후 저장할 목적으로 정해진 길이의 배열을 미리 생성시킬 수 있다.
	//타입[] 변수명 = new 타입[배열 길이]; 의 형식으로 가능하다.
	//new 연산자는 해당 길이의 배열을 생성한 후, 변수명에 해당 배열의 주소(번지)를 리턴한다.
	//이때문에, 변수명만 먼저 선언하고 이후 new 연산자로 길이를 지정해줄 수도 있다.
	//new 연산자를 사용하여 만든 배열은, 사용자가 값을 저장하지 않았으므로 기본값으로 초기화된다.
	//아래는 데이터 타입 별 배열의 초기값 목록이다.
	
	// 1)기본 타입 별 초기값 목록
	// byte[], short[], int[], long[] : 0(long은 끝에 L 붙여야 함.)
	// char[] : '\u0000'
	// float[], double[] : 0.0(float은 끝에 f 붙여야함)
	// boolean : false
	
	// 2) 참조 타입 배열의 초기값 목록
	// 클래스[], 인터페이스[] : null
	
	//배열의 길이란, 배열에 저장할 수 있는 항목의 개수를 말한다.
	//배열의 길이를 얻으려면, 배열 변수 명에 '.'을 입력하고, length라는 필드(객체 내의 변수) 값을 받아오면 된다.
	//.length 값은 어떤 배열의 길이를 가리키므로, 배열 전체를 for문으로 돌릴 때 많이 쓰인다.
	//for문에서 .length를 사용할 경우, 인덱스가 0이기 때문에 조건식에서 반드시 <를 써줘야 개수가 맞으므로 주의하자.
	
	public static void main(String[] args) {
		
		//아래는 배열 선언과 생성, 인덱스 읽기, 값 변경 예제
		
		//배열 변수 선언 및 생성
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		//배열 값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		//인덱스 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		//배열 변수 선언 및 생성
		int[] scores = {83, 90, 87};
		
		//총합과 평균 구하기
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=scores[i];
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / 3;
		
		System.out.println("평균 : " + avg);
		
		//아래는 배열 변수 선언 이후, new 연산자 + 중괄호를 사용하여 값을 대입하는 예제.
		
		String[] names = null;
		//names= {"마비", "노기", "갓겜"}; 이렇게 쓰면 컴파일 에러난다. 중괄호 사용은 선언과 동시에 초기화 시에만 가능하다.
		names = new String[] {"마비", "노기", "갓겜"};
		
		//아래는 함수의 매개인수로 배열을 대입할 때의 예제.
		//
		//void printItem(int[] scores){...} 메소드가 있다면
		//printItem({95, 85, 90}) << 이렇게 넣으면 에러난다. 위 예제와 같은 이유(중괄호로 배열 초기화는 선언과 동시에 초기화 시에만 가능).
		//printItem(new int[] {95, 85, 90}) 이렇게 적어야 가능하다.
		
		//아래는 배열을 메소드 매개인자로 대입해보는 예제(클래스 밖 메소드 선언까지 포함).
		printItem(new int[] {83, 90, 87}); 
		
		//아래는 다양한 데이터 타입의 배열 선언 및 초기화, 출력 예제.
		
		//정수 타입 배열 선언, 초기화, 출력.
		int[] arr1 = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d] : %d ", i, arr1[i]);
		}
		
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d] : %d ", i, arr1[i]);
		}
		
		System.out.println();			
		
		//실수 타입 배열 선언, 초기화, 출력
		System.out.println();
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d] : %.2f ", i, arr2[i]);
		}
		
		System.out.println();
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d] : %.2f ", i, arr2[i]);
		}
		
		//문자열 타입 배열 선언, 초기화, 출력
		System.out.println();
		System.out.println();
		String arr3[] = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d] : %s ", i, arr3[i]);
		}
		
		System.out.println();
		
		arr3[0] = "마비";
		arr3[1] = "노기";
		arr3[2] = "갓겜";
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d] : %s ", i, arr3[i]);
		}
		
		//아래는 어떤 배열의 길이를 구하여 배열 전체의 for문을 구하는 예제.
		
		sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

	public static void printItem(int[] scores) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
		
	}
	
}
