package kr.co.sist.vo;

public class EmpVO {
	private int emptno, sal;
	private String ename, job, hiredate;
	
	
	public EmpVO() {
		super();
	}
	public EmpVO(int emptno, int sal, String ename, String job, String hiredate) {
		super();
		this.emptno = emptno;
		this.sal = sal;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}
	public int getEmptno() {
		return emptno;
	}
	public int getSal() {
		return sal;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setEmptno(int emptno) {
		this.emptno = emptno;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
	
}
