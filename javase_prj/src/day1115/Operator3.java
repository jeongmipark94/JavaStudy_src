package day1115;
/*
	����Ʈ������
	<< (left shifr) : ��Ʈ�� �������� �а� �о ��ĭ�� 
						�׻� 0���� ä���.
	>> (right shift) : ��Ʈ�� ���������� �а� �о ��ĭ�� 
						�ֻ��� ��ȣ��Ʈ�� ���� ����� 0�� ������
						1�� ä���.
	>>> (unsigned right shift) : ��Ʈ�� ���������� �а� 
						�о ��ĭ�� �׻� 0���� ä���. 
*/

class Operator3{
	public static void main(String[] args){
		System.out.println();

	//mothod : static method ���
	// Ŭ������.method��(��)
	int i=11;
	System.out.println( Integer.toBinaryString(i) );//1011
	System.out.println( Integer.toOctalString(i) );//013
	System.out.println( Integer.toHexString(i) );//0xb

	i=9;
	System.out.println( i+"<<3=" + (i <<3));
	i=36;
	System.out.println( i+">>3=" + (i >>3));
	i=120;
	System.out.println( i+">>>4=" + (i >>>4));

	i=1;
	System.out.println( i << 32 );//�ֻ��� ��ȣ��Ʈ ����
	i = -1;
	System.out.println( i >> 100 );// �ֻ��� ��ȣ��Ʈ ����
	System.out.println( i >>> 1 );//�ֻ��� ��ȣ��Ʈ ���� 0���� ����
	}//main
}//class
