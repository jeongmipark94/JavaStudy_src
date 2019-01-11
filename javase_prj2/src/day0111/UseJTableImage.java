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
		
		String[] columnNames= {"로고","URL","특징"};
		Object [][] rowData = { 
				{daum, "http://daum.net", "카카오 프렌즈"},
				{naver,"http://naver.com","웹툰"},
				{google,"http://google.com","검색엔진이 좋아요"}
		};
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//입력된 클래스가 그대로 Cell(Columns)에 표현되도록 method Override
		//getColumnClass(int column)
		JTable jt = new JTable(dtm) {
			@Override
			public Class getColumnClass(int column) {//////////////////
				//row - JTable에 입력된 이차원 배열의 행에 속한다면
				//모든 컬럼의 값을 입력된 형으로 반환한다.
				//getClass는 해당되는 곳의 클래스 형태를 반환
				return getValueAt(0	, column).getClass();//0행은 있으니까. 반드시 0일 필요는 X
//				return getValueAt(0	, 0).getClass(); 처음행에 대해서만 나옴.
//				return getValueAt(3	, column).getClass();//3행은 배열에 속하지 않기 때문에 에러가남
			}
		};
		jt.setRowHeight(100);
		
		JScrollPane jsp =new JScrollPane(jt);
		jt.getTableHeader().setReorderingAllowed(false);// 컬럼의 이동 막기
		jt.getTableHeader().setResizingAllowed(false);//컬럼의 크기 변경 막기 
		
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
