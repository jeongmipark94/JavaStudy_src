package day1217;

import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import day1128.Main;

public class HwMenu extends JFrame  {
	public HwMenu() {
		super("12-17 ����");
		
		JTextArea jta =new JTextArea(); //
		String anw = JOptionPane.showInputDialog("�޴����� \n "
				+ "1. �Է�        2.���        3.����");
		
		
		
//		//1. ������ ���� 
//		String[] columnNames = {"��ȣ","�̸�","�ڹ�","����Ŭ","����","���"};
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
		 	String data = JOptionPane.showInputDialog("������ �Է� \n ��) �̸�, �ڹ�����, ����Ŭ����");
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
