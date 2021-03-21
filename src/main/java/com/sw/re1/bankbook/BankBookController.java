package com.sw.re1.bankbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	//상품리스트 bankbooList  get
	@RequestMapping(value="/bankbook/bankbookList")
	public void bankbookList() throws Exception {
		
	}
	
	//상품등록 bankbookAdd get/	post-parameter(bookName, bookRate, bookSale)
	@RequestMapping(value="/bankbook/bankbookAdd")
	public void bankbookAdd() throws Exception {
		
	}
	
	@RequestMapping(value="/bankbook/bankbookAdd", method=RequestMethod.POST)
	public void bankbookAdd(ModelAndView mv) throws Exception {
		
	}
	
	
	//상품상세 bankbookSelect get-parameter(bookNumber)
	@RequestMapping(value="/bankbook/bankbookSelect")
	public void bankbookSelect(Model model) throws Exception {
		
	}
	
	//상품수정 bankbookUpdate get-parameter(bookNumber)/	post-parameter(bookNumber, bookName, bookRate, bookSale)
	@RequestMapping(value="/bankbook/bankbookUpdate")
	public void bankbookUpdate(Model model) throws Exception{
		
	}
	
	@RequestMapping(value="/bankbook/bankbookUpdate", method=RequestMethod.POST)
	public void bankbookUpdate(ModelAndView mv) throws Exception{
		
	}
	
	
	
	//상품삭제 bankbookList get-parameter(bookNumber)
	@RequestMapping(value="/bankbook/bankbookDelete")
	public void bankbookDelete(Model model) throws Exception{
		
	}
	
	
	

}
