package day1207;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HwDayprint {
	public HwDayprint() {
		
	}//HwDayprint의 생성자
	
	Map<Integer> map = new HashMap<Integer>();
	Set<String> set = new HashSet<String>();
	Calendar cal = Calendar.getInstance();
	Iterator<String> ita = set.iterator();
	
/*	숙제 1.
	main method의 arguments로 날짜를 여러개 입력 받아 입력받은 날짜의
	 요일을 저장하고 출력하는 method 를 작성하세요.

	예) java Test 4 12 30 32 35 15 4   

	출력) 4 화
	        12 수
	        15 토
	        30 일  */
	
		public void print( int date ) {
			set.add(date);
			
		}
	
	
	
	
	public static void main(String[] args) {
		HwDayprint hd = new HwDayprint();
		
				hd.print(args);
		
	}//main

}//class
