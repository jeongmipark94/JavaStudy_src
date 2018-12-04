package day1204;

/**
 * 내부클래스를 static변수처럼 사용할 수 있는 중첩클래스.
 * @author owner
 */
public class NestedOuter {

	int i;
	static int j;
	
	public NestedOuter() {
		System.out.println("바깥 클래스의 생성자");
	}//NestedOuter
	
	public void outInstMethod() {
		System.out.println("바깥클래스의 instance method");
	}//outInstMethod
	
	public static void outStatMethod() {
		System.out.println("바깥클래스의 static method");
	}//outStatMethod
	
	///////////////////////////Nested Class 시작///////////////
	static class NestedInner{
//			int in_i; // instance 변수임. static클래스여도 안쪽 영역은 기본이 인스턴스영역
			static int in_j;//static 변수
			
//			public NestedInner() {
//			}
			//static 영역안에서는 주로 인스턴스 변수나 생성자를 만들진 않는다.
			//만들 순 있음.! 그러나 잘 안만들뿐.
			public void inMethod() {
				System.out.println("안쪽 클래스의 instance method");
			}//inMethod
			
			public static void inStatMethod() {
				System.out.println("안쪽 클래스의 static method");
				System.out.println("바깥 클래스의 자원 사용. i= 사용불가, j="+
				NestedOuter.j);
//				outInstMethod(); Instance영역의 method이므로 사용할 수 없다.
				NestedOuter.outStatMethod();
				
			}//inStatMethod
	}//class
	///////////////////////////Nested Class 끝///////////////
	
	
	
	public static void main(String[] args) {
		//static 영역을 사용할 때에는 객체화없이 클래스명.ㅣ변수명,
		//클래스명.method명으로 사용한다.
		NestedInner.inStatMethod();
		
	}//main

}//class
