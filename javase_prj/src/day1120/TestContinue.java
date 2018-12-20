package day1120;

/**
 * continue : 반복문내의 반복실행 코드의 수행을 건너 뛰는 일.<br>
 * 	
 * @author owner
 */
public class TestContinue {
		
	public static void main(String[] args) {

		//0~100까지 홀수만 출력
		for(int i=0 ; i<100; i++) {
			if(i % 2==0) {
			continue;
			}//end if
			System.out.println("i ="+i);
		}//end for
		
	}

}
