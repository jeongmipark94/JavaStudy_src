package day0111;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BtnMsg extends JFrame implements ActionListener {

	private JButton[] jbtNames;
	private String[] names;
	private String[] msg;
	
	public BtnMsg() {
		super("�̸��� Ŭ�����ּ���");

		names=new String[] {"������","�ڿ���","������","����ö","������","������",
				"������","������","�����","������"};
		msg=new String[] {"������ ���","�����غ�����","����ǿ췯����!","��������ʹ�","�����̰����ƿ�*^-^*","�����ϰ�ʹ�",
				"��!���� ĳ���Ҳ���","�����ϰ�ʹ�","���ɸ���������","�ָ��� �����ϼ���."};
		
		jbtNames= new JButton[10];
		
		setLayout(new GridLayout(5, 2));
		for(int i =0; i< jbtNames.length ; i++) {
			jbtNames[i] = new JButton(names[i]);//����
			jbtNames[i].addActionListener(this);//�̺�Ʈ ���
			add(jbtNames[i]);//��ġ
		}//end for
		
		
		for(int i =0; i<jbtNames.length ; i++) {
			add(jbtNames[i]);
		}//end for
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//BtnMsg
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		for(int i =0; i<jbtNames.length ; i++) {
			if(ae.getSource() == jbtNames[i]) {
				
				JOptionPane.showMessageDialog(this, msg[i]);
				break;
			}//end if
		}//end if

	}//actionPerformed

	public static void main(String[] args) {
		new BtnMsg();
	}//main

}//class
