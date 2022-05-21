package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //heap공간에 올린다.
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
		//1년이 지났다. 강아지가 노란색으로 염색, 이름도 레르코로 바뀜
		d1.age = d1.age + 1;
		d1.color = "노란색";
		d1.name = "레르코";
		//d1.type = "푸들"; 이건 상수로 변했으므로 변경 불가능
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
	}

}
