package day1115;
/*
	쉬프트연산자
	<< (left shifr) : 비트를 왼쪽으로 밀고 밀어서 빈칸을 
						항상 0으로 채운다.
	>> (right shift) : 비트를 오른쪽으로 밀고 밀어서 빈칸을 
						최상위 부호비트에 따라 양수면 0을 음수면
						1을 채운다.
	>>> (unsigned right shift) : 비트를 오른쪽으로 밀고 
						밀어서 빈칸을 항상 0으로 채운다. 
*/

class Operator3{
	public static void main(String[] args){
		System.out.println();

	//mothod : static method 사용
	// 클래스명.method명(값)
	int i=11;
	System.out.println( Integer.toBinaryString(i) );//1011
	System.out.println( Integer.toOctalString(i) );//013
	System.out.println( Integer.toHexString(i) );//0xb

	i=9;
	System.out.println( i+"<<3=" + (i <<3));
	i=36;
	System.out.println( i+">>3=" + (i >>3));
	i=120;
	System.out.println( i+">>>4=" + (i >>>4));

	i=1;
	System.out.println( i << 32 );//최상위 부호비트 변경
	i = -1;
	System.out.println( i >> 100 );// 최상위 부호비트 유지
	System.out.println( i >>> 1 );//최상위 부호비트 부터 0으로 변경
	}//main
}//class
