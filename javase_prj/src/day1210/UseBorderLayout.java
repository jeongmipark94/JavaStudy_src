package day1210;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 일반컴포넌트와 LayoutManager의 사용.
 * @author owner
 */
	//Window Component를 상속받아야함.(사용자에게 보여지는 일)

@SuppressWarnings("serial")
public class UseBorderLayout extends Frame { // 상속을 하면 부모가 먼저 생성(자바의 모든 클래스의 부모는 object)
	
	public UseBorderLayout() {
		super("BorderLayout 연습"); //부모의 기본 생성자를 호출해줌. ()안에 뭐 쓰면 부모의 매개변수 받는 생성자를 호출
		
		//2. 사용할 일반 컴포넌트를 생성
		TextField tfNorth = new TextField("North"); //한줄의 입력을 받을 수 있는 컴포넌트가 생겨남
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");//여러줄 텍스트 입력가능
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		//3. 배치관리자 설정 : Window Component인 Frame, Dialog는 
		//BorderLayout이 기본 설정되어있다.
		setLayout(new BorderLayout());
		
		//4. 컴포넌트의 배치관리자를 사용하여 배치 
		//add를 이용한다. 여러개있음. 
		//add("배치위치",컴포넌트);         add(상수, 컴포넌트);
		//문자열 상수를 사용하여 배치 "North""Center"
		add("North", tfNorth);
		add("Center", taCenter); 
//		Center만 배치하면 테두리인 North, West, South, East 자리가 사라진다.
		
		//Constant(Field)를 사용하여 배치
		add(BorderLayout.WEST, lblWest);
		add(BorderLayout.EAST, lblEast);
		add(BorderLayout.SOUTH, choSouth);
		
		
		
		//5. 윈도우의 크기 설정
		setSize(400, 400);
		//6. 사용자에게 보여주기
		setVisible(true);
		//종료 (종료라는 동작은 한번만 일어난다.)
		addWindowListener(new WindowAdapter() {//윈도우어댑터는 추상클래스, 객체화가 안됨 어나니머스 이너 클래스
			@Override
			public void windowClosing(WindowEvent we) {
			dispose();
		}//WIndowClosing
		}/*여기서 anonymous inner class종료*/);
		
		
		
	}//UseBorderLayout

	public static void main(String[] args) {
			new UseBorderLayout();
	}//main

}//class
