package day1221;

public class hwhw {

	public static void main(String[] args) {

		String s = "c:/dev/temp/java_read.txt";
		
		//���ϸ��� �������� �ִ� .�� Ȯ������
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.insert(s.lastIndexOf("."),"_bak"));
//		String backStr = s.substring(0,s.indexOf("."))+"_bak"+s.substring(s.indexOf("."));
		System.out.println(sb.insert(s.lastIndexOf("."), "_bak"));
//		System.out.println(backStr);
//		
		
	}

}
