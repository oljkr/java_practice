package ch05;


//요리사
class 요리사 {
	String name = "요리사";
}

//홍길동 or 요리사
class 홍길동 extends 요리사{
	String name = "홍길동";
}
public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new 홍길동();//heap에 (홍길동,요리사)가 떴고 홍길동을 선택
		System.out.println(h1.name);

		요리사 y1 = new 홍길동();//heap에 (홍길동,요리사)가 떴고 요리사를 선택
		System.out.println(y1.name);
		
		//홍길동 h1 = new 요리사(); //heap에 (요리사)만 뜨기 때문에 홍길동 선택 불가능
	}

}
