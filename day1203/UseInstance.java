package day1203;

public class UseInstance {
	public TestSuper test1() {
		//is a ������ ��üȭ : �θ��� �ڿ��� �ڽ��� Override�� method�� ��밡��
		//�θ� �������� ��ü�� = new �ڽ�Ŭ����������();
		TestSuper ts =new TestSub();
		return ts;
	}//test1

	public TestSuper test2() {
		//is a ������ ��üȭ : �θ��� �ڿ��� �ڽ��� Override�� method�� ��밡��
		//�θ� �������� ��ü�� = new �ڽ�Ŭ����������();
		TestSuper ts =new TestSub();
		return ts;
	}//test2
		
	public static void main(String[] args) {
		
		//�ڽ� Ŭ������ ��ü�� �����Ͽ� ���.
		//�ڽ�Ŭ������ ��ü�� = new �ڽ��� ������(); <-�Ϲ���
		//��ü�� ��밡���� �� : �θ� Ŭ������ ����, �޼ҵ�, �ڽ� Ŭ������ ����, �޼ҵ�
		TestSub ts = new TestSub();
		ts.i = 100; //�θ�� ���� �̸��� ������ �ڽ��� ���� ���.
		//main �޼ҵ峪 static ������ super������.
		ts.pMethod(); //�θ��� method�� ����� �� �ִ�.
		ts.subMethod();//�ڽ��� method
		ts.printI(); // �ڽ��� override�� method�� ��� �ڽ��� method ȣ��
		//�� ������ �Ϲ����� ��üȭ
		
		System.out.println("--------------�θ��� �̸����� ��üȭ : ��ü ������ ---------");
		//��ü������ : ���� �̸��� Ŭ������ �پ��ϰ� ����ϴ� ��.
		//�θ� ����� �� �˸�ȴ�.
		UseInstance ui = new UseInstance();
		
		TestSuper ts1 =ui.test1();
		TestSuper ts2 =ui.test2();
		
		ts1.printI(); //Override�� method ȣ��
		ts2.printI();
		
		
		//
		
		
	}//main

}//class
