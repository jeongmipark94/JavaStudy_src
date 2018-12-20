package day1211;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdaper class가 사용되어야하는 이유
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent2 extends Frame {

	public UseWindowEvent2() {
		super("윈도우 이벤트 연습");

		setBounds(100, 100, 400, 400);
		setVisible(true);
		UseWindowEvent2.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);


	}// UseWindowEvent

	public static void main(String[] args) {
		new UseWindowEvent2();

	}// main
//WindowAdapter class를 상속받으면 필요한 method만 Override 하면된다.

	public class WindowImpl extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			dispose();
		}

	}// inner class 종

}// class
