package kr.co.sist.lunch.user.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import kr.co.sist.lunch.user.model.LunchClientDAO;
import kr.co.sist.lunch.user.view.LunchClientView;
import kr.co.sist.lunch.user.view.LunchOrderDetailView;
import kr.co.sist.lunch.user.vo.LunchDetailVO;
import kr.co.sist.lunch.user.vo.LunchListVO;
import kr.co.sist.lunch.user.vo.OrderInfoVO;
import kr.co.sist.lunch.user.vo.OrderListVO;

public class LunchClientController extends WindowAdapter implements ActionListener, MouseListener {

	private LunchClientView lcv;// has a ����
	private LunchClientDAO lc_dao;
	public static final int DBL_CLICK = 2;

	public LunchClientController(LunchClientView lcv) {
		this.lcv = lcv;
		lc_dao = LunchClientDAO.getInstance();
		
		try {
			String[] fileNames = lunchImageList();//Ŭ���̾�Ʈ�� ���� �̹����� üũ�Ͽ�
			lunchImageSend(fileNames);//������ �������� �̹����� ���� �� 
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		
		setLunchList(); //Jtable�� �����Ѵ�.//�̰� �ϱ����� �̹��� �޾ƿ;���. �� ���� �̹��� �޾ƿ��� 
	}// LunchClientController

	/**
	 * ���ö� ����� ��ȸ�Ͽ� JTable�� �����ϴ� ��. Ư������ 25�� �̻��̶�� 24�ڱ����� ����ϰ� �������� ...���� �ҿ��� �����Ѵ�.
	 */
	private void setLunchList() {
		// ���ö� ��� ��ȸ
		try {
			List<LunchListVO> list = lc_dao.selectLunchList();

			DefaultTableModel dtm = lcv.getDtmLunchList();
			dtm.setRowCount(0);

			Object[] rowData = null;
			LunchListVO llvo = null;

			String spec = "";
			for (int i = 0; i < list.size(); i++) {
				llvo = list.get(i);
				// ���̺� �߰��� ������ ����
				rowData = new Object[5];
				rowData[0] = new Integer(i + 1);
				rowData[1] = new ImageIcon(
						"C:/dev/workspace/lunch_prj/src/kr/co/sist/lunch/user/img/s_" + llvo.getImg());
				rowData[2] = llvo.getLunchCode();
				rowData[3] = llvo.getLunchName();

				spec = llvo.getLunchSpec();

				if (spec.length() > 25) {
					spec = spec.substring(0, 24) + "...";
				} // end if

				rowData[4] = spec;
				// ������ �����͸� ���̺� �߰�
				dtm.addRow(rowData);

			} // end for

		} catch (SQLException se) {
			msgCenter(lcv, "���ö� ����� ��ȸ�ϴ� �� ���� �߻�");
			se.printStackTrace();
		} // end catch
	}// setLunchList

	private void msgCenter(Component comp, String msg) {
		JOptionPane.showMessageDialog(comp, msg);
	}// msgCenter

	@Override
	public void windowClosing(WindowEvent e) {
		lcv.dispose();

	}// windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(JFrame.ABORT);
	}// windowClosed

	@Override
	public void mouseClicked(java.awt.event.MouseEvent me) {
		if (lcv.getJtp().getSelectedIndex() == 0) {
			lcv.setTitle(" ���� ���ö� �ֹ�");
		} // end if
		if (lcv.getJtp().getSelectedIndex() == 1) {
			lcv.setTitle(" ���� ���ö� �ֹ� ��ȸ");
		} // end if

		if (me.getSource() == lcv.getJtLunch()) {

			switch (me.getClickCount()) {// ����Ŭ�� getClickCount
			case DBL_CLICK:
				JTable jt = lcv.getJtLunch();
				String lunch_code = (String) jt.getValueAt(jt.getSelectedRow(), 2);
				// ���ö��� ������ ��ȸ
				try {
					LunchDetailVO ldvo = lc_dao.selectDetailLunch(lunch_code);
					if (ldvo == null) {// �ڵ�� ��ȸ�� ����� ���� ��
						msgCenter(lcv, lunch_code + "�� ��ȸ�� ���ö��� �����ϴ�.");
					} else {// �ڵ�� ��ȸ�� ����� ���� ��
						new LunchOrderDetailView(lcv, ldvo);
					} // end else
				} catch (SQLException se) {
					msgCenter(lcv, "������ ��ȸ�� ���� �߻�!!");
					se.printStackTrace();
				}//end catch
//				new LunchOrderDetailView(lcv, );
			}// end switch
		} // end if
	}// mouseClicked

