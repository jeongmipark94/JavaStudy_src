package day1204;

/**
 * ����Ŭ������ static����ó�� ����� �� �ִ� ��øŬ����.
 * @author owner
 */
public class NestedOuter {

	int i;
	static int j;
	
	public NestedOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}//NestedOuter
	
	public void outInstMethod() {
		System.out.println("�ٱ�Ŭ������ instance method");
	}//outInstMethod
	
	public static void outStatMethod() {
		System.out.println("�ٱ�Ŭ������ static method");
	}//outStatMethod
	
	///////////////////////////Nested Class ����///////////////
	static class NestedInner{
//			int in_i; // instance ������. staticŬ�������� ���� ������ �⺻�� �ν��Ͻ�����
			static int in_j;//static ����
			
//			public NestedInner() {
//			}
			//static �����ȿ����� �ַ� �ν��Ͻ� ������ �����ڸ� ������ �ʴ´�.
			//���� �� ����.! �׷��� �� �ȸ����.
			public void inMethod() {
				System.out.println("���� Ŭ������ instance method");
			}//inMethod
			
			public static void inStatMethod() {
				System.out.println("���� Ŭ������ static method");
				System.out.println("�ٱ� Ŭ������ �ڿ� ���. i= ���Ұ�, j="+
				NestedOuter.j);
//				outInstMethod(); Instance������ method�̹Ƿ� ����� �� ����.
				NestedOuter.outStatMethod();
				
			}//inStatMethod
	}//class
	///////////////////////////Nested Class ��///////////////
	
	
	
	public static void main(String[] args) {
		//static ������ ����� ������ ��üȭ���� Ŭ������.�Ӻ�����,
		//Ŭ������.method������ ����Ѵ�.
		NestedInner.inStatMethod();
		
	}//main

}//class
