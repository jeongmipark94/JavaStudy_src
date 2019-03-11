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
	<%!
		int i;//instance 변수 (특징 - 자동초기화 됨)
		
		public String name(){
			return "공선의 "; 
		}//test
		
		/* public String ip(){
			//declaration에서는 내장객체(request)를 사용할 수 없다.
			String ip =request.getRemoteAddr();
			return ip;
		} */
	%>
	
	<%!
		public void test(){          
		int j=0;//지역변수
	%>
		<%-- <%= j %> : declaration사이에서 정의된 코드지만 생성되는 위치가 달라 
				출력할 수 없다. --%> 
	<%!
		}//test										
	%>
	
	i=<%= i %><br/>
	이름 : <%= name() %>
	<%
		//request : 내장(내재) 객체 : _jspService method 안에서 자동 선언되어있는 객체
		String ip =request.getRemoteAddr();
	%>
	접속자 IP Address : <%= ip %>
	<%-- <%
		/* public void test(){//메서드는 중첩정의가안되서 스크립틀릿에서 정의 못한다.
		
		} */
	%> --%>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>