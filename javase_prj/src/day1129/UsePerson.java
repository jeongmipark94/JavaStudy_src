package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
			HongGilDong gd= new HongGilDong();
			gd.setName("ȫ�浿");//�θ��� method ���
			System.out.println("��" + gd.getEye()+"�� : "+ gd.getNose()+ "�� : "+ gd.getMouth());
			System.out.println(gd.eat());
			System.out.println(gd.eat("����",1));
			//�ڽŸ��� Ư¡
//			System.out.println(gd.fight(6)); // 7->8
//			System.out.println(gd.fight(7)); // 8->9
			System.out.println(gd.fight(7)); // ���
//			System.out.println(gd.fight(10)); // ����. 9>8
//			System.out.println(gd.fight(9)); // ����.8>7
			System.out.println("-----------------------------------------");
			Clark superman = new Clark(); //�ڽ��� �����Ǹ� �θ�Ŭ������ ���� ������ �� 
			//�ڽ��� �����ȴ�.
			//�ڽ��� ��ü�� �θ� Ŭ������ �ڿ� ( ����, method)�� �ڽ��� ��ó��
			//����� �� �ִ�. ( �ڵ��� ���뼺)
			superman.setName("Ŭ��");
			
			System.out.println(superman.getEye() +"/" + superman.getNose()+"/" +superman.getMouth() + "/"+ superman.getName());
			
			System.out.println(superman.eat());
			System.out.println(superman.eat("������ũ",10));
			
			// �ڽ�(�ڽ�)�� �ڿ� (����, method)
			String stone="¯��";
			System.out.println(stone+"�� ���� ���" + superman.power(stone) + ",���� ��ȭ :"+ superman.power);
			stone = "���̾Ƹ��";
			System.out.println(stone+"�� ���� ���" + superman.power(stone) + ",���� ��ȭ :"+ superman.power);
			
			
			JeongMi me = new JeongMi();
			me.setName("����");
			System.out.println(me.getEye() +"/" + me.getNose()+"/" +me.getMouth() + "/"+ me.getName());
			System.out.println(me.eat());
			String getMoney ="�뵷";
			System.out.println(getMoney + " �߻�! :"+me.cash(getMoney)+"���� ��ȭ :"+ me.cash);
			
			getMoney ="����";
			System.out.println(getMoney + " �߻�! :"+me.cash(getMoney)+"���� ��ȭ :"+ me.cash);
			
			getMoney ="���ݸ�";
			System.out.println(getMoney + " �߻�! :"+me.cash(getMoney)+"���� ��ȭ :"+ me.cash);
			
			System.out.println(me.toString());
			System.out.println(gd.toString());//heap�� �ּҰ� ���´�.
			String s= new String("������ �ݿ��� �Դϴ�");
			System.out.println( s.toString()); //heap�� �ּҰ� �ƴ϶� ���� ��µ�
			//String�� �������̵��� ����. �θ� �����ϴ� �ּ��� ��±��
			//heap�� �ּ� ������ �÷�! �������̵� �Ѵ�. 
			Date d = new Date();
			System.out.println(d.getYear());
			int i;
			
	}//main

}//class
