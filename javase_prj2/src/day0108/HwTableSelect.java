package day0108;

import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HwTableSelect extends JFrame {

	private JLabel jlbTS;
	private JComboBox<String> jcbTS;
	private JButton jbtTS;
	private DefaultTableModel dtmInfo;

	public HwTableSelect() {
		jlbTS = new JLabel("���̺� ����");
		jcbTS = new JComboBox<String>();
		jbtTS = new JButton("����");

		String[] columnNames = { "�÷���", "��������", "ũ��", "�������" };
		dtmInfo = new DefaultTableModel(columnNames, 5);
		JTable tabInfo = new JTable(dtmInfo);

		tabInfo.getTableHeader().setReorderingAllowed(false);
		tabInfo.setRowHeight(24);

//      tabInfo.getColumnModel().getColumn(0).setPreferredWidth(60);
//      tabInfo.getColumnModel().getColumn(1).setPreferredWidth(400);

		JScrollPane jsp = new JScrollPane(tabInfo);

//		setLayout(new GridLayout(3, 1));
		JPanel panel = new JPanel();
		panel.add(jlbTS);
		panel.add(jcbTS);
		panel.add(jbtTS);

		add("North", panel);
		add("Center", jsp);

		HwTableSelectEvt tse = new HwTableSelectEvt(this);
		try {
			tse.Table("fsf");// �޼ҵ����
		} catch (SQLException e) {
			e.printStackTrace();
		}

		HwTableSelectEvt htse = new HwTableSelectEvt(this);
		addWindowListener(htse);
		jbtTS.addActionListener(htse);

		setBounds(100, 100, 500, 300);
		setVisible(true);

	}

	public JLabel getJlbTS() {
		return jlbTS;
	}

	public JComboBox<String> getJcbTS() {
		return jcbTS;
	}

	public JButton getJbtTS() {
		return jbtTS;
	}

	public static void main(String[] args) {
		new HwTableSelect();
	}

	public DefaultTableModel getDtmInfo() {
		return dtmInfo;
	}

}
