package day0107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsePreparedStatementDAO {
	public UsePreparedStatementDAO() {
		
	}//UsePreparedStatementDAO
	
	private Connection getConn() throws SQLException{
		Connection con = null;
		//1.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		//2.
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass = "tiger";
		
		con =DriverManager.getConnection(url, id, pass);
		
		return con;
	}//getConn
	
	public void insertCpEmp2(CpEmp2VO cevo)throws SQLException {
		Connection con =null;
		PreparedStatement pstmt= null;
		
		try {
		//1. 드라이버 로딩
		
		//2. Connection 얻기
			con = getConn();
		//3. 쿼리문 생성객체 얻기 : PreparedStatement 객체는 실행되는 쿼리문을 알고 있다. ?-bind변수
			String insertCpEmp = "insert into cp_emp2(empno, ename,hiredate, sal) values (?,?,sysdate,?)";
			pstmt = con.prepareStatement(insertCpEmp);
		//4. 바인드 변수에 값 설정
			pstmt.setInt(1, cevo.getEmpno());
			pstmt.setString(2, cevo.getEname());
			pstmt.setInt(3, cevo.getSal());
		//5. 쿼리 수행 후 결과 얻기
			pstmt.executeUpdate();
		}finally {
		//6. 연결 끊기.
			if(pstmt != null) { pstmt.close();}//end if
			if(con != null) { con.close();}//end if
		}//end finally
	}//insertCpEmp2
	
	
	/*public static void main(String[] args) { //메인에서 단위테스트
		//화이트 박스 테스트 : 코드를 보고 이 프로그램이 잘 동작하는 지 보는 것 (코드를 볼 줄 알아야함)
		//블랙 박스 테스트 : 체크리스트가 있어서 예/아니오로 체크하는 것
		
	    UsePreparedStatementDAO u = new UsePreparedStatementDAO();
	    CpEmp2VO c= new CpEmp2VO(9876,3000,"김희철");
	    try {
			u.insertCpEmp2(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
		
	}//main
*/	
	public boolean updateCpEmp2(CpEmp2VO cevo)throws SQLException {
		boolean flag= false;
		
		return flag;
	}//updateCpEmp2
	
	public boolean deleteCpEmp2(int empno)throws SQLException {
		boolean flag= false;
		
		return flag;
	}//deleteCpEmp2
	
	public List<CpEmp2AllVO>selectAllCpEmp2()throws SQLException{
		List<CpEmp2AllVO> list = new ArrayList<CpEmp2AllVO>();
		
		return list;
	}//selectAllCpEmp2
	
	public CpEmp2OneVO selectOneCpEmp2(int empno) throws SQLException{
		CpEmp2OneVO cevo = null;
		
		return cevo;
	}//selectOneCpEmp2
	
	
	
}//class




