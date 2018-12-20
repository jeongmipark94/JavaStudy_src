package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;
import kr.co.sist.memo.view.MemoHelp;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private  JavaMemo jm;
	
	public JavaMemoEvt(JavaMemo jm) {
		this.jm =jm;
	}//JavaMemoEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�޴� �������̺�Ʈ ���
//		miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiNew() ) {
			newMemo();
		}//end if
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiOpen() )  {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(jm, "������ ������ ���� �� �����ϴ�.",
						"���Ͽ��� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "������ ������ �о���̴� �� ������ �߻�",
						"���Ͽ��� ����", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}//end if
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiSave() )  {
			saveMemo();
		}//end if
		//�ٸ� �̸����� ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiNewSave() )  {
			newSaveMemo();
		}//end if
		//miEnd, miFormat, miHelp;
		//���� �޴������ۿ��� �̺�Ʈ�� �߻��ߤ��� ��
		if( ae.getSource()== jm.getMiEnd() )  {
			jm.dispose();
		}//end if
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiFormat() )  {
			formatDialog();
		}//end if
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if( ae.getSource()== jm.getMiHelp() )  {
			helpDialog();
		}//end if
		
		
	}//actionPerformed
	
	/**
	 * ���� :TextArea�� �ʱ�ȭ�Ѵ�.
	 */
	public void newMemo() {
		jm.getTaNote().getText();
		jm.getTaNote().setText("");
		
		jm.setTitle("�޸��� - ����");
	}//newMemo
	
	/**
	 * txt���� ���� 
	 */
	public void openMemo() throws FileNotFoundException, IOException {
		FileDialog fdOpen = new FileDialog(jm, "��������", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String filePath =fdOpen.getDirectory();
		String fileName = fdOpen.getFile();
		
		if(filePath != null) {//������ ������ ����
			//////////////////////////12-20-2018 ��Ʈ������ ������ ������ �д� �ڵ� �߰� ����///////////////////
			//������ ���Ϸ� ���ϰ�ü ����
			File file = new File(filePath + fileName);
			//16bit stream���
			BufferedReader br = null;
			StringBuilder tempData = new StringBuilder();
			
			try {
				br = new BufferedReader(new FileReader(file));
				String temp ="";
				//T.A�� �ʱ�ȭ����
				while((temp =br.readLine())!= null) {
					//���Ͽ��� �о���� ������ �����Ѵ�.
				}//end while
				
			}finally {
				if( br != null) { br.close();  }//end if
			}//end finally
			
			
			
			
			// ���� : �ƾƾƾƾ�
			// �ۼ� : ��
			//////////////////////////12-20-2018 ��Ʈ������ ������ ������ �д��ڵ� �߰� ��///////////////////
			//������ ��ο� �̸��� Frame�� TitleBar�� ����
			jm.setTitle("�޸��� - ���� "+filePath+fileName);
		}//end if
		
	}//openMemo

	/**
	 * �ۼ��� �޸� ���� - ������ ���ϸ��� �״�� �����ϴ� ���ϸ��� �ݿ�
	 */
	public void saveMemo() {
		newSaveMemo();
	}//saveMemo
	
	/**
	 * ���ϸ��� �Է¹޾� ���̸����� ����
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "��������", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String filePath =fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if(filePath != null) {//������ ������ ����
			//������ ��ο� �̸��� Frame�� TitleBar�� ����
			jm.setTitle("�޸��� - ���� "+filePath+fileName);
		}//end if
		
	}//newSaveMemo
	
	/**
	 * �۲��� �����ϴ� ���̾�α׸� �����ϴ� ��
	 */
	public void formatDialog() {
		new MemoFormat(jm);
	}//formatDialog
	
	/**
	 *  �޸��� ������ �����ϴ� ���̾�α׸� ����
	 */
	public void helpDialog() {
		new MemoHelp(jm);
	}//helpDialog
	
}//class