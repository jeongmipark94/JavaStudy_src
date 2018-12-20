package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;
import kr.co.sist.memo.view.MemoHelp;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private  JavaMemo jm;
	
	public JavaMemoEvt(JavaMemo jm) {
		this.jm =jm;
	}//JavaMemoEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing
	@Override
	public void actionPerformed(ActionEvent ae) {
		//메뉴 아이템이벤트 등록
//		miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
		//새글 메뉴아이템에서 이벤트가 발생했을 때
		if( ae.getSource()== jm.getMiNew() ) {
			newMemo();
		}//end if
		
		//열기 메뉴아이템에서 이벤트가 발생했을 떄
		if( ae.getSource()== jm.getMiOpen() )  {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(jm, "선택한 파일을 읽을 수 없습니다.",
						"파일열기 에러", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "선택한 파일을 읽어들이는 중 문제가 발생",
						"파일열기 에러", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}//end if
		//저장 메뉴아이템에서 이벤트가 발생했을 때
		if( ae.getSource()== jm.getMiSave() )  {
			saveMemo();
		}//end if
		//다른 이름으로 저장 메뉴아이템에서 이벤트가 발생했을 떄
		if( ae.getSource()== jm.getMiNewSave() )  {
			newSaveMemo();
		}//end if
		//miEnd, miFormat, miHelp;
		//종료 메뉴아이템에서 이벤트가 발생했ㅇ르 때
		if( ae.getSource()== jm.getMiEnd() )  {
			jm.dispose();
		}//end if
		//서식 메뉴아이템에서 이벤트가 발생했을 때
		if( ae.getSource()== jm.getMiFormat() )  {
			formatDialog();
		}//end if
		//도움말 메뉴아이템에서 이벤트가 발생했을 때
		if( ae.getSource()== jm.getMiHelp() )  {
			helpDialog();
		}//end if
		
		
	}//actionPerformed
	
	/**
	 * 새글 :TextArea를 초기화한다.
	 */
	public void newMemo() {
		jm.getTaNote().getText();
		jm.getTaNote().setText("");
		
		jm.setTitle("메모장 - 새글");
	}//newMemo
	
	/**
	 * txt파일 열기 
	 */
	public void openMemo() throws FileNotFoundException, IOException {
		FileDialog fdOpen = new FileDialog(jm, "문서열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String filePath =fdOpen.getDirectory();
		String fileName = fdOpen.getFile();
		
		if(filePath != null) {//선택한 파일이 존재
			//////////////////////////12-20-2018 스트림으로 파일의 내용을 읽는 코드 추가 시작///////////////////
			//선택한 파일로 파일객체 생성
			File file = new File(filePath + fileName);
			//16bit stream사용
			BufferedReader br = null;
			StringBuilder tempData = new StringBuilder();
			
			try {
				br = new BufferedReader(new FileReader(file));
				String temp ="";
				//T.A를 초기화한후
				while((temp =br.readLine())!= null) {
					//파일에서 읽어들인 내용을 설정한다.
				}//end while
				
			}finally {
				if( br != null) { br.close();  }//end if
			}//end finally
			
			
			
			
			// 내용 : 아아아아아
			// 작성 : 나
			//////////////////////////12-20-2018 스트림으로 파일의 내용을 읽는코드 추가 끝///////////////////
			//파일의 경로와 이름을 Frame의 TitleBar에 설정
			jm.setTitle("메모장 - 열기 "+filePath+fileName);
		}//end if
		
	}//openMemo

	/**
	 * 작성한 메모 저장 - 기존의 파일명을 그대로 저장하는 파일명에 반영
	 */
	public void saveMemo() {
		newSaveMemo();
	}//saveMemo
	
	/**
	 * 파일명을 입력받아 새이름으로 저장
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "문서저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String filePath =fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if(filePath != null) {//선택한 파일이 존재
			//파일의 경로와 이름을 Frame의 TitleBar에 설정
			jm.setTitle("메모장 - 저장 "+filePath+fileName);
		}//end if
		
	}//newSaveMemo
	
	/**
	 * 글꼴을 설정하는 다이얼로그를 실행하는 일
	 */
	public void formatDialog() {
		new MemoFormat(jm);
	}//formatDialog
	
	/**
	 *  메모장 정보를 제공하는 다이얼로그를 실행
	 */
	public void helpDialog() {
		new MemoHelp(jm);
	}//helpDialog
	
}//class
