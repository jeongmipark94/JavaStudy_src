package day1205;

public class HwLotto {
	/*
	 * ����1 1. 1~45 ������ ������ ���߿��� �������� �ϳ��� �̾� 6���� ��Ʈ�� ����� �迭�� ��ȯ�ϴ� method�� ����� ȣ���Ͽ�
	 * ����� ��. ��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ��Ѵ�.
	 */



	public void pick() {
		int result[] = new int[6];

//		int i = 0;
//		int r = 0;
		for (int i = 0; i < 6; i++) {
//			r = (int) (Math.random() * 45) + 1;

			result[i] =  (int) (Math.random() * 45) + 1;
			for(int j=1; j<=i;j++) {
				if(result[i]==result[j]) {
					i--;
					break;//breakŸ�� �ٽ� ������ for�� ���ư��µ�
					//break���� i--�������ϱ� ���� �ٽ� �־��ִ� ȿ���� ����.
				}
			}//for
			System.out.println(result[i]);

		} // for
//		return ;
	}// pick

	public static void main(String[] args) {
		HwLotto hl = new HwLotto();
		hl.pick();
	}// main

}// main
