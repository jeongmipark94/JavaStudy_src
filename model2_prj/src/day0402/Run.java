package day0402;

import java.util.HashMap;
import java.util.Map;

public class Run {

	/**
	 * Is a ���踦 ������� ��
	 */
	public void useIsA() {
		Map<String, Person> map = new HashMap<String, Person>();
		//�� �Ҵ�
		map.put("gong"	, new SeonUi());
		map.put("lee"	, new JaeHyun());
		map.put("jung"	, new TeackSung());
		
		//Ű
		String key="jung1";
		//��ü �������� ����Ͽ� �θ� �� �ڽ��� �����Ѵ�.
		if( map.containsKey(key)) {
		Person person= map.get(key);
		System.out.println(person.execute());
		}//end if
	}//useIsA
	/**
	 * Is a���踦 ������� �ʰ� ��ü�� ����� ��
	 */
	public void notUseIsA() {
		Map<String, Object> map = new HashMap<String, Object>();
		//�� �Ҵ�
		map.put("gong"	, new SeonUi());
		map.put("lee"	, new JaeHyun());
		map.put("jung"	, new TeackSung());
		// �� ���
		String key="gong";
		if( "gong".equals(key) ) {
			SeonUi su = (SeonUi)map.get(key);//get���� ������ ��ü�� object
			System.out.println(su.execute() );
		}//end if
		if( "jung".equals(key) ) {
			TeackSung ts = (TeackSung)map.get(key);//get���� ������ ��ü�� object
			System.out.println(ts.execute() );
		}//end if
		if( "lee".equals(key) ) {
			JaeHyun jh= (JaeHyun)map.get(key);//get���� ������ ��ü�� object
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
