package day1127;

public class UseString1 {
	// 이메일을 입력받아 이메일의 유효성을 검증하여 boolean형으로
	// 결과를 만들어 반환하는 일
	//메소드는 일만하지 출력은 하지 않는다.

	private boolean validEmail(String email) {
		boolean flag =false;
//		if(email.length()>5 && email.indexOf("@") !=-1 && email.indexOf(".") != -1){
//			flag= true;
//		}else {
//				flag=false;
		flag = email.length()>5 && email.contains("@")  && email.contains(".");
			return flag;
		}//validEmail
		
//				
//			}
//		System.out.println("유효하지 않은 이메일입니다.");
//		}else {
//		System.out.println("유효한 이메일입니다");
//		}



	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		String email = "ruro@daum.net";
		//String email = "@";
		//String email = "ruro@daumnet";
		if(us1.validEmail(email)) {
			System.out.println(email+" 유효");
		}else {
			System.out.println(email + " 무효");
		}//end if
		
	}// main

}// class
