package kr.co.sist.service;

import java.util.List;

import kr.co.sist.vo.EmpVo;

public interface Service {//업무로직 정의
	public void addEmp(EmpVo ev);
	public List<EmpVo> searchEmp();
	
	

}
