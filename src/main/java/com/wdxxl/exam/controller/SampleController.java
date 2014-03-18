package com.wdxxl.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.wdxxl.exam.model.Sample;
import com.wdxxl.exam.service.SampleService;

@Controller
public class SampleController {
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/sample")
	public ModelAndView goToSamplesModelAndView1(){
		Integer sampleId = 1;
		Sample sample = sampleService.doSomeBusinessStuff(sampleId);
		System.out.println("JSON.toJSONString:"+JSON.toJSONString(sample.getName()));
		ModelAndView modelAndView = new ModelAndView("sample");
		return modelAndView;
	}
}


