package kr.co.sist.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.vo.EmpVo;

public class DaoMySqlImpl implements Dao {

	@Override
	public int insertEmp(EmpVo ev) throws SQLException {
		// MySQL DB�� insert �۾� �����ߴ� ħ -
		System.out.println("MySQL�� ������� �߰� ");
		return 1;
	}//insertEmp

	@Override
	public List<EmpVo> selectEmp() throws SQLException {
			List<EmpVo> list= new ArrayList<>();//DB���� ��ȸ�� ����� ġ�� oracle�����̶��� �ٸ� �������� ä����
			list.add(new EmpVo(2111, "������"));
			list.add(new EmpVo(2112, "������"));
			list.add(new EmpVo(2113, "������"));
			list.add(new EmpVo(2114, "���ü�"));
			list.add(new EmpVo(2114, "�̺���"));
		return list;
	}//selectEmp

}
