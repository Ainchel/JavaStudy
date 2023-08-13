package ch07.sec10.exam02;

public class AbstractMethodExample {

	//추상 클래스를 상속받은 자식 클래스들의 객체를 생성하여 추상메소드 사용해보기.
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성 활용해보기
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound(); // 매개인자로 넣은 객체의 메소드를 호출(자식이라면 다형성이 적용될 것이다.)
	}

}
