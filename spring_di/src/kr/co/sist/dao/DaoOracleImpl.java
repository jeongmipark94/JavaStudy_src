package kr.co.sist.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.vo.EmpVo;

public class DaoOracleImpl implements Dao {

	@Override
	public int insertEmp(EmpVo ev) throws SQLException {
		// Oracle DB�� insert �۾� �����ߴ� ħ - ������ jdbc (5�ܰ�)/dbcp(6�ܰ�) /mybatis(sql builder ��¼�� ��¼�� ...��) oracle ����
		System.out.println("Oracle�� ������� �߰� ");
		return 1;
	}//insertEmp

	@Override
	public List<EmpVo> selectEmp() throws SQLException {
			List<EmpVo> list= new ArrayList<>();//DB���� ��ȸ�� ����� ġ��
			list.add(new EmpVo(1111, "������"));
			list.add(new EmpVo(1112, "����ö"));
			list.add(new EmpVo(1113, "������"));
			list.add(new EmpVo(1114, "������"));
		return list;
	}//selectEmp

}
