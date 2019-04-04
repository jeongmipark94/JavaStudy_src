<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- smartmenu 시작 -->
<!-- SmartMenus core CSS (required) -->
    <link href="http://localhost:8080/mybatis_prj/common/smartmenu/css/sm-core-css.css" rel="stylesheet" type="text/css" />

    <!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
    <link href="http://localhost:8080/mybatis_prj/common/smartmenu/css/sm-simple/sm-simple.css" rel="stylesheet" type="text/css" />

	<!-- jQuery -->
   	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script> -->

    <!-- SmartMenus jQuery plugin -->
    <script type="text/javascript" src="http://localhost:8080/mybatis_prj/common/smartmenu/jquery.smartmenus.min.js"></script>

    <!-- SmartMenus jQuery init -->
    <script type="text/javascript">
    	$(function() {
    		$('#main-menu').smartmenus({
    			subMenusSubOffsetX: 1,
    			subMenusSubOffsetY: -8
    		});
    	});
    </script>

<!-- smartmenu 끝 -->
	<nav id="main-nav">
      <!-- Sample menu definition -->
      <ul id="main-menu" class="sm sm-simple">
        <li><a href="#void">홈으로</a></li>
        <li><a href="#void">쿼리실행</a>
          <ul>
            <li><a href="#void">1일차</a>
              <ul>
                <li><a href="main.jsp?page=single_column">컬럼 하나에 레코드 하나</a></li>
                <li><a href="main.jsp?page=multi_column">컬럼 여러개에 레코드 하나 </a></li>
                <li><a href="main.jsp?page=multi_row">컬럼 하나에 레코드 여러개</a></li>
              </ul>
            </li>
          </ul>
        </li>
        </ul>
        </nav>
		