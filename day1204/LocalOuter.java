package day1204;

/**
 *	method 안에 클래스를 정의하는 지역class의 사용.<br>
 *	생성된 객체를 지역변수처럼 사용하는 클래스
 * @author owner
 */
public class LocalOuter {
	int i;
	
	public LocalOuter() {
		System.out.println("바깥 클래스의 생성자");
	}//LocalOuter
	
	public void method( int param_i, final int param_j ) {//파라미터는 곧 지역변수
		//메소드안에서 선언되어지고 사용되어지는 변수
		int local_i=0;
		final int local_j =0;
		
		///////////////////////////지역 클래스의 시작//////////////////////
		class Local{
			int loc_i;
			
			public Local() {
				System.out.println("지역클래스의 생성자");
			}//Local
			public void locMethod() {
				System.out.println("지역 클래스의 method loc_i=" + loc_i);
				System.out.println("외부 클래스의 인스턴스 변수 i="+i);
				//JDK 1.8 이전에서는 final이 붙은 매개변수만 사용할 수 있다. 
				System.out.println("매개변수(Parameter) param_i ="
						+param_i+",param_j="+param_j); //컴파일러 1.7부터 이렇게 사용ㅇ
				//JDK 1.8 이전에서는 final이 붙은 지역변수만 사용할 수 있다. 
				System.out.println("지역변수 local_i ="+local_i+", local_j"+local_j);
				//local_i=2018; //JDK 1.8 에서부터는 final이 붙어있지 않은 지역변수의
				//출력은 가능하지만 값 할당은 되지않는다.
			}//locMethod
			
		}//class
		
		///////////////////////////지역 클래스의 끝//////////////////////
		//지역클래스를 객체화
		Local lo = new Local();
		//생성된 객체로 클래스의 내의 자원을 사용할 수 있다.
//		loc_i =100; //그냥은 못쓴다. 생성된 객체로 사용할 수 있다.
		//눈에 보여도 직접 사용 불가. 
		lo.loc_i =100;
		lo.locMethod();
		
		System.out.println("바깥 클래스의 method 호출");
	}//method
	
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4); //method 불렀다고 생성자가 불려지진 않음
	}//main

}//class
