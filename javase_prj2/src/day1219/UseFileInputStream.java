package day1219;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  HDD�� �����ϴ� File�� �����Ͽ� �� ������ �о���� �� ����ϴ�
 *  FileInputStream
 * @author owner
 */
public class UseFileInputStream {
	public UseFileInputStream() throws IOException{
		File file = new File("c:/dev/temp/java_read.txt");
		if(file.exists()) {
			BufferedReader br =null;
			try {
				//��Ʈ���� �����Ͽ� JVM���� HDD�� ���ϰ� ����
//				FileInputStream fis = new FileInputStream(file);
//				int temp=0;
//				
//					while( (temp=fis.read()) != -1) {//�о���� ������ �����Ѵٸ�
//						System.out.print((char)temp);
//					}//end while
//					//��Ʈ�� ����� �Ϸ������� ��Ʈ���� ��� �޸𸮴����� ���´�.
//					fis.close();
				
				/////////////////////////////////12-20-2018 �ڵ� �߰�///////////////////
				/// 8bit Stream�� 16bit Stream ���� : �ѱ��� ������ �����ذ�.
//				FileInputStream fis = new FileInputStream(file);//���ϰ� ����
//				InputStreamReader isr = new InputStreamReader(fis);//8bit+16bit����
//				br = new BufferedReader(isr);//�ӵ� ����, �ٴ��� �б�
				
				br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file)));
				
				String temp = "";
				//�ٴ���(\n������)�� �о �о���� ������ �ִٸ�
				while( (temp = br.readLine())!=null) {
					System.out.println(temp);//���
				}//end while
				
								
			}finally{
				if(br != null) {br.close();} //end if
			}//end finally
//				try {
//				} catch (IOException e) {
//					e.printStackTrace();
				}//�ݵ�� ������ ����
				
//		}else {
//			System.out.println("��γ� ���ϸ��� Ȯ���ϼ���.");
//		}//end else
	}//UseFileInputStream
	
	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
