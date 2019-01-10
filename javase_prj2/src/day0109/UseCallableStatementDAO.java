package day0109;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import day0110.TestProcAllVO;
import day0110.TestProcOneVO;
import day0110.TestProcUpdateVO;
import kr.co.sist.connection.GetConnection;import oracle.jdbc.internal.OracleTypes;

/**
 * Procedure 를 사용한 CRUD 
 * @author owner
 */
public class UseCallableStatementDAO {
	
	private static UseCallableStatementDAO ucs_dao;
	
	private UseCallableStatementDAO() {
		
	}//UseCallableStatementDAO

	public static UseCallableStatementDAO getInstance() {
		if(ucs_dao ==null) {
			ucs_dao=new UseCallableStatementDAO();
		}//end if
		return ucs_dao;
	}//getInstance
	
	/**
	 * test_proc 테이블에 사원번호, 사원명, 연봉, 직무를 추가하는 일
	 * @param tpvo
	 * @return
	 * @throws SQLException
	 */
	public String insertProc(TestProcVO tpvo) throws SQLException{
		String resultMsg="";
		
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
		//1.
		//2.
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String pass="tiger";
			con=GetConnection.getInstance().getConn(url, id, pass);
		//3. 프로시저 실행 객체 얻기
			cstmt = con.prepareCall(" { call insert_test_proc(?, ?, ?, ?, ?, ?) }");
		//4.
			//바인드 변수에 값 설정
			//in parameter
			cstmt.setInt(1, tpvo.getEmpno());
			cstmt.setString(2, tpvo.getEname());
			cstmt.setInt(3, tpvo.getSal());
			cstmt.setString(4, tpvo.getJob());
			//out parameter : 프로시저가 처리한 결과를 저장할 데이터형을 설정
			cstmt.registerOutParameter(5, Types.VARCHAR );
			cstmt.registerOutParameter(6, Types. NUMERIC);
			
		//5.
			cstmt.execute();
			//프로시져가 실행된 후 out parameter에 설정된 값 얻기
			resultMsg =cstmt.getString(5);
			int cnt = cstmt.getInt(6);
			System.out.println( cnt);
			
			
			
		}finally {
		//6.
			if( cstmt !=null ) { cstmt.close();}//end if
			if( con !=null ) { con.close();}//end if
		}//end finally
		return resultMsg;
		
		
	}//insertProc
	
	public String updateProc(TestProcUpdateVO tpuvo)throws SQLException{
		String msg="";
		
		Connection con =null;
		CallableStatement cstmt = null;
		
		try {
		//1.
		//2.
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			con= GetConnection.getInstance().getConn(url, id, pass);
		//3.
			cstmt=con.prepareCall("{ call update_test_proc(?, ?, ?, ?, ?) }");
		//4.
			//bind변수에 값 넣기 => procedure의 매개변수
			//in parameter : 외부의 값을 안으로 넣어주는 파라미터
			cstmt.setInt(1, tpuvo.getEmpno());
			cstmt.setString(2, tpuvo.getJob());
			cstmt.setInt(3, tpuvo.getSal());
			//out parameter : 프로시저로 처리한 결과 값을 저장한 매개변수 (내부의 값을 밖으로 내어주는 파라미터)
			cstmt.registerOutParameter(4, Types.NUMERIC);
			cstmt.registerOutParameter(5, Types.VARCHAR);
		//5.
			cstmt.execute();
			// 부모의 method를 사용 (상속의 장점) - procedure를 실행. =>실행결과가 out parameter에 저장됨
			int cnt=cstmt.getInt(4);
			msg= cstmt.getString(5);
			System.out.println("update : " + cnt );
			
			
		}finally {
		//6
			if(cstmt != null) {cstmt.close();}//end if
			if(con != null) {con.close();}//end if
		}//end finally
		
		return msg;
	}//updateProc
	
	public String deleteProc(int empno) throws SQLException {
		String msg="";
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
		//1.
		//2.
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			con = GetConnection.getInstance().getConn(url, id, pass);
			
		//3.
			cstmt= con.prepareCall("{call delete_test_proc(?, ?, ?) }");
		//4.
			//바인드 변수에 값 설정
			//in
			cstmt.setInt(1, empno);
			//out
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.NUMERIC);
			
		//5.
			cstmt.execute();
			//out parameter에 설정된 값 받기
			msg = cstmt.getString(2);
			int cnt = cstmt.getInt(3);
			
			System.out.println( cnt + "건 삭제");
		}finally {
		//6.
			if( cstmt != null) { cstmt.close();}//end if
			if( con != null) { con.close();}//end if
			
		}//end finally
		
		return msg;
	}//deleteProc
	
	public List<TestProcAllVO> selecAllTestProc() throws SQLException{
		List<TestProcAllVO> list = new ArrayList<TestProcAllVO>();
		
		Connection con =null;
		CallableStatement cstmt= null;
		ResultSet rs = null;
		
		try {
		//1.
		//2.
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con= GetConnection.getInstance().getConn(url, id, pass);
			
		//3.
			cstmt= con.prepareCall(" { call select_all_test_proc(?, ?) } ");
		//4.
			//바인드 변수에 값넣기
			//out parameter : sys_refcursor -> OracleTypes.CURSOR
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
//			cstmt.registerOutParameter(1, Types.REF_CURSOR);
			//in parameter
			cstmt.setString(2, "mm-dd-yyyy day hh24:mi");
			
		//5.
			cstmt.execute();
			//커서의 제어권 받기
			rs=(ResultSet)cstmt.getObject(1);//부모는 자식을 모르므로 캐스팅 해줘야한다. 오라클의 커서는 자바의 resultset의 자식
			
			//제어권을 받아 조회한 모든 컬럼값을 VO에 할당하고 List 에 추가 (VO하나가 레코드 하나임)
			TestProcAllVO tpavo = null;
			
			while( rs.next()) {
				tpavo=new TestProcAllVO(rs.getInt("empno"), rs.getInt("sal"), 
						rs.getString("ename"), rs.getString("hiredate"), rs.getString("job"));
				
				list.add(tpavo);
			}//end while
			
		}finally {
		//6.
			if(rs != null) {rs.close();}//end if
			if(cstmt != null) {cstmt.close();}//end if
			if(con != null) {con.close();}//end if
		}//end finally
		
		return list;
	}//selecAllTestProc
	
	public TestProcOneVO selectOneTestProc(int empno) throws SQLException{
		TestProcOneVO tpovo = null;
		
		Connection con =null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
		//1.
		//2
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			con= GetConnection.getInstance().getConn(url, id, pass);
		//3
			cstmt= con.prepareCall("{ call select_one_test_proc(?, ?, ?) }");
		//4.
			//바인드변수에 값 설정
			//in parameter
			cstmt.setInt(1	, empno);
			//out parameter
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			cstmt.registerOutParameter(3, OracleTypes.VARCHAR);//Types.VARCHAR
			
		//5
			cstmt.execute();
			rs=(ResultSet)cstmt.getObject(2);
			
			if( rs.next()) {
				tpovo=new TestProcOneVO(rs.getInt("sal"), rs.getString("ename"), 
						rs.getString("job"), rs.getString("hiredate"));
			}//end if
			
		}finally {
		//6
			if( rs!= null) {rs.close();}//end if
			if( cstmt!= null) {cstmt.close();}//end if
			if( con!= null) {con.close();}//end if
		}//finally
		return tpovo;
		
	}//selectOneTestProc

	
	public static void main(String[] args) {
		UseCallableStatementDAO u = new UseCallableStatementDAO();
//		TestProcUpdateVO t = new TestProcUpdateVO(1234, 3000, "과장"); 
//		TestProcVO t = new TestProcVO(2222, 4200, "공선의","과장" );
//		TestProcVO tp = new TestProcVO(1112, 9000, "김정윤", "수강생");
		try {
			System.out.println( u.selectOneTestProc(1234));
//			List<TestProcAllVO> l=u.selecAllTestProc();
//			System.out.println(l);
//			u.insertProc(t);
//			System.out.println(u.deleteProc(1234));
//			System.out.println(u.updateProc(t));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main
	
}//class
