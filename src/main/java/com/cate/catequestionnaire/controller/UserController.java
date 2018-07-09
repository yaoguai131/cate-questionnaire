package com.cate.catequestionnaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cate.catequestionnaire.config.ConfigTestBean;

@RestController
public class UserController {
	
	@Autowired
	ConfigTestBean configTestBean;
	
	@RequestMapping("/")
	public String test(){
		StringBuffer str = new StringBuffer();
		str.append(" secret:"+configTestBean.getSecret());
		str.append(" , number:"+configTestBean.getNumber());
		str.append(" , bignumber:"+configTestBean.getBignumber());
		str.append(" , uuid:"+configTestBean.getUuid());
		str.append(" , ten:"+configTestBean.getTen());
		str.append(" , range:"+configTestBean.getRange());
		return str.toString();
	}

}
