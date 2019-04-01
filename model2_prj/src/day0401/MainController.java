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
		//response.sendRedirect("day0401/hello.jsp");//redirect����� M�� �̵� �������� �������� �̵��� �ȴ�. url�� �����̵�.
		//jsp�� �θ��ԵǴµ� ���࿡ ���ؼ� 403�� ���. �׷��Ƿ� forward�� �ؾ���.
		
		RequestDispatcher rd= request.getRequestDispatcher("day0401/hello.jsp");
		rd.forward(request, response);
		//�̋� hello.jsp�� �̹��� ��δ� ������Ʈ�ѷ� ������ �������� ��ΰ� �̷�������Ѵ�. ../common���� ../�����ߵ�
		//�׷��Ƿ� ���������� url�� ���ִ� ���� ����.
		
		
		
	}//doPost

}//class
