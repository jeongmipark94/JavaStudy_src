package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has a 관계로 이벤트 처리
 * @author owner
 */
//1.이벤트처리 객체를 구현
public class EventHandlingHasA implements ActionListener{
	//EventHadnlingHasA 는 Design을 가지고 있다.
	//2.has a 관계로 저장하고 사용할 객체 선언
	private Design design;
	public EventHandlingHasA(Design design) {
		this.design = design;
	}//EventHandlingHasA

	@Override
	//3. abstract method Override 한다
	public void actionPerformed(ActionEvent ae) {
		//이벤트가 발생했을 때 처리할 코드 - 넣어주고 디자인의 5번 이벤트 등록
		System.out.println("전달받은 Design객체" + design);
//		dispose(); //frame의 부모인 window에 있는 메소드이다.
		//frame 호출할 수 있는 design을 통해서 메서드 호출
		design.dispose();
		
	}//actionPerformed
	


}//class
