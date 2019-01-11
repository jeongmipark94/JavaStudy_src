package day0109;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import kr.co.sist.connection.GetConnection;

public class HwCteateTableEvt extends WindowAdapter implements ActionListener {

	private HwCreateTableView hctv;
	private StringBuilder sql;
	private boolean firstColFlag;
	private List<String> colNamelist;

	public HwCteateTableEvt(HwCreateTableView hctv) throws SQLException {
		this.hctv = hctv;

		colNamelist = new ArrayList<String>();

//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		String url="jdbc:oracle:thin:@:localhost:1521:orcl";
//		String id = "scott";
//		String pass = "tiger";
//		con=GetConnection.getInstance().getConn(url, id, pass);
//		//3.table이 존재하는지?
//		StringBuilder selectTname = new StringBuilder();
//		selectTname.append("select tname from tab where tname=?");
//		//4.
//		pstmt=con.prepareStatement(selectTname.toString());
//		pstmt.setString(1, x);
//		
//		//5.
//		
//		
//		rs=pstmt.executeQuery();
//		boolean flag = false;

	}// HwCteateTableEvt

	public void addTable() {

		String tableName = hctv.getJtfTab().getText().trim();

		if (tableName != null && !tableName.equals("")) {
			createStartQuery(tableName);
		} else {
			JOptionPane.showMessageDialog(hctv, "테이블명을 입력하세요");
			hctv.getJtfTab().requestFocus();
		}

//		
//		
//		String tabName = hctv.getJtfTab().getText().toString().trim();
//		String basicGram = "create table " + tabName+"(\n\n" + ");"; 
//		if(hctv.getJtfTab()!=null) {
//			
//			
//			
//			hctv.getResult().setText(basicGram);
//		}//end if
////		System.out.println(basicGram);
	}// addTable

	public void createStartQuery(String tableName) {
		sql = new StringBuilder();
		sql.append("create table ").append(tableName).append("(\n");
	}

	public void addData() {

		if (firstColFlag) {
			sql.append(",\n");
		}
		
		String colName = hctv.getJtfCol().getText().trim();
		String colSize = hctv.getJtfSize().getText().trim();
		String constName = hctv.getJtfConst().getText().trim();
		String dataType = hctv.getJcbType().getSelectedItem().toString();
		String constraint = hctv.getJcbConst().getSelectedItem().toString();
		// 여기서 비교
		for (int i = 0; i < colNamelist.size(); i++) {
			if (colName.equals(colNamelist.get(i) )){
				
				JOptionPane.showMessageDialog(hctv, "중복된 컬럼명입니다.");
				return;
			}
		}
		colNamelist.add(colName);
		sql.append(colName).append(" ").append(dataType).append("(").append(colSize).append(")").append(" ")
		.append(constraint);// .append("Constraint").append(" ").append(constraint);
		
		firstColFlag = true;
		// boolean형으로 flag만들어서 테이블 추가버튼이 눌려졌을 때 true가 되서 그게 true일 때만 실행되도록 한다.
//		if(hctv.getJtfCol()!=null &&hctv.getJtfSize()!=null&&hctv.getJtfConst()!=null
//				&&hctv.getJcbType().hasFocus()&&hctv.getJcbConst().hasFocus()) {

//		System.out.println(colName+colSize+constName+dataType+constraint);

	}// addDate

	public void createTable() {

	}// createTable

	@Override
	public void windowClosing(WindowEvent e) {
		hctv.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == hctv.getJbtAddTab()) {
			addTable();
			hctv.getResult().setText(sql.toString());
			hctv.getResult().append("\n);");
		}

		if (ae.getSource() == hctv.getJbtAddData()) {
			addData();
			hctv.getResult().setText(sql.toString());
			hctv.getResult().append("\n);");
		}

		if (ae.getSource() == hctv.getJbtCreate()) {
			createTable();
		}

	}
}
