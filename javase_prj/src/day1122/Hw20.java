package day1122;

public class Hw20 {

	/*���� 
	�Ʒ��� ������ ó���ϴ� method�� type�� �˸°� �ۼ��ϰ� API�ּ���
	 ������ �� ȣ���Ͽ� ����� �� �� Java Doc�� �����غ�����.
	- API�ּ��� � ������ method������ �ּ����� ����Ұ�.*/

	//1. �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�. - Ÿ��A
	/**
	 * �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�. - Ÿ��A
	 */
	public void myname() {
		System.out.println("������");
	}
	//2. ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ�  method �ۼ�. 
	/**���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ�  method �ۼ�. 
	 * @param age
	 * @return
	 */
	public int birth(int age) {
		return 2018-age+1;
	}
	//3. ���ڸ� �Է¹޾� �ش� ������ Unicode ���� ��ȯ�ϴ� method �ۼ�.
	/** ���ڸ� �Է¹޾� �ش� ������ Unicode ���� ��ȯ�ϴ� method �ۼ�.
	 * @param i
	 * @return
	 */
	public int uni(char i) {
		return (int)i;
	}
	//4. ���ڸ� �Է¹޾� ���ڰ�  ������, ������ ������ ���� �� �ش� ������
	    //���ڸ�  ����ϴ� ���� �ϴ� method  �ۼ�
	/**���ڸ� �Է¹޾� ���ڰ�  ������, ������ ������ ���� �� �ش� ������
	    //���ڸ�  ����ϴ� ���� �ϴ� method  �ۼ�
	     * 
	 * @param num
	 */
	public void chg(int num) {
		if (num >=65 && num<=90|| num>=97 && num<=122) {
			System.out.println((char)num);
		}//end if
		else 
			System.out.println(num);
			
	}
	
	//5. ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ�  method �ۼ�. - Ÿ��A
		/**ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ�  method �ۼ�. - Ÿ��A
		 * @param hw20
		 */
		public void add(Hw20 hw20) {
		System.out.println(hw20);
	  }
	//6. ģ���� �̸��� �Է¹޾� ����ϴ�  method �ۼ�(ģ���� n�� �Դϴ�.) Ÿ��B
		/**ģ���� �̸��� �Է¹޾� ����ϴ�  method �ۼ�(ģ���� n�� �Դϴ�.) Ÿ��B
		 * @param names
		 */
		public void printMyFrinedsName(String... names) { 
			  		for (String name : names) { 
			  			System.out.print(name + " "); 
			  		} 
			  		System.out.println(); 
			  	} //���� for ��
//�Ϲ� for�����ε� ���������� ���� for������ ���ش�.
		/*for(int i=0; i<names.length; i++) { 
			  			System.out.print(names[i]+" "); 
			 		} 
*/
		
		
	
	
	public static void main(String[] args) {
			Hw20 hw=new Hw20();
			
			hw.myname(); //1��
			System.out.println(hw.birth(25));// 2�� - return���1
			int chu1 = hw.birth(25);
			System.out.println(chu1);// 2�� -return���2
		   System.out.println(hw.uni('a'));//3��
			hw.chg(100);//4��
			hw.add(hw);//5��
			hw.printMyFrinedsName("ģ��1","ģ��2","ģ��3","ģ��4","ģ��5");
			
			
			
			
			
			
			
			
			
	}//main

}//class
