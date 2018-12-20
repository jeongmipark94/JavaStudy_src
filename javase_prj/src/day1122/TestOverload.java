package day1122;

/**
 * 다형성 : method Overload<br>
 * 하나의 클래스에서 같은 이름의 method를 여러개 작성하는 것.<br>
 * 규칙 ) 접근 지정자 반환형 method명은 같게 만들고, 
 * 			매개변수만 다르게 작성. 
 * @author owner
 */
public class TestOverload {
	/**
	 * ★을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}//printStart
	/** 입력되는 값에따라 ★을 여러개 출력하는 일
	 * @param count 출력할 별의 갯수
	 */
	public void printStar(int count) {
		for(int i=0; i < count; i++) {
		System.out.print("☆");
		}//end for
		System.out.println(" ");
	}//printStart
	
	
	//구구단 3단을 출력하는 method 
	public void gugudan() {
		int i=3;
		for(int j=1; j<10; j++) {
			System.out.println(i+"*"+j+"="+i*j);
			
		}// end for
	}//gugudan
	
	
	
	//입력하는 단이 2~9단 사이일 때 해당 단부터 9단까지 출력하는 method
	public void gugudan(int dan ) {
		if (dan>=2 && dan<=9 ) {
			for( int i=dan; i<10; i++) {
			
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				
			}//end for
			}//end for
		}//end if
		else 
			System.out.println("2~9단 만 입력가능합니다 ");
	}//end dan
	
	public static void main(String[] args) {

		TestOverload to =new TestOverload();
		//별 1개 출력
		to.printStar( );
		//별을 여러개 출력
		to.printStar( 10 );
		
		//구구단 3단을 출력하는 method 
		to.gugudan();
		
		//입력하는 단이 2~9단 사이일 때 해당 단을 출력하는 method
		to.gugudan(7);
	}//main

}//class
