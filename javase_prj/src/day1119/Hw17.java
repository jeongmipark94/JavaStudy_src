package day1119;

public class Hw17 {

	public static void main(String[] args) {
		/*1. ����� �ð��� �Է¹޾� �Ʒ��� �������� ����ϼ���.
		  ��� :  ����� �ð��� �ִ� 2�ð��� ������ ������ 60���� �Ѵ� �ٸ� "��Ÿ�"
		 	 60�� ���϶�� "�ܰŸ�"�� ����ϼ���.*/
	 int i =Integer.parseInt(args[0]);
	 
	 if( i >120) {
		 	System.out.println("2�ð� �ʰ� �Է� �Ұ�");
	 	}else if(i>60) {
	 		System.out.println("��Ÿ�");
	 } else
		 System.out.println("�ܰŸ�");
		

		/*2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���.
		   ��������� "����,����ö,�ý�,����"�� �����Ѵ�.
		   ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�.
		   ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�.
			�÷ο���Ʈ
		 ���   :  xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�.
		            �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ���
		            ������ ��: xxxx�� �Դϴ�.  */
	 	
	 //args[1] = �̸�, args[2]=�������, args[3]=����ٰŸ�
	 String ride =args[2]; 
	 int fee = 0;
	 int len = Integer.parseInt(args[3]);
	 int add=(((int)((len-10)/5))*100);
	 	 
	 	 if (len-10>0) {
		 fee=fee+add;
	 	 }
		 switch(ride) {
	case "����" : fee=1200; break;
	 case "����ö" : fee=1250; break;
	 case "�ý�" : fee=3800; break;
	 case "����" : fee=0;
	 }//end switch

	 
	 //if ((args[3]-10)/5*100) {

		 
	 //end if
	 
	 System.out.println(args[1]+"�� ����� ��������� "+args[2]+"�̸� �Ÿ��� "+ args[3]+"Ű�� �Դϴ�.");
		System.out.println("�� �̿� ��� "+fee+"���̰�, �պ��̿� ��� "+(fee*2)+"���̸�,"
				+ " �Ѵ� 20�ϱ���  ������ ��: "+(fee*2*20)+"�� �Դϴ�.");	
	}//main

}//class
