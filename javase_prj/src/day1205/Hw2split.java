package day1205;

import java.util.StringTokenizer;

public class Hw2split {

	/*
	 * 2. �Ʒ� ���õ� ���ڿ��� ���� ���ڷ� �߶󳻾� ���ڿ� �迭�� �����ϰ� ��ȯ�ϴ� ���� �ϴ� method�� �ۼ��ϼ���.
	 * 
	 * "������,������.������,���ü�~������!������.����ö,������,������,���ü�.������"
	 * 
	 * ���; ������ ������ ������ ���ü� ������ ������ ����ö ������ ������ ���ü� ������
	 */

	public String[] getName(String str) {
		StringTokenizer stk = new StringTokenizer(str,",.~!");
		String[] name =new String[stk.countTokens()];
		
		int i=0;
		while(stk.hasMoreTokens()) {
				name[i] = stk.nextToken();
				i++;
	}
		return name;
	}

	public static void main(String[] args) {

		Hw2split h2=new Hw2split();
		String name = "������,������.������,���ü�~������!������.����ö,������,������,���ü�.������";
		String temp[]= h2.getName(name);

//		StringTokenizer stk = new StringTokenizer(names, ",.~!");
//		System.out.println("��ū�� �� : "+ stk.countTokens());
//				while(stk.hasMoreTokens()) {
//					System.out.print(stk.nextToken());
//					System.out.print(" ");
//				}//end while
//
//				name[11] =
				
		System.out.println(h2.getName(name));
		
		
		
		for(int i=0; i<temp.length;i++) {
			System.out.print(temp[i]+" ");
			
		}//end for


		
		
		
		
	}// main

}// class
