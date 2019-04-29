package kr.co.sist.domain;

public class MemberImg {
	private int cnt;
	private String img;
	public MemberImg(int cnt, String img) {
		this.cnt = cnt;
		this.img = img;
	}
	public MemberImg() {
	}
	public int getCnt() {
		return cnt;
	}
	public String getImg() {
		return img;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
