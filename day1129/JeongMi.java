package day1129;

public class JeongMi extends Person{
	public int cash;
	
	public JeongMi() {
		cash = 6;
	}//JeongMi �� �⺻������
	
	public String cash(String getMoney) {
		String result="";
		
		if(getMoney.equals("�뵷")) {
			cash=10;
			result=" �뵷�� ���� ������ �߽��ϴ�";
		}else if(getMoney.equals("����")) {
			cash=2;
			result="���� ���� ����Ƚ��ϴ�";
		}else {
			cash=0;
			result= "��������";
			
		}//ens else
		return result;
	}//cash
	
	
}//class
