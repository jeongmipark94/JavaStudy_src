package day0423;

public class TestService2 {

	//������ ���� ���� ��ü�� ����� �� �ֵ��� instance ������ ����
	private TestDao td;
	private TestDao2 td2;
	
	
	//interface�� ������ ���� ������ ������� �ȴ�. 
	public TestService2(TestDao td, TestDao2 td2 ) {
		this.td = td;
		this.td2 = td2;
		System.out.println("�Ű������� �������� �����ڿ� ������ ����");
	}//TestService
	
	
}//class
