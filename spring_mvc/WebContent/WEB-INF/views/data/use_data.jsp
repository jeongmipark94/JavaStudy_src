<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="Controller에서 HttpServletRequest를 사용하여 전달된 값을 처리하는 Page"
    %>
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
	<div>값 전달한 객체 : <c:out value="${ msg }"/></div>
	<div style="width: 250px; height: 186px; float: right; background-image: url(http://localhost:8080/spring_mvc/common/images/postit.png)">
		<div style="margin-top: 35px; margin-left: 30px">
		<ul>
		<li style="text-align: center; font-weight: bold ">공지사항</li>
		<c:forEach var="notice" items="${ requestScope.req_data }">
		<li><a href="notice_detail.do?num=${ notice.num} "><c:out value="${ notice.subject }"/></a>
		
		</li>
		</c:forEach>
		</ul>
		</div>
		
	</div>
	
	<div>
	
	</div>
	</div>
	
	<div id="footer">
	
	</div>
</div>

</body>
</html>