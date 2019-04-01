package ajax0401;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class WebMemberDAO {

	private static WebMemberDAO wm_dao;
	
	private WebMemberDAO() {
		
	}
	public static WebMemberDAO getInstance() {
		if(wm_dao == null) {
			wm_dao= new WebMemberDAO();
		}//end if
		return wm_dao;
	}//getInstance
	
	private Connection getConn() throws SQLException{
		Connection con = null;
		try {
			//1.JNDI 사용객체 생성
			Context ctx = new InitialContext();
			//2. DBCP에서 DataSource 얻기
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/jsp_dbcp");
			//3. DataSource에서 Connection 얻기
			con=ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
		
		return con;
	}//getConn
	
	/**
	 * ID가 존재하는지 중복 검사
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public boolean selectId(String id)throws SQLException{
		boolean flag= false;
		
		Connection con=null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		
		try {
		//1.JNDI 생성객체 얻기
		//2.데이터 생성 객체 얻기
		//3.커넥션 얻기
			con= getConn();
		//4. 쿼리문 생성
			String selectId="select id from web_member where id=?";
			pstmt=con.prepareStatement(selectId);
			pstmt.setString(1, id);
		//5.쿼리 수행 후 값 조회하기
			rs=pstmt.executeQuery();
			
			flag =!rs.next();
			
		}finally {
		//6. 연결 끊기 
			if(rs!=null) {rs.close();}//end if
			if(pstmt!=null) {pstmt.close();}//end if
			if(con!=null) {con.close();}//end if
		}//end if
		
		return flag;
	}//selectId
	
}//class




