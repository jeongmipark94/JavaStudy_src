package day1212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HwHasA extends WindowAdapter implements ActionListener, ItemListener, TextListener {

	private HwList hl;
	private String name, age, addr;

	public HwHasA(HwList hl) {
		this.hl = hl;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		hl.dispose();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		if (e.getSource() == hl.getTfName()) {
			name = hl.getTfName().getText();
		} // end if
		if (e.getSource() == hl.getTfAge()) {
			age = hl.getTfAge().getText();

		} // end if
		if (e.getSource() == hl.getTfAddr()) {
			addr = hl.getTfAddr().getText();

		} // end if

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		String temp = hl.getListResult().getSelectedItem();
		String[] arr = temp.split("/");
		hl.getTfName().setText(arr[0]);
		hl.getTfAge().setText(arr[1]);
		hl.getTfAddr().setText(arr[2]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hl.getBtnAdd()) {
//			if(!(name.isEmpty()  || age.isEmpty() || addr.isEmpty())) {
				StringBuilder Item = new StringBuilder();
				Item.append(name).append("/").append(age).append("/").append(addr);
				hl.getListResult().add(Item.toString());
				
				hl.getTfName().setText("");
				hl.getTfAge().setText("");
				hl.getTfAddr().setText("");
				
			}

//		}
		if (e.getSource() == hl.getBtnDel()) {

			if (hl.getListResult().getSelectedItem() != null) {
				int idx = hl.getListResult().getSelectedIndex();
				hl.getListResult().remove(idx);
			}
		}
		if (e.getSource() == hl.getBtnChg()) {
			if (hl.getListResult().getSelectedItem() != null) {
				int idx2 = hl.getListResult().getSelectedIndex();
				hl.getListResult().remove(idx2);

				StringBuilder item2 = new StringBuilder();
				item2.append(name).append("/").append(age).append("/").append(addr);
				hl.getListResult().add(item2.toString(), idx2);
				hl.getTfName().setText("");
				hl.getTfAge().setText("");
				hl.getTfAddr().setText("");
			}
		}
		if (e.getSource() == hl.getBtnExi()) {
			hl.dispose();

		}

	}

}
