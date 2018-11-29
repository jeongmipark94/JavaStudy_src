package day1119;

/**
 * if~else : 둘중 하나의 코드를 실행해야할 때 사용<br>
 * 문법 ) if(조건식){<br>
 * 			 조건에 맞을 때 수행할 문장들;<br>
 * 			}else{<br>
 * 				조건에 맞지 않을 때 수행할 문장들;<br>
 * 			}
 * @author owner
 */
public class TestIfElse {

	public static void main(String[] args) {
			int i=19;
			//변수에 존재하는 수가 음수인지, 양수인지를 판단
			System.out.print( i+"는(은)");
					if(i <0) {
						System.out.println("음수");
					}else {
						System.out.println("양수");
				
			}//end if
					
			//변수에 존재하는 수가 홀수인지, 짝수인지를 판단
			//수행하는 행수가 한행이라면 {는 생략할 수 있다}		
					if(i % 2 == 0) { 
						System.out.println("짝수");
						
					}else {
						System.out.println("홀수");
						System.out.println("홀수우우우우우");
					}//end if
						
						//입력하는 수가 3의 배수라면 "짝"을 출력하고 그렇지 않다면
						//입력한 수를 출력하시오. 
					
					
					
					
					
					
					
					
					
	}//main

}//class
