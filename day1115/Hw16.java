package day1115;
class Hw16{
	public static void main(String[] args){

/*
 ����
1. ������ �Ҵ�� ���� ����϶��� 2������ ����ϰ� ������� ~�� ����Ͽ�
    ����� �����ϰ� �Էµ� �״���� 10������ ���.
    ��� ��)  " ��� �ΰ��"  10��  1010
                 "���� �ΰ��"  -10 �� 10  */

		int i=-300;
		System.out.println(i>=0 ? Integer.toBinaryString(i):~i+1);



/*
2. 2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
    ��� ��) ���� 2byte -> 32767= 0111 1111 1111 1111 
                ���� 2byte - > 65535 = 1111 1111 1111 1111
				*/
		int e=2147483647;
		System.out.println(Integer.toBinaryString(e));
		System.out.println( e >> 16 );//���� 2����Ʈ 32767
		System.out.println( ~(e << 16) ); // ����2����Ʈ 65535
		
		



//3. ||�� ������� �� ������ true��� ������ �������� �ʴ� ���� ������ �� �ִ� �ڵ带 �ۼ��ϼ���.
		boolean flag1=true,flag2=false,flag3=true,flag4=false;


		System.out.println(flag1+" || "+flag3+" = " +(flag1 || flag3)); //true
		System.out.println(flag1+" || "+flag2+" = " +(flag1 || flag2)); //true
		//������ true �̸� ������ ������� �ʴ´�. 
		System.out.println(flag2+" || "+flag1+" = " +(flag2 || flag1)); //true
		System.out.println(flag2+" || "+flag4+" = " +(flag2 || flag4)); //false

	}
}
