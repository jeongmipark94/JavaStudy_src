package day1114;

class Hw15{
	public static void main(String[] args) 
	{
		
		//1번 숙제
		/*1. 아래의 값을 저장할 변수를 만들고 출력해 보세요.

   이니셜 : 'K', 나이 : 자신의나이, 왼눈시력 : 1.5, 오른눈 시력 : 0.8

   출력 : 나의 이니셜은 'K'이고, xx살입니다. 시력은 왼눈 xx, 오른눈 xx입니다.*/

		char i='K';
		byte age=25;
		double lft=1.5;
		double rgt=0.8;

		System.out.println("나의 이니셜은"+i+"이고, "+age+"살입니다. 시력은 왼눈"+lft+", 오른눈 "+rgt+"입니다");

		
/*2. 기본형 데이터형에 대응되는 클래스를 Wrapper Class라고 한다. 
   Java Document에서 Wrapper클래스의 상수가 존재하는지 찾아보고 
   그에 대한 최소값과 최대값을 출력 한다. 
 
   출력 :  byte의 최소값 :  -128  최대값 : 127 
*/

		
		System.out.println("byte의 최댓값 :"+Byte.MAX_VALUE+"/ 최소값 : "+ Byte.MIN_VALUE);
		System.out.println("float의 최댓값 :"+Float.MAX_VALUE+"/ 최소값 : "+ Float.MIN_VALUE);
		System.out.println("int의 최댓값 :"+Integer.MAX_VALUE+"/ 최소값 : "+ Integer.MIN_VALUE);
		System.out.println("long의 최댓값 :"+Long.MAX_VALUE+"/ 최소값 : "+ Long.MIN_VALUE);
		System.out.println("short의 최댓값 :"+Short.MAX_VALUE+"/ 최소값 : "+ Short.MIN_VALUE);
		System.out.println("char 최댓값 :"+ (int)Character.MAX_VALUE+"/ 최소값 : "+(int)Character.MIN_VALUE);
		System.out.println("Boolean의 최댓값 :"+Boolean.TRUE+"/ 최소값 : "+ Boolean.FALSE);
		//System.out.println("void의 최댓값 :"+Void.MAX_VALUE+"/ 최소값 : "+ Void.MIN_VALUE);

			int deci=15;
			int octal=017;
			int hex = 0xf;

			int tel=0101237; //8진수는 8이없어서 쓸 수 없다.tel=0101238

			System.out.println(deci+octal+hex+"+"+tel);

	}
}
