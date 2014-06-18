package com.wdxxl.common.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	@RequestMapping(value="/json", method=RequestMethod.GET)
	public @ResponseBody Object  getJson(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("name", "King");
		result.put("age", "12");
		return result;
	}
	
}
