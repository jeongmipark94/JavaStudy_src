package day1120;

import org.omg.Messaging.SyncScopeHelper;

/**
 * switch~ case�� ����� ���� ���ϱ�
 * @author owner
 */
public class TestSwitchCase {

	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	public static void main(String[] args) {
		//		char grade=' ';//char�� ���ڸ� �����Ѵ�.'' �ڵ�¿� ���� ����.
		// ' '���鹮��(white space)- unicode \u0000 ~ \uFFFF ����\u0000�� �� ���� ����. ' '�� �����
		int score=56;
		char grade=64;
		//case�� ����� �������� �������� ������ Constant �� ���. �����ǹ̷� �ִ��� �𸣱⶧����.
		if(score >=0 && score<=100 ) {	
			switch( score/ 10 ) {
			case TestSwitchCase.GRADE_D: grade++;
			case TestSwitchCase.GRADE_C: grade++;
			case TestSwitchCase.GRADE_B: grade++;
			case TestSwitchCase.GRADE_A: 
			case TestSwitchCase.GRADE_A_PLUS: grade++; break;
			default: grade+=6;
			
			/*case 10 :
			case 9 : grade='A'; break;
			case 8 : grade='B'; break;
			case 7 : grade='C'; break;
			case 6 : grade='D'; break;
			default : grade='F';*/
			//break; default�� �Ʒ��ٿ� ����� �ڵ尡 �����Ƿ� �б⹮�� ������� �ʴ´�. 
					
		}//end switch
		System.out.println(score+" ���� ������"+grade);
	}else {
		System.out.println("������ 0~100�� ���̸� �Է� ���� !!! �Է�����: ["+score+"]");
	}//end if
	}//main
}//class
