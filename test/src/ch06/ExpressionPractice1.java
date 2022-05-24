package ch06;

public class ExpressionPractice1 {

	public static void main(String[] args) {
		//문제 1
		for(int x=1;x<=10;x++) {
			if(x==6) continue;
			System.out.println(x);
		}
		
		System.out.println("===========");
		//문제 2
		for(int x=10;x>=1;x--) {
			if(x!=3) {
				System.out.println(x);
			}
		}
		
		System.out.println("===========");
		//문제 3
		for(int x=1;x<=20;x++) {
			if(x%2==0) {
				System.out.println(x);
			}
		}

	}

}
