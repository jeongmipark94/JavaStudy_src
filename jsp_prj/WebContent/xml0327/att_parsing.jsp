<%@page import="day0327.AttVO"%>
<%@page import="java.util.List"%>
<%@page import="day0327.AttParsing"%>
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
#header{ width: 800px; height:140px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/jsp_prj/common/images/header_bg.png); 
				position:relative;}
#headerTitle{ font-family: HY견고딕,고딕; font-size: 35px; font-weight: bold; text-align: center; 
					position: absolute; top:40px; left:350px}
#container{ width: 800px; min-height:600px; margin-top: 30px}
#footer{ width: 800px; height:120px;/*  background-color: #333333;  */}
#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$("[name='frm']").submit();
		});//click
	});//ready
</script>
</head>
<body>
<div id="wrap">
	<div id="header">header :800(w) x 140(h)
			<div id="headerTitle"> SIST Class4</div>
				<div style="padding-top: 100px">
					<c:import url="../common/jsp/main_menu.jsp"/>
				</div>
			</div>
	
	<div id="container">
	<div>
	<form name="frm" action="att_parsing.jsp" method="get">
		<select id="lastName" name="lastName">
			<option value="김">김씨</option>
			<option value="이">이씨</option>
			<option value="박">박씨</option>
			<option value="노">노씨</option>
			<option value="정">정씨</option>
			<option value="최">최씨</option>
		</select>
		<input type="button" value="조회" id="btn" class="btn"/>
	</form>
	</div>
	
	
	<c:if test="${ not empty param.lastName }">

	<div>
		<div>선택하신 "${ param.lastName }" 으로 조회한 결과입니다.</div>
		<div>
		<%
			String lastName=request.getParameter("lastName");
			AttParsing ap=new AttParsing();
			List<AttVO> list = ap.personData(lastName);
			pageContext.setAttribute("personList", list);
		%>
		<table border="1">
		<tr>
			<th width="100">성명</th>
			<th width="400">주소</th>
		</tr>
		<c:if test="${ empty personList }">
		<tr>
			<td colspan="2" align="center">검색결과가 존재하지 않습니다.</td>
		</tr>
		</c:if>
		<c:forEach var="data" items="${ personList }">
		<tr>
			<td>
				<c:out value="${ data.lastName}"/>
				<c:out value="${ data.firstName}"/>
			</td>
			<td>
				${ data.address } ( ${ data.city }, ${ data.zipcode } )
			</td>
		</tr>
		</c:forEach>
		</table>
		</div>
	</div>
	</c:if>

</div>
</div>
</body>
</html>