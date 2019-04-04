package kr.co.sist.exam.service;

import java.util.List;

import kr.co.sist.exam.dao.MyBatisDAO;
import kr.co.sist.exam.domain.DeptInfo;

public class MyBatisService {
	public String deptName() {
		MyBatisDAO mb_dao = MyBatisDAO.getInstance();
		String dname=mb_dao.singleColumn()+"�μ�";
		return dname;
	}//deptName
	
	/**
	 * �÷� ������ ���ڵ� �ϳ� 
	 * @return
	 */
	public DeptInfo deptInfo() {
		MyBatisDAO mb_dao = MyBatisDAO.getInstance();
		DeptInfo di=mb_dao.multiColumn();
		return di;
	}//deptName
	
	public List<Integer> multiRow(){
		List<Integer> list=null;
		MyBatisDAO mb_dao=MyBatisDAO.getInstance();
		list = mb_dao.multiRow();
		return list;
	}//multiRow

}//class
