package day1205;

import java.util.StringTokenizer;

/**
 *문자열을 짧은 마디로 구분하는 StringTokenizer의 사용
 * @author owner
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg = "오늘은 수요일 입니다. 날씨는 -5입니다. 쉬었다가 합시다";
		
		//공백으로 구분. : 매개변수 하나인 생성자 사용.
		StringTokenizer stk = new StringTokenizer(msg);
		
		System.out.println( stk.countTokens()+"개");
		while(stk.hasMoreTokens()) {//토큰이 존재하는지?
		System.out.println( stk.nextToken() );//토큰을 얻고 포인터를 다음으로 이동
		}//end while
		
		String names="이재현,이재찬~정택성, 김희철.김정운~김정윤,공선의";
		
		//특정 문자로 토큰을 구분 : 매개변수 2개인 생성자
		StringTokenizer stk1 = new StringTokenizer(names, ",~"); //or기능이있다
		System.out.println("-------------------------------");
		System.out.println("토큰의 수 : "+ stk1.countTokens());
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}//end while
		
		//특정문자로 토큰 구분. 구분된 문자열도 토큰으로 처리:
		//매개변수 세개인 생성자
		System.out.println("-------------------------------");
		StringTokenizer stk2 = new StringTokenizer(names, ",.~", false);
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}//end while
		
	}//UseStringTokenizer
	public static void main(String[] args) {
		new UseStringTokenizer();
		

	}//main

}//class
