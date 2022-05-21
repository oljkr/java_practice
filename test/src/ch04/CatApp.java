package ch04;

public class CatApp {

	//Cat→커스텀 타입(개발자가 만든 타입)
	//c1→heap 공간을 가르키는 주소
	//new→ heap 메모리에 할당.(static이 아닌 모든 것이니까 여기선 String name, String color)
	//Cat()→생성자 호출→상태를 초기화 하기 위해서
	public static void main(String[] args) {
		Cat c1 = new Cat("집사1","하얀색");
		System.out.println(c1.name);
		System.out.println(c1.color);
		
		Cat c2 = new Cat("집사2","노란색");
		System.out.println(c2.name);
		System.out.println(c2.color);

	}

}
