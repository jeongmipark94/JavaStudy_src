package day1203;

/**
 * ���� Ŭ����(�ڽ� Ŭ����)���� �ݵ�� �����ؾ��ϴ� ���� ��ϸ�
 * �����ϴ� interface ����.(������ ������)
 * @author owner
 */
//interface�� �θ� ������ ���� �� �ִ�. 
public interface SuperInterface extends InterA,InterB {
	//constant : ������ ���ó�� ���.
	//int i;//������ �ۼ��� �� ����.
	public static final int FLAG_VALUE= 12;
	
	//�߻� method����
	//�Ϲ� method�� ���� �� ����.
	
//	interface�� ��ӿ��� �߻�޼ҵ带 Override���� �ʴ´�.
	//�������� �ڽĿ��� ���� ���Ѵ�.
//	@Override
//	public String msg();
	
	//abstract�� ������� �ʾƵ� �ȴ�
	public void methodA();
	//abstract�� ����ص� �ȴ�.
	public abstract void methodB(int i);
	//�������̽������� �߻�޼ҵ�� abstract �� ������� �ʾƵ� �ȴ�. 
	
}//interface
