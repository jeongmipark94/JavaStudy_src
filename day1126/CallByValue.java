package day1126;

/**
 * method 의 매개변수가 기본형으로 정의된다면 매개변수에 할당되는 값은
 * 복사되어 전달된다. 
 * 매개변수에 값을 변경하더라도 원래의 값이 변경되지 않는다. (Call by value)
 * @author owner
 */
public class CallByValue {
	
	public void swap(int i, int j) {//가변 일을 하는 메소드 형식
		int temp=0;
		//입력되는 변수의 값을 서로 변경.
		temp=i;
		i=j;
		j=temp;
		System.out.println("swap method 내에서 i="+ i+", j="+j);
	}//swap
	
	

	public static void main(String[] args) {
			int i=11, j=26;
			System.out.println("swap 전 i="+i+",j="+j);
			
			CallByValue cbv = new CallByValue();
			cbv.swap(i, j);//값이 복사되어 들어간다.
			
			System.out.println("Swap 후 i="+i+",j="+j);
			
	}//main

}//class
