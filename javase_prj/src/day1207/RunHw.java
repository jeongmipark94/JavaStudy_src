package day1207;
/*	���� 1.
main method�� arguments�� ��¥�� ������ �Է� �޾� �Է¹��� ��¥��
 ������ �����ϰ� ����ϴ� method �� �ۼ��ϼ���.

��) java Test 4 12 30 32 35 15 4   

���) 4 ȭ
        12 ��
        15 ��
        30 ��  */

public class RunHw {
	
	public static void main(String[] args) {
		HW hw =new HW();
		
		hw.setDate(args);
		hw.printDate(hw.map);
		
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		
	}

}
