package day1218;

/**
 *	Compile Exception : byte code�� ���������� �����ϱ����� ��.
 *	�����ڰ� �ݵ�� ���ܻ�Ȳ�� ó���ؾ��ϴ� ����.
 * @author owner
 */
public class UseCompileException {

	public static void main(String[] args) {
		
		
		try {
//			Object obj = Class.forName("java.lang.String");
			Object obj = Class.forName("day1217.UseRuntimeException");
			System.out.println("�ε��� Ŭ����"+ obj);
		} catch (ClassNotFoundException cnfe) {
			 System.err.println("�˼��մϴ�.");
			 System.err.println("���� �޼��� ��� : " + cnfe.getMessage());
			 System.err.println("����ó�� ��ü�� �޼��� :" + cnfe);
			 cnfe.printStackTrace();//�����ؼ� ����ϴ� ���� , ����ҋ� �� ��������
//			 System.out.println("---------"); //println�� printStackTrace���� ���� ��µ� �� �ִ�.
			 
		}finally {
			System.out.println("������ּż� ��");
		}//end finally
		
		
	}//main

}//class

