package kr.co.sist.exam.vo;

/**
 * Procedure에 사용되는 VO는 In Parameter 값과 Out Parameter 값을 모두
 * 가지고 있어야한다. 
 * @author owner
 */
public class TestProcVO {

	private int empno, sal, rowCnt;
	private String ename, job, msg;
	public TestProcVO(int empno, int sal, int rowCnt, String ename, String job, String msg) {
		super();
		this.empno = empno;
		this.sal = sal;
		this.rowCnt = rowCnt;
		this.ename = ename;
		this.job = job;
		this.msg = msg;
	}
	public int getEmpno() {
		return empno;
	}
	public int getSal() {
		return sal;
	}
	public int getRowCnt() {
		return rowCnt;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getMsg() {
		return msg;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setRowCnt(int rowCnt) {
		this.rowCnt = rowCnt;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}//class
