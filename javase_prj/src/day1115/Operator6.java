package day1115;
/*
	����(����)������
	?:
*/

class Operator6{
	public static void main(String[] args){
		int i=-1;
		System.out.println(i+"��(��)"+(i>0?"���":"����"));
		//���밪
		System.out.println(i+"�� ���밪 "+(i>=0 ? i:-i));
		//������ ���� ¦������ Ȧ������ �Ǵ��ϴ� ���׿�����
		int j =5;
		System.out.println(j%2==0? "¦��":"Ȧ��");
	}//main
}//class