package com.wdxxl.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdxxl.exam.mapper.PersonMapper;
import com.wdxxl.exam.model.Person;
import com.wdxxl.exam.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonMapper personMapper;

	public List<Person> getPersons() {
		return personMapper.getPersons();
	}
	
}
