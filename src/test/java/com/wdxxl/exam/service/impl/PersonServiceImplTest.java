package com.wdxxl.exam.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.wdxxl.exam.model.Person;
import com.wdxxl.exam.service.PersonService;
import com.wdxxl.exam.utils.SpringTransactionalTestCase;

@ContextConfiguration(locations = {"classpath:spring-mvc-servlet.xml"})
public class PersonServiceImplTest extends SpringTransactionalTestCase {
	@Autowired 
	private PersonService personServiceImpl;
	
	@Test
	public void testGetPersons() {
		List<Person> persons =  personServiceImpl.getPersons();
		Assert.assertTrue(persons.size()>0);
	}
}
