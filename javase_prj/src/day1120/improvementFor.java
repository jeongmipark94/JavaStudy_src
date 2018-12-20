package day1120;

import java.util.ArrayList;
import java.util.List;
//�̰� ���־�� list�� �� ����
/**
 *������ for�� : �迭�̳� Collection���� ��� ���� ���� ó������ ������
 *���������� ����ϱ����� ����.<br>
 * ������ for���� JDK 1.5�������� ��밡��<br>
 *���� ) for (�������� ������ : �迭��(Collection��)){<br>
 *					������;(�迭(Collection)���� ���� ����Ҽ��ִ�.)<br>
 *}
 * @author owner
 */
public class improvementFor {

	public static void main(String[] args) {

		int[] tempArr = {2018, 11, 20, 16, 5};
		//������ for�� ��� ���� ���� ���
		for(int i=0; i< tempArr.length; i++) {
			System.out.println(tempArr[0]);
		}//end for
		System.out.println("========================");
		for(int value : tempArr) {
			System.out.println(value);
		}//end for
		
		//Collection �ε� List��
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(110);
		list.add(1);
		System.out.println("-----------------List ����for----------------");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i) );
		}//end for
		System.out.println("-----------------List ����for----------------");
		for(int i : list) {
			System.out.println( i );
		}//end for
		
	}//main

}//class
