package com.cate.catequestionnaire.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cate.catequestionnaire.tool.BaseAjaxResponse;

@RestController
@RequestMapping("/cate")
public class CateController {
	
	@RequestMapping("/save")
	public BaseAjaxResponse save(){
		BaseAjaxResponse res = new BaseAjaxResponse();
		return res;
	}

}
