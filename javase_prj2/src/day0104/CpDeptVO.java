package day0104;

public class CpDeptVO {//값이 하나라도 다르면 VO새로 만든다.
	private int deptno;
	private String dname, loc;
	
	public CpDeptVO() {
	}
	
	public CpDeptVO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	
	
}//class
