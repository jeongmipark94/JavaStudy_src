package day0107;

public class CpEmp2AllVO {
	private int empno,sal;
	private String name, hiredate;
	
	public CpEmp2AllVO() {
		
	}//CpEmp2AllVO

	public CpEmp2AllVO(int empno, int sal, String name, String hiredate) {
		super();
		this.empno = empno;
		this.sal = sal;
		this.name = name;
		this.hiredate = hiredate;
	}//인자있는 CpEmp2AllVO

	public int getEmpno() {
		return empno;
	}

	public int getSal() {
		return sal;
	}

	public String getName() {
		return name;
	}

	public String getHiredate() {
		return hiredate;
	}
	
	
	
	
}
