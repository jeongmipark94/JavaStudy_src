package day1114;



class PrimitiveDataType{
	public static void main(String[] args) {
		//������ 
		byte a=10;
		short b=20;
		int c=30;
		long d=40;//�Ҵ�Ǵ� ���� 4byte�� �̹Ƿ� literal�� ��ȯ�� �ʿ䰡 ����
		long e=2147483648L;
		//literal�� ������ ���� �����Ƿ� literal�� ũ�⸦ ���� - �����

		System.out.println("byte: "+ a+",short:"+b+
			", int :" +c+", long :"+d+", "+e);
		// ������ : unicode �� : \u0000
		char f=66; // unicode ���� 10������ �Ҵ簡��.
		char g='0'; //0,'0',"0" ���� �ٸ���. ����, ����,���ڿ�
		char h='��';
		//��� : unicode�� ���� ���� ���
		
		System.out.println("char : " +f+","+g+","+h);
		
		//�Ǽ� 
		float i=3.14F; //float�� 4byte�� �Ǽ� 3.14 ���ͷ� ũ��� 8����Ʈ��. 
				//F - �����- �Ǽ� literal�� 8byte�̰� float���������� 4byte�̹Ƿ� ���Ҵ��� ���� �ʴ´�.
		double j=3.14; //���ͷ��� ���������� �����Ƿ� �����(d) ���� �� �� �ִ�. 
		double k=3.14D;

		System.out.println("float :"+i+", double :"+j+","+k);
		//�Ҹ���
		boolean l=true;
		boolean m=false;
		System.out.println("boolean :"+l+","+m);
		byte b1=10, b2=20;
		int result=0;
		result = b1 + b2; //�ڵ� ����ȯ ���ؼ� int�� �Ǳ� ������ result�� byte�� �����߾ �ȵ���, �׷��Ƿ� result�� int�� �ٲ㼱��.
		System.out.println(result);


	}//main
}//class
