package day1203;

public class UseInstance {
	public TestSuper test1() {
		//is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method만 사용가능
		//부모 갤래스명 객체명 = new 자식클래스생성자();
		TestSuper ts =new TestSub();
		return ts;
	}//test1

	public TestSuper test2() {
		//is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method만 사용가능
		//부모 갤래스명 객체명 = new 자식클래스생성자();
		TestSuper ts =new TestSub();
		return ts;
	}//test2
		
	public static void main(String[] args) {
		
		//자식 클래스를 객체로 생성하여 사용.
		//자식클래스명 객체명 = new 자식의 생성자(); <-일반적
		//객체로 사용가능한 것 : 부모 클래스의 변수, 메소드, 자식 클래스의 변수, 메소드
		TestSub ts = new TestSub();
		ts.i = 100; //부모와 같은 이름의 변수는 자식의 것을 사용.
		//main 메소드나 static 에서는 super못쓴다.
		ts.pMethod(); //부모의 method를 사용할 수 있다.
		ts.subMethod();//자식의 method
		ts.printI(); // 자식이 override한 method인 경우 자식의 method 호출
		//위 내용이 일반적인 객체화
		
		System.out.println("--------------부모의 이름으로 객체화 : 객체 다형성 ---------");
		//객체다형성 : 같은 이름의 클래스를 다양하게 사용하는 것.
		//부모만 사용할 줄 알면된다.
		UseInstance ui = new UseInstance();
		
		TestSuper ts1 =ui.test1();
		TestSuper ts2 =ui.test2();
		
		ts1.printI(); //Override한 method 호출
		ts2.printI();
		
		
		//
		
		
	}//main

}//class
