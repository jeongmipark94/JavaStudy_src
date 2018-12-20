package day1114;


class Constant{ 


	//Constant 선언
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;

	
		public static void main(String[] args){
			//public static final int MIN_SCORE=0;
			//상수는 method내에서 선언할 수 없다. Error
		System.out.println(Constant.MAX_SCORE+"/" + Constant.MIN_SCORE);

		int my_score=95;
		my_score=93;
		//MAX_SCORE=90; //상수는 값할당이 되지 않는다.
		my_score =83;//변수는 몇번이라도 값 할당 가능
		System.out.println("점수의 최고점은"+Constant.MAX_SCORE +"점이고, 최저점은"+
			MIN_SCORE+"입니다. 획득점수는" +my_score+"이고 최고점과 획득점수의 차이는 "+(MAX_SCORE - my_score));
		
		System.out.println("long 최댓값 :"+ Long.MAX_VALUE+"/ 최소값 : "+ Long.MIN_VALUE);
			
	}//main
}//class
