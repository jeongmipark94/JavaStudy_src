package kr.co.sist.controller.webparam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.service.CookieService;

//import org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@Controller
public class CookieController {
	@RequestMapping(value="cookie/read_cookie.do",method=GET)
	public String readCookie(HttpServletRequest request, Model model) {
	
		//1.쿠키들 읽기
		Cookie[] cookies=request.getCookies();
		model.addAttribute("rCookie", cookies);
		if(cookies!= null) {//읽어들인 쿠키 존재
			
			//읽어들인 모든 쿠키를  JSP에서 사용할 수있다.
			CookieService cs= new CookieService();
			
			Cookie tempCookie= null;
			int cnt=0;
			for(int i=0; i< cookies.length; i++) {
				//Controller에서 쿠키의 값으로 업무처리를 하기 위해서
				tempCookie=cookies[i];
				if("JSESSIONID".equals(tempCookie.getName())) {
					cnt++;
				}//end if
				if("name".equals(tempCookie.getName())) {
					model.addAttribute("name",cs.nameMsg(tempCookie.getValue()));
					cnt++;
				}//end if
				if("age".equals(tempCookie.getName())) {
					model.addAttribute("birth",cs.birth(
							Integer.parseInt(tempCookie.getValue())));
					
				}//end if
			}//end for
			if(cnt==1) {//JSESSIONID만 존재하는 경우
				model.addAttribute("rCookie",null);
			}//end if
		}//end if
		
		
		return "cookie/read_cookie";
	}//readCookie
	
	@RequestMapping(value="/cookie/add_cookie.do", method=GET)
	public String addCookie(HttpServletResponse response, Model model) {
		
		//1.쿠키생성
		Cookie nameCookie = new Cookie("name", "seonui.gong");//쿠키는 한글이 심어지지않는다. 한글을 넣으려면 encoding 어쩌구 해줘야됨
		Cookie ageCookie = new Cookie("age", "28");
		//2.쿠키 생존시간 설정 : 브라우저가 열려있으면 계속 유지
		//브라우저 종료 후 생존시간이 적용된다.
		nameCookie.setMaxAge(60*2);
		ageCookie.setMaxAge(60*2);
		//3.쿠키 심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		
		return "cookie/read_cookie";
	}//addCookie
	
	@RequestMapping(value="/cookie/remove_cookie.do", method=GET)
	public String removeCookie(HttpServletResponse response, Model model) {
		//1.같은 이름의 쿠키를 생성한다.
		Cookie nameCookie = new Cookie("name", "");
		Cookie ageCookie = new Cookie("age", "");
		//2.생존 시간을 0으로 설정.
		nameCookie.setMaxAge(0);
		ageCookie.setMaxAge(0);
		//3.쿠키 심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		model.addAttribute("cookieFalg",true);
		model.addAttribute("msg","쿠키가 생성되었습니다.");
		
		
		return "cookie/read_cookie";
	}//removeCookie
	
	/////////////////////////////////////////////////////@CookieValue annotation 사용////////////////////////////////////////////////
	@RequestMapping(value="/cookie/read_an_cookie.do",method=GET)
	public String anReadCookie(
			@CookieValue(value="an_name", defaultValue="")String an_name,
			@CookieValue(value="an_age",defaultValue="")String an_age, Model model) {
			System.out.println("쿠키 값 이름:"+ an_name);
			System.out.println("쿠키 값 나이:"+ an_age);
			
			model.addAttribute("an_name",an_name);
			model.addAttribute("an_age",an_age);
			
		return "cookie/an_read_cookie";
	}//anReadCookie
	
	@RequestMapping(value="/cookie/an_add_cookie.do", method=GET)
	public String anAddCookie(HttpServletResponse response ) {
		
		//1.쿠키생성
		Cookie nameCookie = new Cookie("an_name", "jungyun");
		Cookie ageCookie = new Cookie("an_age", "30");
		//2.쿠키 생존시간 설정 : 브라우저가 열려있으면 계속 유지
		//브라우저 종료 후 생존시간이 적용된다.
		nameCookie.setMaxAge(60*60);
		ageCookie.setMaxAge(60*60);
		//3.쿠키 심기
		response.addCookie(nameCookie);
		response.addCookie(ageCookie);
		
		
		return "cookie/an_cookie_result";
	}//addCookie
	
}//class













