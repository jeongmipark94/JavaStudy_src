package day1121;

public class Hw19 {

	/*
	 * ���� 1. while�� ����Ͽ� ������ ��ü ���� ����ϴ� instance method�� �ۼ��ϰ�, ȣ���ϼ���.
	 */
	public void gugudan() {
		int i = 1;
		while (i<10) {
			int j = 1;
			while( j<10) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Hw19 hw19=new Hw19();
		hw19.gugudan();
	
		
		
		
		/*2.  do~while�� ����Ͽ� �Ʒ��� ������  *�� ����ϴ�  static method��
		    �ۼ��Ͽ� ȣ���ϼ���.
		    *
		    **
		    ***
		    *****/

//			int i = 1;
//			int j = 1;
//			while (i<10 ) {
//				System.out.println(i+"x"+j+"="+i*j);
//				
//				i++;
//				j++;
//			}
//			
//		}
		
		
		
	}// main

}// class
