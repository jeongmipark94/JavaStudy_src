package day0102;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FourChatServerView extends JFrame {
	
	private JTextArea jtaChatDisplay1,jtaChatDisplay2,jtaChatDisplay3,jtaChatDisplay4;
	private JScrollPane jspChatDisplay1,jspChatDisplay2,jspChatDisplay3,jspChatDisplay4;
	private JButton jbStart, jbClose;
	private Panel Center, soso;
	
	public FourChatServerView() {
		super("채팅 서버");
		
		 Center = new Panel();
		 soso = new Panel();
		
		
		 jtaChatDisplay1 = new JTextArea();
		 jtaChatDisplay2 = new JTextArea();
		 jtaChatDisplay3 = new JTextArea();
		 jtaChatDisplay4 = new JTextArea();
		
		 jspChatDisplay1 = new JScrollPane(jtaChatDisplay1);
		 jspChatDisplay2 = new JScrollPane(jtaChatDisplay2);
		 jspChatDisplay3 = new JScrollPane(jtaChatDisplay3);
		 jspChatDisplay4 = new JScrollPane(jtaChatDisplay4);
		
		 jbStart = new JButton("시작");
		 jbClose= new JButton("종료");
		
		jspChatDisplay1.setBorder(new TitledBorder("1조"));
		jspChatDisplay2.setBorder(new TitledBorder("2조"));
		jspChatDisplay3.setBorder(new TitledBorder("3조"));
		jspChatDisplay4.setBorder(new TitledBorder("4조"));

		Center.setLayout(new GridLayout(2, 2));
		Center.add(jspChatDisplay1);
		Center.add(jspChatDisplay2);
		Center.add(jspChatDisplay3);
		Center.add(jspChatDisplay4);
		
		setLayout(new BorderLayout());
		
		
		soso.add(jbStart);
		soso.add(jbClose);
		
		add("Center", Center);
		add("South", soso);
		setBounds(100,100, 500,500);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FourChatServerEvt fcse = new FourChatServerEvt( this);
		jbStart.addActionListener(fcse);
		jbClose.addActionListener(fcse);
		addWindowListener(fcse);
		
		
		
		
	}//hwServer
	public static void main(String[] args) {
		new FourChatServerView();
	}

}
