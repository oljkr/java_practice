package ch05;

class LittleAnimal{
	String name = "LittleAnimal";
	void attack(LittleAnimal e1) {} //무효화됨
	
	String CheckName() { //무효화됨
		return "?";
	}
}

class Rabbit extends LittleAnimal {
	String name = "Rabbit";
	
	//오버라이드 = 부모의 메서드를 무효화하다
	void attack(LittleAnimal e1) {
		System.out.println(this.name+" attacks "+e1.CheckName());
		
	}
	
	String CheckName() {
		return name;
	}
}

class Squirrel extends LittleAnimal {
	String name = "Squirrel";
	void attack(LittleAnimal e1) {
		System.out.println(this.name+" attacks "+e1.CheckName());
		
	}
	String CheckName() {
		return name;
	}
}

class Hamster extends LittleAnimal {
	String name = "Hamster";
	void attack(LittleAnimal e1) {
		System.out.println(this.name+" attacks "+e1.CheckName());
		
	}
	String CheckName() {
		return name;
	}
}

class Cat extends LittleAnimal {
	String name = "Cat";
	void attack(LittleAnimal e1) {
		System.out.println(this.name+" attacks "+e1.CheckName());
		
	}
	String CheckName() {
		return name;
	}
}
public class OOPEx06 {

	public static void main(String[] args) {
		LittleAnimal u1 = new Rabbit(); //(Rabbit,LittleAnimalV)
		LittleAnimal u2 = new Squirrel();//(Squirrel,LittleAnimalV)
		LittleAnimal u3 = new Hamster();//(Hamster,LittleAnimalV)
		LittleAnimal u4 = new Cat();
		
		u1.attack(u2);
		u1.attack(u1);
		u2.attack(u1);
		u2.attack(u3);
		u4.attack(u3);
	}

}