	/**
	 * �ֹ��ڸ�� ��ȭ��ȣ�� ������ ���ö� ��ȸ
	 */
	private void searchLunchOrder() {
		JTextField jtfName = lcv.getJtfName();
		String name = jtfName.getText().trim();
		if (name.equals("")) {
			msgCenter(lcv, "�ֹ��ڸ��� �ʼ� �Է�!!!");
			jtfName.setText("");
			jtfName.requestFocus();
			return;
		} // end if

		JTextField jtfTel = lcv.getJtfTel();
		String tel = jtfTel.getText().trim();

		if (tel.equals("")) {
			msgCenter(lcv, "��ȭ��ȣ�� �ʼ� �Է�!!!");
			jtfTel.setText("");
			jtfTel.requestFocus();
			return;
		} // end if

		try {
			// �Է°��� ����Ͽ� DB Table ��ȸ
			List<OrderListVO> list = lc_dao.selectOrderList(new OrderInfoVO(name, tel));

			// JTable ���
			DefaultTableModel dtmOrderList = lcv.getDtmOrderList();
			dtmOrderList.setRowCount(0);

			String[] rowData = null;

			OrderListVO olv = null;

			for (int i = 0; i < list.size(); i++) {
				olv = list.get(i);
				rowData = new String[4];
				rowData[0] = String.valueOf(i + 1);
				rowData[1] = olv.getLunchName();
				rowData[2] = olv.getorderDate();
				rowData[3] = String.valueOf(olv.getQuan());

				dtmOrderList.addRow(rowData);

			} // end for

			if (list.isEmpty()) {
				msgCenter(lcv, "�Է��� ������ ��ȸ�� ����� �����ϴ�.");
			} else {
				lcv.setTitle("�������ö� - ��ȸ [" + name + " ���� �ֹ���Ȳ]");
			} // end else

			jtfName.setText("");
			jtfTel.setText("");
			jtfName.requestFocus();

		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch

	}// searchLunchOrder

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == lcv.getJtfName()) {
			lcv.getJtfTel().requestFocus();
		} // end if

		if (ae.getSource() == lcv.getJbtSearch() || ae.getSource() == lcv.getJtfTel()) {
			// �ֹ��� ���ö� ��� ��ȸ
			searchLunchOrder();
		} // end if
	}// actionPerformed
	
		/**
		 * ������ �̹����� ������ ���� �̹����� �޴� ��.
		 * @param fileName
		 */
		private void lunchImageSend(String[] fileNames) throws IOException{
			
			Socket socket = null;
			DataOutputStream dos = null;
			DataInputStream dis = null;
			
			try {
				socket = new Socket("211.63.89.143", 25000);
				dos = new DataOutputStream(socket.getOutputStream());
				dos.writeInt(fileNames.length);
				
				for(int i = 0 ; i< fileNames.length; i++) {
					dos.writeUTF(fileNames[i]);//������ ����
				}//end for
				 dos.flush();
				 
				 dis = new DataInputStream(socket.getInputStream());
				 //������ �������� ������ ������ ���� ����
				 int fileCnt = dis.readInt();
				 System.out.println("Ŭ���̾�Ʈ" + fileCnt+"�� ���� ");
				 
				 String fileName = "";
				 int fileSize = 0;
				 int fileLen = 0;
				 
				 FileOutputStream fos = null;
				 for(int i =0; i< fileCnt ; i++) {
					 
					 //���� ���� ���� ������ ����
					 fileSize=dis.readInt();        /////////������ ������ ���� ���� �ڿ� ���ϸ��� �޴´� .
					 
					 //���ϸ� �ޱ� 
					 fileName =dis.readUTF();
					 fos=new FileOutputStream("C:/dev/workspace/lunch_prj/src/kr/co/sist/lunch/user/img/"+ fileName);
					 
					 byte[] readData = new byte[512];
					 
					 while( fileSize >0 ) {
						 fileLen = dis.read(readData);//�������� ������ ���� ������ �о�鿩
						fos.write(readData, 0 , fileLen); //������ ���Ϸ� ���
						fos.flush();
						 fileSize--;
					 }//end while
				 }//end for
				 
			}finally {
				if(dos !=null) {dos.close();}//end if
				if(socket !=null) {socket.close();}//end if
			}
			
			
		}//lunchImageSend
	
	
	/**
	 * ���ö� �̹��� ����Ʈ 
	 */
	private String[] lunchImageList() {
		String[] fileList = null;
		String path = "C:/dev/workspace/lunch_prj/src/kr/co/sist/lunch/user/img/";
		
		File dir = new File(path); ////////�ش� ���丮�� ��ü���� ���� ��ü�� ����
//		fileList= dir.list();
		// ū �̹��� (s_�� ���� ����) �� �迭�� ��������.
		List<String> list = new ArrayList<String>();
		for(String f_name : dir.list()) {//File method .list
			if(!f_name.startsWith("s_")) {
				list.add(f_name);
			}//end if
//			fileList[i]= path+
		}//end for
		
		fileList = new String[list.size()];
		list.toArray(fileList);
		
//		fileList = {path + "m1_l1.gif"};
		System.out.println(Arrays.toString(fileList) );
		return fileList;
	}//lunchImageList
	
		public LunchClientController() {
			
		}//LunchClientController
		public static void main(String[] args) {
			new LunchClientController().lunchImageList();
			
		}//main

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	}

}