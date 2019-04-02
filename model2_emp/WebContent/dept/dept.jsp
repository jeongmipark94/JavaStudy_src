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
					<c:import url="../common/jsp/main_menu.jsp"/>
				</div>
			</div>
	<div id="container">
	<table>
	<tr>
		<th width="40">번호</th>
		<th width="80">부서번호</th>
		<th width="100">부서명</th>
		<th width="100">위치</th>
	</tr>
	<c:if test="${ empty deptList }">
	<tr>
		<td colspan="4" align="center">부서정보가 존재하지 않습니다.</td>
	</tr>
	</c:if>
	<c:forEach var="dept" items="${ deptList }">
	<c:set var="i" value="${ i+1 }"/>
	<tr>
		<td><c:out value="${ i }" /></td>
		<td><a href="emp.do?cmd=E001&deptno=${ dept.deptno }"><c:out value="${ dept.deptno }" /></a></td>
		<td><c:out value="${ dept.dname }" /></td>
		<td><c:out value="${ dept.loc }" /></td>
	</tr>
	</c:forEach>
	</table>
	
	
	</div>
	<div id="footer">
	
	</div>
</div>

</body>
</html>