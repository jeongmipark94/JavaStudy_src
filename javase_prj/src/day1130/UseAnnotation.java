package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 *	JDK 1.5 에서부터 추가된 annotation의 사용.
 * Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {
	
	/**
	 *  이 메소드는 자라서 문제를 발생시킬 수 있습니다.
	 *  
	 */
	@Deprecated //닥주석보다 시각적 효과가 뛰어나서 알림 효과가 좋다. 문제를 발생시킬 수 있으니까 쓰지마 !
	public void test() {
		System.out.println("차후에 문제가 발생될 method");
	}//test
	
	@Override
	public String toString() {
		return "온뇨소초몬도";
	}//toString
	//메소드 위에 설정하면 메소드 내의 모든 경고 상황을 무시한다.
	public void temp() {
		//unused 변수를 사용하지 않아도 될 때 경고 무시
//		@SuppressWarnings("unused")
		int i=0;
		//rawtypes : Generic 을 사용하지 않을 때 경고 무시 
		//변수위에 설정하면 바로 아래있는 변수만 경고를 무시하고
//		@SuppressWarnings({"rawtypes", "unused"})
		List l = new ArrayList();
		
		int j= 0;
		System.out.println("temp j=" +j);
		
	}
	

	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		System.out.println( ua);
	}//main

}//class
