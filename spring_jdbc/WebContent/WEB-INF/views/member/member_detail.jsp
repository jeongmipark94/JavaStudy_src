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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4
/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#btnUpdate").click(function(){
			if($("#btnUpdate").val()=="수정" ){
				var updateView=
					"이름 : <input type='text' name='name' value='"+$("#name").text()
					+"'/><br/>"
					+"출신고 : <input type='text' name='highschool' value='"
					+$("#highschool").text()+"'/><br/>"
					+"지역 : <input type='text' name='loc' value='"
					+$("#loc").text()+"'/>";
			
				$("#btnUpdate").val("수정실행");
				
				$("#view").html( updateView );
			}else{
				//유효성 검증 코드를 작성
				document.frm.action="update_member.do";
				$("#frm").submit();//이 전에 유효성 검증해야한다.
			}//end else
		});//click
		
		$("#btnDelete").click(function() {
			if(confirm("["+ $("#name").text()+"] 회원을 삭제 하시겠습니까?")){
				document.frm.action="delete_member.do";//action이 바뀜 -
				$("#frm").submit();//document.frm.submit();을 해줘도 같다. jquery 사용 이유 - 적게 쓰고 많은 일.
			}//end if
		})//click
		
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
			<a href="add_form.do">정보추가</a>
			<a href="search_member.do">정보조회</a>
	
	<div>
		<c:choose>
		<c:when test="${ empty memberData }">
				조회된 회원이 존재하지 않습니다.
		</c:when>
		<c:otherwise>
		<form name='frm' id='frm' action='update_member.do' method='post'>
				<input type="hidden" name="num" value="${ param.num }"/><!--  이 글의 글번호 -->
				<div id="view">
					<ul>
						<li>이름 : <span id="name"><c:out value="${ memberData.name }"/></span></li>
						<li>출신고 :<span id="highschool"><c:out value="${ memberData.highschool}"/></span></li>
						<li>위치 : <span id="loc"><c:out value="${ memberData.loc}"/></span></li>
					</ul>
				</div>
				<div>
					<input type="button" value="수정" id="btnUpdate" class="btn"/>
					<input type="button" value="삭제" id="btnDelete" class="btn"/>
				</div>
			</form>
		</c:otherwise>
		</c:choose>
	</div>
	
</div>

</body>
</html>