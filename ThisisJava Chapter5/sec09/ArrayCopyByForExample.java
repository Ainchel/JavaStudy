package ch05.sec09;

public class ArrayCopyByForExample {

	//배열 복사에 대하여.
	//한번 만든 배열은 길이를 수정할 수 없다.
	//따라서, 길이를 늘려야 한다면 더 큰 길이의 배열을 새로 생성하고, 값을 복사해 넣어줘야 한다.
	
	// 가장 기초적인 배열 복사 방법은, for문을 통해 기존 배열의 값을 하나씩 새 배열에 저장시키는 것이다.
	// JAVA에서의 더욱 간단한 방법은, System.arraycopy() 메소드를 사용하여 복사하는 것이다.
	// System.arraycopy()의 매개인자는 5개이며, 순서대로 아래와 같이 입력한다.
	// 원본 배열, 복사를 시작할 원본 배열 인덱스 번호, 새 배열, 붙여넣기를 시작할 새 배열 인덱스 번호, 복사 인덱스 개수
	// 풀어서 쓰면, 원본 배열의 n번 인덱스를, 새 배열의 m번 인덱스에 i개 인덱스만큼 복사한다.
	// 위 규칙에 따라, a배열 전체를 b배열에 복사해 넣으려면 아래와 같이 인자를 입력한다.
	// System.arraycopy(a, 0, b, 0, a.length)
	
	public static void main(String[] args) {

		//아래는 for문을 통한 가장 기초적인 배열 복사 예제.
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} // 이 예제에서는 새 배열의 [4],[5]배열 값은 복사되지 않는다(이전 배열의 길이가 짧아서)
		
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
		
		//아래는 system.arraycopy() 함수를 이용하여 배열을 복사하는 예제.
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
	}//main

}
