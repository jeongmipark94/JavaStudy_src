package day1211;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdaper class가 사용되어야하는 이유
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("윈도우 이벤트 연습");

		setBounds(100, 100, 400, 400);
		setVisible(true);
		UseWindowEvent.WindowImpl wi = this.new WindowImpl();
		addWindowListener(wi);

		addWindowListener(wi);

	}// UseWindowEvent

	public static void main(String[] args) {
		new UseWindowEvent();

	}// main
//Window Listener interface를 구현한 class는 사용하지 않는 method일지라도
	// 모두 Override 해야한다.

	public class WindowImpl implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpended");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("WIndowClosing");
			dispose();

			// windowClosing에서 dispose()가 후출되면 그 때 윈도우 Closing이 호출된다.

		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("WIndowClosed");

		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("WIndowConified");

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified");

		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated");

		}
	}// inner class 종

}// class
