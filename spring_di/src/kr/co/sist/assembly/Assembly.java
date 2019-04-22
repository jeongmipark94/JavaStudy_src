package kr.co.sist.assembly;

import kr.co.sist.dao.Dao;
import kr.co.sist.dao.DaoMySqlImpl;
import kr.co.sist.dao.DaoOracleImpl;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

/**
 * 의존성 주입 관계를 설정하는 일 (dao와 service 연결?) 
 * @author owner
 */
public class Assembly {
	public Service getBean() {
		//1. 의존성 주입할 객체 생성(!!!!) 어느 경우는 oracle로... 어떤 경우는 mysql로 가능 
		//Dao dao= new DaoOracleImpl();
		Dao dao= new DaoMySqlImpl();//oracle 말고 mysql 로 바꾸는 일이 생김 - assembly서 이거 바꿔줌
		//2. 의존성 주입받을 객체 생성하면서 의존성 주입
		Service service = new ServiceImpl(dao);
		//3. 의존성 주입받은 객체 반환     		                             (원래 위의 1,2,3은 스프링프레임웍이 해준다 but 여기선 내가 해줌.) 
		return service;
	}//getBean
}//class
