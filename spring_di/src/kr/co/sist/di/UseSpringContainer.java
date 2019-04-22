package kr.co.sist.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.service.ServiceImpl;
import kr.co.sist.vo.EmpVo;

public class UseSpringContainer {

	public static void main(String[] args) {

		//1. 설정파일을 사용하여  Spring Container 생성
		ApplicationContext ac= 
				new ClassPathXmlApplicationContext("kr/co/sist/di/applicationContext.xml");
		//2. id를 사용하여 Bean(의존성 주입받은 객체) 얻기
//		ServiceImpl si=(ServiceImpl)ac.getBean("service");//2.5.3 - 하위버전일 때 쓰는 방법.
		
		ServiceImpl si=ac.getBean("service",ServiceImpl.class);//serviceImpl이 여러개이면 못씀 
		
		//3.찾아낸 bean을 사용하여 출력
		si.addEmp(new EmpVo(3333, "김정윤"));
		
		List<EmpVo> list= si.searchEmp();
		for(EmpVo ev:list) {
			System.out.println(ev.getEmpno() +"/"+ev.getEname());
		}//end for
	}//main

}//class
