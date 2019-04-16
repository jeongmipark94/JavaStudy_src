package kr.co.sist.controller.webparam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.sist.util.HangulConv;
import kr.co.sist.vo.SessionVO;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Random;

import javax.servlet.http.HttpSession;;
@SessionAttributes({"an_name","an_addr"})
@Controller
public class SessionController {

	//요청을 특정 이름으로 묶어서  처리할려면 value="/묶을이름/요청.do"의
	//형식으로 사용한다.
	@RequestMapping(value="/session/use_session.do", method=GET)
	//세션 값을 Controller에서 받기, HttpSession을 매개변수로 받아서 처리한다.
	public String sessionForm(HttpSession session) {
		String name=(String)session.getAttribute("ses_name");
		String addr=(String)session.getAttribute("ses_addr");
		System.out.println("-----Controller에서 받은 값 :=------"+ name+"/"+addr);
		return "session/session_form";
	}//sessionForm
	
	@RequestMapping(value="/session/session_param.do", method=POST)
	//입력되는 매개변수를 세션에 할당한다.
	public String sessionParam(SessionVO s_vo, HttpSession session) {
		session.setAttribute("ses_name", s_vo.getName());
		session.setAttribute("ses_addr", s_vo.getAddr());
		
		String url="session/use_session";//ViewResolver를 통해서 이동
		session.setAttribute("flag", "forward로 이동");
		if(new Random().nextBoolean()) {
			//ViewResolver를 통하지 않고 이동
			session.setAttribute("flag", "redirect로 이동");
			url="redirect:use_session.jsp";
		}//end if
		
		/*System.out.println("------param is-----"+
					s_vo.getName()+" "+s_vo.getAddr());*/
		return url;
	}//sessionParam
	
	@RequestMapping(value="/session/remove_session.do", method=GET)
	//세션이 가진 값 삭제
	public String removeSession(HttpSession session) {
		
		session.removeAttribute("ses_name");
		session.removeAttribute("ses_addr");
		session.invalidate();//세션 지워짐.
		
		return "session/session_form";
	}//removeSession
	
	/////////////////////////////////////////////@SessionAttribute을 사용한 세션처리///////////
		@RequestMapping(value="/session/an_use_session.do", method=GET)
		//세션 값을 Controller에서 받기, HttpSession을 매개변수로 받아서 처리한다.
	public String anSessionForm(HttpSession session) {
		String name=(String)session.getAttribute("an_name");
		String addr=(String)session.getAttribute("an_addr");
		
		System.out.println("-----Controller anSessionForm에서 받은 값 :=------"+ name+"/"+addr);
		return "session/an_session_form";
	}//sessionForm
	
		@RequestMapping(value="/session/an_session_param.do", method=POST)
		//입력되는 매개변수를 세션에 할당한다.
		//@SessionAttribues annotation을 사용하면 세션을 받지않고 모델을 받는다.
		public String anSessionParam(SessionVO s_vo, Model model) {
			
			//세션에서 사용할 값을 Model객체에 설정한다.
			//단, 이름은 위에서 정의한 이름과 같아야 세션으로 값이 할당된다.
			//저장된 값은 requestScope과 sessionScope에 동일하게 할당 된다.
			model.addAttribute("an_name", s_vo.getName());
			model.addAttribute("an_addr", s_vo.getAddr());
			
			String url="session/an_session_value";//ViewResolver를 통해서 이동
			model.addAttribute("an_flag", "forward로 이동");
			
			return url;
		}//sessionParam
		
		
		@RequestMapping(value="/session/an_remove_session.do", method=GET)
		//세션이 가진 값 삭제 (HttpSession을 매개변수로 받아서는 @SessionAttribute
		//에 설정된 값이 삭제되지 않는다.
		//1. SessionStatus객체를 매개변수로 선언하고
		public String anRemoveSession(SessionStatus ss) {
			
			//2.setComplete()를 호출하여 삭제한다.
			ss.setComplete();//값 싹 다 지우기.
/*			System.out.println("-----------세션 삭제------------");*/
			return "session/an_session_form";
		}//removeSession
		
}//class
