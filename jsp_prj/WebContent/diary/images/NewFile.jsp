<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/jsp_prj/common/css/main_v20190130.css">
<style type="text/css">
#wrap{ margin:0px auto; width: 800px; height:860px;}
#header{ width: 800px; height:140px;background: #FFFFFF url(http://localhost:8080/jsp_prj/common/images/header_bg.png); 
            position:relative;}
#headerTitle{ font-family: HY견고딕,고딕; font-size: 35px; font-weight: bold; text-align: center; 
               position: absolute; top:40px; left:290px}
#container{ width: 800px; height:600px; }
#footer{ width: 800px; height:120px;}
#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }
/*달력설정  */
#diaryTab{margin: 0px auto; border-spacing: 0px; border: 1px solid #CECECE}
.sunTitle{width: 100px; height: 25px; border: 1px solid #CECECE;font-weight:bold; color:#FFFFFF; background-color:#FF2626 ;}
.weekTitle{width: 100px; height: 25px; border: 1px solid #CECECE; }
.satTitle{width: 100px; height: 25px; border: 1px solid #CECECE; font-weight:bold; color:#FFFFFF; background-color:#0000FF ;}
#diaryTitle{text-align: center; margin-bottom: 10px; margin-top: 20px;}
#diaryToday{width: 100px; font-family: 고딕체;font-size: 27px; font-weight: bold; }
.diaryTd{width: 100px; height: 60px; border: 1px solid #CECECE; text-align: right; vertical-align:top; font-size: 14px; font-weight: bold}
.todayTd{width: 100px; height: 60px; border: 1px solid #D7E2E9; background-color: #E9F4FB; text-align: right; vertical-align:top; font-size: 14px; font-weight: bold}
.blankTd{width: 100px; height: 60px; border: 1px solid #CECECE; color:#CCCCCC; text-align: right; vertical-align:top; font-size: 14px; font-weight: bold}
.sunColor{ font-size: 15px; color:#FF2626 }   
.weekColor{ color:#222222 }   
.satColor{ font-size: 15px; color:#0000D8 }   
/* 달력설정 끝 */
</style>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( document ).tooltip({
      position: {
        my: "center bottom-20",
        at: "center top",
        using: function( position, feedback ) {
          $( this ).css( position );
          $( "<div>" )
            .addClass( "arrow" )
            .addClass( feedback.vertical )
            .addClass( feedback.horizontal )
            .appendTo( this );
        }
      }
    });
  } );
  </script>
  <style>
  .ui-tooltip, .arrow:after {
    background: black;
    border: 2px solid white;
  }
  .ui-tooltip {
    padding: 10px 20px;
    color: white;
    border-radius: 20px;
    font: bold 14px "Helvetica Neue", Sans-Serif;
    text-transform: uppercase;
    box-shadow: 0 0 7px black;
  }
  .arrow {
    width: 70px;
    height: 16px;
    overflow: hidden;
    position: absolute;
    left: 50%;
    margin-left: -35px;
    bottom: -16px;
  }
  .arrow.top {
    top: -16px;
    bottom: auto;
  }
  .arrow.left {
    left: 20%;
  }
  .arrow:after {
    content: "";
    position: absolute;
    left: 20px;
    top: -20px;
    width: 25px;
    height: 25px;
    box-shadow: 6px 5px 9px -9px black;
    -webkit-transform: rotate(45deg);
    -ms-transform: rotate(45deg);
    transform: rotate(45deg);
  }
  .arrow.top:after {
    bottom: -20px;
    top: auto;
  }
  </style>
  <script type="text/javascript">
  
        function moveMonth(month,year) {
         //location.href="diary.jsp?param_year="+year+"&param_month="+month;
         //var obj=document.diaryFrm;
         //obj.param_month.value=month;
         //obj.param_year.value=year;
         //obj.submit();
         $("[name='param_year']").val(year);
         $("[name='param_month']").val(month);
         $("[name='diaryFrm']").submit();
         
      }//moveMonth
  </script>
</head>
<body>
<div id="wrap">
   <div id="header">
         <div id="headerTitle"> SIST Class4</div>
         </div>
   <div id="container">
   
   <div id="diaryWrap">
   <%!//declaration
       public static final int START_DAY=1;
   %>
   <%
      Calendar cal=Calendar.getInstance();
   //오늘을 저장 
   StringBuilder todate=new StringBuilder();
   todate.append(cal.get(Calendar.YEAR)).append(cal.get(Calendar.MONTH)+1).append(cal.get(Calendar.DAY_OF_MONTH));
   
      int nowYear=0;
      int nowMonth=0;
      int nowDay=cal.get(Calendar.DAY_OF_MONTH);
      //1 2 3 4 5
      //0 1 2 3 (java 0부터 시작)
      
      String param_month=request.getParameter("param_month");
      if(param_month !=null && !"".equals(param_month)) {//파라메터 월이 존재하면 현재 캘린더 객체의 월을 변경
      cal.set(Calendar.MONTH, Integer.parseInt(param_month)-1);
      }//end if
      
      nowMonth=cal.get(Calendar.MONTH)+1;
      
      String param_year=request.getParameter("param_year");
      if(param_year !=null&& !"".equals(param_year)) {//파라메터  년이 존재하면 현재 캘린더 객체의 년을 변경
      cal.set(Calendar.YEAR, Integer.parseInt(param_year));
      }//end if
      
      nowYear=cal.get(Calendar.YEAR);
      
    boolean toDayFlag=false;
    StringBuilder nowDate=new StringBuilder();
    nowDate.append(nowYear).append(nowMonth).append(nowDay);
    
    if(todate.toString().equals(nowDate.toString())) {
       toDayFlag=true;
    }//end if
    log(todate+"/"+nowDate+"/"+toDayFlag);
    
    
      pageContext.setAttribute("nowYear", nowYear);
      pageContext.setAttribute("nowMonth", nowMonth);
      pageContext.setAttribute("nowDay", nowDay);
   %>
   <form action="diary.jsp" name="diaryFrm" method="post">
         <input type="hidden" name="param_month"/>
         <input type="hidden" name="param_year"/>
   </form>
   
   <div id="diaryTitle">
         <a href="#void" onclick="moveMonth(${nowMonth-1==0?12:nowMonth-1 },${nowMonth-1==0?nowYear-1:nowYear})"><img src="images/btn_prev.png" title="이전 월"/></a>
         <span id="diaryToday" title="${nowYear }년 ${nowMonth }월"><c:out value="${nowYear }"/>.<c:out value="${nowMonth }"/></span> 
         <a href="#void" onclick="moveMonth(${nowMonth+1==13?1:nowMonth+1 },${nowMonth+1==13?nowYear+1:nowYear})"><img alt="" src="images/btn_next.png" title="다음 월"/></a>
         <a href="#void" onclick="moveMonth('','')" ><img alt="" src="images/btn_today.png" title="오늘"/></a>
         <!-- <a href="diary.jsp" ><img alt="" src="images/btn_today.png" title="오늘"/></a> -->
   </div>
   <div id="diaryContent"></div>
      <table id="diaryTab">
         <tr>
            <th class="sunTitle">일</th>
            <th class="weekTitle">월</th>
            <th class="weekTitle">화</th>
            <th class="weekTitle">수</th>
            <th class="weekTitle">목</th>
            <th class="weekTitle">금</th>
            <th class="satTitle">토</th>
         </tr>
         <tr>
         <%
         String dayClass="";//요일별 색깔
         String todayCss="";//오늘이거나 평일의 TD색 
         
         //매월마다 끝나는 날짜가 다르기 때문에 무한루프를 사용한다.
          for(int tempDay=1;  ; tempDay++) {
         cal.set(Calendar.DAY_OF_MONTH, tempDay);//임시일자를 설정한다.
         if(cal.get(Calendar.DAY_OF_MONTH)!=  tempDay) {
            //설정된 날짜가 현재일자가 아니라면 다음달 1일이므로 공백을 출력한 후 반복문을 빠져나간다.
            
            
            int week=cal.get(Calendar.DAY_OF_WEEK);
            int nextMonth=cal.get(Calendar.MONTH)+1;
            if(week!=Calendar.SUNDAY) {//마지막 일이 일요일이 아니면 출력 
               int nextDay=1;
               for (int blankTd= week; blankTd<8; blankTd++) {
               %> 
               <td class="blankTd"><div><%=nextMonth %>/<%=nextDay %></div></td>
               <% 
               nextDay++;
            }//end for
         }//end if
            break;
         }//end if
          
         //1일을 출력하기 전에 공백 출력
         switch(tempDay) {
         case START_DAY:
            for(int blankTd=1; blankTd<cal.get(Calendar.DAY_OF_WEEK); blankTd++) {
               
             %>
            <td class="blankTd"></td>
             <%
               
            }
         }
         //요일별 색 설정
         switch(cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:       dayClass="sunColor";      break;
            case Calendar.SATURDAY:   dayClass="satColor";      break;
            default:                     dayClass="weekColor";
         
         }//end switch
         
         todayCss="diaryTd";//평일의 CSS설정
      
         if(toDayFlag) {//요청한 년월일과 오늘의 년월일이 같다면 
            if(nowDay==tempDay) {//오늘일자에만 다른 CSS를 적용한다.
            todayCss="todayTd";
            }//end if
         }//end if
            %>
            <td class="<%=todayCss %>">
               <div><span class="<%=dayClass %>"><%=tempDay %></span></div>
            </td>
            <%   
            //토요일이라면 줄 변경
            switch(cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SATURDAY:
                  out.println("</tr><tr>");
            }

          }//end for
         %>
         
      </table>
   </div>
   
   </div>
   <div id="footer">
      <div id="footerTitle">copyright&copy; all reserved. class 4 </div>
   </div>
</div>

</body>
</html>