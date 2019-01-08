package day0108;

/**
 * 실행중인 JVM에서 하나의 객체가 만들어지고, 하나의 객체만 사용되는 Pattern.
 * @author owner
 */
public class Singleton {
	private static Singleton single;

	/**
	 * 1. class 외부에서 객체화를 하지 못하도록 막는다.
	 */
		private Singleton() {
		
	}//SIngleton
		public static Singleton getInstance() {
			if(single == null) {//객체가 생성되어있지 않다면 객체를 생성하고
			single = new  Singleton();
			}//end if
			//객체가 생성되어있다면 생성된 객체가 반환된다.
			return single;
		}//getInstance

}//class
