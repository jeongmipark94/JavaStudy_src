package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HwRandomScore {
		
	
		List<String> name = new ArrayList<>();
		List<Integer> score = new ArrayList<>();
		
		public HwRandomScore(String str) {
			
			String[] name = str.split(",");
			Random r = new Random();
			
			for(int i=0; i<name.length; i++) {
				this.name.add(name[i]);
				score.add(r.nextInt(101));
			
			}
			
		}//������ �̸� ���� �ʱ�ȭ
		
//		List<Integer> score = new ArrayList<Integer>();
		public void printScore(int cnt) {
			int sumOfScore = 0;
			Random r = new Random();
			int[] tmpIdx =new int[name.size()];//?
			
			//���� ����� �ߺ� ��µ�, �������� �̴µ� �ߺ��� idx�� ����
			for(int i=0; i<tmpIdx.length; i++) {
				tmpIdx[i] = r.nextInt(name.size());
					for(int j=0; j<i; j++) {
						if(tmpIdx[i] == tmpIdx[j]) {
							i--;
							break;
						}
					}
				System.out.println(name.get(tmpIdx[i])+" "+ score.get(tmpIdx[i]));
				sumOfScore += score.get(tmpIdx[i]);
			
			}

				System.out.println(" ���� " + sumOfScore);
		}
	
		
		public void scoremaker() {
			
			
		}//scoremaker
		
		public void scoreprint() {
			
			
		}//scoreprint
		
		
		 

		/*1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���.
		  ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�,
		 ������ 0~100�� ���̷� �߻��Ҽ��ֽ��ϴ�.

		 ���α׷��� ����Ǹ� ���� ����߿� 2���̻� ����ó�� ����� �̰� 
		 n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.
		 �ߺ��̸��� �� �� ����.
		��� �� )
		 ������ 89
		 ���ü� 77
		 ������ 90
		  ����   xx��
		  
		������ ����Ʈ, 
		����ó�� �޼ҵ�,
		���� ��� �޼ҵ�*/
	
	
	
	

	public static void main(String[] args) {
		HwRandomScore h1 = new HwRandomScore(str);
		
//		String[] names = new String [6];
		String str = "������,�̺���,������,���ü�,������,������";
		
		int cnt =0; //����� ��� �� (�����ϰ� 2~)
		
		while(true) {
			cnt =(int)(Math.random()*h1.name.size())+1;
			if(cnt >1) break;
		}
		h1.printScore(cnt);
		
		

	}//main

}//class
