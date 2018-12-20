package day1130;

public class SuperConstr {

	int i;
	
	public SuperConstr() {
		this(100);
		System.out.println("부모의 기본 생성자");
	}
	
	public SuperConstr(int i) {
		super();
		this.i=i;
		System.out.println("부모 인자 생성자"+ i);
	}
	//주석으로 막아도 기본생성자는 기본적으로 만들어진다,
}
