package day1204;

/**
 *	
 * @author owner
 */
public class Outer {
	int i;
	
	public Outer() {
		System.out.println("�ٱ� Ŭ������ ������");
	}//Outer
	
	public void outMethod() {
		System.out.println("�ٱ�Ŭ������ method i="+ i);
//		System.out.println("���� Ŭ������ j="+j); //����Ŭ���� ��üȭ���� ���Ұ�
		//���� Ŭ������ ��üȭ
		Outer.Inner in = this.new Inner();
		//���⼭ this�� �ٱ�Ŭ������ ��ü�� ����Ű�� �ּ���. �װ� �װ�.
		in.j=100;
		in.inMethod();
		
	}//outMethod
	
	/////////////////����Ŭ���� ����////////////////////////
	public class Inner{
		int j;
		public Inner() {
			System.out.println("���� Ŭ������ ������");
		}//Inner
		
		public void inMethod() {
			System.out.println("����Ŭ������ method j="+j+
					",�ٱ� Ŭ������ �ڿ� i="+i);
			//��üȭ ���ص� �ٱ�Ŭ������ �ڿ��� �󸶵��� ������ �� �� �ִ�.
//			outMethod();//�ٱ� Ŭ������ method�� �󸶵��� �θ� �� �ִ�.
		}//inMethod
	}//Inner class
	/////////////////����Ŭ���� ��////////////////////////
		
	public static void main(String[] args) {
		//1.�ٱ� Ŭ������ ��üȭ
		Outer out = new Outer(); //�ٱ� Ŭ���� ��üȭ �ߴٰ�
//		���� Ŭ���� ���� ��üȭ�Ǵ� �� �ƴϴ�.
		out.i=10;
		out.outMethod();
//		out.j=10; // ���� Ŭ������ �ڿ��� ���� �����Ͽ� ����� �� ����.
//		out.inMethod();//���� Ŭ������ �ڿ��� ���� �����Ͽ� ����� �� ����.
		
		//2.���� Ŭ������ ��üȭ : --�ٱ�Ŭ�������� ���� Ŭ������ �ڿ��� ����� �� �ִ�. 
		//�ٱ�Ŭ������.����Ŭ������ ��ü�� = �ٱ�Ŭ������ ��ü��.new ���ʻ�����(); 
//		Outer.Inner in = out.new Inner();
		//�ٱ� Ŭ�������� ������ �� �ִ�.
//		Inner in = out.new Inner(); 
//		in.j=12;
//		in.inMethod();
		
		
	}//main

}//class
