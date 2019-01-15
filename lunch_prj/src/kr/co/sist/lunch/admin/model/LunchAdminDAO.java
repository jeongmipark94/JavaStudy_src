package kr.co.sist.lunch.admin.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.lunch.admin.vo.AdminLoginVO;
import kr.co.sist.lunch.admin.vo.LunchVO;

public class LunchAdminDAO {

	private static LunchAdminDAO la_dao;
	
	private LunchAdminDAO() {
		//1. 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
	}//LunchAdminDAO
	
	public static LunchAdminDAO getInstance() {
		if( la_dao == null ) {
			la_dao = new LunchAdminDAO();
		}//end if
		return la_dao;
	}//getInstance
	
	private Connection getConn() throws SQLException{
		//2.
		String url = "jdbc:oracle:thin:@211.63.89.143:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		Connection con=DriverManager.getConnection(url, id, pass);
		return con;
	}//getConn
	
	/**
	 * ID�� PASSWORD�� �Է¹޾� lunch_admin���� �̸��� ��ȸ�ϴ� ��
	 * @param alvo
	 * @return
	 * @throws SQLException
	 */
	public String login(AdminLoginVO alvo) throws SQLException{
		String adminName = "";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//1.
		//2.
				con = getConn();
		//3.
				String selectName = "SELECT NAME FROM LUNCH_ADMIN WHERE ID=? AND PASS = ?";
				pstmt = con.prepareStatement(selectName);
		//4.
				pstmt.setString(1, alvo.getId());
				pstmt.setString(2, alvo.getPass());
		//5.
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					adminName = rs.getString("NAME");
				}//end if
		
		} finally {
		//6.
			if( rs!= null ) {rs.close();}//end if
			if( pstmt!= null ) {pstmt.close();}//end if
			if( con!= null ) {con.close();}//end if
		}//end finally
		
		return adminName;
	}//login
	
	/**
	 * �Էµ� ���ö��� �ڵ�, �̹���, ���ö���, �ܰ� ��ȸ
	 * @return
	 * @throws SQLException
	 */
	public List<LunchVO> selectLunch( ) throws SQLException{
		List<LunchVO> list = new ArrayList<LunchVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//1.
		//2.
			con = getConn();
		//3.
			String selectAllLunch = "SELECT LUNCH_CODE,LUNCH_NAME,IMG,PRICE FROM LUNCH";
			pstmt = con.prepareStatement(selectAllLunch);
		//4.
		//5.
			rs= pstmt.executeQuery();
			
			LunchVO lv = null;
			
			while( rs.next()) {
				lv = new LunchVO(rs.getString("LUNCH_CODE"), rs.getString("LUNCH_NAME"), 
						rs.getString("IMG"), rs.getInt("PRICE"));
				list.add(lv);
			}
		}finally {
		//6.
			if(rs!=null) {rs.close();}//end if
			if( pstmt!=null) {pstmt.close();}//end if
			if(con!=null) {con.close();}//end if
		}//end if
		
		return list;
	}//selectLunch
	
	public static void main(String[] args) {
		try {
			System.out.println( getInstance().selectLunch());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main
	
}//class
