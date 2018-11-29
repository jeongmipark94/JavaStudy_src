package day1129;

/**
 * 사람의 공통 특징을 부모(Person)로 부터 사용하고 자신만의
 * 		특징만(싸움을 잘한다)  정의
 * @author owner
 */
public class HongGilDong extends Person {
	private int level; // 싸움레벨
	
	
	/**
	 * 홍길동은 싸움을 평민보다 잘하므로 7로 시작
	 */
	public HongGilDong() { // 생성자
		level=7;
	}//HongGilDong
	
	/**
	 * 싸움하는 일 : 입력된 레벨보다 낮다면 패배, 입력된 레벨보다 
	 *  높다면 승리, 입력된 레벨과 같다면 비김.
	 *  승리하면 레벨이 1증가, 패배 하면 레벨이 1감소, 비기면 레벨 변화없음
	 *  레벨은 최대 10, 최소 1을 가진다.
	 * @param inputLevel  싸움상대자의 레벨
	 * @return  싸움의 결과
	 */
	public String fight(int inputLevel) {
		String result="";
		if(level > inputLevel) {//승리
			result= "이겼다 s('. ^)V";
			level++;
			if(level > 10) {
				level=10;				
			}//end if
		}else if( level< inputLevel) {//패배
			result= "졌다 ~(_-_)~";
			level--;
			if(level <1) {
				level=1;
			}//end if
		}else {//비김
			result="비김ㅡㅡ+;;";
		}//end else
		return result;
	}//fight
	
	
}//class
