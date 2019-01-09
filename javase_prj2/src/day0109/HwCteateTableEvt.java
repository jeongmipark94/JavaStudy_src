package day0109;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HwCteateTableEvt extends WindowAdapter implements ActionListener {

	private HwCreateTableView hctv;
	
	public HwCteateTableEvt(HwCreateTableView hctv) {
		this.hctv = hctv;
	}//HwCteateTableEvt
	
	public void addTable() {
	
		
		
		String tabName = hctv.getJtfTab().getText().toString().trim();
		String basicGram = "create table " + tabName+"(\n\n" + ");"; 
		if(hctv.getJtfTab()!=null) {
			
			
			
			hctv.getResult().setText(basicGram);
		}//end if
//		System.out.println(basicGram);
	}//addTable
	
	public void addData() {
		
		String colName= hctv.getJtfCol().getText().trim();
		String colSize = hctv.getJtfSize().getText().trim();
		String constName = hctv.getJtfConst().getText().trim();
		String dataType = hctv.getJcbType().getSelectedItem().toString();
		String constraint = hctv.getJcbConst().getSelectedItem().toString();
		
//		if(hctv.getJtfCol()!=null &&hctv.getJtfSize()!=null&&hctv.getJtfConst()!=null
//				&&hctv.getJcbType().hasFocus()&&hctv.getJcbConst().hasFocus()) {
			System.out.println(colName+colSize+constName+dataType+constraint);
			
			
		
	}//addDate
	

	@Override
	public void windowClosing(WindowEvent e) {
		hctv.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == hctv.getJbtAddTab()) {
			addTable();
		}
		
		if(	ae.getSource()== hctv.getJbtAddData()) {
			addData();
			}
		}
	}
