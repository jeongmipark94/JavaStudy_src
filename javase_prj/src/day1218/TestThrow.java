package day1218;

import java.util.Random;

/**
 * 예외를 강제로 발생
 * @author owner
 */
public class TestThrow {

	/**
	 * 길을 가다가 담배를 피우는 학생을 보면 정의사회를 구현한다.
	 */
	
	public void teacksung() throws Exception {
		String[] grade= {"초등학생","중학생","고등학생"};
		String randomGd= grade[new Random().nextInt(grade.length) ];
		
		if(randomGd.equals("초등학생")) {
//			try { try ~ catch 로 잘 안함
			throw new Exception(randomGd+"행님들 금연해야하는 부분인지용?");
//			} catch (Exception e) {
//				e.printStackTrace();
			
			
		}else {
			System.out.println(randomGd + "이 담배를 피우면 모른척 지나간다 (''   )(   '')");
		}//end else
	}//teacksung
	
	
	public void teacksung2() throws TobaccoException{//런타임 예외는 try catch 안해줘도 괜찮음
		String[] grade= {"초등학생","중학생","고등학생"};
		String randomGd= grade[new Random().nextInt(grade.length) ];
		
		if(randomGd.equals("초등학생")) {
			throw new TobaccoException();/*(randomGd+"행님들 금연해야하는 부분인지용?");*/
			
			
		}else {
			System.out.println(randomGd + "이 담배를 피우면 모른척 지나간다 (''   )(   '')");
		}//end else
	}//teacksung
	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {//어떤 예외를 발생하는지 알 수 없다.
			e.printStackTrace();
		}//end catch
		System.out.println("----------------------------------------------------------------");
		
			try {
				tt.teacksung2();
			} catch (TobaccoException e) {
				e.printStackTrace();
			}
		
	}//main

}//class
