package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 형식이 있는 날짜정보를 얻을 때.
 * 형식 - java.text.SimpleDateFormat
 * 날짜정보 - java.util.Date
 * @author owner
 */
public class UseDate {

	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //비추천 메서드가 많다.
		
		
		//다른 나라의 날짜 옇식으로 변경하여 제공할 떄 사용
		
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy-MM- dd a EEEEE HH(hh,kk):mm:ss ",Locale.TAIWAN);
						
		String formatDate=sdf.format(date);
		System.out.println(formatDate);
		
		
	}//UseDate
	
	public static void main(String[] args) {
		new UseDate();
	}//main

}//class
