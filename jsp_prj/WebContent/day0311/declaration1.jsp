	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    	//라디오 몇개 만들지, 라디오 버튼의 이름이 무엇일지를 정해야함. 내가 버튼 눌렀을 때 어떤 라디오 눌렀는지 - 파라미터로 받기
    	/**
    	라디오 버튼을 생성하는 method<br/>
    	createRadio(라디오버튼 갯수, 라디오버튼의 이름(그룹), 기본체크값 - 라디오 버튼보다 크면 안됨)
    	*/
    	public String createRadio(int rCnt, String rName, int rDefault){
    		StringBuilder radio = new StringBuilder();
    		if(rCnt <rDefault ){
    			rDefault=0;
    		}//end if
    		
    		for(int i =0; i<=rCnt; i++){
    		radio.append("<input type='radio' name='").append(rName)
    			.append("' value='").append(i).append("'");
	    		if(i == rDefault){
	    			radio.append(" checked='checked'");
	    		}//end if
	    		radio.append(">").append(i).append("점&nbsp;");
    		}//end if
    		
    		return radio.toString();
    	}//createRadio
    
    %>
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

#nameTitle{ width:100px; }
#scoreTitle{ width:500px; }
table{border-top: 2px solid #333}
th{height:30px}
th, td{ border-bottom: 1px dotted #4F4F4F; text-align: center;}
/* 색 넣어준건 넓이가얼만큼 차지하는지 확인하는 용도로 쓴 것. 확인 후엔 필요없어서 지웠다.*/
</style>
</head>
<body>
<div id="wrap">
	<div id="header">header :800(w) x 140(h)
			<div id="headerTitle"> SIST Class4</div>
			</div>
	<div id="container">
	<%
		String[] names={ "공선의","김건하","이재찬","정택성","김희철" };
	%>
	<table>
		<tr>
			<th id="nameTitle">이름</th>
			<th id="scoreTitle">점수</th>
		</tr>
		<% for(int i=0; i<names.length; i++){%>
		<tr>
			<td><%= names[i] %></td>
			<td><%= createRadio(10, "name_"+i, 5) %></td>
			<!--메서드를 만들어 사용해서 간단해짐  -->
		</tr>
			<%}//end for %>
	</table>
	전체 점수 : <%= createRadio(10, "total", 0) %>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>

