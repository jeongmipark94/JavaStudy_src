package day0107;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

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
	
	/**
	 * �����ȣ, �����, ������ �Է¹޾� CpEmp2���̺� �߰��ϴ� ��
	 * @param cevo
	 * @throws SQLException
	 */
	public void insertCpEmp2(CpEmp2VO cevo)throws SQLException {
		Connection con =null;
		PreparedStatement pstmt= null;
		
		try {
		//1. ����̹� �ε�
		
		//2. Connection ���
			con = getConn();
		//3. ������ ������ü ��� : PreparedStatement ��ü�� ����Ǵ� �������� �˰� �ִ�. ?-bind����
			String insertCpEmp = "insert into cp_emp2(empno, ename,hiredate, sal) values (?,?,sysdate,?)";
			pstmt = con.prepareStatement(insertCpEmp);
		//4. ���ε� ������ �� ����
			pstmt.setInt(1, cevo.getEmpno());
			pstmt.setString(2, cevo.getEname());
			pstmt.setInt(3, cevo.getSal());
		//5. ���� ���� �� ��� ���
			pstmt.executeUpdate();
		}finally {
		//6. ���� ����.
			if(pstmt != null) { pstmt.close();}//end if
			if(con != null) { con.close();}//end if
		}//end finally
	}//insertCpEmp2
	
	
	/**
	 * �����ȣ, �����, ������ �Է¹޾� �����ȣ�� �ش��ϴ� �����, ������ �����ϴ� ��.
	 * @param cevo
	 * @return
	 * @throws SQLException
	 */
	public boolean updateCpEmp2(CpEmp2VO cevo)throws SQLException {
		boolean flag= false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		//1.  ����̹� �ε�
			
		//2. Connection ���
			con = getConn();
		//3. ������ ���� ��ü ���
			String updateCpEmp2="update cp_emp2 set ename=?,sal=? where empno=?";
			pstmt=con.prepareStatement(updateCpEmp2);
		//4. bind ����(?)�� �� ����(���� ? �������� 1,2,3)
			pstmt.setString(1, cevo.getEname());
			pstmt.setInt(2, cevo.getSal());
			pstmt.setInt(3, cevo.getEmpno());
		//5. ������  ���� �� ��� ���

			
//	}//main
			int cnt=pstmt.executeUpdate();
			if( cnt !=0) {
				flag = true;
			}//end if
		}finally {
		//6. ���� ����
		}//end finally
		return flag;
	}//updateCpEmp2
	
	/**
	 * �����ȣ�� �Է¹޾� �����ȣ�� �ش��ϴ� ����� �����ϴ� ��.
	 * @param empno
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteCpEmp2(int empno)throws SQLException {
		boolean flag= false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		//1 ����̹� �ε�
		//2 connection ���
			con= getConn();
		//3 ������ ������ü ���
			String deleteCpEmp2 = "delete from cp_emp2 where empno=?";
			pstmt=con.prepareStatement(deleteCpEmp2);
		//4 bind ������ �� ����
			pstmt.setInt(1, empno);
		//5 ���� ���� �� ��� ���
			int cnt = pstmt.executeUpdate();
			
			if(cnt!=0) {
				flag=true;
			}//end if
		}finally {
		//6���� ����
			if(pstmt != null) {pstmt.close();}//end if
			if(con != null) {con.close();}//end if
		}//end finally
		
		
		
		return flag;
	}//deleteCpEmp2
		
	
	/**
	 * ��� �μ� ��������� ��ȸ
	 * @return
	 * @throws SQLException
	 */
	public List<CpEmp2AllVO>selectAllCpEmp2()throws SQLException{
		List<CpEmp2AllVO> list = new ArrayList<CpEmp2AllVO>();
		
		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		try {
		//1. ����̹� �ε�
		//2 Connection ���
			con= getConn();
		//3 ������ ������ü ���
//			String deleteCpEmp2 = "delete from cp_emp2 where empno=?";
//			pstmt=con.prepareStatement(deleteCpEmp2);
			String selectAllCpEmp2 = "select empno, ename, sal, to_char(hiredate,'yyyy-mm-dd') hiredate from cp_emp2 ";
		    pstmt=con.prepareStatement(selectAllCpEmp2);
		//4 ���ε� ������ �� �ֱ� //���⼱ �ʿ����
		//5 ������ ���� �� ��� ���
		    rs=pstmt.executeQuery(); //rs�� ������ �����ϰ� �� ����� Ŀ���� �������  ������ �ִ�.
		    
		    //��ȸ�� ����� VO�� �Ҵ�
		    CpEmp2AllVO cda_vo = null;
		    while(rs.next()) {
		    	cda_vo=new CpEmp2AllVO(rs.getInt("empno"), rs.getInt("sal"), rs.getString("ename"), rs.getString("hiredate"));
		    	list.add(cda_vo);	
		    }//end while
		    
		}finally {
		//6 ���� ����
			if(rs!=null) {rs.close();}; //end if
			if(pstmt!=null) {pstmt.close();}; //end if
			if(con!=null) {con.close();}; //end if
			
		}//end finally
		return list;
	}//selectAllCpEmp2
	
	
	/**
	 * �ԷµǴ� �����ȣ�� �ش��ϴ� ������� ��ȸ
	 * @param empno
	 * @return
	 * @throws SQLException
	 */
	public CpEmp2OneVO selectOneCpEmp2(int empno) throws SQLException{
		CpEmp2OneVO cevo = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//1. ����̹� �ε�
		
		//2. Connection ���
			con = getConn();
		//3. ������ ���� ��ü ���
			String selectOneCpEmp=" select ename, sal, hiredate from cp_emp2 where empno=?";
			pstmt=con.prepareStatement(selectOneCpEmp);
		//4. ���ε� ������ �� ����
			pstmt.setInt(1, empno);
		//5. ������ ���� �� ��� ���
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				cevo = new CpEmp2OneVO(rs.getInt("sal"), rs.getString("ename"), rs.getDate("hiredate"));
			}//end if
			
		}finally {
		//6. ���� ����
			if(rs!=null) {rs.close();}//end if
			if(pstmt!=null) {pstmt.close();} //end if
			if(con!=null) {con.close();}//end if
		}//end finally
		
		
		
		return cevo;
	}//selectOneCpEmp2
	
	 	
//	public static void main(String[] args) { //���ο��� �����׽�Ʈ
//		//ȭ��Ʈ �ڽ� �׽�Ʈ : �ڵ带 ���� �� ���α׷��� �� �����ϴ� �� ���� �� (�ڵ带 �� �� �˾ƾ���)
//		//�� �ڽ� �׽�Ʈ : üũ����Ʈ�� �־ ��/�ƴϿ��� üũ�ϴ� ��
//		
//		UsePreparedStatementDAO u = new UsePreparedStatementDAO();
////		CpEmp2VO c= new CpEmp2VO(1234,4000,"������");
//		try {
//			CpEmp2OneVO c = u.selectOneCpEmp2(7521);
//			System.out.println(c);
////			List<CpEmp2AllVO> list = u.selectAllCpEmp2();
////			System.out.println(list);//�̷����ϸ� ���� �ȳ����� ��ü�� �ּҰ� ���´�.
////			u.deleteCpEmp2(1234);
//		} catch (SQLException e) {
//			e.printStackTrace();}
//	}����  - �����׽�Ʈ
	
	
}//class




