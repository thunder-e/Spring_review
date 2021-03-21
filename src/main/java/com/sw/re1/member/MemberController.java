package com.sw.re1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/memberJoin")
	public void memberJoin() throws Exception{
	}
	
	@RequestMapping(value="/member/memberJoin", method=RequestMethod.POST)
	public void memberJoin(MemberDTO memberDTO, ModelAndView mv) throws Exception{
		
	}
	
	@RequestMapping(value="/member/memberLogin")
	public void memberLogin() throws Exception {	
	}
	
	
	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, ModelAndView mv) throws Exception {
		memberDTO =	memberService.memberLogin(memberDTO);
		
		System.out.println("로그인은 됐는감");
		mv.addObject("dto", memberDTO);
		mv.setViewName("member/memberPage");
	
		return mv;
	}
	
	

}
