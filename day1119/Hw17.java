package day1119;

public class Hw17 {

	public static void main(String[] args) {
		/*1. 출퇴근 시간을 입력받아 아래의 조건으로 출력하세요.
		  출력 :  출퇴근 시간은 최대 2시간의 제한이 있으며 60분을 넘는 다면 "장거리"
		 	 60분 이하라면 "단거리"를 출력하세요.*/
	 int i =Integer.parseInt(args[0]);
	 
	 if( i >120) {
		 	System.out.println("2시간 초과 입력 불가");
	 	}else if(i>60) {
	 		System.out.println("장거리");
	 } else
		 System.out.println("단거리");
		

		/*2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요.
		   교통수단은 "버스,지하철,택시,도보"로 제한한다.
		   버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다.
		   요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다.
			플로우차트
		 출력   :  xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다.
		            편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준
		            교통비는 총: xxxx원 입니다.  */
	 	
	 //args[1] = 이름, args[2]=교통수단, args[3]=출퇴근거리
	 String ride =args[2]; 
	 int fee = 0;
	 int len = Integer.parseInt(args[3]);
	 int add=(((int)((len-10)/5))*100);
	 	 
	 	 if (len-10>0) {
		 fee=fee+add;
	 	 }
		 switch(ride) {
	case "버스" : fee=1200; break;
	 case "지하철" : fee=1250; break;
	 case "택시" : fee=3800; break;
	 case "도보" : fee=0;
	 }//end switch

	 
	 //if ((args[3]-10)/5*100) {

		 
	 //end if
	 
	 System.out.println(args[1]+"님 출퇴근 교통수단은 "+args[2]+"이며 거리는 "+ args[3]+"키로 입니다.");
		System.out.println("편도 이용 요금 "+fee+"원이고, 왕복이용 요금 "+(fee*2)+"원이며,"
				+ " 한달 20일기준  교통비는 총: "+(fee*2*20)+"원 입니다.");	
	}//main

}//class
