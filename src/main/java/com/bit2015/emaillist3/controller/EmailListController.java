package com.bit2015.emaillist3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2015.emaillist3.dao.EmailListDao;
import com.bit2015.emaillist3.vo.EmailListVo;

@Controller
public class EmailListController {

	@Autowired
	EmailListDao emailListDao;
	
	@RequestMapping( "/list" )
	public String list( Model mode ) {
		List<EmailListVo> list = emailListDao.getList();
		mode.addAttribute( "list", list );
		return "/WEB-INF/views/list.jsp";
	}
}
