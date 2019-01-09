package day0109;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HwCreateTableView extends JFrame  {
	private JTextField jtfTab, jtfCol, jtfConst, jtfSize;
	private JComboBox<String> jcbConst, jcbType;
	private JButton jbtAddTab, jbtAddData, jbtCreate, jbtInit;
	private JTextArea result;
	public HwCreateTableView() {
		
		JLabel jltabName= new JLabel("테이블명");
		JLabel jlcolName = new JLabel("컬럼명");
		JLabel jlconst = new JLabel("제약사항");
		JLabel jlconstName = new JLabel("제약사항명");
		JLabel jltypeName = new JLabel("데이터형");
		JLabel jlsize = new JLabel("크기");
		
		 jtfTab = new JTextField();
		 jtfCol = new JTextField();
		 jtfConst = new JTextField();
		 jtfSize = new JTextField();
		 
		 String[] typList = {"varchar2","char","number","date"};
		 String[] constList = {"null","primary key","unique","not null"};
		 jcbConst = new JComboBox<String>(constList);
		 jcbType= new JComboBox<String>(typList);
		
		 result = new JTextArea();
		 
		 jbtAddTab = new JButton("추가");
		 jbtAddData = new JButton("추가");
		 jbtCreate = new JButton("테이블 생성");
		 jbtInit = new JButton("초기화 ");
		 result.setEditable(false);
//		 result.setBorder();
		 
		 jltabName.setBounds(10, 10, 70, 30);
		 jtfTab.setBounds(80, 10, 80, 30);
		 jbtAddTab.setBounds(170, 10, 60, 30);
		 jlcolName.setBounds(10, 60, 70, 30);
		 jtfCol.setBounds(80, 60, 80, 30);
		 jltypeName.setBounds(170, 60, 70, 30);
		 jcbType.setBounds(250, 60, 100, 30);
		 jlsize.setBounds(370, 60, 80, 30);
		 jtfSize.setBounds(440, 60, 100, 30);
		 jlconst.setBounds(10, 100, 80, 30);
		 jcbConst.setBounds(80, 100, 120, 30);
		 jlconstName.setBounds(220, 100, 80, 30);
		 jtfConst.setBounds(300, 100, 130, 30);
		 jbtAddData.setBounds(450, 100, 60, 30);
		 result.setBounds(50, 170, 500, 300);
		 jbtCreate.setBounds(350, 490, 110, 30);
		 jbtInit.setBounds(470, 490, 80,30);
		 
		 add(jltabName);
		 add(jtfTab);
		 add(jbtAddTab);
		 add(jlcolName);
		 add(jtfCol);
		 add(jltypeName);
		 add(jcbType);
		 add(jlsize);
		 add(jtfSize);
		 add(jlconst);
		 add(jlconstName);
		 add(jcbConst);
		 add(jtfConst);
		 add(jbtAddData);
		 add(result);
		 add(jbtCreate);
		 add(jbtInit);
		 
		 
		 setBounds(100, 100, 600, 570);
		 setLayout(null);
		 setVisible(true);
//		 setResizable(false);
		 
		 HwCteateTableEvt hcte = new HwCteateTableEvt(this);
		 addWindowListener(hcte);
		 jbtAddData.addActionListener(hcte);
		 jbtAddTab.addActionListener(hcte);
		 jbtCreate.addActionListener(hcte);
		 jbtInit.addActionListener(hcte);
		 
//		 typList.add("varchar2,char,number,date".split(","));
		
		 
		 jcbConst.addItem("");
		 
		 
		 
	}//HwCreateTable
	
	
	public JTextField getJtfTab() {
		return jtfTab;
	}


	public JTextField getJtfCol() {
		return jtfCol;
	}


	public JTextField getJtfConst() {
		return jtfConst;
	}


	public JTextField getJtfSize() {
		return jtfSize;
	}


	public JComboBox<String> getJcbConst() {
		return jcbConst;
	}


	public JComboBox<String> getJcbType() {
		return jcbType;
	}


	public JButton getJbtAddTab() {
		return jbtAddTab;
	}


	public JButton getJbtAddData() {
		return jbtAddData;
	}


	public JButton getJbtCreate() {
		return jbtCreate;
	}


	public JButton getJbtInit() {
		return jbtInit;
	}


	public JTextArea getResult() {
		return result;
	}


	public static void main(String[] args) {
		new HwCreateTableView();
	}//main

}//class
