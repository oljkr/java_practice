package ch06;

public class ForEx01 {

	public static void main(String[] args) {
		for(int y=2;y<=9;y++) {//i는 지역변수
			for(int x=1;x<=9;x++) {
				System.out.println(y+"*"+x+"="+y*x);
			}
			System.out.println();			
		}
	}
}

