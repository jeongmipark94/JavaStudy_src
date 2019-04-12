<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/jsp_prj/common/css/main_v20190130.css"/ >
<style type="text/css">
#wrap{ margin:0px auto; width: 800px; height:860px;/*  background-color: #FF0000; */ }
#header{ width: 800px; height:170px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/jsp_prj/common/images/header_bg.png); 
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
	<ul>
	<li>VO로 값 처리</li>
	<li>${ param.name }( ${ nameData } )  님 안녕하세요?</li>
	<li>${ param.age }( ${ ageData } ) 살 </li>
	<li>
	<c:if test="${empty langData }">관심언어가 없습니다.</c:if>
		<c:forEach var="lang" items="${ requestScope.langData }">
			<c:out value="${ lang }"/>
		</c:forEach>
	</li>
	<li>
		<a href="#void" onclick="history.back();">다시입력</a>	
		<a href="#void" onclick="location.href='request_form.do'">다시입력</a>	
	</li>
	</ul>
	
	</div>
	<div id="footer">
	</div>
</div>

</body>
</html>