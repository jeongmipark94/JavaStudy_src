package day1210;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HwCustom extends Frame {
	public HwCustom() {
		super("수동배치");
		
		//2. 
		Label lbl1 = new Label("글꼴");
//		lbl1.setBackground(Color.black);
		Label lbl2 = new Label("글꼴스타일");
		Label lbl3 = new Label("크기");
		Label lbl4 = new Label("보기");
	
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField("AaBbYyZz");
		tf4.setFont(new Font(Font.DIALOG, Font.BOLD, 24));
		
		List list1= new List();
		list1.add("Dialog");
		list1.add("Serif");
		list1.add("SansSerif");
		list1.add("Monospaced");
		list1.add("DialogInput");
		
		List list2 = new List();
		list2.add("일반");
		list2.add("굵게");
		list2.add("기울임꼴");
		list2.add("굵게 기울임꼴");
		
		List list3 = new List();
		for(int i =2; i<=10; i+=2) {
			list3.add(Integer.toString(i));
		}
		for(int i =11 ; i<=89; i++) {
			list3.add(Integer.toString(i));
		}
		
		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");
		
		//배치관리자 해제
		setLayout(null);
		
		//3.배치
		lbl1.setBounds(50, 50, 30,30);
		lbl2.setBounds(200, 50, 70,30);
		lbl3.setBounds(350, 50, 50,30);
		lbl4.setBounds(200, 220, 30,30);
		
		tf1.setBounds(50, 85, 100,20);
		tf2.setBounds(200, 85, 100, 20);
		tf3.setBounds(350, 80, 100, 20);
		tf4.setBounds(200, 250, 130, 50);
		
		list1.setBounds(50, 110, 100, 90);
		list2.setBounds(200, 110, 100, 90);
		list3.setBounds(350, 110 , 100 ,90);
		
		btn1.setBounds(300, 310, 40, 30);
		btn2.setBounds(350, 310, 40, 30);
		
		//frame에 배치
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(list1);
		add(list2);
		add(list3);
		add(btn1);
		add(btn2);
		
		
		//4.5
		setBounds(200, 100, 500	, 400);
		setResizable(false);
		
		//6.
		setVisible(true);
		//7.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
		
		
	}

	public static void main(String[] args) {
		new HwCustom();
	}//main

}//class
