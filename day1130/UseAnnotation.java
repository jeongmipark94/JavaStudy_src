package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 *	JDK 1.5 �������� �߰��� annotation�� ���.
 * Deprecated, Override, SuppressWarnings
 * @author owner
 */
public class UseAnnotation {
	
	/**
	 *  �� �޼ҵ�� �ڶ� ������ �߻���ų �� �ֽ��ϴ�.
	 *  
	 */
	@Deprecated //���ּ����� �ð��� ȿ���� �پ�� �˸� ȿ���� ����. ������ �߻���ų �� �����ϱ� ������ !
	public void test() {
		System.out.println("���Ŀ� ������ �߻��� method");
	}//test
	
	@Override
	public String toString() {
		return "�´����ʸ�";
	}//toString
	//�޼ҵ� ���� �����ϸ� �޼ҵ� ���� ��� ��� ��Ȳ�� �����Ѵ�.
	public void temp() {
		//unused ������ ������� �ʾƵ� �� �� ��� ����
//		@SuppressWarnings("unused")
		int i=0;
		//rawtypes : Generic �� ������� ���� �� ��� ���� 
		//�������� �����ϸ� �ٷ� �Ʒ��ִ� ������ ��� �����ϰ�
//		@SuppressWarnings({"rawtypes", "unused"})
		List l = new ArrayList();
		
		int j= 0;
		System.out.println("temp j=" +j);
		
	}
	

	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		System.out.println( ua);
	}//main

}//class
