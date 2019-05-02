package kr.co.sist.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.domain.ItemDomain;
import kr.co.sist.service.ItemService;

public class AopRun {

	public void execute(){
		ApplicationContext ac= 
				new ClassPathXmlApplicationContext
					("kr/co/sist/run/applicationContext.xml");
		
		ItemService is=ac.getBean(ItemService.class);
		//�޼��尡 ����Ǳ� ���� ���� �ҷ��� before �� �� // after�� �� ���߿� �����ߵȴ�.
		
		ItemDomain id = is.searchItem("����ö");
		System.out.println(id.getItemNo());
		System.out.println(id.getItem() );
	}//execute
	
	public static void main(String[] args) {
		AopRun ar= new AopRun();
		ar.execute();
		
	}//main
}//class
