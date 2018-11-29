package day1122;

/**
 * Variable Arguments :
 * �Ű������� �ϳ��ε� �μ��� ������ ���� �� �ִ�  ���<br>
 * method �������� �迭�� ó���ȴ�.<br>
 * ���� ) "�������� ... �Ķ���͸�" �������� ����
 * 
 * @author owner
 */
public class VariableArguments {
	/**���� ������������ �� �μ� ���� ������ ����� �� 
	 * @param param ���� ������
	 */
	public void test(int ... param) {
		for(int val : param) {
			System.out.println(val);
		}//end for
		System.out.println("test method called!");
	}//test
	
	/**
	 * ���� �μ��� �ޱ����� �Ź�߼��� ���� ���������� ����� �� �ִ�.
	 * @param i ���� �ϳ�
	 * @param d �Ǽ� �ϳ�
	 * @param j      �� �ڷδ� ��� ���� �������.
	 */
	public void test1(int i, double d, int ... j) {
		System.out.println("ó�� �Ű����� : "+i);
		System.out.println("�ι�° �Ű����� : "+d);
		System.out.println("������ �Ű����� : "+j);
		for(int idx=0; idx< j.length ; idx++) {
			System.out.println(j[idx]);			
		}//end for
		
	}//test
	//���ڿ��� �Է¹��� �� �ִ� �Ű������� ���.
	public void printName(String name) {
		System.out.println( name +"�� �ȳ��ϼ���?" );
		}//printName
	public static void main(String[] args) {
			VariableArguments va = new VariableArguments();
		//	va.test(1,2,3,4,5);
			va.test1(1, 3.14, 10, 20,30,40,50,60 );
			
		 String name="������";
		 System.out.println(name);
		 va.printName(name);
		 
		// String path="c:\temp\kkk.file.txt";
		 //System.out.println(path);
		 //��� : �ȳ��ϼ���.
		 System.out.println("�ȳ��ϼ���");
		 System.out.println("'�ȳ��ϼ���'");
		 System.out.println("\"�ȳ��ϼ���\"");
		 
		 
			
	}//main

}//class
