package day1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	����ڰ� �Է��� Ű������ ���� ó���ϴ� System.in
 * @author owner
 */
public class UseKeyboardInput {
	public UseKeyboardInput() {
		
		System.out.println("�ƹ�Ű�� ������ ����");
		
		//8bit stream�� 16bit Stream�� ����
		
		BufferedReader br = new BufferedReader(
						new InputStreamReader(System.in));
				
		try {
			//�Է� �� �� ���� �Է� ���� �ϳ� �ޱ�.
//			int input= System.in.read();
//			System.out.println("�Է°� : "+ input); 
			
			
//										//�Էµ� ��繮�ڿ� �ޱ� : �ѱ��� ���� �� ����.
//			int input = 0;
//			while(true) {
//				input = System.in.read();
//				System.out.println((char)input);
//				
//				if(input ==13) {
//					break;
//				}
//			}//end while
			
			//16bit stream�� ����Ͽ� �Էµ����͸� �ٴ����� �о� ���δ�.
			
			String str = br.readLine();
			
			System.out.println(str);
			
			//��Ʈ�� ����� �������� ��Ʈ���� ������ ����. 
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//UseKeyboardInput

	public static void main(String[] args) {
			new UseKeyboardInput();
			
	}//main

}//class