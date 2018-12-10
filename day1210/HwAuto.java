package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HwAuto extends Frame {
	public HwAuto() {
		super("�ڵ���ġ");
		
		//2. �Ϲ� ������Ʈ ����
		Label lblNorth =new Label("                                                   �� �� �� ��");
		Label lblName = new Label("�̸�");
		Label lblAge = new Label("����");
		Label lblTel = new Label("��ȭ��ȣ");
		Label lblgen = new Label("����");
		Button btn1	 = new Button("�߰�");
		Button btn2	 = new Button("����");
		Button btn3	 = new Button("����");
		Button btn4	 = new Button("����");
		TextField input1 = new TextField();
		TextField input2 = new TextField();
		TextField input3 = new TextField();
		TextArea txa = new TextArea();
		
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("��", false, cg);
		Checkbox rb2 = new Checkbox("��", false, cg);
		
		Panel panelCenter = new Panel();
		Panel panelCenterL = new Panel();
		Panel panelCenterS = new Panel();
		Panel panelSouth = new Panel();
		
		//center �г� 
		panelCenter.add(panelCenterL);
		panelCenter.add(txa);
		
		
		//L�гο� �� �־���
		panelCenterL.add(lblName);
		panelCenterL.add(input1);
		panelCenterL.add(lblAge);
		panelCenterL.add(input2);
		panelCenterL.add(lblTel);
		panelCenterL.add(input3);
		panelCenterL.add(lblgen);
		panelCenterL.add(panelCenterS);
		
		//s�гο� �� �־���
		panelCenterS.add(rb1);
		panelCenterS.add(rb2);
		
		//south�г� �� �־���
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		panelSouth.add(btn4);
		
		//3.
		panelCenter.setLayout(new GridLayout(1, 2));
		panelCenterL.setLayout(new GridLayout(4, 2));
		setLayout(new BorderLayout());
		
		//4. ��ġ ������
		add("North", lblNorth);
		add("Center", panelCenter);
		add("South", panelSouth);
		
		//5.
		setSize(400, 400);
		
		//6
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//WindowClosing
		});
		
	}

	public static void main(String[] args) {
		new HwAuto();
	}//main

}//class
