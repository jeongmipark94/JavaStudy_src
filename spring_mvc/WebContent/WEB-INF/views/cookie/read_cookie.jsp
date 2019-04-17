<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/spring_mvc/common/css/main_v20190130.css"/ >
<style type="text/css">
#wrap{ margin:0px auto; width: 800px; height:860px;/*  background-color: #FF0000; */ }
#header{ width: 800px; height:170px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/spring_mvc/common/images/header_bg.png); 
				position:relative;}
#headerTitle{ font-family: HY견고딕,고딕; font-size: 35px; font-weight: bold; text-align: center; 
					position: absolute; top:40px; left:350px}
#container{ width: 800px; min-height:600px; }
#footer{ width: 800px; height:120px;/*  background-color: #333333;  */}
#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		<c:if test="${ cookieFlag }">
			alert("${msg}");
		</c:if>
	});//ready
</script>
</head>
<body>
<div id="wrap">
	<div id="header">header :800(w) x 140(h)
			<div id="headerTitle"> SIST Class4</div>
				<div style="padding-top: 100px">
					<c:import url="/common/jsp/main_menu.jsp"/>
				</div>
			</div>
	<div id="container">
	<div>
		<strong>Model에 들어있는 쿠키들 읽기</strong><br/>
		<c:if test="${ empty requestScope.rCookie }">
			쿠키가 존재하지 않습니다. <a href="add_cookie.do">쿠키심기</a>
		 </c:if><br/>
		 <%-- <c:forEach var="cookie" items="${ rCookie }">
		 	쿠키명 : <c:out value="${ cookie.name }"/><br/>
		 	쿠키값 : <c:out value="${ cookie.value }"/><br/>
		 </c:forEach> --%>
		 <%
		 	Cookie[] t=(Cookie[])request.getAttribute("rCookie");
		 	if(t!= null){
		 		for(Cookie tt: t){
		 			out.println(tt.getName()+" "+ tt.getValue()+"<br/>");
		 		}//end for
		 	}//end if
		 %>
		<c:if test="${ not empty requestScope.rCookie }">
			 <strong>쿠키 값</strong><br/>
			 <c:out value="${ requestScope.name }" escapeXml="false"/><br/><!--마퀴가 실행이된다.  -->
			 태어난 해 <c:out value="${ requestScope.birth }"/>
				<a href="remove_cookie.do">쿠키삭제</a>
		 </c:if>
		 <br/>
		 
	</div>
	
	</div>
	
	<div id="footer">
	
	</div>
</div>

</body>
</html>