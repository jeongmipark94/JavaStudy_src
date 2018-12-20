package day1129;

import java.util.Arrays;

public class UseSecureArray {

	public static void main(String[] args) {
		SecureArray sa= new SecureArray();
		int[] tempArr = sa.getArr();
		//배열 방의 값을 손쉽게 출력 할려면 Arrays클래스 - for문 안돌려도 이거 쓰면 출력 가능
		tempArr[0]=190;
		System.out.println( Arrays.toString(tempArr)); 
		
		int[] tempArr1= sa.getArr();
		System.out.println(Arrays.toString(tempArr1));
		
		
	}//main

}//class
