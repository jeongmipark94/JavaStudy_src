<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/spring_jdbc/common/css/main_v20190130.css"/ >
<style type="text/css">
#wrap{ margin:0px auto; width: 800px; height:860px;/*  background-color: #FF0000; */ }
#header{ width: 800px; height:170px;/*  background-color: #0000FF;  */ background: #FFFFFF url(http://localhost:8080/spring_jdbc/common/images/header_bg.png); 
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
		$("#upfile").change(function(){
			var upfile=$("#upfile").val();
			if( upfile ==  ""){
				alert("이미지 선택해주세요");
				return;
			}//end if
			
			readURL(this);
		//클라이언트의 파일은 보안 이슈때문에 직접 접근하여 미리보기를 할 수 없다.
			/* var img=$("#img");
			img.src=upfile;
			alert( img.src ) */
			
		});//click
	});//ready
	
	//업로드한 사진 미리보기 코드
	function readURL(input) {
	    if (input.files && input.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#img').attr('src', e.target.result);
	        }//function
	        reader.readAsDataURL(input.files[0]);
	    }//end if
	}//readURL

	
	
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
	<!-- 파일업로드는 무조건 post로 가능. get으로는 안된다. -->
	<form action="addmember_process.do" method="post" enctype="multipart/form-data">
	<table border="1">
		<tr>
			<th colspan="3"><h2>이미지</h2></th>
		</tr>
		<tr>
			<td width="100">이미지</td>
			<td width="100">이름</td>
			<td width="100">
				<input type="text" name="name" class="inputBox"/>
			</td>
		</tr>
		<tr>
			<td rowspan="5">
				<img src="common/images/default.png" id="img" 
						style="width:100px; height:100px"/>
				<br/>
				<input type="file" name="upfile" class="inputBox" id="upfile"/>
			</td>
		</tr>
		<tr>
			<td>지역</td>
			<td><input type="text" name="loc" class="inputBox"/></td>
		</tr>	
		<tr>
			<td>출신고</td>
			<td>
			<select name="highschool">
				<option value="오지고">오지고</option>
				<option value="지리고">지리고</option>
				<option value="렛잇고">렛잇고</option>
				<option value="맛보고">맛보고</option>
			</select>
			</td>
		</tr>	
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="입력" class="btn"/>
			</td>
		<tr>
			<td colspan="2" align="center">&nbsp;</td>
		</tr>
		</tr>
	</table>
	</form>
	
	
	<div id="footer">
	
	</div>
</div>

</body>
</html>