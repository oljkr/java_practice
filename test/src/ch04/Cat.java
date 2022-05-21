package ch04;

//값을 초기화하지 않는 이유는 new할 때마다 다른 상태를 가진 고양이를 만들기 위해서이다.
public class Cat {
	String name;
	String color;
	
	//디폴트 생성자 적어주기
	public Cat() {
		
	}
	
	//개발자가 직접 생성자 구현함
	public Cat(String n, String c) {
		System.out.println("고양이가 탄생함");
		System.out.println("n : "+n);
		System.out.println("c : "+c);
		
		//String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
		name = n;
		color = c;
	}
}
