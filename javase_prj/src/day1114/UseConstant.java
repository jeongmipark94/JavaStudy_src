package day1114;

/*
	다른 클래스에 있는 상수를 사용해보기위한 클래스 
*/
class UseConstant{
	public static void main(String[] args){
	//다른 클래스에 존재하는 상수는 "클래스명.상수명"의 형식을 가진다.
	//System.out.println( MAX_SCORE);
	System.out.println(Constant.MAX_SCORE+"/"+Constant.MIN_SCORE);

	int my_score=95;
	my_score=93;
//	MAX_SCORE=90; 상수는 값할당이 되지 않는다.
	my_score=83;

	//System.out.println("점수의 최고점은"+Constant.MAX_SCORE +"점이고, 최저점은"+
	//MIN_SCORE+"입니다. 획득점수는" +my_score+"이고 최고점과 획득점수의 차이는 "+(MAX_SCORE - my_score));



	}//main
}//class
