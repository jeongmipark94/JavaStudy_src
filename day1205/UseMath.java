package day1205;

/**
 *	Math : ��ü�� ���������ʰ� ����ϴ� Ŭ����.
 * @author owner
 */
public class UseMath {
	public UseMath() {
//		Math m =new Math();
		int i = -12;
		System.out.println("i�� ���밪 : " +Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));//�Ҽ��� ���� ù�ڸ�����
		System.out.println(Math.floor(10.5));//�Ҽ��� ���� ù�ڸ�����

		double d= Math.random();
		System.out.println("�߻��� ���� : " +d);
		System.out.println("������ ������ ���� : " +d*5);
		System.out.println("������ ������ �������� ���� : " +(int)(d*5));
		
		//A(65)~Z(90) �� �ϳ��� ���ڸ� ��ȯ�ϴ� ��.
		System.out.println( (char)((int)(d*26)+65) );
		
		System.out.println((char)((int)(d*26)+65));
		
//		public char[]hwPassword(){
//			char[] tempPass = new char[8];
//
//		double p=(int)(Math.random());
////		int i =0;
//		String r;
//		System.out.println(p);
//		 if(p>0) {
//			 for(i=0; i<9; i++) {
//				 if(p>48 ||p<57) {
//					 
//				 }
//				 
//			 }//end for			 
//		 }//end if
//		}
		
		
	}//UseMate
		public char[] createPassword() {
			char[] tempPass= new char[8];
			//������ �빮��, �ҹ���,���ڷ� �̷���� ������ ��й�ȣ 8�ڸ���
			//�����Ͽ� ��ȯ�ϴ� ��
			String flag="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			
			for(int i=0 ; i<tempPass.length; i++) {
				tempPass[i]=flag.charAt((int)((Math.random()*flag.length())));
				System.out.print(tempPass[i]);
			}//end for
			
			
			
//			�ҹ���97-121
//			48~57
			
			
			
			
			
			return tempPass;
		}//createPassword

	public static void main(String[] args) {
//		new UseMath();
		new UseMath().createPassword();
	}//main

}//class
