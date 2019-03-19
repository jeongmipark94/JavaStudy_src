<%@page import="org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException"%>
<%@page import="kr.co.sist.util.HangulConv"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
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
	<!-- enctype="multipart/form-data"인 경우 parameter를 받을 수 없다. -->
	<%-- 이름<%= request.getParameter("uploader") %><br/>
	나이<%= request.getParameter("age") %> --%>
	
	<%
	request.setCharacterEncoding("UTF-8");
	// 파일업로드에 적합한 요청인지를 얻는다.
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	if( isMultipart ){//파일업로드에 적합한 요청
		File repository = new File("C:/dev/workspace/jsp_prj/WebContent/upload");//업로드된 파일은 여기에 저장된다.
	
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 업로드 파일이 메모리에 저장되는 최대 크기
		factory.setSizeThreshold(1024*1024*1); //1MB씩 끊어서 메모리에 저장된다.
		factory.setRepository(repository);

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// 업로드 파일의 최대 크기 설정
		upload.setSizeMax(1024*1024*5);//5MB까지 저장가능

		try{
		// Parse the request
		List<FileItem> items = upload.parseRequest(request);
		
		// Process the uploaded items
		Iterator<FileItem> iter = items.iterator();//list처리는 데 for보다 이터레이터가 더 빨라서  
		String uploader="",age="";
		String fieldName ="" , fileName = "",contentType ="";
		long sizeInBytes=0;
		while (iter.hasNext()) {
		    FileItem item = iter.next();

		    if (item.isFormField()) {//일반 HTML Form Control인지? <input type="file"이 아닌 것
//			out.println("일반 폼 컨트롤 <br/>");
			 String controlName = item.getFieldName();
			    String controlValue = item.getString();
			    
			    //업로더라는 변수에는 이름을 저장하고 age라는 변수에는 나이를 저장시킨다.
			    if("uploader".equals(controlName)){
			    	uploader= HangulConv.toUTF(controlValue);
			    }//end if
			    if("age".equals(controlName)){//값 받기가 번거롭다.
//			    if(controlName.equals("age")){//값 받기가 번거롭다.
			    	age=controlValue;
			    }//end if
																				    /* out.println("컨트롤명:" +controlName);
																				    out.println("컨트롤값:" + HangulConv.toUTF(controlValue)+"<br/>"); */
		    }else{//File Upload Control 인지 <input type="file">
			/* out.println("파일 폼 컨트롤 <br/>"); */
		    	 	 fieldName = item.getFieldName();//File Control 명
		    	     fileName = item.getName();//FileControl 값
		    	     contentType = item.getContentType();//업로드한 파일 종류
		    	     sizeInBytes = item.getSize();//크기
		    	     
		    	     File selectFile = new File(fileName);
		    	     File uploadedFile = new File(repository.getAbsolutePath()+"/"+selectFile.getName());//업로드파일의 저장경로와 파일명을 설정
		    	     item.write(uploadedFile);//설정된 파일을 업로드
		    	     
		    }//end else
		}//end while
		%>
		파일업로드 성공<br/>
		업로더명 : <%=uploader %><br/>
		연령대 : <%=age%><br/>
		업로드 파일명 : <%=fileName%><br/>
		크기 : <%=sizeInBytes%>byte<br/>
		<a href="upload_form.jsp">업로드</a><br/>
		<a href="file_list.jsp">파일리스트</a><br/>
		<%
		}catch(SizeLimitExceededException slsee){
			//브라우저로 출력이 되지 않는다.
			out.println("예외!!!");
		}//end catch
	}else{//파일업로드에 부적합 요청           기본 폼으로 가진다.
		response.sendRedirect("upload_form.jsp");
	}//end else
	%>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all reserved. class 4 </div>
	</div>
</div>

</body>
</html>