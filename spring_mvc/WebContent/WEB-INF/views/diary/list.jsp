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


#diary{ margin-top:20px}
#diaryHeader{ font-size: 19px; font-weight: bold; text-align: center; height: 40px; }
#diaryContents{ height: 400px}
#diaryIndexList{ height: 30px; text-align: center}
#diarySearch{height: 30px; text-align: center}

#listTab{clear:both; border-top:2px solid #3C4790; border-spacing: 0px }
#numTitle{ width:50px ; height:25px; background-color: #F3F3F3 }
#subjectTitle{ width:350px ; height:25px; background-color: #F3F3F3}
#writerTitle{ width:120px ; height:25px;background-color: #F3F3F3 }
#evtDayTitle{ width:150px ; height:25px;background-color: #F3F3F3 }
#wriDayTitle{ width:150px ; height:25px;background-color: #F3F3F3 }
th,td{ border-bottom: 1px solid #EEEEEE  }
td{ height: 24px}
tr:HOVER{ background-color: #F3F3F3 }
.center{ text-align: center;}
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
					<c:import url="/common/jsp/main_menu.jsp"/>
				</div>
			</div>
	<div id="container">
	<div>
	
	<div id="diary">
		<span style="float:left"><a href="list.jsp"><img src="images/btn_all.png"/></a></span>
		<div id="diaryHeader" >
		이벤트 리스트
		</div>
		<div id="diaryContents" style="height: 450px">
			<table id="listTab">
			<tr>
				<th id="numTitle" >번호</th>
				<th id="subjectTitle">이벤트 제목</th>
				<th id="writerTitle">작성자</th>
				<th id="evtDayTitle">이벤트일자</th>
				<th id="wriDayTitle">작성일자</th>
			</tr>
			<c:if test="${not empty e }">
			<tr>
				<td colspan="5"]>서비스가 원활하지 못한점 ㅈㅅ!</td>
			</tr>
			</c:if>
			<c:if test="${empty list }">
			<tr>
				<td colspan="5">이벤트가 존재하지 않습니다.<br/>
					<a href="diary.jsp">이벤트 작성</a>
				</td>
			</tr>
			</c:if>
			<c:forEach var="data" items="${ diaryList }">
			<c:set var="i" value="${ i+1 }"/>
			<tr>
				<td><c:out value="${ (totalCount -(currentPage-1)*pageScale-i)+1 }"/></td>			
				<td><a href="bbs_read.do?num=${ data.num }"><c:out value="${ data.subject }"/></a></td>			
				<td><c:out value="${ data.writer }"/></td>			
				<td><c:out value="${ data.e_year }-${ data.e_month }-${ data.e_day }"/></td>			
				<td><c:out value="${ data.w_date }"/></td>			
			</tr>
			</c:forEach>
			
			</table>
		</div>
		<div id="diaryIndexList" style="text-align:center">
		<!-- escapeXml="false" c:out으로 태그를 출력할 때 -->
		<c:out value="${ indexList }" escapeXml="false"/><!-- c:out을 써서 태그를 그대로 표시하고 싶다면 escapeXml : false 속성을 줘라  -->
		<%-- <c:forEach var="i" begin="1" end="${totalPage }" step="1">
		[ <a href="list.jsp?current_page=${i }">${i }</a> ]
		</c:forEach> --%>
		
		</div>
		</div>
	
	
	
	
	</div>
	
	<div id="footer">
	
	</div>
</div>

</body>
</html>