package day1120;

/**
 * 다양한 for 형태
 * 
 * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {
		// 무한 loop
//		for( ; ; ) {
//			System.out.println("무한루프");
//		}//end for
//		System.out.println(""); // 무한루프 아래에있는 코드는 실행되지 않기 때문에 여기에 써주는 것은 의미 없다

		// 증가하는 수를 세는 무한 loop
		// for() {
		for (int i = 0;; i++) {
			System.out.println("무한 loop" + i);
			if (i == 50) {
				break; // 가장 인근에 있는 반복문을 빠져나간다. for 안에 for가 있을 땐 안쪽 for를 빠져나감
			} // end if//if가 있는 순간 무한루프가 아니게됨. 무한루프처럼 보여도
		} // end for
		// }

		// 여러개의 초기값을 사용하는 for
		for (int i = 0, j = 10, k = 30; i < 10; i++, j++, k--) {
			System.out.println(i + " " + j + " " + k);
		} // end for

		// 조건식을 잘못설정하면 무한 loop에 들어간다.
//		for(int i=0; i<10; i--) {
//			System.out.println(i);
//		}//end for            -i가 10을 영원히 넘지 못하기 때문에 무한 루프이다.

		int i = 0;
		for (i = 0; i < 10; i++);{
			System.out.println("반복문" + i);
		}
	}// main

}// class
