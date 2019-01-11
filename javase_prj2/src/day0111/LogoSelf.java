package day0111;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

@SuppressWarnings("serial")
public class LogoSelf extends JFrame{

	public LogoSelf() {
		ImageIcon daum = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\daum.png");
		ImageIcon google = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\google.png");
		ImageIcon naver = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0111\\images\\naver.png");
		
		String[] columnNames= {"·Î°í","URL","Æ¯Â¡"};
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 4);
		JTable jt = new JTable(dtm);
		
		
		Object[] rowData = new Object[];
		
		TableColumn tc = jt.getColumnModel().getColumn(0);
		tc.setPreferredWidth(30);
		
		
		setBounds(300, 300, 300, 400);
		setVisible(true);
		
		
		
		
		
	}//UseJTableImage
	
	public static void main(String[] args) {

	}

}
