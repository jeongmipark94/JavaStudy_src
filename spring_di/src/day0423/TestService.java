package day0423;

public class TestService {

	//������ ���� ���� ��ü�� ����� �� �ֵ��� instance ������ ����
	private TestDao td;
	
	
	//interface�� ������ ���� ������ ������� �ȴ�. 
	public TestService(TestDao td) {
		this.td = td;
		System.out.println("������ ������ ����");
	}//TestService
	
	public TestService() {
		System.out.println("�⺻ �����ڸ� ����Ͽ� ��ü ����");
	}
	
	
	//method ������ ���� :�ݵ�� �⺻ �����ڰ� �����ؾ��Ѵ�.
	public void setTd(TestDao td) {
		this.td=td;
	}//setTd
	public TestDao getTd() {
		return td;
	}//getTd
	
}
