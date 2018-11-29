package day1120;

/**
 * for : 시작과 끝을 알 때 사용하는 반복문<br>
 * 문법 : for(시작값 ; 끝값 ; 증가또는 감소식){<br>
 * 			반복 수행 문장;<br>
 * 			}
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
			//0에서부터 9까지 10보다 작을 떄 까지 반복수행하는 for
		
		for(int i = 0; i<10 ; i++) {
			System.out.println(i + "번 안녕");
		}//end for
		
		//1에서부터 1씩 증가하며 100까지 반복 수행 for
		
		for (int i =1; i<101; i++) {
			System.out.println(i);
		}
		//반복문 조건줄 떄 <= >= 등은 두번 물어봄.크거나 같을 때,.. 처럼. 그래서 >, < 같이 단일 비교하는 것이 좋음
		
		//1에서부터 100까지 짝수만 옆으로 출력
		for(int i=1; i<101; i++) {
			if(i%2 ==0) {				
			System.out.print(i+" ");
			}//end if
		}//end for
		System.out.println();//줄변경
		
		
		//1에서 부터 100까지 홀수만 옆으로 출력
		int cnt=0;
		//증,감소식은 변수에 값을 변화시키고 유지 시킬수 있는 모든 연산자를 사용할 수 있다.
		for(int i=1; i<101; i+=2) {
			cnt++;
//			if(i%2 ==1) {				
				System.out.print(i+" ");
//			}//end if
		}//end for
	System.out.println("\n"+cnt+"번");

		//1~100까지 출력하기 3의 배수마다 숫자대신 "짝"을 출력 (플로우차트)
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				System.out.println(i+"번"+" 짝 ");		
				continue;
			}//end if
			System.out.println(i);
		}//end for
	
		//1~100까지의 합 출력 : 1에서부터 100까지의 합은 5050 (플로우차트)
	int sum =0;
	for(int i=1; i<101; i++) {
		sum +=i; // sum=sum+i
	}
	System.out.println("1에서부터 100까지의 합은 "+sum);
	
	//A~Z까지 출력
	//방법 1
	for(char c='A'; c<='Z'; c++ ) {
	System.out.print(c );
	}//end for
	
	//방법 2
	for(int c=65; c<91; c++) {
		System.out.println((char)c);
	}//end fo
	
	// 2단 구구단
	for(int i=1; i<10; i++) {
		System.out.println("2 * "+i+" = " +(2*i));
	}
	
	
	}//main

}//class
