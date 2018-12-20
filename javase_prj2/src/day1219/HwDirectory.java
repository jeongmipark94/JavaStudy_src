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
 * 프로그램이 실행되면
 * 
 * "디렉토리명 입력 :" 메시지가 출력되고 사용자가 디렉토리 "예) c:/dev" 를 입력했을 때 디렉토리라면 해당 디렉토리 내 파일 정보를
 * JOptionPane.showMessageDialog 에 출력 하는 프로그램 작성
 * 
 * 출력 : 메세지 다이얼로그
 * 
 * 이름 유형 크기 마지막으로 수정한 날짜 apis 폴더 test.java 파일 164byte yyyy-MM-dd a hh:mm
 * 
 * 디렉토리가 아니라면 "파일은 취급하지 않습니다" - console에 출력
 * 
 * @author owner
 *
 */
public class HwDirectory {

	public void create() {

		JTextArea jta = new JTextArea(10, 40);

		System.out.println("디렉토리명 입력");

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
//		System.out.println("마지막 수정일 :" +sdf.format(d));
		File[] arr = file.listFiles();

		if (file.isDirectory() == true) {

			jta.append("이름                유형                크기                마지막으로 수정한 날짜                \n");

			for (int i = 0; i <= arr.length -1; i++) {
				jta.append(arr[i].getName()+ "                " +(arr[i].isFile()? "파일" : "폴더")+ "                " + arr[i].length() + "  byte" + "                " + sdf.format(d)+"\n");
				
			} // end for

//			System.out.println(file.getName() + "          " + (file.isFile() ? "파일" : "폴더") + "        "
//					+ file.length() + "byte" + "                " + sdf.format(d));
//			System.out.println(file.getName());
//			System.out.println(file.getName());

			JOptionPane.showMessageDialog(null, jta);

		} else {
			System.out.println("파일은 취급하지않습니다.");
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
