package ch06.Practice;

//268페이지 연습문제의 13, 14번 문제 

//13번 문제 : 아래의 필드를 가지는 'Member' 클래스 선언하기.
//14번 문제 : 13번에서 이어서, 클래스 외부에서 두 개의 필드를 초기화시켜주는 생성자 선언하기.

//15번 문제 : MemberService 클래스 생성 후, 아래의 조건을 가지는 메소드를 선언하기.
//조건 1: login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 때 true를 리턴.
//조건 2: logout() 메소드는 매개값 id + "님이 로그아웃 되었습니다" 로 출력되게끔 작성

//16번 문제 : Printer 클래스를 만든 후, 메소드로 println()을 사용하여 int, boolean, double, String을 출력하게끔 작성하세요.(오버로딩)
//17번 문제 : 위 Print 클래스에서, 객체를 만들지 않고도 내부 메소드의 호출이 가능하게끔 수정하세요.(정적변수화)

//18번 문제 : 아래 코드가 실행되었을 때, "같은 ShopService 객체이빈다." 라는 메시지가 출력되게끔 클래스 작성 및 객체를 생성하세요. (싱글톤)

//19번 문제 : Setter와 Getter 및 상수를 이용하여, 필드 범위값을 유지하면서 변경이 가능한 클래스 만들기.

class ShopService{
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}

	public static ShopService getInstance() {
		return singleton;
	}
}


class MemberService{
	
	String id;
	String password;
	
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")){
			return true;
		}
		
		else {return false;}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

class Member{
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
}

class Print{

	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void println(boolean b) {
		System.out.println(b);
	}
	
	public static void println(double d) {
		System.out.println(d);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
	
}

class Account{
	
	private int balance;
	
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
		this.balance = balance;
		} else {
			return;
		}
	}
}

public class Example {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		System.out.printf("%s, %s", user1.name, user1.id);
		
		System.out.println();
		System.out.println();
		
		MemberService ms1 = new MemberService();
		boolean result = ms1.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms1.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
//		Print printer = new Print();
//		
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
		
		Print.println(10);
		Print.println(true);
		Print.println(5.7);
		Print.println("홍길동");
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체를 참조하고 있습니다.");
		} else {
			System.out.println("다른 ShopService 객체를 참조하고 있습니다.");
		}
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}
