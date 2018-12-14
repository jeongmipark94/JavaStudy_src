package day1213;

import java.awt.Button;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 	Frame클래스에서 Dialog 클래스를 has a로 사용
 * @author owner
 */
@SuppressWarnings("serial")
public class UseDialogHasA extends Frame implements ActionListener {//dialog를 객체화해서 사용

	private Button btn1 /*Frame에 배치 */, btn2 /* Dialog*/;
	private Dialog d;
	
	public UseDialogHasA() {
		super("다이얼로그 사용");
		
		
		btn1 = new Button("다이얼로그 사용");
			Panel panel = new Panel();
			panel.add(btn1);
			
			add("Center", panel);

			btn1.addActionListener(this);
			setBounds(100, 100, 300, 400);
			setVisible(true);
			
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
						dispose();
				}
			});
			
			
	}//UseDialogHasA
	 
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			createDialog();			
		}//end if
		
		if(ae.getSource()==btn2) {
			d.dispose();
		}//end if
		
		
	}//actionPerformed

	public void createDialog() {
		//1. 생성 
		d = new Dialog(this,"다이얼로그", false); //true = modal , false - 비 modal
		//2. Dialog에 배치될 컴포넌트 생성
		Label lbl = new Label("오늘은 눈오는 목요일 입니다. (^.~)");
		btn2=new Button("닫기");
		
		d.add("Center", lbl);
		d.add("South", btn2);
		
		btn2.addActionListener(this);
		
		
		
		d.setBounds(200, 200, 300, 300);
		
		//2. 크기 설정
		d.setBounds(200, 200, 300, 300);
		d.addWindowListener(new WindowAdapter() {			
			@Override
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});//다이얼로그 닫는것은 가시화 전에 있어야함
		//가시화
		d.setVisible(true);
		
		
	}//createDialog
	
	public static void main(String[] args) {
			new UseDialogHasA();
			

	}//main

}//class
