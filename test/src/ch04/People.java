package ch04;

public class People {
	String name;
	int age;
	
	public People(String name, int age) {
		System.out.println("People 메서드 스택 name : "+name);
		System.out.println("People 메서드 스택 age : "+age);
		this.name = name; //stack 공간의 name과 age를 heap공간으로 옮겨줌
		this.age = age;
	}
}
