package day1115;
class Hw16{
	public static void main(String[] args){

/*
 숙제
1. 변수에 할당된 값이 양수일때만 2진수로 출력하고 음수라면 ~를 사용하여
    양수로 변경하고 입력된 그대로의 10진수로 출력.
    출력 예)  " 양수 인경우"  10은  1010
                 "음수 인경우"  -10 은 10  */

		int i=-300;
		System.out.println(i>=0 ? Integer.toBinaryString(i):~i+1);



/*
2. 2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
    출력 예) 상위 2byte -> 32767= 0111 1111 1111 1111 
                하위 2byte - > 65535 = 1111 1111 1111 1111
				*/
		int e=2147483647;
		System.out.println(Integer.toBinaryString(e));
		System.out.println( e >> 16 );//상위 2바이트 32767
		System.out.println( ~(e << 16) ); // 하위2바이트 65535
		
		



//3. ||를 사용했을 때 전항이 true라면 후항을 연산하지 않는 것을 증명할 수 있는 코드를 작성하세요.
		boolean flag1=true,flag2=false,flag3=true,flag4=false;


		System.out.println(flag1+" || "+flag3+" = " +(flag1 || flag3)); //true
		System.out.println(flag1+" || "+flag2+" = " +(flag1 || flag2)); //true
		//전항이 true 이면 후항을 계산하지 않는다. 
		System.out.println(flag2+" || "+flag1+" = " +(flag2 || flag1)); //true
		System.out.println(flag2+" || "+flag4+" = " +(flag2 || flag4)); //false

	}
}
