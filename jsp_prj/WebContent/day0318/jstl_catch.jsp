<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="예외처리"
    %>
    <%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<c:catch var="e"><!-- <-이렇게 하면 모든 예외를 처리할 수 있게된다. -->
	<%
	/* try{ */
		//코드 생성 - 스크립틀릿은 _jspService에서 try ~ catch를 해주고 있어서 에러안남
		Class.forName("Test");//예외를 throws하는 method를 사용하더라도 _jspService가
		//코드를 try ~catch로 감싸고 있기 떄문에 코드 에러가 발생하지 않는다.
	/* }catch(ClassNotFoundException cnfe){
		out.println("뎨둉합니다");
	} */
	%>
	</c:catch>
	<%-- <c:if test="${ e ne null }"> 42=43   --%>
	<c:if test="${ not empty e }">
	서비스 도중 문제가 발생하였습니다.<br/>
	${ e }
	</c:if>
	
	<%-- <%!
		public void test(){
		Class.forName("");// try~catch 필수 예외처리 안해줘서 에러남.
		}
	%> --%>
	
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>