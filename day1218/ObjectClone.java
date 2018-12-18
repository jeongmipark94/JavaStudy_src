package day1218;

import java.util.Stack;

/**
 * ��ü ���� : �����Ǵ� ��ü�� Cloneable interface�� �����ؾ߸��Ѵ�.
 * @author owner
 */
public class ObjectClone implements Cloneable{
	
	private int i;
	private Stack<ObjectClone>stack = new Stack<>();
		
		
	public static void main(String[] args) {
		
			ObjectClone oc = new ObjectClone();
			oc.i=100;
			
			try {
				ObjectClone oc1=(ObjectClone) oc.clone();
				System.out.println("���� ����" + oc1);
				oc.i=200; //���簴ü�� ���°� ����
				System.out.println("���� :"+ oc.i + "/������ :"+oc1.i);
								
			} catch (CloneNotSupportedException cnse) {
				cnse.printStackTrace();
			}//catch
			
			
	}//main

}//class