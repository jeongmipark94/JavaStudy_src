package day1114;

class Hw15{
	public static void main(String[] args) 
	{
		
		//1�� ����
		/*1. �Ʒ��� ���� ������ ������ ����� ����� ������.

   �̴ϼ� : 'K', ���� : �ڽ��ǳ���, �޴��÷� : 1.5, ������ �÷� : 0.8

   ��� : ���� �̴ϼ��� 'K'�̰�, xx���Դϴ�. �÷��� �޴� xx, ������ xx�Դϴ�.*/

		char i='K';
		byte age=25;
		double lft=1.5;
		double rgt=0.8;

		System.out.println("���� �̴ϼ���"+i+"�̰�, "+age+"���Դϴ�. �÷��� �޴�"+lft+", ������ "+rgt+"�Դϴ�");

		
/*2. �⺻�� ���������� �����Ǵ� Ŭ������ Wrapper Class��� �Ѵ�. 
   Java Document���� WrapperŬ������ ����� �����ϴ��� ã�ƺ��� 
   �׿� ���� �ּҰ��� �ִ밪�� ��� �Ѵ�. 
 
   ��� :  byte�� �ּҰ� :  -128  �ִ밪 : 127 
*/

		
		System.out.println("byte�� �ִ� :"+Byte.MAX_VALUE+"/ �ּҰ� : "+ Byte.MIN_VALUE);
		System.out.println("float�� �ִ� :"+Float.MAX_VALUE+"/ �ּҰ� : "+ Float.MIN_VALUE);
		System.out.println("int�� �ִ� :"+Integer.MAX_VALUE+"/ �ּҰ� : "+ Integer.MIN_VALUE);
		System.out.println("long�� �ִ� :"+Long.MAX_VALUE+"/ �ּҰ� : "+ Long.MIN_VALUE);
		System.out.println("short�� �ִ� :"+Short.MAX_VALUE+"/ �ּҰ� : "+ Short.MIN_VALUE);
		System.out.println("char �ִ� :"+ (int)Character.MAX_VALUE+"/ �ּҰ� : "+(int)Character.MIN_VALUE);
		System.out.println("Boolean�� �ִ� :"+Boolean.TRUE+"/ �ּҰ� : "+ Boolean.FALSE);
		//System.out.println("void�� �ִ� :"+Void.MAX_VALUE+"/ �ּҰ� : "+ Void.MIN_VALUE);

			int deci=15;
			int octal=017;
			int hex = 0xf;

			int tel=0101237; //8������ 8�̾�� �� �� ����.tel=0101238

			System.out.println(deci+octal+hex+"+"+tel);

	}
}
