package day1119;

/**
 * else~if : ������ ���� ������ ���� ��. <br>
 * ���� ) if(���ǽ�){
 * 				���ǿ� ���� �� ���� ����;<br>
 * 			}else if(���ǽ�){<br>
 * 				���ǿ� ���� �� ���� ����;<br>
 * }else if(���ǽ�){ <br>
 * 				���ǿ� ���� �� ���� ����;<br>
 * }else if(���ǽ�){ <br>
 * 				���ǿ� ���� �� ���� ����;<br>
 * 
 *  ....
 *  }else {<br>
 *  ��� ���ǿ� ���� ���� �� ���� ����;
 *  }
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		System.out.print(i+"��(��)");
		if(i<0) {
			System.out.print("0���� �۾Ƽ� ����");
	
	}else if(i>100) {
		System.out.print("100���� Ŀ�� ����");
	}else {
		System.out.println("�Է¼���");
	}//end else
		
		//�̸��� �Է� �޾� "������"�̸� ������ 
		//�̺���, �ڿ���, ������,������ �̸� ������
		//�׷��� ������ "���"�� �̸��տ� ����ϼ���."��å �̸�" �̷��� ���
		
		if(args[1].equals("������")) {
			System.out.println("����");
		}else if(args[1].equals("�̺���")||args[1].equals("�ڿ���")||
				args[1].equals("������")||args[1].equals("������")) {
			System.out.println("����");

		}else {
			System.out.println("���");
		}//end if
		System.out.println(args[1]+"�� �ȳ��ϼ���.");
		
		//�ǽ� - �¾��(1995)�� �Է¹޾� ��(12) ���ϱ�
		//11-��, 10-��,9-��, 8-��, 7-�䳢, 6-ȣ����,5-��,4-��, 3-����, 2-��,1-��,0-������
		
		int a =(Integer.parseInt(args[2]))%12;
		if( a ==11) {
			System.out.print("��");
			}else if( a ==10) {
				System.out.print("��");
			}else if( a ==9) {
				System.out.print("��");
			}else if( a ==8) {
				System.out.print("��");
			}else if( a ==7) {
				System.out.print("�䳢");
			}else if( a ==6) {
				System.out.print("ȣ����");
			}else if( a ==5) {
				System.out.print("��");
			}else if( a ==4) {
				System.out.print("��");
			}else if( a ==3) {
				System.out.print("����");
			}else if( a ==2) {
				System.out.print("��");
			}else if( a ==1) {
				System.out.print("��");
			}else 
				System.out.print("������");
	
		
		
		
}//main
}//class
