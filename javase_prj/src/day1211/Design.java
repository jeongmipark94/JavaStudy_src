package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 * has a 관계의 이벤트 처리<br>
 * 디자인과 이벤트처리 코드를 분리하여 코드의 복잡도를 낮출 수 있다. 
 * @author owner
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class Design extends Frame {
	//2. 이벤트처리와 관련있는 Component를 선언
	private Button btn;
	
	public Design() {
		super("디자인");
		//3.컴포넌트를 생성
		btn = new Button("클릭");
		
		
		//4.배치
		Panel panel =new Panel();
		panel.add(btn);
		
		add("Center", panel);
		
		//5.이벤트 등록 (4와 5사이에서 해준다) //근데 아직 객체 가 안나와서 6번 부터해줌 
		//이벤트 처리 객체 생성하고 has a 관계.
		EventHandlingHasA ehha = new EventHandlingHasA(this);
		System.out.println("생성된 디자인 객체" + this);
		//컴포넌트에 이벤트를 등록
		btn.addActionListener( ehha );//버튼에서 이벤트가 발생하면 ehha객체의
		//Override된 method에서 이벤트를 처리
		
		
		//6.윈도우 크기 설정
		setBounds(100, 100, 400, 300);
		//7. 사용자에게 보여주기 
		setVisible(true);
		
		
		
	}//Design
	
	public Button getBtn() {
		return btn;
	}//getBtn
	
	
	public static void main(String[] args) {
		new Design();
		
	}//main

}//class
