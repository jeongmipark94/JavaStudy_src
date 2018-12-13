package kr.co.sist.memo.evt;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import kr.co.sist.memo.view.MemoHelp;

public class MemoHelpEvt extends WindowAdapter implements ActionListener{
	private MemoHelp mh;
	public MemoHelpEvt(MemoHelp mh) {
		this.mh= mh;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		mh.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mh.dispose();
	}
}
