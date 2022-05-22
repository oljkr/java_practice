package ch05;

// 접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player {
	//상태 = 필드
	String name; //이름
	private int thirsty; //목마름(0~100)//private->외부 클래스에서 접근 불가능
	
	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
	}
	
	//행위 = 메서드 = 값을 변경
	void 물마시기() {
		System.out.println("물마시기 행위");
		this.thirsty = this.thirsty - 50;
	}
	
	int 목마름상태확인() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름은 : "+p1.name);
		System.out.println("갈증지수 : "+p1.목마름상태확인());

//		1. 첫번째 시나리오 = 마법(X)
//		p1.thirsty = 50;
//		System.out.println("갈증지수 : "+p1.thirsty);
		
//		2. 두번째 시나리오 = 상태가 행위를 변경함(X) - 실수할 수 있음(신입)
//		p1.물마시기();
//		p1.thirsty = 50;
//		System.out.println("갈증지수 : "+p1.thirsty);
		
//		3. 세번째 시나리오
		p1.물마시기(); //실수할 수가 없음.
		System.out.println("갈증지수 : "+p1.목마름상태확인());
	}

}
