package day1123;

public class UseHw21Ramen {

	public static void main(String[] args) {
		//��ü ����
		Hw_Ramen sin=new Hw_Ramen();
		//
		sin.setName("�Ŷ��");
		sin.setThick("����");
		sin.setChily("������ �������� ���");
		sin.setFan(5);
				
		System.out.format("������ ��� ��ü ���� ���� ����[%s], ��[%s], ��ȣ��[%d], �̸�[%s]\n ",
				sin.getThick(),sin.getChily(),sin.getFan(),sin.getName());
		
		System.out.println(sin.cook());
		System.out.println(sin.cook("���", 5500));
		
		
		Hw_Ramen guri = new Hw_Ramen();
		System.out.format("������ ��� ��ü ���� ���� ����[%s], ��[%s], ��ȣ��[%d], �̸�[%s]\n ",
				guri.getThick(),guri.getChily(),guri.getFan(),guri.getName());
		
		
		Hw_Ramen Ozing = new Hw_Ramen("��¡�� «��","����","�ſ�",3);
		System.out.format("������ ��� ��ü ���� ���� ����[%s], ��[%s], ��ȣ��[%d], �̸�[%s]\n ",
				Ozing.getThick(),Ozing.getChily(),Ozing.getFan(),Ozing.getName());
	}//main

}//class
