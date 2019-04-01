package day0401;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MainController extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("day0401/hello.jsp");//redirect방식은 M자 이동 브라우저가 페이지의 이동을 안다. url이 변경이됨.
		//jsp를 부르게되는데 제약에 의해서 403이 뜬다. 그러므로 forward로 해야함.
		
		RequestDispatcher rd= request.getRequestDispatcher("day0401/hello.jsp");
		rd.forward(request, response);
		//이떄 hello.jsp의 이미지 경로는 메인컨트롤러 서블릿을 기준으로 경로가 이루어져야한다. ../common에서 ../지워야됨
		//그러므로 사진같은건 url로 해주는 것이 좋다.
		
		
		
	}//doPost

}//class
