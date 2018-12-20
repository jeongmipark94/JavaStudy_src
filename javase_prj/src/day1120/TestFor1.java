package day1120;

/**
 * 다중 for : 인덱스를 여러개 사용해야하는 경우.<br>
 * 문법) for( 시작값; 끝값 ; 증가.감소식){<br>
 *  			for( 시작값; 끝값 ; 증가.감소식){<br>
 *  				반복수행문장;<br>
 *  				}<br>
 *  			}<br>
 *  		}<br>
 * @author owner
 */
public class TestFor1 {

	public static void main(String[] args) {
			for(int i=0 ; i< 6 ; i++) {
					for( int j=0; j<7; j++) {
						System.out.println("i :"+i+",j: "+j);
					}//end for
					System.out.println("=====================");
			}//end for
			
			//구구단 전단 출력 - 보충
			for(int i=2; i<10 ; i++) {//단
				System.out.println(i+"단 시작");
				for(int j=1; j<10;j++) {//수
					System.out.println(i+ " * "+ j);
				}//end for
					
				
				System.out.println(i+"단 끝");
				
			}//end for
			
			
			/*
			i  j  i  j i  j i  j
			0 0
			1 0 1 1
			2 0 2 1 2 2
			3 0 3 1 3 2 3 3 */
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(i+ " "+j+" ");
				}//end for
				System.out.println(" ");
			}//end for
			System.out.println("=====================");
		/*	i j i j i j i j
			01020304
			121314
			2324
			34*/
			
			for(int i=0;i<4;i++) {
				for(int j=i+1;j<5 ;j++) {
					System.out.print(i+ " "+j+ " ");
				}//end for
				System.out.println(" ");
			}//end for
			
			
			
	}//main

}//class
