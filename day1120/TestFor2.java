package day1120;

/**
 * �پ��� for ����
 * 
 * @author owner
 */
public class TestFor2 {

	public static void main(String[] args) {
		// ���� loop
//		for( ; ; ) {
//			System.out.println("���ѷ���");
//		}//end for
//		System.out.println(""); // ���ѷ��� �Ʒ����ִ� �ڵ�� ������� �ʱ� ������ ���⿡ ���ִ� ���� �ǹ� ����

		// �����ϴ� ���� ���� ���� loop
		// for() {
		for (int i = 0;; i++) {
			System.out.println("���� loop" + i);
			if (i == 50) {
				break; // ���� �αٿ� �ִ� �ݺ����� ����������. for �ȿ� for�� ���� �� ���� for�� ��������
			} // end if//if�� �ִ� ���� ���ѷ����� �ƴϰԵ�. ���ѷ���ó�� ������
		} // end for
		// }

		// �������� �ʱⰪ�� ����ϴ� for
		for (int i = 0, j = 10, k = 30; i < 10; i++, j++, k--) {
			System.out.println(i + " " + j + " " + k);
		} // end for

		// ���ǽ��� �߸������ϸ� ���� loop�� ����.
//		for(int i=0; i<10; i--) {
//			System.out.println(i);
//		}//end for            -i�� 10�� ������ ���� ���ϱ� ������ ���� �����̴�.

		int i = 0;
		for (i = 0; i < 10; i++);{
			System.out.println("�ݺ���" + i);
		}
	}// main

}// class
