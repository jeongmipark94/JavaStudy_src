package day1121;

public class Hw19two {
	/*
	 * 2. do~while�� ����Ͽ� �Ʒ��� ������ *�� ����ϴ� static method�� �ۼ��Ͽ� ȣ���ϼ���.
	 *
	 **
	 ***
	 ****
	 */
public static void star() {
	int i =1;
	do { 
			int j = 1;
			do {
		     		System.out.print("*");
		     		j++;
			}while(j<=i);
		System.out.println(" ");
		i++;
	} while (i<=4);
	
}

	public static void main(String[] args) {
		Hw19two.star();
	}// main

}// class
