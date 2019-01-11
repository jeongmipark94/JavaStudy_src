package day0111;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

@SuppressWarnings("serial")
public class UseJTableImage extends JFrame{

	public UseJTableImage() {
		ImageIcon daum = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\daum.png");
		ImageIcon google = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\google.png");
		ImageIcon naver = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\naver.png");
		
		String[] columnNames= {"�ΰ�","URL","Ư¡"};
		Object [][] rowData = { 
				{daum, "http://daum.net", "īī�� ������"},
				{naver,"http://naver.com","����"},
				{google,"http://google.com","�˻������� ���ƿ�"}
		};
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//�Էµ� Ŭ������ �״�� Cell(Columns)�� ǥ���ǵ��� method Override
		//getColumnClass(int column)
		JTable jt = new JTable(dtm) {
			@Override
			public Class getColumnClass(int column) {//////////////////
				//row - JTable�� �Էµ� ������ �迭�� �࿡ ���Ѵٸ�
				//��� �÷��� ���� �Էµ� ������ ��ȯ�Ѵ�.
				//getClass�� �ش�Ǵ� ���� Ŭ���� ���¸� ��ȯ
				return getValueAt(0	, column).getClass();//0���� �����ϱ�. �ݵ�� 0�� �ʿ�� X
//				return getValueAt(0	, 0).getClass(); ó���࿡ ���ؼ��� ����.
//				return getValueAt(3	, column).getClass();//3���� �迭�� ������ �ʱ� ������ ��������
			}
		};
		jt.setRowHeight(100);
		
		JScrollPane jsp =new JScrollPane(jt);
		jt.getTableHeader().setReorderingAllowed(false);// �÷��� �̵� ����
		jt.getTableHeader().setResizingAllowed(false);//�÷��� ũ�� ���� ���� 
		
		jt.getTableHeader().getColumnModel().getColumn(0).setPreferredWidth(600);
		jt.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(50);
		jt.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(140);
		
		add(jsp);
//		Object[] rowData = new Object[];
		
		TableColumn tc = jt.getColumnModel().getColumn(0);
		tc.setPreferredWidth(30);
		
		
		setBounds(300, 300, 700, 500);
		setVisible(true);
		
		
		
		
	}//UseJTableImage
	
	public static void main(String[] args) {
		new UseJTableImage();
	}

}
