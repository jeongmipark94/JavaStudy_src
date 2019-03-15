<%@page import="day0313.TestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="반복문 forEach 사용"
    %>
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
	<select>
	<!--  증가하는 값을 반복시킬 때 -->
		<c:forEach var="i" begin="1" end="100" step="1">
		<option value="${ i }"><c:out value="${ i }"/></option>
		</c:forEach>
	</select>
	<div>
	<%
	//배열의 값 출력.
			String[] movie={"시네마 천국","주토피아","코어","7인의 사무라이","트루먼 쇼","인셉션"};
			pageContext.setAttribute("movie", movie);
		%>	
		
	<ul>
	<c:forEach var="movie" items="${ movie }">
	<c:set var="i"  value="${ i+1 }" />	
		<li>${i}.${movie }</li>
	</c:forEach>
	<%
		//List의 값 출력
		List<String> list= new ArrayList<String>();//list를 el에서 쓸 수 없다. scope객체를
		//써야한다. 총 4개의 스콥 객체가 있다.
		list.add("java SE");
		list.add("Java EE");
		list.add("DBMS");
		list.add("HTML");
		pageContext.setAttribute("list",list);//list라는 이름으로 list를 넣어준다. 스콥 객체
	%>
	<ul>
	<c:forEach var= "subject" items="${ list }">
	<li><c:out value="${ subject }"/></li>
	</c:forEach>
	</ul>
	<%
		//List가 Generic으로 VO를 가진 경우 사용
		//forEach안에서 "변수명.getter명()"
		List<TestVO> voList=new ArrayList<TestVO>();
		voList.add(new TestVO("정윤", 30));
		voList.add(new TestVO("희철", 27));
		voList.add(new TestVO("재찬", 26));
		voList.add(new TestVO("택성", 28));

		pageContext.setAttribute("vl", voList);
		%>
	<table border="1">
	<thead>
	<tr>
		<th width="50">번호</th>
		<th width="100">이름</th>
		<th width="50">나이</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var= "data" items="${ vl }">
	<c:set var="cnt" value="${ cnt+1 }"/>
	<tr>
		<!--c:out을 쓰는 이유 XSS를 막으려고 c:out은 입력된걸 그대로 출력  -->
		<td><c:out value="${ cnt }"/></td>
		<td><c:out value="${ data.firstName }"/></td>
		<td><c:out value="${ data.age }"/></td>
	</tr>	
	</c:forEach>
	</tbody>
	
	
	</table>
	
	</div>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>