package day1121;

/**
 * while : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * 			�ּ� 0�� ���� �ִ� ���Ǳ��� ����<br>
 * ���� ) while(���ǽ�){<br>
 * 				�ݺ����๮��;<br>
 * 			}
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		/*int i=100; //�ʱⰪ
		
		while(i <10) { //���ǽ�
			System.out.println("i="+ i );//�ݺ����� ����
			i++;//������
		}//end while
		*/
		System.out.println("===============================");
		
		//���� �Է¹޾� 2��~9�� ���̶�� ������ ���
		int input= Integer.parseInt(args[0]);//��
		if (input > 1 && input < 10) {
			
		System.out.println(input + "�� ����ϰڽ��ϴ�.");
		
		int i = 1;// �ʱ��
		while ( i < 10) { // ���ǽ�
			System.out.println(input + " * "+i+"="+(input * i)+ "\t");
			
			i++; //������	
		}
		}else {
			System.out.println("���� 2~9������ ���� �Է°����մϴ�.");
			
			
			
		}
	
//		if( Integer.parseInt(args[0]);
//		while(i<10) {
//			System.out.println(i*j);
//			
			//���� loop
			int i=0;
			while(true) {
				System.out.println("���� loop");	
				if(i==5) {
				break;
				}//end if
				i++;
			}//end while
			
	}//main

}//class
