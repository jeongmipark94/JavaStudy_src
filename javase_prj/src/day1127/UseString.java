package day1127;

import java.rmi.server.SocketSecurityException;

/**
 * ���ڿ� ������� �ּҸ� �����ϰ�, ���ڿ��� �ٷ�� ����� �����ϴ� 
 * String Class�� ���.<br>
 * java���� �����ϴ� Ŭ������ �̸��� �������� Ŭ������ �̸��� ���ٸ� 
 * ���� ���� Ŭ������ ���� ����ϰ� �ȴ�. 
 * java���� �����ϴ� Ŭ������ ����� ������ 
 * "full path : ��Ű������ ��� ����Ͽ� Ŭ������ ����ϴ� ��"�� ����ؾ��Ѵ�.
 * ��Ű����.Ŭ������
 * @author owner
 */
public class UseString {

	public static void main(String[] args) {
		System.out.println("�ȳ�");
		//�⺻�� ���� ���.(new ��� X)  String s = "���ڿ�";
		String str="AbcdEfg";
		//������ ���� ���.(new ��� O) String s = new String("���ڿ�");
		String mail= new String("melosist@naver.com");
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str + "�� ����"+str.length());
		System.out.println(mail + "�� ����"+mail.length());
		
		System.out.println(str+"�� ��� �빮��"+str.toUpperCase());
		System.out.println(str+"�� ��� �ҹ���"+str.toLowerCase());
		//"AbcdEfg";
		// 0123456
		//indexOf�� L-> R���� �����ϸ� ���� ó�� ã������ ���ڿ��� �ε���
		System.out.println(str +"���� 'd'�� �ε��� :"+ str.indexOf("dEf"));
		System.out.println(str +"���� 'z'�� �ε��� :"+ str.indexOf("z")); // ������ -1���´�.
		
		System.out.println(mail +"���� \"@\"�� �ε��� :"+ mail.indexOf("@"));
		str = "AbcdEfAg";
		//lastIndexOf�� R->L���� �����ϸ鼭 ���� ó�� ã������ ���ڿ���
		//�ε����� ��´�.
		System.out.println(str +"���ڿ����� �ڷκ��� 'A'�� �ε��� :"+ str.lastIndexOf("A"));
		
		//Ư�� �ε����� ���ھ��
		char temp = str.charAt(2);
		System.out.println(str+" ���� 2��° �ε����� �ش��ϴ� ���� :"+ temp);
		
		//�ڽ� ���ڿ� �ڸ���
		//	str = "AbcdEfAg";
		//			  01234567
		System.out.println(str+ "���� �ε����� 2~5��° �ش��ϴ� ���ڿ�"+ str.substring(2,6));
		//melosist@naver.com
		//01234567  8  91011 12 13 14 15 16 17 < - String index
		System.out.println(mail +"���� ���� �ּҸ� ��� "+ mail.substring(0,mail.indexOf("@")));
		System.out.println(mail +"���� ������ �ּҸ� ��� "+ mail.substring(9,18));
		//substring�� ���� �ε����� ������ ������ �߶󳽴�.
		System.out.println(mail +"���� ������ �ּҸ� ��� "+ mail.substring(mail.indexOf(("@"))+1));
		
		//�յڰ��� �ڸ���
		str = "     A BC    ";
		System.out.println("[" +str + "]���� �յ� ���� ����"+"["+ str.trim()+"]");
		
		//���ڿ� ���̱�
		str= "Abcd";
		String str1 = str.concat("Efg");
		String str2 = str + "Efg";
		System.out.println(str1);
		System.out.println(str2);
				
		//���ڿ��� �Ϻ��ϰ� ������ ��
		str = "������";
		System.out.println(str+"��(��)"+(str.equals("������")?"����":"���"));
		
		//���ڿ��� �� ���ڿ��� �����ϴ��� 
		str="�Ǿ���";
		if(str.startsWith("����")) {
			System.out.println("���� ����Ͻ� �� �����ϴ�.");
		}else {
			System.out.println(str);
		}//else
		
		str="����� ������";
		str1="������ �ȴޱ�";
		
		System.out.println(str1 + "��(��)" + (str1.startsWith("����")?"������Դϴ�.":"������ �ƴմϴ�."));
		//Ư�� ���ڿ��� ��������
		str="����� ������ ���ﵿ";
		str1="��⵵ ������ ������";
		System.out.println(str1 + "��(��)" + (str1.endsWith("��")?"����":"�ð�"));
		
		//ġȯ : ���ڿ� ���� ��� ���ڿ� ã�Ƽ� ġȯ
		str="�� ���� �Ǿ����ε� �� ���� �������!";
		//System.out.println( str.replaceAll("����","**"));
		//.�� �޼ҵ� �ٽ� �θ��� �� (�޼ҵ带 �����ؼ� �θ��� ��): methodChain��.
		System.out.println( str.replaceAll("��","*").replaceAll("��", "*")	);
		
		str="    A BC    ";
		System.out.println( str.replaceAll(" ","")	);
		
		int i= 27;
//		str=i; int�� String���� �Ҵ� �� �� ����.
		//�⺻�� ���������� ���ڿ��� ��ȯ
		str=String.valueOf(i);
		System.out.println(str);
		double d=11.27;
		str=d+"";
		System.out.println(str);
		
		str="";
		System.out.println(str.isEmpty());
		
		//��ü������ ���� �ʾ��� �� �� Ŭ������ �����ϴ� method�� 
		//����� �� ����. Error
//		str = null;
//		System.out.println(str.isEmpty());
		
		////////////////////11-28-2018 split ��� �ڵ� �߰�//////////////////
		String data = 
				"������,������,���ü�~������~�����.������,������,������.������";
				//split�� �ѹ��� �ϳ��� ���ڷ� �����Ͽ� �ڸ���.
			String[] arr = data.split("[.]");//.�� �׳� ���� ���� ���� �ʴ´�. []�� ��� ����.
			System.out.println("���е� �迭 ���� ���� : "+ arr.length);
			for(String name : arr) {
				System.out.println(name);
			}//end for
		
		
	}//main

}//class
