package day0402;

import java.util.HashMap;
import java.util.Map;

public class Run {

	/**
	 * Is a 관계를 사용했을 때
	 */
	public void useIsA() {
		Map<String, Person> map = new HashMap<String, Person>();
		//값 할당
		map.put("gong"	, new SeonUi());
		map.put("lee"	, new JaeHyun());
		map.put("jung"	, new TeackSung());
		
		//키
		String key="jung1";
		//객체 다형성을 사용하여 부모에 얻어낸 자식을 저장한다.
		if( map.containsKey(key)) {
		Person person= map.get(key);
		System.out.println(person.execute());
		}//end if
	}//useIsA
	/**
	 * Is a관계를 사용하지 않고 객체를 사용할 떄
	 */
	public void notUseIsA() {
		Map<String, Object> map = new HashMap<String, Object>();
		//값 할당
		map.put("gong"	, new SeonUi());
		map.put("lee"	, new JaeHyun());
		map.put("jung"	, new TeackSung());
		// 값 사용
		String key="gong";
		if( "gong".equals(key) ) {
			SeonUi su = (SeonUi)map.get(key);//get으로 나오는 객체는 object
			System.out.println(su.execute() );
		}//end if
		if( "jung".equals(key) ) {
			TeackSung ts = (TeackSung)map.get(key);//get으로 나오는 객체는 object
			System.out.println(ts.execute() );
		}//end if
		if( "lee".equals(key) ) {
			JaeHyun jh= (JaeHyun)map.get(key);//get으로 나오는 객체는 object
			System.out.println(jh.execute() );
		}//end if
		
	}//notUseIsA
	
	public static void main(String[] args) {
		Run run = new Run();
		run.useIsA();
		System.out.println("--------------------------------------");
		run.notUseIsA();
	}//main

}//class
