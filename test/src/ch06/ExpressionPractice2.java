package ch06;

public class ExpressionPractice2 {
	
	static void CalCoin(int coin[],int restMoney) {
		for(int x=0;x<4;x++) {
			System.out.println(coin[x]+"원 : "+(restMoney/coin[x]));
			restMoney = restMoney%coin[x];
			System.out.println("남은금액 : "+restMoney);			
	}
	}
	
	public static void main(String[] args) {
		int[] coin = {500,100,50,10};
		
		//최소 동전구하기 500, 100, 50, 10
		int money = 10980;
		int restMoney = money;
		
		CalCoin(coin, restMoney);
		


	}

}
