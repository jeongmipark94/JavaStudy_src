package day0110;

public class TestProcUpdateVO {

	private int empno, sal;
	private String job;
	
	public TestProcUpdateVO() {

	}//기본생성자

	public TestProcUpdateVO(int empno, int sal, String job) {
		this.empno = empno;
		this.sal = sal;
		this.job = job;
		
		
	}//인자있는 생성자

	public int getEmpno() {
		return empno;
	}

	public int getSal() {
		return sal;
	}

	public String getJob() {
		return job;
	}
	//getter만
	
	
}
