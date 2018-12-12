package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class selfButton extends Frame implements ActionListener{
	public selfButton () {
		super("버튼 두 개");
		
		//이벤트 비교
		Button btn1 = new Button("A");
		Button btn2 = new Button("B");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		add("Center", btn1);
		add("South", btn2);
		
		setBounds(200, 200, 300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("ㅋㅋㅋ");
		System.out.println("^o^");

		
	}
	public static void main(String[] args) {
		new selfButton();
	}//main

}//class
