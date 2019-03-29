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
#header{ width: 800px; height:165px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/jsp_prj/common/images/header_bg.png); 
				position:relative;}
#headerTitle{ font-family: HY견고딕,고딕; font-size: 35px; font-weight: bold; text-align: center; 
					position: absolute; top:40px; left:350px}
#container{ clear:both ; width: 800px; height:600px; }
#footer{ width: 800px; height:120px;/*  background-color: #333333;  */}
#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#setValue").click(function(){
			$.ajax({
				url : "json_result.jsp", 
				type:"post", 
				dataType: "json",
				error: function(xhr){
					alert( xhr.status+ " "+xhr.statusText );
				},
				success:function( jsonObj){
					$("#name").val( jsonObj.name );
					$("#age").val( jsonObj.age );
					
				}//success
			});//ajax
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
				<a href="#void" id="setValue">값 설정</a>
			</div>
			<div>
				이름 : <input type="text" name="name" id="name" class="inputBox"/><br/>
				나이 : <input type="text" name="age" id="age" class="inputBox"/><br/>
			</div>
			</div>
			
</div>

</body>
</html>