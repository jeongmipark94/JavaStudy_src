package day1119;

/**
 * else~if : 연관된 여러 조건을 비교할 때. <br>
 * 문법 ) if(조건식){
 * 				조건에 맞을 때 수행 문장;<br>
 * 			}else if(조건식){<br>
 * 				조건에 맞을 때 수행 문장;<br>
 * }else if(조건식){ <br>
 * 				조건에 맞을 때 수행 문장;<br>
 * }else if(조건식){ <br>
 * 				조건에 맞을 때 수행 문장;<br>
 * 
 *  ....
 *  }else {<br>
 *  모든 조건에 맞지 않을 때 수행 문장;
 *  }
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		System.out.print(i+"는(은)");
		if(i<0) {
			System.out.print("0보다 작아서 실패");
	
	}else if(i>100) {
		System.out.print("100보다 커서 실패");
	}else {
		System.out.println("입력성공");
	}//end else
		
		//이름을 입력 받아 "이재찬"이면 반장을 
		//이봉현, 박영민, 김정운,오영근 이면 조장을
		//그렇지 않으면 "평민"을 이름앞에 출력하세요."직책 이름" 이렇게 출력
		
		if(args[1].equals("이재찬")) {
			System.out.println("반장");
		}else if(args[1].equals("이봉현")||args[1].equals("박영민")||
				args[1].equals("김정운")||args[1].equals("오영근")) {
			System.out.println("조장");

		}else {
			System.out.println("평민");
		}//end if
		System.out.println(args[1]+"님 안녕하세요.");
		
		//실습 - 태어난해(1995)를 입력받아 띠(12) 구하기
		//11-양, 10-말,9-뱀, 8-용, 7-토끼, 6-호랑이,5-소,4-쥐, 3-돼지, 2-개,1-닭,0-원숭이
		
		int a =(Integer.parseInt(args[2]))%12;
		if( a ==11) {
			System.out.print("양");
			}else if( a ==10) {
				System.out.print("말");
			}else if( a ==9) {
				System.out.print("뱀");
			}else if( a ==8) {
				System.out.print("용");
			}else if( a ==7) {
				System.out.print("토끼");
			}else if( a ==6) {
				System.out.print("호랑이");
			}else if( a ==5) {
				System.out.print("소");
			}else if( a ==4) {
				System.out.print("쥐");
			}else if( a ==3) {
				System.out.print("돼지");
			}else if( a ==2) {
				System.out.print("개");
			}else if( a ==1) {
				System.out.print("닭");
			}else 
				System.out.print("원숭이");
	
		
		
		
}//main
}//class
