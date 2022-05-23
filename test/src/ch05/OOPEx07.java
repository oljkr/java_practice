package ch05;

//추상클래스
abstract class Animal {
	abstract void speak();//추상메서드 (몸체{}가 없다.)
	
	
}
class Dog extends Animal{
	//오버라이드 (Animal의 speak()가 무효화됨.)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cow extends Animal{
	//오버라이드 (Animal의 speak()가 무효화됨.)
	void speak() {
		System.out.println("음머");
	}
}
class Bird extends Animal {

	//추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.
	@Override
	void speak() {
		System.out.println("짹쨱");
		
	}
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cow();
		Animal a3 = new Bird();
		a1.speak();
		a2.speak();
		a3.speak();

	}

}
