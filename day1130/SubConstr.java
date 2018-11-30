package day1130;

public class SubConstr extends SuperConstr {
	
	int i;
	
	public SubConstr() {
		super();
		System.out.println("자식 기본 생성자");
	}
	
	public SubConstr(int i) {
		this();
		System.out.println("자식의 인자 생성자"+ i);
	}
	
	
}
