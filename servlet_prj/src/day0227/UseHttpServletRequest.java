package day0227;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1. HttpServlet상속받기
public class UseHttpServletRequest extends HttpServlet {
	//2. 요청방식에 대한 처리 method를 Override 한다.
	//3. service method는 요청방식이 GET / POST 모두 처리할 수 있다.
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답방식 설정 (MIME-Type)
		response.setContentType("text/html;charset=UTF-8");
		//4. 출력 스트림 얻기
		PrintWriter out = response.getWriter();//이름이 없는 파일을 내보내기 위해서 스트림에 꽂은 것임
		String ip=request.getRemoteAddr();
		String[] blockIP = {"133","141","149","157","144","152"};//아이피 막기
		
		boolean moveFlag=false;
		for(int i=0; i< blockIP.length; i++) {
			if(ip.endsWith(blockIP[i])) {
				moveFlag= true;
			}
		}
		if(moveFlag) {
			response.sendRedirect("http://sist.co.kr/index.do");
		}//end if
		
		//5. 출력 내용 작성
	      out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/servlet_prj/common/css/main_v190130.css\"/>\r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("#wrap{ margin:0px auto; width:800px; height: 860px;  }\r\n");
	      out.write("#header{  width:800px; height: 140px; background: #FFFFFF url(http://localhost:8080/servlet_prj/common/images/header_bg.png) repeat-x;\r\n");
	      out.write("\t\t\tposition: relative; }\r\n");
	      out.write("#headerTitle{ font-family: HY견고딕, 고딕; font-size: 30px; font-weight: bold;text-align: center;\r\n");
	      out.write("\t\t\t\t\tposition: absolute; top:30px; left:290px}\r\n");
	      out.write("#container{  width:800px; height: 600px; }\r\n");
	      out.write("#footer{  width:800px; height: 120px; }\r\n");
	      out.write("#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }\r\n");
	      out.write("</style>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	      
	      //print와 println의 차이는 소스보기에서 줄바꿈 차이 겉보기엔 차이없음 ( 브라우저는 <br/> 써야 줄바꾼것처럼 보인다)
	     /* out.print("<a href='");
	      out.print("test.jsp'>클릭");
	      out.println("</a>");
	      out.println("<br>");*/
	      
	      out.println("\t<ul>");
	      
	      out.print("\t\t<li><strong>요청URL</strong> :  ");
	      out.print(request.getRequestURL());
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>요청 방식</strong> :  ");
	      out.print(request.getMethod());
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>요청 프로토콜</strong> :  ");
	      out.print(request.getProtocol());
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>요청 서버명( 도메인 )</strong> :  ");
	      out.print(request.getServerName());
	      out.println("</li>");

	      out.print("\t\t<li><strong>요청서버의 포트</strong> :  ");
	      out.print(request.getServerPort());
	      out.println("</li>");

	      out.print("\t\t<li><strong>요청 URI</strong> :  ");
	      out.print(request.getRequestURI());
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>요청 서블릿 경로</strong> :  ");
	      //context path를 제외한 하위경로
	      out.print(request.getServletPath());
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>요청 QueryString</strong> :  ");
	      out.print(request.getQueryString());//GET방식에만 존재
	      out.println("</li>");
	      
	      
	      out.print("\t\t<li><strong>이름이 유일한 Parameter 값받기</strong> :  ");
	      out.print(request.getParameter("name"));
	      out.println("</li>");

	      out.print("\t\t<li><strong>이름이 같은 Parameter 값받기</strong> :  ");
	      String[] ageArr=request.getParameterValues("age"); //이름이 같아서 배열로 처리
	      
	   
	      
	      if(ageArr != null) {
	    	  for(int i = 0; i < ageArr.length; i++) {
	    		  out.print(ageArr[i]);//
	    		  out.print("살&nbsp;");
	    	  }//end for
	      }else{
	    	  out.print("나이 없음.");
	      }//end else
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>Parameter의 이름 받기</strong> :  ");
	      
	      Enumeration<String> en=request.getParameterNames();
	    	  while(en.hasMoreElements()) {//파라메터의 이름이 있다면.
	    		  out.print(en.nextElement());//값을 가져오고 다음방으로 포인터를 이동한다.
	    		  out.print(" ");
	    	  }//end for
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>접속자의 IP</strong> :  ");
	      out.print(request.getRemoteAddr());//GET방식에만 존재
	      out.println("</li>");
	      
	      out.print("\t\t<li><strong>접속자의 Port/strong> :  ");
	      out.print(request.getRemotePort());//GET방식에만 존재
	      out.println("</li>");
	      
	      out.println("\t</ul>");
	      out.println("\t<a href='use_request?name=jungyun.kim&age=31&age=30'>GET요청</a>");
	      out.println("\t<form action='use_request' method='post'>");
	      
	      out.println("\t<input type='hidden' name='name' value='seonui.kong'/>");
	      out.println("\t<input type='hidden' name='age' value='28'/>");
	      out.println("\t<input type='hidden' name='age' value='26'/>");
	      out.println("\t<input type='submit' value='POST전송' class='btn'/>");
	      out.println("\t</form>");
	      
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"footer\">\r\n");
	      out.write("\t\t<div id=\"footerTitle\">copyright&copy; all right reserved. class 4 </div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>\r\n");
		
		
	}//service

}//class
