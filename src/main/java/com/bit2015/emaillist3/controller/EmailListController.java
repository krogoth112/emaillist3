package com.bit2015.emaillist3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit2015.emaillist3.dao.EmailListDao;
import com.bit2015.emaillist3.vo.EmailListVo;

@Controller
public class EmailListController {

	@Autowired
	EmailListDao emailListDao;
	
	@RequestMapping( "/list" )
	public String list( Model model ) {
		
		List<EmailListVo> list = emailListDao.getList();
		model.addAttribute( "list", list );
		// model.addAttribute( list );  // 첫번째 요소의 타입이름(클래스이름)에 List를 붙힌다.  emailListVoList

		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping( "/form" )
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping( value = "/insert", method = RequestMethod.POST )
	public String insert( @ModelAttribute EmailListVo vo ) {
		emailListDao.insert(vo);
		return "redirect:/list";
	}
}
