package day1203;

/**
 * 추상클래스를 부모로하는 자식 클래스<br>
 * 자식클래스는 반드시 부모클래스의 모든 추상 method를 Override 해야한다.
 * @author owner
 */
public class AbstractSub extends AbstractSuper {
	public void subMethod() {
		System.out.println("자식 method!!!");
	}//subMethod

	@Override
	//Override 규칙 : 접근지정자는 달라도되고 (광의의) 반환형, method명
	//매개변수는 같아야한다.
	public void  absMethod() {
		//추상method는 super로 호출할 수 없다.  불러봐야 body가 없으니까 일을 할 수 없다.
//		super.absMethod(); //Error 
		System.out.println("Override한 자식 absMethod");	
	}//absMethod
	
	@Override
	public String  absMethod1(int param_i) {
		return String.valueOf(param_i).concat("- 자식");
	}//absMethod1
	
	public static void main(String[] args) {
		
		//자식 클래스가 객체화되면 추상클래스는 객체화가 된다.
		AbstractSub as = new AbstractSub();
		//자식클래스 객체화 : 부모의 변수, method, 자식의 변수, method
		as.i=12;//부모의 변수 - 나한텐 없지만 내 것처럼 사용 가능
		as.method();//부모의 메소드
		
		//Override 된 method는 자식에서 구현한 것이므로 자식의 method가 호출된다.
		as.absMethod();//같은 이름으로 존재한다면 자식의 메소드 호출
		System.out.println(as.absMethod1(3));
		
		as.subMethod();
		//is a 관계의 객체화 : 객체 다형성
		//부모 클래스명 객체명 = new 자식생성자();
		AbstractSuper as1 = new AbstractSub();
		//부모의 자원호출 가능
		as1.i = 100;
		as1.method();
		//Override된 method가 존재한다면 자식의 method를 호출할 수 있다. 
		//추상메소드는 body가 없다. 그래서 호출 불가능함. 그치만 호출하게된면 자식의 method가 호출된다.(Override)
		as1.absMethod();  //body없는 걸로 가지더라도 ( 컨트롤 +스페이스바 눌렀어도) 자식의 메서드가 불린다,.
		System.out.println(as1.absMethod1(2018));
		
		//is a 관계로 객체화하면 자식이 가진 method는 호출 불가
//		as1.SubMethod();        <-Error
		
		
		
		
	}//main

}//class
