package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class EventFriend extends Frame {
	public EventFriend() {
		super("模备包府");
		
		Label lbl1 = new Label("模备 格废");
		Label lbl2 = new Label("瞒窜等 模备");
		
		List list1 = new List();
		List list2 = new List();
		list1.add("捞犁蛮");
		list1.add("捞犁泅");
		list1.add("沥琶己");
		
		Button btn1 = new Button(">>");
		Button btn2 = new Button("<<");
		
		
		
		setLayout(null);
		lbl1.setBounds(80, 100, 150, 50);
		lbl2.setBounds(355, 100, 150, 50);
		list1.setBounds(30, 150, 150, 200);
		list2.setBounds(320, 150, 150, 200);
		btn1.setBounds(225, 200, 50, 30);
		btn2.setBounds(225, 250, 50, 30);
		
		
		
		
		add(lbl1);
		add(lbl2);
		add(list1);
		add(list2);
		add(btn1);
		add(btn2);
		
		setBounds(200, 200, 500, 400);
		setResizable(false);
		
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		
	}

	public static void main(String[] args) {
		new EventFriend();
	}//main

}//class
