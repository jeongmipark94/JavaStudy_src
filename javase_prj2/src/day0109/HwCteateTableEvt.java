package day0109;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class HwCteateTableEvt extends WindowAdapter implements ActionListener {

	private HwCreateTableView hctv;
	private StringBuilder sql;
	private boolean firstColFlag;

	public HwCteateTableEvt(HwCreateTableView hctv) {
		this.hctv = hctv;

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

		if(firstColFlag ) {
			sql.append(",\n");
		};
		String colName = hctv.getJtfCol().getText().trim();
		String colSize = hctv.getJtfSize().getText().trim();
		String constName = hctv.getJtfConst().getText().trim();
		String dataType = hctv.getJcbType().getSelectedItem().toString();
		String constraint = hctv.getJcbConst().getSelectedItem().toString();

		sql.append(colName).append(" ").append(dataType).append("(").append(colSize).append(")").append(" ")
				.append(constraint);// .append("Constraint").append(" ").append(constraint);
		firstColFlag=true;
//		if(hctv.getJtfCol()!=null &&hctv.getJtfSize()!=null&&hctv.getJtfConst()!=null
//				&&hctv.getJcbType().hasFocus()&&hctv.getJcbConst().hasFocus()) {

//		System.out.println(colName+colSize+constName+dataType+constraint);

	}// addDate

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
	}
}
