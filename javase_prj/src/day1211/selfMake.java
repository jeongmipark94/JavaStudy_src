package day1211;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class selfMake extends Frame {

	public selfMake() {
		super("self");
		
		
		//2.
		List list1 = new List();
		list1.add("이재찬/27");
		list1.add("정택성/26");
		list1.add("공선의/27");
		
		Label lbl1 = new Label("이름 :             나이:");
//		Label lbl2 = new Label("나이 :");
		
//		TextField tf1 = new TextField();
//		TextField tf2 = new TextField();
		
//		Panel panel = new Panel();
//		
//		panel.add(lbl1);
//		panel.add(tf1);
//		panel.add(lbl2);
//		panel.add(tf2);
		
		
		//3
		setLayout(new BorderLayout());
		
		//4. 
		add("Center", list1);
		add("South", lbl1);
		
		//5.
		setLocation(400, 200);
		setSize(300, 300);
		//6
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
	}

	public static void main(String[] args) {
		new selfMake();

	}//main

}//class
