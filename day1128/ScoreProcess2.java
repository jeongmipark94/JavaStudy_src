package day1128;

import javax.tools.ToolProvider;

/**
 * �л��� Oracle,Java,JDBC ���� ������ ó���ϴ� ���α׷�
 * @author owner
 */
public class ScoreProcess2 {
	private int total;
	
	public ScoreProcess2() {
		total=0;
	}//ScoreProcess2
	
	/**
	 * ������ ���� �� 
	 * @param score
	 */
	public void addTotal(int score) {
		total+=score;
	}//setTotal
	/**
	 * ������ ��� ��
	 * @return
	 */
	public int getTotal() {
		return total;
	}//getTotal
	/**
	 * ���� ������ �ʱ�ȭ
	 */
	public void resetTotal() {
		total=0;
	}//resetTotal
	
	public String[] nameData() {
		String[] name = { "������", "������", "���ü�", "������", "������", "������", "�����" };
		return name;
	}// nameData

	public int[][] scoreData() {
		int[][] score = { { 85, 86, 81 }, { 95, 91, 100 }, { 89, 71, 59 }, { 97, 96, 91 }, { 78, 74, 77 },
				{ 100, 95, 68 } };
		return score;
	}// scoreData

	
	//���� 1��
	public double avr(int[] score) {
		double avr = 0;
		avr = getTotal()/score.length;
		
		return avr;
	}//end avr
	
	
	
//	"%4d\t%.2f\t\n",total,(float)total/3);
	public void printScore(String[] name, int[][] score) {
		//����. -��� ���� �մ��� �Ű������� ��ȯ���� ����Ͽ� 
		//method�� �����Ͽ� ȣ���Ͽ� ����Ѵ�.
		//1.�� �л��� ����� ���Ͽ� ����Ѵ�.(�޼ҵ��) (����� �Ҽ����� 1�ڸ������� ���)
		int total = 0;
		
		
		System.out.println("��ȣ\t�̸�\tOracle\tJava\tJFBC\t����\t���");
		System.out.println("-----------------------------------------------");
		
		
		for (int i = 0; i < score.length; i++) {// ��
			System.out.printf("%d\t%s\t", i + 1, name[i]);
			for (int j = 0; j < score[i].length; j++) {// ��
				System.out.printf("%d\t", score[i][j]);
				addTotal(score[i][j]);
//				total +=score[i][j];
			} // end for
			System.out.print(getTotal());
			System.out.println("\t"+avr(score[i]));
			resetTotal();
			
//			total=0;
		} // end for
		System.out.println("-----------------------------------------------");
		//2.�� ����� ������ ������ ����
		System.out.printf("��������-----------------------------------------------");
//		public void subTotal() {
			for(int i=0; i<name.length) {
				for() {
					
				}
			}
			
		}
		
		//3.�� ����� ��հ� ��ü ���(��ü����� �Ҽ����� ���ڸ� ���� ���)
		System.out.printf("�������-----------------------------------------------");
		//4.�� ����� �ְ� ������ ���
		System.out.println("�ְ� ���� �ڹ� []    ����Ŭ[]    JDBC[] ");
		//5.1�� �л��� �̸��� ����, ��ȣ
		System.out.println("TOP ��ȣ[]   �̸�[]   ����[]");
		public void topStu (String[] name, int[][] score) {
			int topOfTotal = 0;
			
			for(int i=0; i<name.length; i++) {
				for(int j=0; j<name.length; j++) {
					
				}
			}
		}
		//6.�ڹ� ������ �������� �����Ͽ� ���
		
	}// printScore
	//����2.
	/*2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ� 
	 * method�� �ۼ�.
	 * 1 1 1 1 1 1 1 1 1 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 0 0 0 0 0 0 0 1
	 * 1 1 1 1 1 1 1 1 1   
	 */
	
	public int hwArray() {
		int[][] hwarray = new int[6][9];
		for(int i=0; i<hwarray.length ; i++) {
			if(i)
			for(int j=0; j<hwarray[i].length; j++) {
				
			}//end for			
		}//end for
	}//hwArray
	
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		// ó���� ������ �ޱ�
		String[] name = sp2.nameData();
		int[][] score = sp2.scoreData();

		sp2.printScore(name, score);
//		System.out.println(sp2.avr());
	}// main

}// class
