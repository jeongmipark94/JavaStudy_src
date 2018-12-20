package day1121;

/**
 * while : 시작과 끝을 모를 때 사용하는 반복문<br>
 * 			최소 0번 수행 최대 조건까지 수행<br>
 * 문법 ) while(조건식){<br>
 * 				반복수행문장;<br>
 * 			}
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		/*int i=100; //초기값
		
		while(i <10) { //조건식
			System.out.println("i="+ i );//반복수행 문장
			i++;//증가식
		}//end while
		*/
		System.out.println("===============================");
		
		//단을 입력받아 2단~9단 사이라면 구구단 출력
		int input= Integer.parseInt(args[0]);//단
		if (input > 1 && input < 10) {
			
		System.out.println(input + "단 출력하겠습니다.");
		
		int i = 1;// 초기식
		while ( i < 10) { // 조건식
			System.out.println(input + " * "+i+"="+(input * i)+ "\t");
			
			i++; //증감식	
		}
		}else {
			System.out.println("단은 2~9사이의 값만 입력가능합니다.");
			
			
			
		}
	
//		if( Integer.parseInt(args[0]);
//		while(i<10) {
//			System.out.println(i*j);
//			
			//무한 loop
			int i=0;
			while(true) {
				System.out.println("무한 loop");	
				if(i==5) {
				break;
				}//end if
				i++;
			}//end while
			
	}//main

}//class
