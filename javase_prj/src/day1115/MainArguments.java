package day1115;
/*
	Java 프로그램 외부에서 Java 프로그램 내부로 값을
	전달할 때 main method의 Arguments 사용.
	실행 ) java bytecode명(클래스 파일명을 의미) 값 값 값
*/
class MainArguments{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		
//		System.out.println(args[0]*args[1]);
		//이 데이터형이 스트링이여서 문자열로 인식됨. 연산 사용 못한다.

//		int i=args[0]; //안된다. int는 기본형데이터고 args는 참조형이라서 데이터를 못넣는다. 캐스팅도 안된다. 아예 데이터형 구조가 달라서
		//문자열을 정수로 변환
		//Integer.parselnt ( 문자열 ); 문자열을 구분하여 int형으로 변환한 후 그 값을 반환하는 일 - 되게 많이 쓴다. 
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		System.out.println(i*j);

		System.out.println(args[2]+"님 안녕하세요");
	}//main
}//class
