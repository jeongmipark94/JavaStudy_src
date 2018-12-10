package day1210;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �Ϲ�������Ʈ�� LayoutManager�� ���.
 * @author owner
 */
	//Window Component�� ��ӹ޾ƾ���.(����ڿ��� �������� ��)

@SuppressWarnings("serial")
public class UseBorderLayout extends Frame { // ����� �ϸ� �θ� ���� ����(�ڹ��� ��� Ŭ������ �θ�� object)
	
	public UseBorderLayout() {
		super("BorderLayout ����"); //�θ��� �⺻ �����ڸ� ȣ������. ()�ȿ� �� ���� �θ��� �Ű����� �޴� �����ڸ� ȣ��
		
		//2. ����� �Ϲ� ������Ʈ�� ����
		TextField tfNorth = new TextField("North"); //������ �Է��� ���� �� �ִ� ������Ʈ�� ���ܳ�
		Label lblEast = new Label("East");
		TextArea taCenter = new TextArea("Center");//������ �ؽ�Ʈ �Է°���
		Label lblWest = new Label("West");
		Choice choSouth = new Choice();
		choSouth.add("South");
		
		//3. ��ġ������ ���� : Window Component�� Frame, Dialog�� 
		//BorderLayout�� �⺻ �����Ǿ��ִ�.
		setLayout(new BorderLayout());
		
		//4. ������Ʈ�� ��ġ�����ڸ� ����Ͽ� ��ġ 
		//add�� �̿��Ѵ�. ����������. 
		//add("��ġ��ġ",������Ʈ);         add(���, ������Ʈ);
		//���ڿ� ����� ����Ͽ� ��ġ "North""Center"
		add("North", tfNorth);
		add("Center", taCenter); 
//		Center�� ��ġ�ϸ� �׵θ��� North, West, South, East �ڸ��� �������.
		
		//Constant(Field)�� ����Ͽ� ��ġ
		add(BorderLayout.WEST, lblWest);
		add(BorderLayout.EAST, lblEast);
		add(BorderLayout.SOUTH, choSouth);
		
		
		
		//5. �������� ũ�� ����
		setSize(400, 400);
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		//���� (������ ������ �ѹ��� �Ͼ��.)
		addWindowListener(new WindowAdapter() {//���������ʹ� �߻�Ŭ����, ��üȭ�� �ȵ� ��ϸӽ� �̳� Ŭ����
			@Override
			public void windowClosing(WindowEvent we) {
			dispose();
		}//WIndowClosing
		}/*���⼭ anonymous inner class����*/);
		
		
		
	}//UseBorderLayout

	public static void main(String[] args) {
			new UseBorderLayout();
	}//main

}//class
