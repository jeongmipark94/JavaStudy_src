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

		String[] str= {"������","������","�Ķ���","������","���","��ȫ��"};
		cho = new Choice();
		for(int i=0; i<str.length; i++) {
			cho.add(str[i]);
		}
//		cho.add("������");
//		cho.add("������");
//		cho.add("�Ķ���");
//		cho.add("������");
//		cho.add("���");
//		cho.add("��ȫ��");
//		list = new List();
//		list.add("������");
//		list.add("�Ķ���");
//		list.add("������");
//		list.add("��    ��");
//		list.add("��ȫ��");

		 lbl = new Label("������ ȭ����");
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
		case "�Ķ���" : c=Color.blue; 		break;
		case "������" : c=Color.red; 		break;
		case "���" : c=Color.green; 		break;
		case "��ȫ��" : c=Color.magenta; 	break;	
		default : c=Color.black; 
		}
		 lbl.setForeground(c);
//		String color = pick[0];
//		System.out.println(color);
	}// itemChanged

}// class
