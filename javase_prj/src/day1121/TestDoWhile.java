package day1121;

/**
 * do~while : 시작과 끝을 모를 때 사용하는 반복문<br>
 * 최소 1번 수행 최대 조건까지 수행<br>
 * 문법) do{ <br>
 * 반복수행문장들;<br>
 * }while(조건식);
 * 
 * @author owner
 */
public class TestDoWhile {

	public static void main(String[] args) {
		int i = 1000;// 초기값
		do {
			System.out.println("i=" + i);// 반복수행문장
			i++;// 증가식
		} while (i < 10);// 조건식

		// 입력되는 단으로 구구단 출력

		i = Integer.parseInt(args[0]);
		// i= 10 ;
		// float f= Float.parseFloat(args[0]);

		if (i > 1 && i < 10) { // 2단~9단 사이
			int j = 1;

			do {
				System.out.println(i + "x" + j + "=" + i * j);
				j++;
			} while (j < 10);

		} else {
			System.out.println("단은 2단에서 9단까지 입력해주세요");

		} // end if

	}// main

}// class
