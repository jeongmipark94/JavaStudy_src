package day1115;
/*
	Java ���α׷� �ܺο��� Java ���α׷� ���η� ����
	������ �� main method�� Arguments ���.
	���� ) java bytecode��(Ŭ���� ���ϸ��� �ǹ�) �� �� ��
*/
class MainArguments{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		
//		System.out.println(args[0]*args[1]);
		//�� ���������� ��Ʈ���̿��� ���ڿ��� �νĵ�. ���� ��� ���Ѵ�.

//		int i=args[0]; //�ȵȴ�. int�� �⺻�������Ͱ� args�� �������̶� �����͸� ���ִ´�. ĳ���õ� �ȵȴ�. �ƿ� �������� ������ �޶�
		//���ڿ��� ������ ��ȯ
		//Integer.parselnt ( ���ڿ� ); ���ڿ��� �����Ͽ� int������ ��ȯ�� �� �� ���� ��ȯ�ϴ� �� - �ǰ� ���� ����. 
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		System.out.println(i*j);

		System.out.println(args[2]+"�� �ȳ��ϼ���");
	}//main
}//class
