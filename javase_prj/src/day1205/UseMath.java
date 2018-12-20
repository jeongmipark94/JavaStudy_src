package day1205;

/**
 *	Math : 객체를 생성하지않고 사용하는 클래스.
 * @author owner
 */
public class UseMath {
	public UseMath() {
//		Math m =new Math();
		int i = -12;
		System.out.println("i의 절대값 : " +Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));//소수점 이하 첫자리에서
		System.out.println(Math.floor(10.5));//소수점 이하 첫자리에서

		double d= Math.random();
		System.out.println("발생한 난수 : " +d);
		System.out.println("범위를 설정한 난수 : " +d*5);
		System.out.println("범위를 설정한 난수에서 정수 : " +(int)(d*5));
		
		//A(65)~Z(90) 중 하나의 문자를 반환하는 일.
		System.out.println( (char)((int)(d*26)+65) );
		
		System.out.println((char)((int)(d*26)+65));
		
//		public char[]hwPassword(){
//			char[] tempPass = new char[8];
//
//		double p=(int)(Math.random());
////		int i =0;
//		String r;
//		System.out.println(p);
//		 if(p>0) {
//			 for(i=0; i<9; i++) {
//				 if(p>48 ||p<57) {
//					 
//				 }
//				 
//			 }//end for			 
//		 }//end if
//		}
		
		
	}//UseMate
		public char[] createPassword() {
			char[] tempPass= new char[8];
			//영문자 대문자, 소문자,숫자로 이루어진 임의의 비밀번호 8자리를
			//생성하여 반환하는 일
			String flag="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			
			for(int i=0 ; i<tempPass.length; i++) {
				tempPass[i]=flag.charAt((int)((Math.random()*flag.length())));
				System.out.print(tempPass[i]);
			}//end for
			
			
			
//			소문자97-121
//			48~57
			
			
			
			
			
			return tempPass;
		}//createPassword

	public static void main(String[] args) {
//		new UseMath();
		new UseMath().createPassword();
	}//main

}//class
