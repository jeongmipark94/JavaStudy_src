package day0108;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;
import javax.swing.JComboBox;

import kr.co.sist.connection.GetConnection;

public class HwTableSelectEvt extends WindowAdapter implements ActionListener {

	private HwTableSelect hts;

	public HwTableSelectEvt(HwTableSelect hts) {
		this.hts = hts;
//      try {
//         this.Table("t");
//      } catch (SQLException e) {
//         e.printStackTrace();
//      }

	}

	@Override
	public void windowClosing(WindowEvent e) {
		hts.dispose();
	}

	public String Table(String id) throws SQLException {
		String tname = "";
		// 1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 2. Connection 얻기
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbo_id = "scott";
		String dbo_pass = "tiger";
		con = DriverManager.getConnection(url, dbo_id, dbo_pass);// ??

		try {
			// 3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
			// 4. 쿼리문 수행 후 결과 얻기
			StringBuilder selectTname = new StringBuilder();
			selectTname.append(" select tname ").append(" from tab ");

			rs = stmt.executeQuery(selectTname.toString());

			List<String> list = new ArrayList<String>();
			while (rs.next()) {
				hts.getJcbTS().addItem(rs.getString("TNAME"));
			}
		} finally {
			// 5. 연결 끊기
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return tname;
	}

	/*public void searchInfo(String tableName) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		// 2
		GetConnection gc = GetConnection.getInstance();
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		con = gc.getConn(url, id, pass);
		// 3
		String selectInfo = "select * from 'tableName'";
		pstmt = con.prepareStatement(selectInfo);

		// 4
		// 5
		rs = pstmt.executeQuery();
		rsmd = rs.getMetaData();
		int cnt = rsmd.getColumnCount();

		String[] rowData = null;

		for (int i = 1; i < cnt + 1; i++) {
			rowData = new String[3];// 일단 3으로 만듬
			rowData[0] =  String columnName =  rsmd.getColumnLabel(i);
			rowData[1] =  String columnType =  rsmd.getColumnTypeName(i);
			rowData[2] =  int columnPricision =  Integer.toString((rsmd.getPrecision(i)));
//	   String columnConst =rsmd.get??????????????????

		} // end for

//	   public void

	}*/
	
	public void getRecord(String tableName) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		GetConnection gc = GetConnection.getInstance();//1,2번 안해도됨
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		
		try {
			
			con=gc.getConn(url, id, pass);
			
			String sql="SELECT utc.column_name, utc.data_type,NVL(utc.data_precision,0) data_precision, NVL(ucc.constraint_name,'') constraint_name " + 
					"FROM user_tab_cols utc, user_cons_columns ucc " + 
					"WHERE (utc.table_name=?) " + 
					"	AND (utc.table_name=ucc.table_name(+)) " + 
					"	AND (utc.column_name=ucc.column_name(+))";
			//3
			pstmt= con.prepareStatement(sql);
			//4
			pstmt.setString(1, tableName);
			//5
			rs = pstmt.executeQuery();
			
			//dtm 초기화
			hts.getDtmInfo().setRowCount(0);
			
			String[] rowData = new String[4];
			while(rs.next()) {
				rowData[0] =rs.getString("COLUMN_NAME");
				rowData[1] = rs.getString(2); //rsmd는 컬럼명 string말고 숫자int로 해도됨
				rowData[2] = rs.getString(3);//DATA_PRECISION 으로해도됨
				rowData[3] = rs.getString("CONSTRAINT_NAME");
				hts.getDtmInfo().addRow(rowData);
			}//end while
			
			
		} finally {
			if(rs!= null) {rs.close(); }
			if(pstmt!= null) {pstmt.close(); }
			if(con!= null) {con.close(); }
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String tableName = hts.getJcbTS().getSelectedItem().toString();
		try {
			getRecord(tableName);
//			searchInfo(tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
