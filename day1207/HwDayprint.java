package day1207;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HwDayprint {
	public HwDayprint() {
		
	}//HwDayprint�� ������
	
	Map<Integer> map = new HashMap<Integer>();
	Set<String> set = new HashSet<String>();
	Calendar cal = Calendar.getInstance();
	Iterator<String> ita = set.iterator();
	
/*	���� 1.
	main method�� arguments�� ��¥�� ������ �Է� �޾� �Է¹��� ��¥��
	 ������ �����ϰ� ����ϴ� method �� �ۼ��ϼ���.

	��) java Test 4 12 30 32 35 15 4   

	���) 4 ȭ
	        12 ��
	        15 ��
	        30 ��  */
	
		public void print( int date ) {
			set.add(date);
			
		}
	
	
	
	
	public static void main(String[] args) {
		HwDayprint hd = new HwDayprint();
		
				hd.print(args);
		
	}//main

}//class
