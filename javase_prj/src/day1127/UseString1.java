package day1127;

public class UseString1 {
	// �̸����� �Է¹޾� �̸����� ��ȿ���� �����Ͽ� boolean������
	// ����� ����� ��ȯ�ϴ� ��
	//�޼ҵ�� �ϸ����� ����� ���� �ʴ´�.

	private boolean validEmail(String email) {
		boolean flag =false;
//		if(email.length()>5 && email.indexOf("@") !=-1 && email.indexOf(".") != -1){
//			flag= true;
//		}else {
//				flag=false;
		flag = email.length()>5 && email.contains("@")  && email.contains(".");
			return flag;
		}//validEmail
		
//				
//			}
//		System.out.println("��ȿ���� ���� �̸����Դϴ�.");
//		}else {
//		System.out.println("��ȿ�� �̸����Դϴ�");
//		}



	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		String email = "ruro@daum.net";
		//String email = "@";
		//String email = "ruro@daumnet";
		if(us1.validEmail(email)) {
			System.out.println(email+" ��ȿ");
		}else {
			System.out.println(email + " ��ȿ");
		}//end if
		
	}// main

}// class
