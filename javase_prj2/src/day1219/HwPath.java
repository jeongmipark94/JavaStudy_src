package day1219;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * 
 * JOptionPane.showInputDialog�� ����Ͽ� ��θ� �Է� �޴´�.
 * 
 * �Է¹��� ��ο� Ȯ���ڰ� java�� ������ �����Ѵٸ�
 * 
 * JOptionPane.showConfirmDialog�� ����Ͽ� �������θ� ���´�.
 * 
 * ��� �޼��� "java ������ x�� �����մϴ�. �����Ͻðڽ��ϱ�?" "��"�� ������ �ش� ������ �����ϰ� , "�ƴϿ�"�� "���"��
 * �������� �����Ѵ�.
 * 
 * @author owner
 */
public class HwPath {
	public HwPath() {
		String path = JOptionPane.showInputDialog("��θ� �Է��ϼ���");
		File[] all = new File(path).listFiles();
		List<Integer> java = new ArrayList<Integer>();
		
			for(int i=0; i<=all.length -1; i++) {
				if(all[i].getName().contains("java"){
					java.add(i);
				}//end if
				
				
			}//end for
//		if(path ) {
////			
////		}
////		
////		
	}

	public static void main(String[] args) {
		new HwPath();
	}// main

}// class
