package kr.co.sist.diary.vo;

public class MonthVO {
	private int num;
	private String subject;
	public MonthVO(int num, String subject) {
		super();
		this.num = num;
		this.subject = subject;
	}
	public MonthVO() {
	}
	
	public int getNum() {
		return num;
	}
	public String getSubject() {
		return subject;
	}
	
	
	
	
}
