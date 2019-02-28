package day0228;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardA extends HttpServlet {
	//데이터처리코드에 집중
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//처리된 데이터
		String[] nameArr= {"노진경","박영민","김정윤","최지우","김희철","박소영","이지수"};
		
		List<String> list = new ArrayList<String>();
		list.add("PC방 관리 프로그램");
		list.add("영화관 예매 프로그램");
		list.add("개발자 구인구직 프로그램");
		
//		//out.println("<h1>브라우저 출력!!!!</h1>");
		//1. 처리된 데이터를 이동한 페이지로 보내기 위해  요청 객체에 속성으로 설정한다.
		request.setAttribute("member", nameArr);
		request.setAttribute("project_list", list);
		//2. 이동할 페이지 설정
		RequestDispatcher rd= request.getRequestDispatcher("forward_b");
		//3. 이동
		rd.forward(request, response);//forward 호출된 순간부터 37번줄인 아래의 내용은 출력이 안된다.
		//out.println("<h1>브라우저 출려크!!!!</h1>");
		
	}//doGet

}//class




