package day0103;

/**
 * �Ű������� �֤�
 * @author owner
 */
public class UseLambda2 {

	public static void main(String[] args) {
		//�Ű������� �ִ� �߻� �޼��� ���
		//�߻�޼��尡 �Ű������� ������ �ִٸ� ���ٽĿ� �Ű������� ���� 
		
//		TestLambda2 tl2 =(int i, int j)-> System.out.println(i+ "+" +j+"="+(i+j));
//		���ٽĿ� ����Ǵ� �Ű��������� �߻� �޼����� �Ű�������� ���� �ʿ�� ����.
//		TestLambda2 tl2 =(int num1, int num2)-> 
//		System.out.println(num1+ "+" +num2+"="+(num1+num2));
		
		//Ÿ�� �߷� : ���ٽĿ� ����Ǵ� �Ű������� ���������� ���� �� �� �ִ�.
		//������ ���¶�� {}�� �־� ����Ѵ�.
		TestLambda2 tl2 =(num1, num2)-> {
			StringBuilder sb = new StringBuilder();
			sb.append(num1).append(" + ").append(num2).append(" = ")
			.append(num1 + num2);
			
		System.out.println(sb);
		};
		tl2.plus(1, 3);
	}

}
