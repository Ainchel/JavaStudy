package ch02.sec11;

public class VariableScopeExample {
	//main 메소드 내에서, 중괄호 블록({} 이거)이 여러개 작성될 수 있다.
	//이 경우, main 메소드 내의 중괄호 블록에서 선언된 변수는 해당 블록 내부에서만 사용이 가능하다.
	//이 규칙으로 인해, 장기적으로 사용할 변수는 main 메소드 첫 부분에 선언하는 것이 재사용이 가능하다.
	//단기적으로 사용하고 말 변수는 중괄호 블록 내에 선언해도 무관하다.
	
	public static void main(String[] args) {
		//아래는 main 메소드 안에 중괄호가 있을 때, 변수 사용 가능 범위에 대한 예제.
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; 이렇게 쓸 경우, v2 변수를 사용할 수 없어 컴파일 에러가 난다.
	}
}
