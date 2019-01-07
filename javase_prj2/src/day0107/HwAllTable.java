package day0107;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HwAllTable extends JFrame {
	private JComboBox<String> jcb;
	private JButton jbtSelect;

	public HwAllTable() {
		super("2019-01-07 숙제");
		JLabel jlb = new JLabel("테이블 선택");
		jcb = new JComboBox<String>();
		jbtSelect = new JButton("선택");

		JPanel panel = new JPanel();
		panel.add(jlb);
		panel.add(jcb);
		panel.add(jbtSelect);

		add(panel);

		HwAllTableEvt hate = new HwAllTableEvt(this);
		jbtSelect.addActionListener(hate);

		setBounds(100, 100, 500, 600);
		setVisible(true);
		setResizable(false);

	}//

	public JButton getJbtSelect() {
		return jbtSelect;
	}
	

	public JComboBox<String> getJcb() {
		return jcb;
	}

	public static void main(String[] args) {
		new HwAllTable();
	}// main

}// class
