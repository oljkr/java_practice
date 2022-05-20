package ch04.b;

import ch04.a.Cal;

//main이 있는 자바파일이 실행파일임
public class App {

	//JVM이 main메서드를 찾으려면 public이 필요(공개)
	//JVM이 main메서드를 찾으려면 static이 필요(메모리에 올린다는 뜻)
	//main 메서드만 return 타입을 허용하지 않는다.
	//메서드의 이름이 main이다.
	//String[] args 매개변수 -> 나중에
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
		// System.out.println(c.num);

	}

}
