package day1120;

/**
 * for : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * ���� : for(���۰� ; ���� ; �����Ǵ� ���ҽ�){<br>
 * 			�ݺ� ���� ����;<br>
 * 			}
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
			//0�������� 9���� 10���� ���� �� ���� �ݺ������ϴ� for
		
		for(int i = 0; i<10 ; i++) {
			System.out.println(i + "�� �ȳ�");
		}//end for
		
		//1�������� 1�� �����ϸ� 100���� �ݺ� ���� for
		
		for (int i =1; i<101; i++) {
			System.out.println(i);
		}
		//�ݺ��� ������ �� <= >= ���� �ι� ���.ũ�ų� ���� ��,.. ó��. �׷��� >, < ���� ���� ���ϴ� ���� ����
		
		//1�������� 100���� ¦���� ������ ���
		for(int i=1; i<101; i++) {
			if(i%2 ==0) {				
			System.out.print(i+" ");
			}//end if
		}//end for
		System.out.println();//�ٺ���
		
		
		//1���� ���� 100���� Ȧ���� ������ ���
		int cnt=0;
		//��,���ҽ��� ������ ���� ��ȭ��Ű�� ���� ��ų�� �ִ� ��� �����ڸ� ����� �� �ִ�.
		for(int i=1; i<101; i+=2) {
			cnt++;
//			if(i%2 ==1) {				
				System.out.print(i+" ");
//			}//end if
		}//end for
	System.out.println("\n"+cnt+"��");

		//1~100���� ����ϱ� 3�� ������� ���ڴ�� "¦"�� ��� (�÷ο���Ʈ)
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				System.out.println(i+"��"+" ¦ ");		
				continue;
			}//end if
			System.out.println(i);
		}//end for
	
		//1~100������ �� ��� : 1�������� 100������ ���� 5050 (�÷ο���Ʈ)
	int sum =0;
	for(int i=1; i<101; i++) {
		sum +=i; // sum=sum+i
	}
	System.out.println("1�������� 100������ ���� "+sum);
	
	//A~Z���� ���
	//��� 1
	for(char c='A'; c<='Z'; c++ ) {
	System.out.print(c );
	}//end for
	
	//��� 2
	for(int c=65; c<91; c++) {
		System.out.println((char)c);
	}//end fo
	
	// 2�� ������
	for(int i=1; i<10; i++) {
		System.out.println("2 * "+i+" = " +(2*i));
	}
	
	
	}//main

}//class
