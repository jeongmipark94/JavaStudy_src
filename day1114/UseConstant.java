package day1114;

/*
	�ٸ� Ŭ������ �ִ� ����� ����غ������� Ŭ���� 
*/
class UseConstant{
	public static void main(String[] args){
	//�ٸ� Ŭ������ �����ϴ� ����� "Ŭ������.�����"�� ������ ������.
	//System.out.println( MAX_SCORE);
	System.out.println(Constant.MAX_SCORE+"/"+Constant.MIN_SCORE);

	int my_score=95;
	my_score=93;
//	MAX_SCORE=90; ����� ���Ҵ��� ���� �ʴ´�.
	my_score=83;

	//System.out.println("������ �ְ�����"+Constant.MAX_SCORE +"���̰�, ��������"+
	//MIN_SCORE+"�Դϴ�. ȹ��������" +my_score+"�̰� �ְ����� ȹ�������� ���̴� "+(MAX_SCORE - my_score));



	}//main
}//class
