package kr.co.sist.exam.domain;

public class EmpProcedure {
		private int empno, sal, deptno;
		private String ename, dname, loc;
		
		public int getEmpno() {
			return empno;
		}
		public int getSal() {
			return sal;
		}
		public int getDeptno() {
			return deptno;
		}
		public String getEname() {
			return ename;
		}
		public String getDname() {
			return dname;
		}
		public String getLoc() {
			return loc;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		
}
