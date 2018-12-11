package day1211;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.security.auth.callback.ChoiceCallback;

@SuppressWarnings("serial")
public class HwEvent extends Frame implements ItemListener {
	private Choice cho;
	private Label lbl;

	public HwEvent() {

		String[] str= {"색선택","검은색","파란색","빨간색","녹색","심홍색"};
		cho = new Choice();
		for(int i=0; i<str.length; i++) {
			cho.add(str[i]);
		}
//		cho.add("색선택");
//		cho.add("검은색");
//		cho.add("파란색");
//		cho.add("빨간색");
//		cho.add("녹색");
//		cho.add("심홍색");
//		list = new List();
//		list.add("검은색");
//		list.add("파란색");
//		list.add("빨간색");
//		list.add("녹    색");
//		list.add("심홍색");

		 lbl = new Label("오늘은 화요일");
//		lbl.setForeground(Color.black);
//		lbl.setForeground(Color.blue);
//		lbl.setForeground(Color.red);
//		lbl.setForeground(Color.green);
//		lbl.setForeground(Color.magenta);

		//
		setLayout(new BorderLayout());
		setBounds(300, 300, 400, 400);

		cho.addItemListener(this);

		add("West", lbl);
		add("East", cho);

		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}// windowClosing
		});

	}

	public static void main(String[] args) {
		new HwEvent();
	}// main

	@Override
	public void itemStateChanged(ItemEvent e) {
		String pick = cho.getSelectedItem();
		Color c;

		switch(pick) {
		case "파란색" : c=Color.blue; 		break;
		case "빨간색" : c=Color.red; 		break;
		case "녹색" : c=Color.green; 		break;
		case "심홍색" : c=Color.magenta; 	break;	
		default : c=Color.black; 
		}
		 lbl.setForeground(c);
//		String color = pick[0];
//		System.out.println(color);
	}// itemChanged

}// class
