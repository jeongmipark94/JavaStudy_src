package day1122;

public class Hw20 {

	/*숙제 
	아래의 업무를 처리하는 method를 type에 알맞게 작성하고 API주석을
	 설정한 후 호출하여 결과를 본 후 Java Doc을 생성해보세요.
	- API주석은 어떤 형태의 method인지를 주석으로 기술할것.*/

	//1. 자신의 이름을 반환하는 method작성. - 타입A
	/**
	 * 자신의 이름을 반환하는 method작성. - 타입A
	 */
	public void myname() {
		System.out.println("박정미");
	}
	//2. 나이를 입력받아 태어난 해를 반환하는  method 작성. 
	/**나이를 입력받아 태어난 해를 반환하는  method 작성. 
	 * @param age
	 * @return
	 */
	public int birth(int age) {
		return 2018-age+1;
	}
	//3. 문자를 입력받아 해당 문자의 Unicode 값을 반환하는 method 작성.
	/** 문자를 입력받아 해당 문자의 Unicode 값을 반환하는 method 작성.
	 * @param i
	 * @return
	 */
	public int uni(char i) {
		return (int)i;
	}
	//4. 숫자를 입력받아 숫자가  영문자, 숫자의 범위에 있을 때 해당 숫자의
	    //문자를  출력하는 일을 하는 method  작성
	/**숫자를 입력받아 숫자가  영문자, 숫자의 범위에 있을 때 해당 숫자의
	    //문자를  출력하는 일을 하는 method  작성
	     * 
	 * @param num
	 */
	public void chg(int num) {
		if (num >=65 && num<=90|| num>=97 && num<=122) {
			System.out.println((char)num);
		}//end if
		else 
			System.out.println(num);
			
	}
	
	//5. 호출하면 자신의 주소를 출력하는  method 작성. - 타입A
		/**호출하면 자신의 주소를 출력하는  method 작성. - 타입A
		 * @param hw20
		 */
		public void add(Hw20 hw20) {
		System.out.println(hw20);
	  }
	//6. 친구의 이름을 입력받아 출력하는  method 작성(친구는 n명 입니다.) 타입B
		/**친구의 이름을 입력받아 출력하는  method 작성(친구는 n명 입니다.) 타입B
		 * @param names
		 */
		public void printMyFrinedsName(String... names) { 
			  		for (String name : names) { 
			  			System.out.print(name + " "); 
			  		} 
			  		System.out.println(); 
			  	} //향상된 for 문
//일반 for문으로도 가능하지만 향상된 for문으로 해준다.
		/*for(int i=0; i<names.length; i++) { 
			  			System.out.print(names[i]+" "); 
			 		} 
*/
		
		
	
	
	public static void main(String[] args) {
			Hw20 hw=new Hw20();
			
			hw.myname(); //1번
			System.out.println(hw.birth(25));// 2번 - return출력1
			int chu1 = hw.birth(25);
			System.out.println(chu1);// 2번 -return출력2
		   System.out.println(hw.uni('a'));//3번
			hw.chg(100);//4번
			hw.add(hw);//5번
			hw.printMyFrinedsName("친구1","친구2","친구3","친구4","친구5");
			
			
			
			
			
			
			
			
			
	}//main

}//class
