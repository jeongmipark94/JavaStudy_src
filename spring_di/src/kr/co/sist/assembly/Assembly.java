package kr.co.sist.assembly;

import kr.co.sist.dao.Dao;
import kr.co.sist.dao.DaoMySqlImpl;
import kr.co.sist.dao.DaoOracleImpl;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

/**
 * ������ ���� ���踦 �����ϴ� �� (dao�� service ����?) 
 * @author owner
 */
public class Assembly {
	public Service getBean() {
		//1. ������ ������ ��ü ����(!!!!) ��� ���� oracle��... � ���� mysql�� ���� 
		//Dao dao= new DaoOracleImpl();
		Dao dao= new DaoMySqlImpl();//oracle ���� mysql �� �ٲٴ� ���� ���� - assembly�� �̰� �ٲ���
		//2. ������ ���Թ��� ��ü �����ϸ鼭 ������ ����
		Service service = new ServiceImpl(dao);
		//3. ������ ���Թ��� ��ü ��ȯ     		                             (���� ���� 1,2,3�� �����������ӿ��� ���ش� but ���⼱ ���� ����.) 
		return service;
	}//getBean
}//class
