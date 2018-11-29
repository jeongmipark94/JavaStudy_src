package day1120;

import java.util.ArrayList;
import java.util.List;
//이게 되있어야 list쓸 수 있음
/**
 *개선된 for문 : 배열이나 Collection들의 모든 방의 값을 처음부터 끝까지
 *순차적으로 출력하기위해 제공.<br>
 * 개선된 for문은 JDK 1.5에서부터 사용가능<br>
 *문법 ) for (데이터형 변수명 : 배열명(Collection명)){<br>
 *					변수명;(배열(Collection)방의 값을 사용할수있다.)<br>
 *}
 * @author owner
 */
public class improvementFor {

	public static void main(String[] args) {

		int[] tempArr = {2018, 11, 20, 16, 5};
		//이전의 for로 모든 방의 값을 출력
		for(int i=0; i< tempArr.length; i++) {
			System.out.println(tempArr[0]);
		}//end for
		System.out.println("========================");
		for(int value : tempArr) {
			System.out.println(value);
		}//end for
		
		//Collection 인데 List임
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(110);
		list.add(1);
		System.out.println("-----------------List 이전for----------------");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i) );
		}//end for
		System.out.println("-----------------List 향상된for----------------");
		for(int i : list) {
			System.out.println( i );
		}//end for
		
	}//main

}//class
