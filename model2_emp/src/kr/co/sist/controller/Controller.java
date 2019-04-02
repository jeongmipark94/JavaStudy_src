package kr.co.sist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	/**
	 * 요청, 응답 처리, 관계유지 객체(Session- 정보를 서버의 메모리에 저장 어떤 브라우저든 모든 접속자의 정보를 저장,
	 *  Cookie- 접속자의 정보를 접속자의 HDD에 저장)의 사용
	 * @param request 웹 파라메터 요청처리
	 * @param response 응답처리
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException;
	
	/**
	 * 처리한 결과를 보여줄 JSP명을 반환 
	 * @return
	 */
	public String moveURL();
	/**
	 * 처리한 결과를 보여줄 JSP, HTML로 이동하는 이동방식 선정
	 * @return
	 */
	public boolean isForward();
	
}
