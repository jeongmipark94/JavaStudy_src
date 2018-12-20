package day1219;

import java.io.BufferedReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * ���α׷��� ����Ǹ�
 * 
 * "���丮�� �Է� :" �޽����� ��µǰ� ����ڰ� ���丮 "��) c:/dev" �� �Է����� �� ���丮��� �ش� ���丮 �� ���� ������
 * JOptionPane.showMessageDialog �� ��� �ϴ� ���α׷� �ۼ�
 * 
 * ��� : �޼��� ���̾�α�
 * 
 * �̸� ���� ũ�� ���������� ������ ��¥ apis ���� test.java ���� 164byte yyyy-MM-dd a hh:mm
 * 
 * ���丮�� �ƴ϶�� "������ ������� �ʽ��ϴ�" - console�� ���
 * 
 * @author owner
 *
 */
public class HwDirectory {

	public void create() {

		JTextArea jta = new JTextArea(10, 40);

		System.out.println("���丮�� �Է�");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = new File(str);

		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println("������ ������ :" +sdf.format(d));
		File[] arr = file.listFiles();

		if (file.isDirectory() == true) {

			jta.append("�̸�                ����                ũ��                ���������� ������ ��¥                \n");

			for (int i = 0; i <= arr.length -1; i++) {
				jta.append(arr[i].getName()+ "                " +(arr[i].isFile()? "����" : "����")+ "                " + arr[i].length() + "  byte" + "                " + sdf.format(d)+"\n");
				
			} // end for

//			System.out.println(file.getName() + "          " + (file.isFile() ? "����" : "����") + "        "
//					+ file.length() + "byte" + "                " + sdf.format(d));
//			System.out.println(file.getName());
//			System.out.println(file.getName());

			JOptionPane.showMessageDialog(null, jta);

		} else {
			System.out.println("������ ��������ʽ��ϴ�.");
		} // end else

//		if
//					
//		}
//		

		System.out.println();

	}

	public static void main(String[] args) {
		HwDirectory hd = new HwDirectory();
		hd.create();
	}// main

}// class
