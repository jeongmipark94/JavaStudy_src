package day1129;

public class Hw22classArray {

//	int inSeoul = 0;
//	int sumage =0;
//	int oldestage =0;
//	String oldestname = "";
//	String oldestgender= "";
//	
//	
//	
//	
//	//2-1 ����� �ο����
//	public int seoul() {
//		
//		
//	}
//	//2-2 ������ �� ���
//	public int sum() {
//		
//	}
//	//2-3 ���� ���� ��� �̸� ���
//	public String maxage() {
//		
//	}

	public static void main(String[] args) {
		int inSeoul = 0;
		int sumage = 0;
		int oldestage = 0;
		String oldestName = "";
		String oldestGender = "";
		
		Hw22personclass[] personArr = new Hw22personclass[7];

		personArr[0] = new Hw22personclass(1, "������", "����� ������ ���ﵿ", 28, "����");
		personArr[1] = new Hw22personclass(2, "������", "����� ���빮�� ��ʸ���", 27, "����");
		personArr[2] = new Hw22personclass(3, "������", "������ ���뱸 ���뵿", 26, "����");
		personArr[3] = new Hw22personclass(4, "���ü�", "����� ���α� ���ε�", 27, "����");
		personArr[4] = new Hw22personclass(5, "���ü�", "����� ���۱� �󵵵�", 29, "����");
		personArr[5] = new Hw22personclass(6, "�����", "��⵵ ��õ�� ��õ��", 26, "����");
		personArr[6] = new Hw22personclass(7, "�����", "����� ������ �����絿", 27, "����");

		for (int i = 0; i < personArr.length; i++) {
			personArr[i].hw22personclass();
			sumage += personArr[i].age;
			if (personArr[i].addr.contains("�����")) {
				inSeoul += 1;
			}
			if (oldestage < personArr[i].age) {
				oldestage = personArr[i].age;
				oldestName = personArr[i].name;
				oldestGender = personArr[i].gender;
				
			}

			System.out.println();
		} // end for
		System.out.println("����� ������ : " + inSeoul + " ������ ��" + sumage + "���� ���� ��� �̸� ���" + oldestName
				+"["+oldestGender+"]");
		// System.out.println("����� ������" + );
	}// main

}// class
