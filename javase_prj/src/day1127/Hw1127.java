package day1127;

public class Hw1127 {
	private String ssn;
	
	//1-1 �����ڴ� �ֹι�ȣ�� �޾� instance ������ �Ҵ��Ѵ�. 
    	public Hw1127(String ssn) {
    		this.ssn = ssn;
    	}//�ֹι�ȣ
	
	//1-2 �ֹι�ȣ�� ���� üũ 14��
	public boolean chklength() {
		boolean flag = false;
		if( ssn.length() == 14 ) {
			flag = true;
			return flag;
		}else {
			flag=false;
			return flag;
		}//end if
	}//end chklength
	
	//1-3 �ֹι�ȣ�� 6��° �ڸ��� "-"�� �ƴϸ� false ��ȯ
	public boolean hipen() {
		if( ssn.charAt(6)!='-') {
			return false;
		}else {
			return  true;			
		}
		//end if
	}//end hipen
	
//	1-4�ֹι�ȣ�� ��ȿ�� �����Ͽ� ��ȿ�ϸ� true(�ƴϸ� false) ��ȯ
//	�� �ڸ��� 2 3 4 5 6 7 8 9 2 3 4 5�� ���� ����
//	���Ͽ�  11�� ���� ������ ���� ��� 11 ���� �� ���� ����
//	10���� ���� �������� �ֹι�ȣ�� ���ڸ��� ���ٸ� true / false
	
	public boolean exist() {
		int checkNum = 0;
		
		int j = 2;
		//�� 6�ڸ�
		
		
		for(int i=0; i<6; i++) {
			checkNum +=Integer.parseInt(ssn.substring(i,i+1))*j;
			j++;
		}//end for

		
		for(int i=7; i<ssn.length()-1; i++) {
			checkNum +=Integer.parseInt(ssn.substring(i,i+1))*j;
			j++;
			if(j>9) j=2;
		}//end for
		
		checkNum %= 11;
		checkNum = 11-checkNum;
		checkNum %= 10;
		
		if (Integer.parseInt(ssn.substring(13)) == checkNum) {
			return true;
		}else {
			return false;
		}
		
		
	}//end exist
		public String getBirth() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birth;
			if( flag == 1 || flag ==2 || flag ==5 || flag==6) {
				birth = 19+ssn.substring(0,2)+"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
			}else {
				birth = 20+ssn.substring(0,2)+"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
				
			}
			return birth;
		}
		
		// 1-6 ���̸� ��ȯ�ϴ� ��        31
		public int getAge() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birth;
			int age;
			if( flag ==1 || flag==2||flag==5||flag==6) {
				birth = 19+ssn.substring(0,2);
				 age  = 2018- Integer.parseInt(birth)+1;
			}else {
				birth = 20+ssn.substring(0,2);
				age = 2018- Integer.parseInt(birth)+1;
			}
							return age;
		}//end age
		
		//1-7 ������ ��ȯ (��/��)
		private char getGender() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			
			if (flag == 1 || flag ==3 || flag ==5||flag ==7) {
					return '��';
			} else {
					return '��';
			}
		}
		
		//1-8 �� �ܱ��� ��ȯ
		private String nation() {
			
			int flag = Integer.parseInt(ssn.substring(7,8));
			
			if(flag == 0 ||flag ==1|| flag ==2|| flag == 3|| flag==4|| flag==9) {
				return "������";
			}else {
				return "�ܱ���";
			}
		}
		
		//1-9 �츦 ��ȯ
		public String getCz() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birthYear;
			
			if(flag ==1 || flag ==2 || flag ==5||flag ==6) {
				birthYear = 19+ssn.substring(0,2);
			}else {
				birthYear = 20+ssn.substring(0,2);
			}
			
			int i = Integer.parseInt(birthYear);
			
			if (i%12 == 11) {
				return "��";
			}else if (i%12 == 10) {
				return "��";
			}else if (i%12 == 9) {
				return "��";
			}else if (i%12 == 8) {
				return "��";
			}else if (i%12 == 7) {
				return "�䳢";
			}else if (i%12 == 6) {
				return "ȣ����";
			}else if (i%12 == 5) {
				return "��";
			}else if (i%12 == 4) {
				return "��";
			}else if (i%12 == 3) {
				return "����";
			}else if (i%12 == 2) {
				return "��";
			}else if (i%12 == 1) {
				return "��";
			}else {
				return "������";
			}
		}
		
		
	public static void main(String[] args) {
		String ssn = "940101-2123456";
		Hw1127 hw = new Hw1127(ssn);
		System.out.println(ssn);
		System.out.println(hw.chklength());
		System.out.println(hw.hipen());
		System.out.println(hw.exist());
		System.out.println(hw.exist());
		System.out.println(hw.getBirth());
		System.out.println(hw.getAge());
		System.out.println(hw.getGender());
		System.out.println(hw.nation());
		System.out.println(hw.getCz());
		System.out.println("-----------------------------");
		
		if (hw.chklength()) {
			if(hw.hipen()) {
				if(hw.exist()) {
					System.out.println("������� : " + hw.getBirth());
					System.out.println("���� : " + hw.getAge());
					System.out.println("���� : " + hw.getGender());
					System.out.println("���� : " + hw.nation());
					System.out.println("�� : " + hw.getCz());
				} else {
					System.out.println("������ �ȵǴ� �ֹι�ȣ�Դϴ�.");					
				}
			}else {
				System.out.println("6��° �ڸ��� '-'�� �����ϴ�..");
			}
		}else {
			System.out.println("�ֹι�ȣ ���̰� 14�ڰ� �ƴմϴ�..");
		}
	}

}
