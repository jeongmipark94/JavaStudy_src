package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oreilly.servlet.MultipartRequest;

import kr.co.sist.domain.Member;
import kr.co.sist.domain.MemberDetail;
import kr.co.sist.service.JdbcService;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
@Controller
public class JdbcController {
   @Autowired
   private JdbcService js;
   
   @RequestMapping(value="/index.do", method= {GET,POST})
   public String main() {
      return "index";
   }//end main
   
   @RequestMapping(value="/add_form.do", method=GET)
   public String memberUploadForm() {
      return "member/add_form";
   }
   @RequestMapping(value="/addmember_process.do",method=POST)
   public String uploadProcess(HttpServletRequest request) {
      
      String moveURL="redirect:err/err.html";
      
      try {
         if(js.fileUploadProcess(request)) {
            moveURL="member/upload_success";
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      return moveURL;
   }//uploadProcess
   
   @RequestMapping(value="/search_member.do", method=GET)
   public String searchAllMember(Model model) {
	   List<Member> list= null;
	   list=js.searchAllMember();
	   
	   model.addAttribute("memberList", list);//memberList는 request scope에 들어감 
	   //값이 어디까지 사용되는지에 따라 4가지 , 생성이 어디서 되는지 4가지 종류 scope
	   //model에 값으로 들어가있는 것이 session에 들어가려면 클래스 위에 session attribute
	   //세션에 들어있는 값을 받을 떈 httpsession 써야함
	   
	   return "member/member_list";
   }//searchAllMember
   @RequestMapping(value="/detail_member.do",method=GET)
   public String seachOneMember(@RequestParam(defaultValue="0") int num, Model model) {
      MemberDetail md=js.searchOneMember(num);
      model.addAttribute("memberData",md);
      
      
      return "member/member_detail";
   }
   
}//class