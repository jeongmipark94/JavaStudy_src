package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat
 * ���ڸ� ������ ���ڿ��� ����.
 *  
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int temp=2018;
		System.out.println(temp);
	
	DecimalFormat df =new DecimalFormat("0,000,000,000");
	DecimalFormat df1 =new DecimalFormat("#,###,###,###");
	
	System.out.println("0��� :"+ df.format(temp));
	System.out.println("#��� :"+ df1.format(temp));
	DecimalFormat df2 =new DecimalFormat("#,###.##");//�Ҽ��� �����ڸ��� ǥ��
	//�Ǽ� �ڸ����� ����ϸ� ���������ڸ��� ���� �ݿø� ����̶�� �ݿø���
	//	����� �����ش�.
	System.out.println("�Ҽ� �ڸ��� ǥ�� :"+df2.format(201812.064));
	System.out.println("�Ҽ� �ڸ��� ǥ�� :"+df2.format(201812.067));

	}//UseDecimalFormat
	
	public static void main(String[] args) {
		new UseDecimalFormat() ;
	}//main

}//class
