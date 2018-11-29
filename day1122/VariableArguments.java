package day1122;

/**
 * Variable Arguments :
 * 매개변수는 하나인데 인수를 여러개 넣을 수 있는  기능<br>
 * method 내에서는 배열로 처리된다.<br>
 * 정의 ) "데이터형 ... 파라메터명" 형식으로 정의
 * 
 * @author owner
 */
public class VariableArguments {
	/**동일 데이터형으로 된 인수 값을 여러개 사용할 때 
	 * @param param 가변 인자형
	 */
	public void test(int ... param) {
		for(int val : param) {
			System.out.println(val);
		}//end for
		System.out.println("test method called!");
	}//test
	
	/**
	 * 가변 인수를 받기위한 매배견수는 가장 마지막에만 사용할 수 있다.
	 * @param i 정수 하나
	 * @param d 실수 하나
	 * @param j      이 뒤로는 몇개가 들어가도 상관없다.
	 */
	public void test1(int i, double d, int ... j) {
		System.out.println("처음 매개변수 : "+i);
		System.out.println("두번째 매개변수 : "+d);
		System.out.println("세번쨰 매개변수 : "+j);
		for(int idx=0; idx< j.length ; idx++) {
			System.out.println(j[idx]);			
		}//end for
		
	}//test
	//문자열을 입력받을 수 있는 매개변수를 사용.
	public void printName(String name) {
		System.out.println( name +"님 안녕하세요?" );
		}//printName
	public static void main(String[] args) {
			VariableArguments va = new VariableArguments();
		//	va.test(1,2,3,4,5);
			va.test1(1, 3.14, 10, 20,30,40,50,60 );
			
		 String name="이재찬";
		 System.out.println(name);
		 va.printName(name);
		 
		// String path="c:\temp\kkk.file.txt";
		 //System.out.println(path);
		 //출력 : 안녕하세요.
		 System.out.println("안녕하세요");
		 System.out.println("'안녕하세요'");
		 System.out.println("\"안녕하세요\"");
		 
		 
			
	}//main

}//class
