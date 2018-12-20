package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ActionEvent를 사용한 Is a 관계로 이벤트를 처리하는 방법<br>
 * 디자인과 이벤트 처리를 하나의 클래스안에서 처리한다. 
 * (값에 대한 사용이 편하다.)
 * @author owner
 */
//1. 상속으로 Frame을 처리하고, 구현으로 이벤트 처리객체를 처리한다.
@SuppressWarnings("serial")
public class EventHandlingIsA extends Frame implements ActionListener {
	
	//2.이벤트 처리에 관련이있는 컴포넌트를 선언
	//클래스 안쪽영역을 묻는 용어 : 필드 //필드에 만드는 변수 : 인스턴스 변수 ( 해당 클래스가 객체로 올라가면 heap에올라가는 변수, 객체 외부에서 접근 가능
	//디폴트가 붙어있는 경우 내 패키지 안에서 버튼 접근 가능// 프라이빗은 외부에서 접근 불가 - 필요할 경우 getter로 사용)
	private Button btn;
	
	
	
	public EventHandlingIsA() {
		super(" Is a 관계로 이벤트 처리하는 방법"); //awt든 swing이든 다 이걸로 이용함.
		//3. 컴포넌트 생성
		btn = new Button("클릭");		
		//4.생성된 컴포넌트가 이벤트를 발생시킬 수 있도록 이벤트에 등록시키기
		btn.addActionListener(this); //Arguments로 입력된 객체의 Override된 method가 호출된다.
		Panel panel = new Panel();
		panel.add(btn);
		
		//5.생성된 컴포넌트를 배치
		add("Center",panel);
		
		//6.윈도우 컴포넌트에 크기 설정
		setBounds(100, 100, 300, 300);
		//7.사용자에게 보여주기
		setVisible(true);
		//
		
		
		
	}//EventHandlingIsA
	
	@Override //추상메서드를 오버라이딩해서 구현해줘야 에러가 사라진다.
	public void actionPerformed(ActionEvent ae) {
		System.out.println("버튼 클릭되었습니다!!!");
		dispose();
		
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new EventHandlingIsA();
	}//main

}//class
