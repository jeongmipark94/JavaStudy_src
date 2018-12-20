package day1217;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJTab extends JFrame {
	
	private JTabbedPane jtp;
	private UseJTab ujt;
	
	public UseJTab() {
		super("Tab");
		ujt = this;
		//1. 탭을 추가할 수 있는 객체 생성.
		 jtp = new JTabbedPane();
		
		//2.각 탭에 들어갈 컴포넌트를 생성
		//처음 탭에 들어갈 컴포넌트
		ImageIcon ii= new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/캡처.JPG");
		JLabel jl = new JLabel(ii);
		ImageIcon ii2= new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/캡처2.JPG");
		JLabel jl2= new JLabel(ii2);
		
		//두번째 탭에 들어갈 컴포넌트
		JPanel jp = new JPanel();
		jp.add(new JLabel("이름"));
		jp.add(new JTextField(30));
		jp.add(new JButton("입력"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("입력데이터"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("결과창"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		JPanel jps = new JPanel();
		
		jtp.add("처음탭", jl);
		jtp.add("두번째 탭", tab2);
		jtp.add("세번째 탭", new JButton("클릭"));
		jtp.add("네번째 탭",  jl2);
		
		
		//배치
		add("Center", jtp);
		
		UseJTab.TabEvt  te= this.new TabEvt();
		jtp.addMouseListener(te);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseJTab
	
	//네번째 탭
	////////////////////////////////
	public class TabEvt extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(jtp);
			
			if(jtp.getSelectedIndex() ==3) {
				String pw=	JOptionPane.showInputDialog(ujt,"password");
				if(pw != null && !pw.equals("123")) {

					jtp.setSelectedIndex(0);
				}//end if
			}//end if
			
		}
	}//class
	
	public static void main(String[] args) {
		new UseJTab();
	}//main
}//class
