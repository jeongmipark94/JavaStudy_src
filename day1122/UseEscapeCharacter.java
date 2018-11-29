package day1122;

/**
 *	특수문자 : 문자열내 \로 시작하는 기능을 가진 문자.
 * @author owner
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		System.out.println("이\t재현");//\t : tab
		System.out.println("이\t\t재현");
		System.out.println("정\n택성");//\n : new line
		System.out.println("정\r택성");//\r : return(커서가 앞으로 )
		System.out.println("오늘은 \"급여일 \"입니다.");//\" : "
		System.out.println("오늘은 '급여일'입니다.");//\ ' : '
		System.out.println("c:\\dev\\workspace\\javase_prj\\src\\day1122\\Test.java");//\\ ' : \'
		System.out.println("c:/dev/workspace/javase_prj/src/day1122/Test.java");//슬래시도 먹는다
		System.out.println("이재현\b");
		System.out.println("이재현\f");
		//위의 내용외에 쓸 수 있는 특수문자는 없다.
		
		
				
	}//main

}//class
