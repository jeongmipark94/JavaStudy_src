package day1126;

/**
 * this�� ����� ������ ȣ��
 * @author owner
 */
public class ThisConstructor {
	public  ThisConstructor() {
		//this(26);  
		//this�� ��� ���ʿ����� �Ἥ 
		//��� �������� ȣ���� ���� �� �ֵ��� �ؾ��Ѵ�.
		System.out.println("�⺻ ������");
	}//ThisConstructor
				
		public  ThisConstructor( int i){
			this();
			System.out.println("�����ִ� ������");
//			this(); // �������� ù��° �ٿ����� ��밡��.
		}//ThisConstructor
	public static void main(String[] args) {
	
			new ThisConstructor(22);
		
	}//main

}//class
