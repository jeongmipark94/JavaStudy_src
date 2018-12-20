package day1217;

import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import day1128.Main;

public class HwMenu extends JFrame  {
	public HwMenu() {
		super("12-17 숙제");
		
		JTextArea jta =new JTextArea(); //
		String anw = JOptionPane.showInputDialog("메뉴선택 \n "
				+ "1. 입력        2.출력        3.종료");
		
		
		
//		//1. 데이터 관리 
//		String[] columnNames = {"번호","이름","자바","오라클","총점","평균"};
//		String[][] rowData ;
//		dtm = new DefaultTableModel(rowData, columnNames) {
//			
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				return false;
//			}
//		};
			
	}//HwMenu

	@Override
	public void actionPerformed(ActionEvent ae) {
		int ans =(int)ae.getSource();
	 switch(ans) {
	 case 1:
		 	String data = JOptionPane.showInputDialog("데이터 입력 \n 예) 이름, 자바점수, 오라클점수");
		 break;
	 case 2:
		 break;
	 case 3:
	    dispose();
	     
	 }//end switch
	
	}//actionPerformed
	public static void main(String[] args) {
		new HwMenu();
	}//main
}//class
