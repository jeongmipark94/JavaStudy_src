package day1205;

import java.util.StringTokenizer;

public class Hw2split {

	/*
	 * 2. 아래 제시된 문자열을 구분 문자로 잘라내어 문자열 배열에 저장하고 반환하는 일을 하는 method를 작성하세요.
	 * 
	 * "이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"
	 * 
	 * 출력; 이재찬 이재현 공선의 정택성 이재현 최지우 김희철 이재찬 이재찬 정택성 공선의
	 */

	public String[] getName(String str) {
		StringTokenizer stk = new StringTokenizer(str,",.~!");
		String[] name =new String[stk.countTokens()];
		
		int i=0;
		while(stk.hasMoreTokens()) {
				name[i] = stk.nextToken();
				i++;
	}
		return name;
	}

	public static void main(String[] args) {

		Hw2split h2=new Hw2split();
		String name = "이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의";
		String temp[]= h2.getName(name);

//		StringTokenizer stk = new StringTokenizer(names, ",.~!");
//		System.out.println("토큰의 수 : "+ stk.countTokens());
//				while(stk.hasMoreTokens()) {
//					System.out.print(stk.nextToken());
//					System.out.print(" ");
//				}//end while
//
//				name[11] =
				
		System.out.println(h2.getName(name));
		
		
		
		for(int i=0; i<temp.length;i++) {
			System.out.print(temp[i]+" ");
			
		}//end for


		
		
		
		
	}// main

}// class
