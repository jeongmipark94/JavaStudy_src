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
		super("자동배치");
		
		//2. 일반 컴포넌트 생성
		Label lblNorth =new Label("                                                   학 생 관 리");
		Label lblName = new Label("이름");
		Label lblAge = new Label("나이");
		Label lblTel = new Label("전화번호");
		Label lblgen = new Label("성별");
		Button btn1	 = new Button("추가");
		Button btn2	 = new Button("변경");
		Button btn3	 = new Button("삭제");
		Button btn4	 = new Button("종료");
		TextField input1 = new TextField();
		TextField input2 = new TextField();
		TextField input3 = new TextField();
		TextArea txa = new TextArea();
		
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox rb1 = new Checkbox("남", false, cg);
		Checkbox rb2 = new Checkbox("여", false, cg);
		
		Panel panelCenter = new Panel();
		Panel panelCenterL = new Panel();
		Panel panelCenterS = new Panel();
		Panel panelSouth = new Panel();
		
		//center 패널 
		panelCenter.add(panelCenterL);
		panelCenter.add(txa);
		
		
		//L패널에 값 넣어줌
		panelCenterL.add(lblName);
		panelCenterL.add(input1);
		panelCenterL.add(lblAge);
		panelCenterL.add(input2);
		panelCenterL.add(lblTel);
		panelCenterL.add(input3);
		panelCenterL.add(lblgen);
		panelCenterL.add(panelCenterS);
		
		//s패널에 값 넣어줌
		panelCenterS.add(rb1);
		panelCenterS.add(rb2);
		
		//south패널 값 넣어줌
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		panelSouth.add(btn4);
		
		//3.
		panelCenter.setLayout(new GridLayout(1, 2));
		panelCenterL.setLayout(new GridLayout(4, 2));
		setLayout(new BorderLayout());
		
		//4. 배치 관리자
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
