package day1203;

/**
 * ����� ���� Ư¡�� �θ�(Person)�� ���� ����ϰ� �ڽŸ���
 * 		Ư¡��(�ο��� ���Ѵ�)  ����
 * @author owner
 */
public class HongGilDong extends Person {
	private int level; // �ο򷹺�
	
	
	/**
	 * ȫ�浿�� �ο��� ��κ��� ���ϹǷ� 7�� ����
	 */
	public HongGilDong() { // ������
		super();
		level=7;
	}//HongGilDong
	
	/**
	 * �ο��ϴ� �� : �Էµ� �������� ���ٸ� �й�, �Էµ� �������� 
	 *  ���ٸ� �¸�, �Էµ� ������ ���ٸ� ���.
	 *  �¸��ϸ� ������ 1����, �й� �ϸ� ������ 1����, ���� ���� ��ȭ����
	 *  ������ �ִ� 10, �ּ� 1�� ������.
	 * @param inputLevel  �ο������� ����
	 * @return  �ο��� ���
	 */
	public String fight(int inputLevel) {
		String result="";
		if(level > inputLevel) {//�¸�
			result= "�̰�� s('. ^)V";
			level++;
			if(level > 10) {
				level=10;				
			}//end if
		}else if( level< inputLevel) {//�й�
			result= "���� ~(_-_)~";
			level--;
			if(level <1) {
				level=1;
			}//end if
		}else {//���
			result="���Ѥ�+;;";
		}//end else
		return result;
	}//fight
	
	@Override
	public String toString() { //toString �� tostring���� ���� �ν��̾ȵ�
		return "ȫ�浿 ��ü�� ��  ��: "+getEye()+"��:"+ getEye()+"/" 
				+",�� : "+ getMouth();
	}//toString
	/**
	 * �θ�Ŭ������ �����ϴ� method�� ����� �ڽĿ��� ���� �ʾ�<br>
	 * ����� �Ĵ��� �ָ����� ����<br>
	 * ȭ������� ���� ������ ����
	 * 
	 */
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� �ָ����� "+ menu+ "�� ������" + price +"�� ���� ��Դ´�.";
	}

	@Override
	public String eat() {
		return getName()+ "������ ���� �Դ´�.";
	}
	
//	@Override
//	public String[] language(String lang) {
//		String[] tempLang=getLanguage();
//		
//		int idx=0;
//		
//		for(int i =0 ; i<tempLang.length ; i++) {
//			if(lang.equals(tempLang[i])) {
//				idx++;
//			}//end if
//		}//end if
//		
//		tempLang[idx]=lang;
//		return tempLang;
////		return "�ѱ���, �߱���, ��ȭ".split(",");
//	}
	
}//class