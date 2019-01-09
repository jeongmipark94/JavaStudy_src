package day0109;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import day0107.CpEmp2VO;

/**
 * 
 * @author owner
 */
public class RunUseCallableStatement {

	public void addTestProc() {
		
		String tempData = JOptionPane.showInputDialog("사원정보 추가 \n 입력 예) 사원번호, 사원명, 연봉,직무");
		if (tempData != null && !tempData.equals("")) {
			String[] data = tempData.split(",");

			if (data.length != 4) {
				JOptionPane.showMessageDialog(null, "입력형식을 확인해주세요.");
				return;
			} // end if
			int empno = 0 , sal = 0;
			String ename = "",job="";

			try {
				empno = Integer.parseInt(data[0].trim());
				ename = data[1].trim();
				sal = Integer.parseInt(data[2].trim());
				job = data[3].trim();
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "사원번호나 연봉은 숫자 입니다.");
				return;
			} // end catch
				// 처리된 입력데이터를 VO에 설정하고
			TestProcVO tpvo = new TestProcVO(empno, sal, ename, job);
			
			// VO의 값을 DB에 insert한다.
			try {
				String msg="";
				msg=UseCallableStatementDAO.getInstance().insertProc(tpvo);
				JOptionPane.showMessageDialog(null, msg);
//				JOptionPane.showMessageDialog(null, empno + "번 사원정보가 입력되었습니다.");
			} catch (SQLException se) {// 예외
				
				JOptionPane.showMessageDialog(null, "DBMS에 사소한 문제 발생");
				se.printStackTrace();
			} // end catch

		} // end if
		
	}//addTestProc
	
	public static void main(String[] args) {
		RunUseCallableStatement rucs=new RunUseCallableStatement();
		boolean exitFlag = false;
		String inputMenu = "";
		
		do {
			inputMenu = JOptionPane.showInputDialog("메뉴선택\n1.사원추가 2.사원변경 3.사원삭제 4.전체사원조회 5.특정사원조회 6. 종료");
			
			if(inputMenu !=null ) {
				switch (inputMenu) {
				case "1":
					rucs.addTestProc();
					break;
//				case "2":
//					rps.modifyCpEmp2();
//					break;
//				case "3":
//					rps.removeCpEmp2();
//					break;
//				case "4":
//					rps.searchAllCpEmp2();
//					break;
//				case "5":
//					rps.searchOneCpEmp2();
//					break;
				case "6":
					exitFlag = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, inputMenu + "은(는) 제공되는 서비스가 아닙니다.");
					break;
				}//end switch
			}else{
					exitFlag = true;
			}//end else

		} while (!exitFlag);
		JOptionPane.showMessageDialog(null, "사용해주셔서 감사합니다");
	}//main

}//class
