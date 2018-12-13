package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.TextArea;

import kr.co.sist.memo.evt.MemoHelpEvt;

@SuppressWarnings("serial")
public class MemoHelp extends Dialog{
	
	private MemoHelpEvt mhe;
	private TextArea taInfo;
	private Button btn1;


	public MemoHelp(JavaMemo jm) {
		super(jm, "����", true);
		
		taInfo = new TextArea("�޸��� ����\n"
				+ "�� �޸����� Java�� �����������\n"
				+ "������ �ڵ� ���� �� ������ �� �� �ֽ��ϴ�.\n"
				+ "��, �� �ڵ带 ����Ͽ� �������� ������\n"
				+ "�ҽ� ������ ��Ģ���� �Ѵ�.\n\n\n"
				+ "�ۼ��� : ������\n"
				+ "-version : 1.0");
		//�� ���ٲٰ�
		taInfo.setEditable(false);
		btn1 = new Button("Ȯ��");
		
		setLayout(null);
		taInfo.setBounds(50, 50, 400, 350);
		btn1.setBounds(220, 410, 50, 25);
		setBounds(200, 200, 500, 450);
		
		MemoHelpEvt mhe = new MemoHelpEvt(this);
		btn1.addActionListener(mhe);
		addWindowListener(mhe);
				
		
		add(taInfo);
		add(btn1);
		setResizable(false);
		setVisible(true);
		
		
		//�̺�Ʈ ���
//		MemoHelp mh = new MemoHelp();
		
		
		
	}//MemoHelp
	

}
