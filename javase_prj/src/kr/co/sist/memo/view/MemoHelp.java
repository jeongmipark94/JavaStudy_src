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
		super(jm, "도움말", true);
		
		taInfo = new TextArea("메모장 정보\n"
				+ "이 메모장은 Java로 만들어졌으며\n"
				+ "누구나 코드 수정 및 배포를 할 수 있습니다.\n"
				+ "단, 이 코드를 사용하여 개선했을 때에는\n"
				+ "소스 공개를 원칙으로 한다.\n\n\n"
				+ "작성자 : 박정미\n"
				+ "-version : 1.0");
		//값 못바꾸게
		taInfo.setEditable(false);
		btn1 = new Button("확인");
		
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
		
		
		//이벤트 등록
//		MemoHelp mh = new MemoHelp();
		
		
		
	}//MemoHelp
	

}
