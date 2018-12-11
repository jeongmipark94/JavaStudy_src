package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has a ����� �̺�Ʈ ó��
 * @author owner
 */
//1.�̺�Ʈó�� ��ü�� ����
public class EventHandlingHasA implements ActionListener{
	//EventHadnlingHasA �� Design�� ������ �ִ�.
	//2.has a ����� �����ϰ� ����� ��ü ����
	private Design design;
	public EventHandlingHasA(Design design) {
		this.design = design;
	}//EventHandlingHasA

	@Override
	//3. abstract method Override �Ѵ�
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ�� �߻����� �� ó���� �ڵ� - �־��ְ� �������� 5�� �̺�Ʈ ���
		System.out.println("���޹��� Design��ü" + design);
//		dispose(); //frame�� �θ��� window�� �ִ� �޼ҵ��̴�.
		//frame ȣ���� �� �ִ� design�� ���ؼ� �޼��� ȣ��
		design.dispose();
		
	}//actionPerformed
	


}//class
