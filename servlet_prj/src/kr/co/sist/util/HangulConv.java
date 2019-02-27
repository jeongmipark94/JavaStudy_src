package kr.co.sist.util;

import java.io.UnsupportedEncodingException;

public class HangulConv {
	public static String toUTF(String kor) {
		if(kor != null || !"".equals(kor)) {                 //kor.equals("") �� ������ �̷��� ���ش�. �̷��� ���� ��� nullpointexception�� ������ ����
			try {
				kor= new String(kor.getBytes("8859_1"),"UTF-8");//3byte�� ����
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		return kor;
	}//toUTF
	
	public static String toEUC(String kor) {
		if(kor != null || !"".equals(kor)) {                 //kor.equals("") �� ������ �̷��� ���ش�. �̷��� ���� ��� nullpointexception�� ������ ����
			try {
				kor= new String(kor.getBytes("8859_1"),"EUC-KR");//2byte�� ����
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		return kor;
	}//toUTF
}
