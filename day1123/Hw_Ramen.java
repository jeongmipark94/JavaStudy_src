package day1123;

/**
 *���� 1123 �ʱ���, ��¡��«��, �Ŷ������ Ŭ���� ����� 
 *1. ��� ���� )  �ʱ���, ��¡��«��, �Ŷ��
        2. ��ü �𵨸� ) ��� -
����� Ư¡ : ����� ����, �ſ��, ��ȣ��
������ Ư¡ : ������
 * @author owner
 */
public class Hw_Ramen {
	private String name, thick, chily  ;//����̸�
	private int fan;
	
	public Hw_Ramen() {
		this("�ʱ���", "�Ѳ���", "����",5);
		System.out.println("�⺻ �����ڷ� ��� ����");
	}// �⺻������ ��� 

	
	public Hw_Ramen(String name,String thick,String chily, int fan) {
		this.name = name;
		this.thick = thick;
		this.chily = chily;
		this.fan = fan;
		System.out.println("�Ű����� �ִ� �����ڷ� ��� ����");
	}//�����ִ� ������ ���
	
	
	public void setName(String name) {
		if(!(name.equals("�Ŷ��")||name.equals("�ʱ���")||
				name.equals("��¡��«��"))) {
			name="�Ŷ��";
		}//end if
		this.name=name;
	}//setName
	
	public void setThick(String thick) {
		this.thick=thick;
	}
	public void setFan(int fan) {
		
		this.fan=fan;
	}//setFan
	
	public void setChily(String chily) {
		
		this.chily=chily;
	}//setchily
	
	//--------------------------------------------------------
	public String getName() {
		return name;
	}//getname
	
	public String getThick() {
		return thick;
	}//getThick
	
	public String getChily() {
		return chily;
	}//getChily
	
	public int getFan() {
		return fan;
	}//getFan
	//--------------------------------------------------
	//������ Ư¡
	public String cook() {
		return name+"��(��) ��������.";
	}//cook
	
	public String cook(String inner, int price) {
		return inner+"��(��)���� "+name+" ��(��)"+price+"�� �ְ� ��Ծ���.";
	}//cook
	
}//class
