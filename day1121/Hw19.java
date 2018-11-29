package day1121;

public class Hw19 {

	/*
	 * 숙제 1. while을 사용하여 구구단 전체 단을 출력하는 instance method를 작성하고, 호출하세요.
	 */
	public void gugudan() {
		int i = 1;
		while (i<10) {
			int j = 1;
			while( j<10) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Hw19 hw19=new Hw19();
		hw19.gugudan();
	
		
		
		
		/*2.  do~while을 사용하여 아래의 형태의  *을 출력하는  static method를
		    작성하여 호출하세요.
		    *
		    **
		    ***
		    *****/

//			int i = 1;
//			int j = 1;
//			while (i<10 ) {
//				System.out.println(i+"x"+j+"="+i*j);
//				
//				i++;
//				j++;
//			}
//			
//		}
		
		
		
	}// main

}// class
