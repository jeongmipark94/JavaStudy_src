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
	<!--
	 page : 기본속성, 요청할 때마다 객체 생성되며, 생성된 객체는 현재 페이지에서만 사용.
	 request : 요청할 때마다 객체 생성되며, 생성된 객체는 현재 페이지와 forward로
	 				이동한 페이지에서 사용.
	 session : 접속자마다 하나의 객체가 생성되며, 생성된 객체는 모든 JSP에서 사용할 수 있다.
	 				접속을 종료하면 사라진다.
	 application : 최초 접속자에의해 하나의 객체가 생성된다. 생성된 객체는 모든 JSP에서 
	 			모든 접속자가 사용한다. ( 공용 ).
	 			Container가 종료되면 사라진다.
	 -->
		<jsp:useBean id="c_vo"  class="day0313.CounterVO" scope="session"/>
		<jsp:setProperty property="cnt" name="c_vo" value="1"/>
		안녕하세요?<br/>
		이 페이지의 [ <strong><jsp:getProperty property="cnt" name="c_vo"/></strong>]
		번째 방문자 입니다.<br/>
		<div><!-- 방문자 수를 표시해주는 숫자 이미지를 띄우기  -->
		<%
		String cnt=String.valueOf(c_vo.getCnt());
		
		
		char temp=' ';
		for(int i=0; i< cnt.length(); i++){
			temp=cnt.charAt(i);
		%>	
			<img src="images/num_<%= temp %>.png" title="<%=temp %>"/>
		<%	
		}//end for
		 %>
		</div>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>