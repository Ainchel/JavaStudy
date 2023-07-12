package ch05.sec05;

public class GarbageObjectExample {

	//참조타입 중 문자열 타입에 대하여.
	//자바의 문자열은 String 타입의 객체로 생성된다.
	//String 객체를 생성 및 초기화하면, 문자열은 객체로 생성된 후 변수에는 해당 객체의 번지(주소)가 저장된다.
	
	//자바는 두 문자열 변수의 리터럴이 동일하다면, 같은 String 객체를 공유하게끔 설계되어 있다.
	//String 변수에 문자열 리터럴을 대입하는 것 외에도, new 연산자를 통해 직접 String 객체를 생성/대입할 수도 있다.
	//두 변수에 new 연산자를 써서 같은 리터럴을 대입해도, 두 변수는 서로 다른 객체의 번지를 가지게 된다.
	
	//String 변수 사이에는 ==를 사용할 경우, 각 변수가 참조하는 번지가 같은지만 검사하게 된다.
	//따라서, 해당 객체에 담긴 실제 문자열이 같은지를 비교하려면, String 객체의 .equals() 메소드를 사용해야 한다.
	
	//String 변수에 빈 문자열("")를 대입할 수 있다.
	//빈 문자열도 객체로 생성되며. equals를 통해 변수가 해당 빈 문자열을 참조하고 있는지 확인할 수 있다.
	
	//문자열에서 특정 위치의 문자를 얻고 싶다면 charAt() 메소드를 사용할 수 있다.
	//charAt() 메소드는 매개값으로 주어진 인덱스의 문자 하나를 리턴한다.
	//인덱스는 0번부터 문자열의 길이 -1번까지 있다.
	
	//문자열에서 문자의 개수를 얻고 싶다면 length() 메소드를 사용할 수 있다.
	//문자열 내 문자의 개수는 띄어쓰기도 포함한다.
	
	//문자열 내 특정 문자열을 다른 문자열로 바꾸고 싶다면 replace() 메소드를 사용한다.
	//replace()를 사용할 경우, 기존 문자열 객체가 아닌 새로운 객체를 생성하여 문자열을 저장한다.
	
	//문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶으면 substring() 메소드를 사용한다.
	//substring()의 매개인자 구성은 두 종류가 있다.
	//1)substring(int beginindex) : 인자로 넣은 인덱스부터 끝까지 전부 자른다.
	//2)substring(int beginindex, int endindex) : 첫 번째 인자로 넣은 인덱스부터 두 번째 인자로 넣은 인덱스까지 자른다.
	
	//문자열에서 특정 문자열의 위치를 찾으려면 indexOf() 메소드를 사용한다.
	//indexOf()는 인자로 넣은 문자열이 시작되는 인덱스 값을 리턴한다.
	//만약 인자로 넣은 문자열이 포함되어 있지 않다면 -1을 리턴한다.
	
	//문자열의 위치가 아닌, 포함 여부만을 조사하려면 contains() 메소드를 사용할 수 있다.
	//contains() 메소드는 인자로 넣은 문자열이 포함되어 있다면 true를, 아닐 시 false를 리턴한다.
	
	//문자열이 어떤 구분자를 기준으로 여러 개의 문자열로 구성되어 있다면, split() 메소드를 사용하여 문자열들을 분리할 수 있다.
	//이 메소드를 사용하면 문자열로 된 배열을 리턴한다.
	
	public static void main(String[] args) {

		String name; //String 타입 변수 name 선언;
		name = "홍길동"; // name 변수에 문자열 대입
		String hobby = "여행"; // String 타입 변수 선언과 동시에 대입
		
		String name1 = "홍길동"; // 리터럴이 동일하므로 같은 번지를 공유함. 
		String name2 = "홍길동"; // 위 name도 같으므로, 세 변수 다 같은 번지를 공유함.
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println(name == name1); // 번지가 같은지 찍어봤더니 true.
		System.out.println(name == name2); // 번지가 같은지 찍어봤더니 true.
		System.out.println(name1 == name2); // 번지가 같은지 찍어봤더니 true.
		
		System.out.println(name == name3); // new를 안 쓴, 동일한 리터럴의 객체와 번지가 같은지 찍으면 false가 나온다.
		System.out.println(name3 == name4); //new를 쓴, 동일한 리터럴의 두 변수의 번지 또한 서로 달라 false가 나온다.
		
		System.out.println(name3 == name4); // ==를 쓸 경우, 객체를 참조하는 번지가 같은지를 확인한다. false.
		System.out.println(name3.equals(name4));// .equals를 사용해야 객체의 내용이 같은지를 확인한다. true.
		
		//아래는 String 변수의 선언 및 대입, 리터럴과 new를 통한 참조의 차이와 == 및 .equals 사용 예제.
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2){
			System.out.println("strVar1과 strVar2는 참조가 같습니다.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다릅니다.");
		} // 요 if문의 결과 : 참조가 같다.(리터럴이 동일하므로 같은 객체를 참조)
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같습니다.");
		} // 요 if문의 결과 : 출력됨.(실제 문자열의 내용이 같으므로)'
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4){
			System.out.println("strVar3과 strVar4는 참조가 같습니다.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다릅니다.");
		} // 요 if문의 결과 : else문 실행. new 연산자를 사용했기 때문에 서로 다른 객체를 참조함.
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같습니다.");
		} // 요 if문의 결과 : 출력. 두 객체의 문자열 내용이 같으므로.
		
		hobby = "";
		if(hobby.equals("")) {
			System.out.println("현재 hobby 변수는 빈 문자열 hobby를 참조하고 있습니다.");
		}
		
		//아래는 문자 추출 예제.
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3); //'프' 추출. 띄어쓰기도 한 글자로 취급함
		System.out.println(charValue);
		
		//아래는 주민등록번호에서 성별에 해당하는 문자를 추출하여 성별 출력하는 예제.
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); //0번부터 시작하므로 6번을 떠와야 7번째 숫자가 됨.
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남성입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		}//switch(sex)
		
		//아래는 문자 개수 추출 예제.
		subject = "자바 프로그래밍";
		int length = subject.length(); // 띄어쓰기를 포함하여 8 저장.
		
		//아래는 문자 개수를 세어, 주민등록번호를 입력한 게 맞는지(13글자) 판단하는 예제.
		
		ssn = "9506241230123";
		length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민등록 번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록 번호 자릿수가 틀립니다..");
		}
		
		//아래는 문자열 대체 예제.
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "JAVA"); // 변경된 문자열은 oldStr의 문자열 객체와 다른 객체이다. 아래 sysout 확인.
		System.out.println(oldStr == newStr); // false 출력. replace()를 사용한 문자열은 기존 객체와 다른 문자열이다.
		
		oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		ssn = "880815-1234567";
		String firstNum = ssn.substring(0,6);
		String secondNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		subject = "자바 프로그래밍";
		int startIndex = subject.indexOf(subject);
		System.out.println(startIndex);
		
		boolean result = subject.contains("프로그래밍");
		System.out.println(result);
		
		//아래는 문자열 찾기와 관련된 예제.
		
		subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) { // 문자열 넣은 게 포함이 되어있다면(없지 않다를 조건으로 걺)
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		//아래는 split()을 이용한 문자열 분리 예제.
		
		String board = "번호,제목,내용,성명";
		String[] arr = board.split(",");
		
		System.out.println(arr[1]);
		
		board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//문자열 분리
		String[] tokens = board.split(",");
		System.out.println("번호 : " + tokens[0]);
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);
		System.out.println();
		
		//for문을 통한 출력 예제
		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
	}//main

}//class
