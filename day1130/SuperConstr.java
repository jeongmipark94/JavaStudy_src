package day1130;

public class SuperConstr {

	int i;
	
	public SuperConstr() {
		this(100);
		System.out.println("�θ��� �⺻ ������");
	}
	
	public SuperConstr(int i) {
		super();
		this.i=i;
		System.out.println("�θ� ���� ������"+ i);
	}
	//�ּ����� ���Ƶ� �⺻�����ڴ� �⺻������ ���������,
}
