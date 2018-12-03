package day1203;

/**
 * interface�� �����ϴ� class (�ڽ� Ŭ�����̰� interface���� ��� �߻� �޼��带 Override�ϴ� Ŭ����) ����
 * interface�� �θ� interface�� �����ٸ� �������� �ڽ�Ŭ���������� ��� �߻�޼ҵ带 �����ؾ��Ѵ�.
 * 
 * @author owner
 */
public class InterfaceImpl implements SuperInterface {

	public String msg() {// interA������
		return "������ ȭ����";
	}// msg

	public String msgB() {// InterB������
		return "������ ������";
	}// msgB

	@Override
	public void methodA() {// SuperInterface������
		System.out.println("methodA");
	}// methodA

	@Override
	public void methodB(int i) {// ������
		System.out.println("methodB");

	}// methodB

	public void test() {

	}

	public static void main(String[] args) {
		// �ڽ� Ŭ������ ��üȭ : �ϸ� ��� �޼ҵ带 ȣ���� �� �ִ�.
		// ii.msg(), ii.msgB(), ii.method(); ii.methodB(), ii.test()
		// si.msg(), si.msgB(), si.methodA(), si.methodB()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);

		// is a ������ ��üȭ
		// SuperInterface�� ��üȭ�� �ϸ� Override �� method �� ȣ��
		// �θ��� method�� ��� ȣ�� ����.
		// 1.interA 2.InterB 3.SuperInterface 4. ��� �� ------>���� 4. ��� �� �� �� �ִ�.

		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());

		// InterA�� ��üȭ�ϸ� : ia, msg()�� ȣ�Ⱑ��
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());

		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());

		// Object o = new Interfalcelmpl();
		// interface�� ��üȭ���� �ʴ´�. �߻�Ŭ���� ó��.
//		InterA ia1=new InterA();
//		SuperInterface si1 = new SuperInterface();

	}//main

}// class
