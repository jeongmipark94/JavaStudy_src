package day1204;

/**
 * 인터페이스가 method의 매개변수일때 간단하게 사용하는 방법.<br>
 * 한번이상 쓸 때에는 anonymous 쓰면 더 힘듬
 * 
 * @author owner
 */
public class TestAnony {
	public void useAnonInter(AnonyInter ai) {
		System.out.println(ai.getMsg() + " " + ai.getName());
	}// useAnonyInter

	public static void main(String[] args) {
//		AnonyInter ai= new AnonyInter(); //인터페이스는 객체화 X
		// 인터페이스가 매개변수 였을 때
		// 1.인터페이스를 구현한 클래스를 생성. (AnonyImpl)

		// 2.구현 클래스로 객체를 생성.
//		AnonyInter ai = new AnonyImpl(); //is a 관계의 객체화 가능
		AnonyImpl ai = new AnonyImpl(); // 이것도 가능
		// 3.매개변수를 가진 method를 호출하기 위해 객체 생성
		TestAnony ta = new TestAnony();
		// 4.메소드를 호출
		ta.useAnonInter(ai);
		ta.useAnonInter(ai);
		System.out.println("--------anonymous innerclass---------");
		// anonymous inner class를 사용하면 클래스를 따로 만들필요가 없음.

		ta.useAnonInter(new AnonyInter() {
			@Override
			public String getName() {
				return "공선의 "+ test();
			}// getName

			public String getMsg() {
				return "온노쇼";
			}// getMsg
			public String test() {
				return "자식 method";
			}
		});

	}// main

}// class
