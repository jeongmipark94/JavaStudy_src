package day1221;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener, Runnable {
	private JButton jb;
	private JProgressBar jpb;
	private long fileLen;
	private int cnt;

	public FileCopy() {
		super("���Ϻ���");
		jb = new JButton("���ϼ���");
		jpb = new JProgressBar(0, 100);
		jpb.setString("��ô��");
		jpb.setValue(50);

		JPanel jp = new JPanel();
		jp.add(jb);

		add("Center", jp);
		add("South", jpb);

		jb.addActionListener(this);
		setBounds(100, 100, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// FileCopy

	@Override
	public void run() {
		for(int i=0; i<= fileLen; ) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end catch
			jpb.setValue(	(int) (cnt / (double) fileLen) * 100);
			System.out.println(fileLen+"   "+cnt);
		}//end for
	}//run

	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(this, "���ϼ���", FileDialog.LOAD);
		fd.setVisible(true);

		String path = fd.getDirectory();
		String name = fd.getFile();
		if (path != null) {
			File file = new File(path + name);
			try {
				copy(file);
				JOptionPane.showMessageDialog(this, file + "���� ����");
			} catch (FileNotFoundException fnfe) {
				JOptionPane.showMessageDialog(this, "������ ���������ʽ��ϴ�");
			} catch (IOException ie) {
				JOptionPane.showMessageDialog(this, "����� �۾��� ���� �߻�.");
			} // end catch
		} // end if

	}// actionPerformed

	public void copy(File file) throws FileNotFoundException, IOException {

		int selectValue = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?");
		switch (selectValue) {
		case JOptionPane.OK_OPTION:
			StringBuilder copyFileName = new StringBuilder(file.getAbsolutePath());
			copyFileName.insert(copyFileName.lastIndexOf("."), "_bak");
//				System.out.println(copyFileName);

			FileInputStream fis = null;
			FileOutputStream fos = null;

			try {

				// �������Ͽ� ��Ʈ�� ����
				fis = new FileInputStream(file);
				fos = new FileOutputStream(copyFileName.toString());// _back�� �� �̸�
				int temp = 0;
				fileLen = file.length();
//				System.out.println(fileLen);

				cnt=0;
				int i =0;
				Thread t = new Thread(this);
				t.start();
//				int i = 0;
//					���ϰ� ����� ��Ʈ������ ���� ��´�.
//					HDD�� �о���̴� ũ�⸦ �����ϰ� 1byte�� �о�鿩 ���
				while ((temp = fis.read()) != -1) {
					fos.write(temp);
					fos.flush();
					jpb.setValue((int) ((i / (double) fileLen) * 100));
					if(jpb.getValue()==100) {
						break;
					}
					cnt++;
				} // end while
				
//					System.out.println(jpb.getValue());
//					i++;
					// �о� ���γ����� _bak�� ���� ������ �����Ͽ� ���(*����)
//						System.out.print( (char)temp );

//					//HDD�� �ѹ��� �о���̴� ũ�⸦ �״�� ���
//					byte[] temp = new byte[512];
//					int len = 0;
//					while(( len = fis.read(temp)) != -1) {
//						fos.write(temp, 0, len);
//						fos.flush();
//						
//						
//					}//end while

			} finally {
				if (fis != null) {
					fis.close();
				} // end if
				if (fis != null) {
					fos.close();
				} // end if
			} // end finally

		}// end switch

	}// copy

	public static void main(String[] args) {
		new FileCopy();
	}// main

}// class