package day0107;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HwAllTableEvt extends WindowAdapter implements ActionListener{
	private HwAllTable hat;
	
	public HwAllTableEvt( HwAllTable hat) {
		this.hat = hat;
	}//HwAllTableEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		hat.dispose();
	}//windowClosing
	
	public List<String> allTable() throws SQLException{
		List<String>list = new ArrayList<String>();
		//1.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		Connection con =null;
		Statement stmt = null;
		ResultSet rs =null;
		try {
		//2. Connection얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id= "scott";
			String pass = "tiger";
			con = DriverManager.getConnection(url, id, pass);
		//3.
			stmt= con.createStatement();
		//4.
			StringBuilder selectTable = new StringBuilder();
			String sql = "select tname from tab";
			
			rs=stmt.executeQuery(sql);
			
			String tl=null;
			while(rs.next()) {
				list.add(rs.getString("tname"));
				
			}//end while
	}finally {
		//5.연결 끊기
		if( rs!= null) {rs.close();}
		if( stmt!= null) {stmt.close();}
		if( con!= null) {con.close();}
		
	}//end finally
		return list;
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == hat.getJbtSelect()){
			try {
				List<String> result = allTable();
				for(int i= 0 ; i <=result.size()-1 ;  i++) {
					hat.getJcb().addItem(result.get(i));
					
					
				}//end for
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//actionPerformed
}
