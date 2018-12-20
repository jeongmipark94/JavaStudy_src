package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat
 * 숫자를 지정한 문자열로 변경.
 *  
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp=2018;
		System.out.println(temp);
	
	DecimalFormat df =new DecimalFormat("0,000,000,000");
	DecimalFormat df1 =new DecimalFormat("#,###,###,###");
	
	System.out.println("0사용 :"+ df.format(temp));
	System.out.println("#사용 :"+ df1.format(temp));
	DecimalFormat df2 =new DecimalFormat("#,###.##");//소수점 이하자리수 표현
	//실수 자릿수를 사용하면 마지막뒷자리의 값이 반올림 대상이라면 반올림한
	//	결과를 보여준다.
	System.out.println("소수 자릿수 표현 :"+df2.format(201812.064));
	System.out.println("소수 자릿수 표현 :"+df2.format(201812.067));

	}//UseDecimalFormat
	
	public static void main(String[] args) {
		new UseDecimalFormat() ;
	}//main

}//class
