package kr.co.sist.domain;

public class DiaryDetail {
	private String writer,subject,contents,w_date,ip;

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setW_date(String w_date) {
		this.w_date = w_date;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getWriter() {
		return writer;
	}

	public String getSubject() {
		return subject;
	}

	public String getContents() {
		return contents;
	}

	public String getW_date() {
		return w_date;
	}

	public String getIp() {
		return ip;
	}
	
}
