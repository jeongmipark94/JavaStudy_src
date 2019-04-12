package kr.co.sist.controller.webparam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.vo.ParamVO;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
	//GET ������� ��û�� ó���� ������ URL�� �־�ȴ�.
	//value="URL", method=RequestMethod.GET
	@RequestMapping("/request_form.do")
	public String requestForm() {
		
		return "param/request_form";
	}//requestForm
	
	@RequestMapping(value="/use_request_process.do", method=GET)
	//HttpServletRequest�� ����� �Ķ���� ó�� : ���� X
	public String requestFormProcess( HttpServletRequest request) {
		
		String name=request.getParameter("name");
		String age= request.getParameter("age");
		String[] lang= request.getParameterValues("lang");
		
		System.out.println(name+" "+ age+" "+ Arrays.toString(lang));
		request.setAttribute("lang", lang );
		
		return "param/request_process";
	    }//requestFormProcess
		@RequestMapping("/vo_form.do")
		public String voForm() {
			
			return "param/vo_form";
		}
		//Vo�� ����� Parameteró��
		@RequestMapping(value="/vo_process.do",method=GET)
		public String voProcess(ParamVO pv, Model m) {
			//System.out.println("-----"+pv);
			
			
			m.addAttribute("langData",pv.getLang());//�� ���� JSP�� ���޵ȴ�.
			m.addAttribute("nameData",pv.getName());//�� ���� JSP�� ���޵ȴ�.
			m.addAttribute("ageData",pv.getAge());//�� ���� JSP�� ���޵ȴ�.
			return "param/vo_process";
		}//requestFormProcess
	}//class
	

