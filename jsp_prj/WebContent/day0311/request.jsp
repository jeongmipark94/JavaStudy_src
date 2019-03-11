<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<ul>
		<!--요청 URL : 서블릿에서 3줄짜리가 JSP에선 1줄이됨  -->
		<li><strong>요청 URL</strong> : <%= request.getRequestURI() %></li>
		<li><strong>요청 Protocol </strong> : <%= request.getProtocol() %></li>
		<li><strong>요청 서버명</strong> : <%= request.getServerName()%></li>
		<li><strong>요청 서버 Port</strong> : <%= request.getServerPort()%></li>
		<li><strong>요청 URI</strong> : <%= request.getRequestURI()%></li>
		<li><strong>요청 서블릿 Path</strong> : <%= request.getServletPath()%></li>
		<!--웹은 이름이 같으면 배열로 처리  -->
		<li><a href="request.jsp?name=jinkyung&addr=gangseohu&age=30">JSP QueryString 요청 </a></li>
		<li><strong>QueryString</strong> : <%= request.getQueryString()%></li><!-- 쿼리 스트링은 get방식에만 존재 -->
		<li><strong>요청 Parameter</strong> : <%= request.getParameter("name") %></li>
		<li><strong>요청 방식</strong> : <%= request.getMethod() %></li>
		<li><strong>접속자IP</strong> : <%= request.getRemoteAddr() %></li>
		<li><strong>접속자 Port</strong> : <%= request.getRemotePort() %></li>
		
	</ul>	
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>