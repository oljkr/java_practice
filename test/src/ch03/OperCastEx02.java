package ch03;

public class OperCastEx02 {
	public static void main(String[] args) {
		System.out.println(130/100); //몫
		System.out.println(130%100); //나머지
		
		int money = 130; //100 1개, 10 3개
		System.out.println("100원 : "+money/100+"개");
		System.out.println("10원 : "+(money%100)/10+"개");
		
		//캐스팅(다운캐스팅,업캐스팅)
		int n1 = 100; //4Byte
		double d1 = n1; //8Byte (8Byte <- 4Byte)
		System.out.println(d1);// 업캐스팅(묵시적)
		
		double d2 = 100.8;
		
		//명시적 형변환 (int) 다운캐스팅
		int n2 = (int)d2; //double을 int로 변환할 수 없어요.
		System.out.println(n2); // 단점 : 데이터가 유실될 수 있다.
		
		System.out.println(130/100);
		System.out.println(money/100);
		System.out.println(money/100.0);// byte 공간이 큰 쪽(double)을 따라감 int/double => double
		

	}
}
