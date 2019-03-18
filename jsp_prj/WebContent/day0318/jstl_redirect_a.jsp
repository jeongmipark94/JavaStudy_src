<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/jsp_prj/common/css/main_v20190130.css"/ >
<style type="text/css">
#wrap{ margin:0px auto; width: 800px; height:860px;/*  background-color: #FF0000; */ }
#header{ width: 800px; height:140px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/jsp_prj/common/images/header_bg.png); 
				position:relative;}
#headerTitle{ font-family: HY견고딕,고딕; font-size: 35px; font-weight: bold; text-align: center; 
					position: absolute; top:40px; left:350px}
#container{ width: 800px; height:600px; }
#footer{ width: 800px; height:120px;/*  background-color: #333333;  */}
#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }
/* 색 넣어준건 넓이가얼만큼 차지하는지 확인하는 용도로 쓴 것. 확인 후엔 필요없어서 지웠다.*/
</style>
</head>
<body>
<div id="wrap">
	<div id="header">header :800(w) x 140(h)
			<div id="headerTitle"> SIST Class4</div>
			</div>
	<div id="container">
	<% 
		boolean flag=new Random().nextBoolean();
		pageContext.setAttribute("flag", flag);//el은 바로 쓸 수 없기때문에 scope객체 만들어줌
	%>
	<c:if test="${ flag }">
	<!-- 비 정상적인 경우의 요청이 있을 때 페이지 이동 -->
	<!-- redirect는 주로 로그인 한 이후에 거의 모두 사용된다. -->
	<%-- <% response.sendRedirect("") %> 3~이 예전엔 35로 써서 해줬던 것이다.  훨씬 깔끔함  --%>
		<c:redirect url="jstl_redirect_b.jsp"/>
	</c:if>
	
	정상적인 경우 제공할 서비스<br/>
	<img src="../common/images/img2.jpg"/>
	
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>