package day1114;



class PrimitiveDataType{
	public static void main(String[] args) {
		//정수형 
		byte a=10;
		short b=20;
		int c=30;
		long d=40;//할당되는 값이 4byte내 이므로 literal을 변환할 필요가 없음
		long e=2147483648L;
		//literal에 저장이 되지 않으므로 literal의 크기를 변경 - 형명시

		System.out.println("byte: "+ a+",short:"+b+
			", int :" +c+", long :"+d+", "+e);
		// 문자형 : unicode 값 : \u0000
		char f=66; // unicode 값을 10진수로 할당가능.
		char g='0'; //0,'0',"0" 전부 다르다. 정수, 문자,문자열
		char h='가';
		//출력 : unicode에 대한 문자 출력
		
		System.out.println("char : " +f+","+g+","+h);
		
		//실수 
		float i=3.14F; //float은 4byte라서 실수 3.14 리터럴 크기는 8바이트다. 
				//F - 형명시- 실수 literal은 8byte이고 float데이터형은 4byte이므로 값할당이 되지 않는다.
		double j=3.14; //리터럴과 데이터형이 같으므로 형명시(d) 생략 할 수 있다. 
		double k=3.14D;

		System.out.println("float :"+i+", double :"+j+","+k);
		//불린형
		boolean l=true;
		boolean m=false;
		System.out.println("boolean :"+l+","+m);
		byte b1=10, b2=20;
		int result=0;
		result = b1 + b2; //자동 형변환 더해서 int로 되기 떄문에 result는 byte로 선언했어서 안들어가짐, 그러므로 result를 int로 바꿔선언.
		System.out.println(result);


	}//main
}//class
