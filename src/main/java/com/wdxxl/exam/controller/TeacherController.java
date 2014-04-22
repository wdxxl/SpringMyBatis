package com.wdxxl.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wdxxl.exam.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/teacherNames")
	public ModelAndView goToTeahcersModelAndView1(){
		List<String> names = teacherService.selectDistinctTeacherName();
		System.out.println(names.size());
		ModelAndView modelAndView = new ModelAndView("teacher");
		return modelAndView;
	}
}


