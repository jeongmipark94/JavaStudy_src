package day1119;

/**
 * switch~case :������ ���� ��.(JDK1.7�������ʹ� ���忭�� �� ����<br>
 * ���� ) switch(������){<br>
 * 			case ��� : ���๮��;<br>
 * 			case ��� : ���๮��;<br>
 * 							.<br>
 * 							.<br>
 * 			default : ��ġ�ϴ� ����� ���� �� ���๮��;<br>
 * 			}
 * @author owner
 */
public class TestSwitchCase {

	public static void main(String[] args) {
//			String i="1"; // jdk 1.7+���� ��� ����
			int i=0;
			
			switch( i ) {//switch�� �ԷµǴ� ������ ���������� byte,short, int, char,String
			//case�� �ԷµǴ� ������ ���� �ٸ� ��������� ������. 
			case 0 : System.out.println("����");
			case 1 : System.out.println("��ħ");
			case 2 : System.out.println("����");
			default : System.out.println("����");
			}//end switch
			}//mail
	}//class


