package kr.co.sist.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.sist.dao.Dao;
import kr.co.sist.vo.EmpVo;

public class ServiceImpl implements Service{
	//자식이 아닌 부모의 이름으로 객체를 저장하면 모든 자식을 받을 수 있다.(객체 다형성)
	private Dao dao;
	//Service 객체는 업무를 처리하는데 반드시 Dao를 사용해야한다.
	//                           =>Service는 DAO에 의존성이있다. ( Service 객체를 사용할려면 DAO를 의존성 주입(DI)받아야한다.)
	public ServiceImpl(Dao dao) {
		this.dao=dao;
	}//ServiceImpl
	
	@Override
	public void addEmp(EmpVo ev) {
		try {
			//업무로직 처리
			System.out.println("추가 작업에 대한  업무로직 처리");
			dao.insertEmp(ev);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//addEmp

	@Override
	public List<EmpVo> searchEmp() {
		
		System.out.println("조회작업에 대한 업무로직 처리");
		List<EmpVo> list=null;
		 try {
			list= dao.selectEmp();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		 
		return list;
	}//searchEmp

	
	
}//class