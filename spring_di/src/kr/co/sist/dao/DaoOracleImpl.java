package kr.co.sist.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.vo.EmpVo;

public class DaoOracleImpl implements Dao {

	@Override
	public int insertEmp(EmpVo ev) throws SQLException {
		// Oracle DB에 insert 작업 수행했다 침 - 원래는 jdbc (5단계)/dbcp(6단계) /mybatis(sql builder 어쩌구 저쩌구 ...들어감) oracle 쿼리
		System.out.println("Oracle에 사원정보 추가 ");
		return 1;
	}//insertEmp

	@Override
	public List<EmpVo> selectEmp() throws SQLException {
			List<EmpVo> list= new ArrayList<>();//DB에서 조회된 결과라 치자
			list.add(new EmpVo(1111, "노진경"));
			list.add(new EmpVo(1112, "김희철"));
			list.add(new EmpVo(1113, "김정윤"));
			list.add(new EmpVo(1114, "이재찬"));
		return list;
	}//selectEmp

}
