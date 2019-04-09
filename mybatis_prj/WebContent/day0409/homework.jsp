<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    

    <div>
    제조국
    <select name="country">
    	<option value="국산"  >국산</option>
    	<option value="수입" >수입</option>
    </select>
    제조사
    <%
    String name=request.getParameter("country");
    %>
	    <select name="brand" >
    <where>
    	<if test="${name } = '국산'">
	    	<option value="현대">현대</option>
	    	<option value="기아">기아</option>
	    	<option value="삼성">삼성</option>
	    	<option value="쌍용">쌍용</option>
    	</if>
    	<if test="${name } = '수입'">
	    	<option value="BMW">BMW</option>
	    	<option value="BENZ">BENZ</option>
	    	<option value="AUDI">AUDI</option>
	    	</if>
	    </select>
	    모델명
    </where>
    <select>
    	<option>그랜저</option>
    	<option>소나타</option>
    </select>
    <input type="submit"  value="조회" class="btn">
    </div>
    
    <div><!--값이 조회될 경우 아래에서 table 뿌려주기  -->
     <%-- <c:if test="${ not empty param. }"> 
    <table>
    	<tr>
    		<th width="60">이미지</th>
    		<th width="120">옵션</th>
    		<th width="60">연식</th>
    	</tr>
    	 <c:forEach var="car" items="${ carList}">
    	<tr>
    		<td><img src=""><c:out value=""/></td>
    		<td><c:out value=""/></td>
    		<td><c:out value=""/></td>
    	</tr>
    	</c:forEach> 
    
    </table>
    
    </c:if> --%>
    </div>