package day0109;

import java.beans.PropertyEditorSupport;
import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import kr.co.sist.connection.GetConnection;

/**
 * DDL (Data Definition Language) : create, drop, truncate 을 사용하여 
 * 테이블을 생성.
 * @author owner
 */
public class CreateTable {

	public CreateTable() throws SQLException{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//1
		//2
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass= "tiger";
			con= GetConnection.getInstance().getConn(url, id, pass);
			String tableName=JOptionPane.showInputDialog("생성할 테이블명을 입력해주세요");
			
		//3. 테이블이 존재하는 지?
			StringBuilder selectTname = new StringBuilder();
			selectTname.append("select tname from tab where tname=?"); //upper(?)도 가능
		//4.
			pstmt=con.prepareStatement(selectTname.toString());
			pstmt.setString(1, tableName.toUpperCase());
		//5.	
			
			rs=pstmt.executeQuery();
			boolean flag = false;
			if(rs.next()) {
				flag = JOptionPane.showConfirmDialog(null,
							tableName+" 테이블이 존재합니다. 삭제한 후 생성하시겠습니까?") // 여기서 "네"를 누르면 1이 반환
							==JOptionPane.OK_OPTION; //반환값이 1이됨           1=1 이되니까 true가 반환
			}//end if
			
			pstmt.close();
			
			if(flag) {//삭제 한 후 테이블 생성
				//3.
				StringBuilder dropTable = new StringBuilder();
				dropTable.append("drop table ").append(tableName);
				pstmt=con.prepareStatement(dropTable.toString()); //StringBuilder 이기 때문에 string으로 바꿔준다.
				//4.
				pstmt.execute();
				
				pstmt.close();
			}//end if
			
		//3
			StringBuilder createTable = new StringBuilder();
			
			createTable
			.append(" create table ").append( tableName).append("(")
			.append(" name varchar2(12) not null, ")
			.append(" age number(3) not null, ")
			.append(" id varchar2(20) constraint pk_").append( tableName).append(" primary key)");
			
			pstmt=con.prepareStatement( createTable.toString() );
		//4
		//5
//			boolean flag = pstmt.execute();
			pstmt.execute();
			JOptionPane.showMessageDialog(null,  "테이블이 생성되었습니다.");
			
		}finally {
		//6
			if(rs!=null) {rs.close();}//end if
			if(pstmt!=null) {pstmt.close();}//end if
			if(con!=null) {con.close();}//end if
		}//end finally
			
	}//CreateTable
	
	public static void main(String[] args) {

		try {
			new CreateTable();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "테이블이 이미 존재합니다.");
			e.printStackTrace();
		}//catch
	}//main

}//class
