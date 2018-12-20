package day1219.hw;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Hw2 {
	String path;
	File[] files ;
	File file;
	int javaFiles;
	List<Integer> listIdx;
	public Hw2() {

		getPath();

		file = new File(path);

		if (file.isFile()) {
			JOptionPane.showMessageDialog(null, "�Է°��� ��ΰ� �ƴ϶� �����Դϴ�");
		} else {
			
			checkJava();

			String msg = "java������" + javaFiles + "�� �����մϴ�. �����Ͻðڽ��ϱ�?";

			int select = JOptionPane.showConfirmDialog(null, msg);
			switch (select) {
			case JOptionPane.OK_OPTION: // OK
				for (int i = 0; i < listIdx.size(); i++) {
					files[listIdx.get(i)].delete();
				}
			}
		}

	}

	public void getPath() {
		path = JOptionPane.showInputDialog("��θ� �Է��ϼ���.\n��)c:/dev");
	}

	public void checkJava() {
		// 'java'�� ������ �����ϴ� �� �����Ǵ�
		files = file.listFiles();
		List<Integer> listIdx = new ArrayList<Integer>();
		javaFiles =0;
		// �̷��� �迭�� ����� File��ü�� ��밡�� files[0].getName()
		for (int i = 0; i < files.length; i++) {

			// for���� ���鼭 �����ؾߵǴ� �͵� : �ڹ������� ��, ������ ������ index
			if (files[i].getName().contains(".java")) {
				listIdx.add(i);
				javaFiles++;
			}
		}
	}

	public static void main(String[] args) {
		new Hw2();

	}

}// class
