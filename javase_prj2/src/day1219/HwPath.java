package day1219;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * 
 * JOptionPane.showInputDialog를 사용하여 경로를 입력 받는다.
 * 
 * 입력받은 경로에 확장자가 java인 파일이 존재한다면
 * 
 * JOptionPane.showConfirmDialog를 사용하여 삭제여부를 묻는다.
 * 
 * 출력 메세지 "java 파일이 x개 존재합니다. 삭제하시겠습니까?" "예"를 누르면 해당 파일을 삭제하고 , "아니오"나 "취소"가
 * 눌려지면 종료한다.
 * 
 * @author owner
 */
public class HwPath {
	public HwPath() {
		String path = JOptionPane.showInputDialog("경로를 입력하세요");
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
