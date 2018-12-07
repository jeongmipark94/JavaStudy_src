package day1207;
/*	숙제 1.
main method의 arguments로 날짜를 여러개 입력 받아 입력받은 날짜의
 요일을 저장하고 출력하는 method 를 작성하세요.

예) java Test 4 12 30 32 35 15 4   

출력) 4 화
        12 수
        15 토
        30 일  */

public class RunHw {
	
	public static void main(String[] args) {
		HW hw =new HW();
		
		hw.setDate(args);
		hw.printDate(hw.map);
		
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		
	}

}
