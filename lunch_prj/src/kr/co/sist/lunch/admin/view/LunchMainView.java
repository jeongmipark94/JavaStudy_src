package kr.co.sist.lunch.admin.view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import kr.co.sist.lunch.admin.controller.LunchMainController;
import oracle.jdbc.driver.DBConversion;

public class LunchMainView extends JFrame{
	private JTabbedPane jtb;
	private DefaultTableModel dtmLunch, dtmOrder, dtmCalc; //�޴�, �ֹ�, ����
	private JButton jbtAddLunch, jbtCalcOrder;
	private JComboBox<Integer> jcbYear,jcbMonth,jcbDay;
	private JTable jtLunch, jtOrder; //�޴�, �ֹ�
	
	private DefaultComboBoxModel<Integer> cbmYear,cbmMonth,cbmDay;
	
	private Calendar cal ;
	
	public static String adminId;
	

	public LunchMainView(String adminName) {
		super("���ö� ���� [ �α��� ���� : " + adminName + "]");
		
		cal= Calendar.getInstance();
		
		jtb = new JTabbedPane();
		//���ö�
		String[] lunchColumns = {"��ȣ","��ǰ�ڵ�","�̹���","���ö���","����"};
		dtmLunch = new DefaultTableModel(lunchColumns,	4) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}//isCellEditable 
		};
		jtLunch = new JTable(dtmLunch) {
			@Override
			public Class getColumnClass(int column) {
				return getValueAt(0, column).getClass();
			}//getColumnClass
		};
		
		//���ö� ���̺� ũ�� ���� : ��ü ������ w800, �̹��� w122 x h110
		jtLunch.getColumnModel().getColumn(0).setPreferredWidth(80);
		jtLunch.getColumnModel().getColumn(1).setPreferredWidth(120);
		jtLunch.getColumnModel().getColumn(2).setPreferredWidth(125);
		jtLunch.getColumnModel().getColumn(3).setPreferredWidth(265);
		jtLunch.getColumnModel().getColumn(4).setPreferredWidth(220);
		
		//���̺��� ����
		jtLunch.setRowHeight(110);
		
		
		//����
		String[] calcColumns = {"��ȣ","���ö���","����","����"};
		dtmCalc = new DefaultTableModel(calcColumns, 4);
		JTable jtCalc = new JTable(dtmCalc);
		
		//�ֹ�
		String[] orderColumns = {"��ȣ","�ֹ���ȣ","���ö��ڵ�","���ö���","�ֹ��ڸ�",
							"����","����","�ֹ���","����ó","�ֹ���ip","���ۻ���"};
		dtmOrder = new DefaultTableModel(orderColumns, 4);
		jtOrder = new JTable(dtmOrder);
		
		jbtAddLunch = new JButton("���ö� �߰�");
		jbtCalcOrder = new JButton("����");
		
		cbmYear = new DefaultComboBoxModel<>();
		jcbYear = new JComboBox<Integer>(cbmYear);
		
		cbmMonth =new DefaultComboBoxModel<Integer>();
		jcbMonth = new JComboBox<Integer>(cbmMonth);
		
		cbmDay = new DefaultComboBoxModel<Integer>();
		jcbDay = new JComboBox<Integer>(cbmDay);
		
		JScrollPane jspLunch = new JScrollPane(jtLunch);
		jspLunch.setBorder(new TitledBorder("���ö� ���"));
		
		JScrollPane jspOrder = new JScrollPane(jtOrder);
		jspOrder.setBorder(new TitledBorder("�ֹ����"));
		
		JScrollPane jspCalc = new JScrollPane(jtCalc);
		jspCalc.setBorder(new TitledBorder("����"));
		
		//ó�� �ǿ� �� ������Ʈ ��ġ
		JPanel jpLunch = new JPanel();
		jpLunch.setLayout(new BorderLayout());
		
		JPanel jpLunchNorth = new JPanel();
		jpLunchNorth.add(jbtAddLunch);
		
		jpLunch.add(BorderLayout.CENTER, jspLunch);
		jpLunch.add("North",jpLunchNorth);
		
		jtb.add("���ö�", jpLunch);
		
		//�ι�° �ǿ� �� ������Ʈ ��ġ 
		JPanel jpOrder = new JPanel();
		jpOrder.setLayout(new BorderLayout());
		jpOrder.add(jspOrder);
		
		jtb.addTab("�ֹ�", jpOrder);
		//����° �ǿ� �� ������Ʈ ��ġ
		JPanel jpCalc = new JPanel();
		jpCalc.setLayout(new BorderLayout());
		
		JPanel jpCalcNorth = new JPanel();
		jpCalcNorth.setBorder(new TitledBorder("�������ڼ���"));
		jpCalcNorth.add(jcbYear);
		jpCalcNorth.add(new JLabel("��"));
		jpCalcNorth.add(jcbMonth);
		jpCalcNorth.add(new JLabel("��"));
		jpCalcNorth.add(jcbDay);
		jpCalcNorth.add(new JLabel("��"));
		jpCalcNorth.add(jbtCalcOrder);
		
		jpCalc.add("North",jpCalcNorth);
		jpCalc.add("Center", jspCalc);
		
		jtb.addTab("����", jpCalc);
		
		//���� �����ӿ� ��ġ 
		add("Center", jtb);
		
		setYear(); //JCB Year����
		setMonth(); //JCB Month ����
		setDay(); //JCB Day����
		
		LunchMainController lmc = new LunchMainController(this);
		addWindowListener(lmc);
		
		jtb.addMouseListener(lmc); //�ǿ��� �̺�Ʈ�� �߻����� ��
		jtLunch.addMouseListener(lmc);
		jtOrder.addMouseListener(lmc);
		
		jbtAddLunch.addActionListener(lmc);
		jbtCalcOrder.addActionListener(lmc);
		
		jcbMonth.addActionListener(lmc);
		
		
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
	}//LunchMainView

	private void setYear() { //����⵵�� 4�������� 
		
		
		int year = cal.get(Calendar.YEAR);
		for(int temp =0; temp<4 ;temp++){
			cbmYear.addElement(year-temp);
		}//end for
		jcbYear.setSelectedItem(new Integer(year));
		
		
//		List<Integer> yearlist = new ArrayList<>();
//		for(int temp = year-4; temp< year+1; temp++) {
//			yearlist.add(temp);
//		}
//		for(int i=0; i<yearlist.size(); i++) {
//		jcbYear.addItem(yearlist.get(i));
//		}
//		
		
	}//setYear
	private void setMonth() { //�� 1~ 12��
		int now_month=cal.get(Calendar.DAY_OF_MONTH)+1;
		for(int month =1; month <13; month++) {
			cbmMonth.addElement(month);
		}//end for
		jcbMonth.setSelectedItem(new Integer(now_month));
//		
//		List<Integer> months = new ArrayList<>();
//		
//		for(int i) {
//		month = cal.get(Calendar.MONTH);
//		}
////		for(int temp = )
//		
//		jcbMonth.addItem(); 
		
	}//setMonrh
	private void setDay() {//�� ���� ������ ��
		int lastDay =cal.getActualMaximum(Calendar.DATE);
		int nowDay = cal.get(Calendar.DAY_OF_MONTH);
		for(int day=1; day<lastDay+1;day++) {
			cbmDay.addElement(day);
		}//end for
		jcbDay.setSelectedItem(new Integer(nowDay));
		
	}//setDay

	public JTabbedPane getJtb() {
		return jtb;
	}


	public DefaultTableModel getDtmLunch() {
		return dtmLunch;
	}


	public DefaultTableModel getDtmOrder() {
		return dtmOrder;
	}


	public DefaultTableModel getDtmCalc() {
		return dtmCalc;
	}


	public JButton getJbtAddLunch() {
		return jbtAddLunch;
	}


	public JButton getJbtCalcOrder() {
		return jbtCalcOrder;
	}


	public JComboBox<Integer> getJcbYear() {
		return jcbYear;
	}


	public JComboBox<Integer> getJcbMonth() {
		return jcbMonth;
	}


	public JComboBox<Integer> getJcbDay() {
		return jcbDay;
	}


	public JTable getJtLunch() {
		return jtLunch;
	}


	public JTable getJtOrder() {
		return jtOrder;
	}


	public DefaultComboBoxModel<Integer> getCbmYear() {
		return cbmYear;
	}


	public DefaultComboBoxModel<Integer> getCbmMonth() {
		return cbmMonth;
	}


	public DefaultComboBoxModel<Integer> getCbmDay() {
		return cbmDay;
	}
	
	
}//class
