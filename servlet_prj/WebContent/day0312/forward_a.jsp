<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="접속자에게 응답되지 않고 데이터처리를 목적으로 하는 페이지"
    %>
<%
	// 업무로직에 집중 할 수 있다.
	String[] names={"공선의","이재현","김건하","최혜원","오영근","박정미"};
	//처리한 결과를 화면 구성 페이지로 전달(Scope 객체 : 값의 사용범위를 정하는 객체 )
	//request내장객체는 값을 forward로 이동한 페이지에서 사용할 수 있다.
	request.setAttribute("group2",names);
	
	
	//1. 이동할 페이지의 URI(도메인, 포트번호가 빠짐- so 다른 서버로 보낼 수가없다.) 설정
	RequestDispatcher rd=request.getRequestDispatcher("forward_b.jsp");/*forward_b는 보여줄 값만 있음 view  */
	//2. 이동
	rd.forward(request, response);
%>







