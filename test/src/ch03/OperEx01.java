package ch03;

public class OperEx01 {

	public static void main(String[] args) {
		int n1 = 3; //대입연산자
		int n2 = 4;
		int sum = n1 + n2; //수치연산
		System.out.println(sum);
		
		String s1 = "올해는 ";
		int age = 2022;
		String s2 = "년입니다.";
		System.out.println(s1+age+s2); // 결합
		
		System.out.println(5-3);
		System.out.println(10/2);
		System.out.println(2*20);
	
		//리턴의 결과 true,false
		System.out.println(1==1); //같은지
		System.out.println(1==2);
		System.out.println(5!=3); //같지 않나요? !는 부정의 의미
		System.out.println(3>1); //크나요?
		System.out.println(3<1); //작나요?
		System.out.println(2<=2); //작거나 같나요?
		System.out.println(2<=3); //작거나 같나요?
		System.out.println(2>=2); //크거나 같나요?
		System.out.println(2>=1); //크거나 같나요?
		
		System.out.println(1==1 && 1==2);//true and false
		System.out.println(1==1 || 1==2);//true or false
		
		int n3 = 1;
		int n4 = 2;
		System.out.println(n3==n3 || n3==n4);
		
		int n5 = 5;
		System.out.println(n5==5 ? "5가 맞습니다." : "5가 아닙니다");
		
		int point = 59;
		System.out.println(point >= 60 ? "시험을 통과하였습니다." : "내년에 재수강해야합니다.");
		
		String result = point >= 60 ? "시험을 통과하였습니다." : "내년에 재수강해야합니다.";
		System.out.println("결과 : "+result);
		
		boolean result2 = 1==1;
		System.out.println("결과 : "+result2);
		
		int result3 = point < 60 ? 0 : 1;
		System.out.println("결과 : "+result3);	
	}

}
