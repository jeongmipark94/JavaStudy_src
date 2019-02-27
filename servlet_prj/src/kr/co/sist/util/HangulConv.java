package kr.co.sist.util;

import java.io.UnsupportedEncodingException;

public class HangulConv {
	public static String toUTF(String kor) {
		if(kor != null || !"".equals(kor)) {                 //kor.equals("") 을 이제는 이렇게 써준다. 이렇게 써줄 경우 nullpointexception이 뜰일이 없음
			try {
				kor= new String(kor.getBytes("8859_1"),"UTF-8");//3byte씩 조합
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		return kor;
	}//toUTF
	
	public static String toEUC(String kor) {
		if(kor != null || !"".equals(kor)) {                 //kor.equals("") 을 이제는 이렇게 써준다. 이렇게 써줄 경우 nullpointexception이 뜰일이 없음
			try {
				kor= new String(kor.getBytes("8859_1"),"EUC-KR");//2byte씩 조합
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		return kor;
	}//toUTF
}
