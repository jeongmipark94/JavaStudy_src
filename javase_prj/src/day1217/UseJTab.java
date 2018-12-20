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
		//1. ���� �߰��� �� �ִ� ��ü ����.
		 jtp = new JTabbedPane();
		
		//2.�� �ǿ� �� ������Ʈ�� ����
		//ó�� �ǿ� �� ������Ʈ
		ImageIcon ii= new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/ĸó.JPG");
		JLabel jl = new JLabel(ii);
		ImageIcon ii2= new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/ĸó2.JPG");
		JLabel jl2= new JLabel(ii2);
		
		//�ι�° �ǿ� �� ������Ʈ
		JPanel jp = new JPanel();
		jp.add(new JLabel("�̸�"));
		jp.add(new JTextField(30));
		jp.add(new JButton("�Է�"));

		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("�Էµ�����"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("���â"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		JPanel jps = new JPanel();
		
		jtp.add("ó����", jl);
		jtp.add("�ι�° ��", tab2);
		jtp.add("����° ��", new JButton("Ŭ��"));
		jtp.add("�׹�° ��",  jl2);
		
		
		//��ġ
		add("Center", jtp);
		
		UseJTab.TabEvt  te= this.new TabEvt();
		jtp.addMouseListener(te);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseJTab
	
	//�׹�° ��
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
