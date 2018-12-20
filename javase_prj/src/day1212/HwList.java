package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HwList extends Frame {

	private TextField tfName;
	private TextField tfAge;
	private TextField tfAddr;
	private Button btnAdd;
	private Button btnDel;
	private Button btnChg;
	private Button btnExi;
	private List listResult;

	public HwList() {

		super("����12��12��");

		Label lblName = new Label("�̸�");
		Label lblAge = new Label("����");
		Label lblAddr = new Label("�ּ�");
		Label lblList = new Label("List");

		listResult = new List();

		tfName = new TextField();
		tfAge = new TextField();
		tfAddr = new TextField();

		btnAdd = new Button("�߰�");
		btnDel = new Button("����");
		btnChg = new Button("����");
		btnExi = new Button("�ݱ�");

		lblName.setBounds(40, 80, 50, 30);
		lblAge.setBounds(40, 120, 50, 30);
		lblAddr.setBounds(40, 160, 50, 30);
		lblList.setBounds(240, 50, 50, 30);

		listResult.setBounds(220, 80, 200, 110);

		tfName.setBounds(90, 83, 100, 25);
		tfAge.setBounds(90, 123, 100, 25);
		tfAddr.setBounds(90, 163, 100, 25);

		btnAdd.setBounds(90, 220, 50, 30);
		btnDel.setBounds(180, 220, 50, 30);
		btnChg.setBounds(270, 220, 50, 30);
		btnExi.setBounds(360, 220, 50, 30);

		add(lblName);
		add(lblAge);
		add(lblAddr);
		add(lblList);
		add(listResult);
		add(tfName);
		add(tfAge);
		add(tfAddr);
		add(btnAdd);
		add(btnDel);
		add(btnChg);
		add(btnExi);

		setLayout(null);
		setBounds(300, 300, 500, 300);
		
		HwHasA hha= new HwHasA(this);
		addWindowListener(hha);
		tfName.addTextListener(hha);
		tfAge.addTextListener(hha);
		tfAddr.addTextListener(hha);
		btnAdd.addActionListener(hha);
		btnDel.addActionListener(hha);
		btnChg.addActionListener(hha);
		btnExi.addActionListener(hha);
		listResult.addItemListener(hha);
		
		
		
		
		
		
		
		
		setResizable(false);
		setVisible(true);
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}// windowClosing
//		});

	}// HwList ������

	
	
	public TextField getTfName() {
		return tfName;
	}



	public TextField getTfAge() {
		return tfAge;
	}



	public TextField getTfAddr() {
		return tfAddr;
	}



	public Button getBtnAdd() {
		return btnAdd;
	}



	public Button getBtnDel() {
		return btnDel;
	}



	public Button getBtnChg() {
		return btnChg;
	}



	public Button getBtnExi() {
		return btnExi;
	}



	public List getListResult() {
		return listResult;
	}



	public static void main(String[] args) {
		new HwList();

	}// main

}// class
