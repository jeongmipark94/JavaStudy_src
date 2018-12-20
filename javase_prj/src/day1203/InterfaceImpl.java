package day1203;

/**
 * interface를 구현하는 class (자식 클래스이고 interface내의 모든 추상 메서드를 Override하는 클래스) 구현
 * interface가 부모 interface를 가진다면 최종적인 자식클래스에서는 모든 추상메소드를 구현해야한다.
 * 
 * @author owner
 */
public class InterfaceImpl implements SuperInterface {

	public String msg() {// interA에있음
		return "내일은 화요일";
	}// msg

	public String msgB() {// InterB에있음
		return "오늘은 월요일";
	}// msgB

	@Override
	public void methodA() {// SuperInterface에있음
		System.out.println("methodA");
	}// methodA

	@Override
	public void methodB(int i) {// 에있음
		System.out.println("methodB");

	}// methodB

	public void test() {

	}

	public static void main(String[] args) {
		// 자식 클래스로 객체화 : 하면 모든 메소드를 호출할 수 있다.
		// ii.msg(), ii.msgB(), ii.method(); ii.methodB(), ii.test()
		// si.msg(), si.msgB(), si.methodA(), si.methodB()
		InterfaceImpl ii = new InterfaceImpl();
		ii.methodB(12);

		// is a 관계의 객체화
		// SuperInterface로 객체화를 하면 Override 된 method 된 호출
		// 부모의 method로 모두 호출 가능.
		// 1.interA 2.InterB 3.SuperInterface 4. 모두 다 ------>정답 4. 모두 다 올 수 있다.

		SuperInterface si = new InterfaceImpl();
		System.out.println(si.msg());

		// InterA로 객체화하면 : ia, msg()만 호출가능
		InterA ia = new InterfaceImpl();
		System.out.println(ia.msg());

		InterB ib = new InterfaceImpl();
		System.out.println(ib.msgB());

		// Object o = new Interfalcelmpl();
		// interface는 객체화되지 않는다. 추상클래스 처럼.
//		InterA ia1=new InterA();
//		SuperInterface si1 = new SuperInterface();

	}//main

}// class
