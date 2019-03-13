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
	<!-- 객체 생성 -->
	<jsp:useBean id="t_vo" class="day0313.TestVO" scope="page"/>
	<!-- setter 호출 : set을 제외한 method명을 소문자로 기술 -->
	<jsp:setProperty property="firstName" name="t_vo" value="노진경"/>
	<jsp:setProperty property="age" name="t_vo" value="20"/>
	<!-- getter 호출 : get을 제외한 method명을 소문자로 기술  
			Expression을 사용하지 않아도 화면출력이 된다.
	 -->
	 이름 : <jsp:getProperty property="firstName" name="t_vo"/><br/>
	 나이 : <jsp:getProperty property="age" name="t_vo"/><br/>
	 <%
	 // < jsp:useBean 으로 생성된 객체는 자바코드로 접근하여 사용할 수 있다.
	 //setter호출
	 t_vo.setFirstName("정윤");
	 t_vo.setAge(30);
	 %>
	 <!-- getter 호출 -->
	 <div>
	 재설정 이름 : <%=t_vo.getFirstName() %><br/>
	 재설정 나이 : <%=t_vo.getAge()%><br/>
	 </div>
	 
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>