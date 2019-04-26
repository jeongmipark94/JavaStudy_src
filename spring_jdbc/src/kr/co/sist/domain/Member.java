package kr.co.sist.domain;

public class Member {
	private int num;
	private String name, img;
	
	public Member() {
	}

	public Member(int num, String name, String img) {
		super();
		this.num = num;
		this.name = name;
		this.img = img;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getImg() {
		return img;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
	
}
