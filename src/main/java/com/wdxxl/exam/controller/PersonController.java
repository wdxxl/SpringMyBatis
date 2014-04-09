package com.wdxxl.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wdxxl.exam.model.Person;
import com.wdxxl.exam.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/person")
	public ModelAndView goToSamplesModelAndView1(){
		List<Person> persons = personService.getPersons();
		System.out.println(persons.size());
		ModelAndView modelAndView = new ModelAndView("person");
		return modelAndView;
	}
}


