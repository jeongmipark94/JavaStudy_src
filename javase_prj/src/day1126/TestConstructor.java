package day1126;

/**
 *	Ŭ������ ��ü�� ���� �� �� �⺻������ ������ �־���� �⺻���� 
 *	�����ϰų�, �⺻������ ����� �ڵ带 �����ϴ� method ���� (��ü �ʱ�ȭ��). 
 * @author owner
 */
public class TestConstructor {
	
	/**
	 * �⺻ ������ : Ŭ������ �ۼ��� �� �����ڸ� �ϳ��� �������� ������
	 * �����Ϸ��� �Ű����� ���� Default Constructor�� �����Ѵ�.
	 */
	public TestConstructor() {
		System.out.println("�⺻ ������");
	//	TestConstructor(300); // �����ڴ� �޼��� ȣ���ϵ� ȣ�� �� �� ����. ��üȭ�� ���ؼ��� �θ� �� �ִ�. 
	}//TestConstructor
	//�����ε��� ��Ģ. ȣ���� �� ���� �� ���еǵ��� �Ű������� �޶�������
	/**
	 * �����ִ� ������ : �������� Overload
	 * @param i ������ ��
	 */
	public TestConstructor(int i) {
	System.out.println("�����ִ� ������"+i);
	}//TestConstructor
	
	
	public void test() {
		System.out.println("test method!!!");
		temp();
	}//test
	public void temp() {
		System.out.println("--------------temp method!!!!");
	}//temp
	
	
	public static void main(String[] args) {
	//overloading �� �����ڸ� ����Ͽ� ��üȭ�� �پ��ϰ� �� �� ����
	//new���� ������� �����ڰ�  tc�� ����	
			TestConstructor tc = new TestConstructor(); // �⺻������
	
		
		
			TestConstructor tc1 = new TestConstructor(26); // �����ִ� ������
			//new���� ������� �����ڰ�  tc�� ����
		System.out.println(tc);
		System.out.println(tc1);
		
		tc.test();
	}//main

}//class
