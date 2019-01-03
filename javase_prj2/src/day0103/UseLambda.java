package day0103;

import java.text.SimpleDateFormat;
import java.util.Date;


public class UseLambda {

	public static void main(String[] args) {
//		TestLambda tl = ()-> new Date().toString(); //return생략가능
//		TestLambda tl = ()-> {return new Date().toString(); }; //return기술 ({}필요)
		//return이 들어가면 여러줄이라고 생각해서 { } 해줘야한다.
		
		
		//abstract method내의 코드가 복잡(여러줄)한 경우에는 { } 를 반드시 기술
		TestLambda tl =()->{
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for(int i=0; i<10 ; i++) {
				System.out.println("i = " + i);
			}//end for
			
			return sdf.format(new Date());
		}; //return 기술 {}필요
		
		System.out.println(tl.toDay());
		
	}//main

}//class
