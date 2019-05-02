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
		//메서드가 실행되기 전에 먼저 불려짐 before 일 땐 // after일 땐 나중에 찍혀야된다.
		
		ItemDomain id = is.searchItem("김희철");
		System.out.println(id.getItemNo());
		System.out.println(id.getItem() );
	}//execute
	
	public static void main(String[] args) {
		AopRun ar= new AopRun();
		ar.execute();
		
	}//main
}//class
