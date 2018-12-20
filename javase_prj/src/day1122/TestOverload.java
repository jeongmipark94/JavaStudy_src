package day1122;

/**
 * ������ : method Overload<br>
 * �ϳ��� Ŭ�������� ���� �̸��� method�� ������ �ۼ��ϴ� ��.<br>
 * ��Ģ ) ���� ������ ��ȯ�� method���� ���� �����, 
 * 			�Ű������� �ٸ��� �ۼ�. 
 * @author owner
 */
public class TestOverload {
	/**
	 * ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}//printStart
	/** �ԷµǴ� �������� ���� ������ ����ϴ� ��
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for(int i=0; i < count; i++) {
		System.out.print("��");
		}//end for
		System.out.println(" ");
	}//printStart
	
	
	//������ 3���� ����ϴ� method 
	public void gugudan() {
		int i=3;
		for(int j=1; j<10; j++) {
			System.out.println(i+"*"+j+"="+i*j);
			
		}// end for
	}//gugudan
	
	
	
	//�Է��ϴ� ���� 2~9�� ������ �� �ش� �ܺ��� 9�ܱ��� ����ϴ� method
	public void gugudan(int dan ) {
		if (dan>=2 && dan<=9 ) {
			for( int i=dan; i<10; i++) {
			
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				
			}//end for
			}//end for
		}//end if
		else 
			System.out.println("2~9�� �� �Է°����մϴ� ");
	}//end dan
	
	public static void main(String[] args) {

		TestOverload to =new TestOverload();
		//�� 1�� ���
		to.printStar( );
		//���� ������ ���
		to.printStar( 10 );
		
		//������ 3���� ����ϴ� method 
		to.gugudan();
		
		//�Է��ϴ� ���� 2~9�� ������ �� �ش� ���� ����ϴ� method
		to.gugudan(7);
	}//main

}//class
