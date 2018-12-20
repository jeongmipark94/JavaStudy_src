package day1123;

public class UseHw21Ramen {

	public static void main(String[] args) {
		//객체 생성
		Hw_Ramen sin=new Hw_Ramen();
		//
		sin.setName("신라면");
		sin.setThick("보통");
		sin.setChily("매콤한 오리지널 라면");
		sin.setFan(5);
				
		System.out.format("생성된 라면 객체 정보 면의 굵기[%s], 맛[%s], 선호도[%d], 이름[%s]\n ",
				sin.getThick(),sin.getChily(),sin.getFan(),sin.getName());
		
		System.out.println(sin.cook());
		System.out.println(sin.cook("계란", 5500));
		
		
		Hw_Ramen guri = new Hw_Ramen();
		System.out.format("생성된 라면 객체 정보 면의 굵기[%s], 맛[%s], 선호도[%d], 이름[%s]\n ",
				guri.getThick(),guri.getChily(),guri.getFan(),guri.getName());
		
		
		Hw_Ramen Ozing = new Hw_Ramen("오징어 짬뽕","보통","매움",3);
		System.out.format("생성된 라면 객체 정보 면의 굵기[%s], 맛[%s], 선호도[%d], 이름[%s]\n ",
				Ozing.getThick(),Ozing.getChily(),Ozing.getFan(),Ozing.getName());
	}//main

}//class
