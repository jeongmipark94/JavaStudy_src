package kr.co.sist.lunch.user.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kr.co.sist.lunch.user.model.LunchClientDAO;
import kr.co.sist.lunch.user.view.LunchOrderDetailView;
import kr.co.sist.lunch.user.vo.OrderAddVO;

import static javax.swing.JOptionPane.showMessageDialog;

public class LunchOrderDetailController extends WindowAdapter implements ActionListener {

	private LunchOrderDetailView lodv;
	private String lunchCode;

	public LunchOrderDetailController(LunchOrderDetailView lodv, String lunchCode) {
		this.lodv = lodv;
		this.lunchCode = lunchCode;
	}// LunchOrderDetailController

	private void lunchOrder() {
		JTextField jtfOrderName = lodv.getJtfOrderName();
		String name = jtfOrderName.getText().trim();
//		int number = 0;
//		try {
//
//			number = Integer.parseInt(lodv.getJtfPhone().getText().trim().replaceAll("-", ""));
//
//		} catch (NumberFormatException nfe) {
//			JOptionPane.showMessageDialog(lodv, "��ȭ��ȣ�� ���ڸ� �Է°����մϴ�.");
//			return;
//		} // end catch

		if (name.equals("")) {
			showMessageDialog(lodv, "�ֹ��ڸ��� �ʼ� �Է�");
			jtfOrderName.setText("");
			jtfOrderName.requestFocus();
			return;
		} // end if

		JTextField jtfTel = lodv.getJtfPhone();
		String tel = jtfTel.getText().trim();

		if (tel.equals("")) {
			showMessageDialog(lodv, "��ȭ��ȣ�� �ʼ� �Է�");
			jtfTel.setText("");
			jtfTel.requestFocus();
			return;
		} // end if
//		} else {
//
//			if (number > 12 || number < 9) {
//				JOptionPane.showMessageDialog(lodv, "�Էµ� ���� ���� �ùٸ��� �ʽ��ϴ�.");
//				return;
//			} // end if
////			if(!tel.substring(3,4).equals("-") &&) {
////				JOptionPane.showMessageDialog(lodv, "");
////			}
//		}
		// ��ȭ��ȣ�� 3-4����-4���� �� 13�� ����

		// ���ڷ����� �� �Էµǰ� �Ϸ���
		if (tel.contains("-")) {
			String[] arrTel = tel.split("-");
			try {
				if (arrTel.length == 3) {
					if (arrTel[0].length() != 3 || !(arrTel[1].length() > 2 && arrTel[1].length() < 5)
							|| arrTel[2].length() != 4) {
						showMessageDialog(lodv, "��ȭ��ȣ�� �ڸ����� �߸��Ǿ����ϴ�.");
						return;
					} // end if
					for (int i = 0; i < arrTel.length; i++) {
						Integer.parseInt(arrTel[i]);// ���ڷθ� �Ǿ��ִ���
					} // end for

					//////// �ֹ� ����/////
					printOrder();
				} else {
					showMessageDialog(lodv, "��ȭ��ȣ�� ������ �ùٸ��� �ʽ��ϴ�.");
				} // end if
			} catch (NumberFormatException nfe) {
				showMessageDialog(lodv, "��ȭ��ȣ�� ���ڿ��� ����ֽ��ϴ�.");
				return;
			} // end catch

		} else {
			try {
				Integer.parseInt(tel);
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(lodv, "���ڸ� �Է°����մϴ�.");
				return;
			}

			if ( tel.length()> 11 ||  tel.length()< 7) {
				System.out.println("---");
				JOptionPane.showMessageDialog(lodv, "��ȭ��ȣ�� ������ �ƴմϴ�.");
			} else {
				System.out.println("---");
				printOrder();
			}
			
		}
	}// lunchOrder

	/**
	 * �ֹ������� �����ְ� �ֹ��� �� ������ ó��.
	 */
	private void printOrder() {

		JTextArea jtaReceipt = new JTextArea(26, 22);
		jtaReceipt.setEditable(false);
		JScrollPane jspReceipt = new JScrollPane(jtaReceipt);

		StringBuilder data = new StringBuilder();
		try {
			data.append("-----------------------------------------------------------\n").append("\t�������ö�\n")
					.append("\t����(�ҵ����)\n").append("�ҷ�������(����)\n").append("��ǥ : ������ 201-11-11212\n")
					.append("-----------------------------------------------------------\n").append("���ö� ��  : ")
					.append(lodv.getJtfLunchName().getText()).append("(").append(lunchCode).append(")\n")
					.append("-----------------------------------------------------------\n").append("���� : ")
					.append(lodv.getJbQuan().getSelectedItem()).append("��\n")
					.append("-----------------------------------------------------------\n").append("�����ݾ� : ")
					.append(lodv.getJtfTotalPrice().getText()).append("��\n")
					.append("-----------------------------------------------------------\n").append("�ֹ��� �� : ")
					.append(lodv.getJtfOrderName().getText()).append("\n")
					.append("-----------------------------------------------------------\n").append("��ȭ��ȣ : ")
					.append(lodv.getJtfPhone().getText()).append("\n")
					.append("-----------------------------------------------------------\n").append("ip address : ")
					.append(InetAddress.getLocalHost().getHostAddress()).append("\n ")
					.append("-----------------------------------------------------------\n")
					.append("���� ������ ���ö� �ֹ��Ͻðڽ��ϱ�?\n").append("\n").append("\n").append("\n").append("\n").append("\n")
					.append("-----------------------------------------------------------\n");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		jtaReceipt.setText(data.toString());
		switch (JOptionPane.showConfirmDialog(lodv, jspReceipt)) {
		case JOptionPane.OK_OPTION:
			try {
				OrderAddVO oavo = new OrderAddVO(lodv.getJtfOrderName().getText(), lodv.getJtfPhone().getText(),
						InetAddress.getLocalHost().getHostAddress(), lunchCode,
						lodv.getJbQuan().getSelectedIndex() + 1);

				try {
					LunchClientDAO.getInstance().insertOrder(oavo);
					showMessageDialog(lodv, "���ö� �ֹ��� �Ϸ�Ǿ����ϴ�. \n �׻� �ּ��� ���ϴ� ���� ���ö� \n�����մϴ�.");
					// �ֹ��� �Ϸ�Ǿ����Ƿ� �ֹ�â�� �ݴ´�.
					lodv.dispose();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} // end catch

		}// end switch
	}// printOrder

	@Override
	public void windowClosing(WindowEvent we) {
		lodv.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == lodv.getJbQuan()) {// ���� ���ý� ��ü ���� �����ش�.
			try {
				int price = Integer.parseInt(lodv.getJtfLunchPrice().getText());
				int quan = ((Integer) lodv.getJbQuan().getSelectedItem()).intValue();

				lodv.getJtfTotalPrice().setText(String.valueOf(price * quan));

			} catch (NumberFormatException nfe) {
				showMessageDialog(lodv, "������ ���� �̾�� �մϴ�.");
			} // end catch
		} // end if
		if (ae.getSource() == lodv.getJbEnd()) {// ����
			lodv.dispose();
		} // end if
		if (ae.getSource() == lodv.getJbOrder()) {// �ֹ�
			lunchOrder();
		} // end if
	}// actionPerformed

}// class
