package com.wdxxl.common.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.wdxxl.common.model.Teacher;
import com.wdxxl.common.service.TeacherService;
import com.wdxxl.common.utils.SpringTransactionalTestCase;

@ContextConfiguration(locations = {"classpath:spring-mvc-servlet.xml"})
public class TeacherServiceImplTest extends SpringTransactionalTestCase {
	@Autowired 
	private TeacherService teacherServiceImpl;
	
	@Test
	public void testGetAllTeacherStudents() {
		List<Teacher> teachers =  teacherServiceImpl.getAllTeacherStudents();
		Assert.assertTrue(teachers.size()>0);
	}
	
	@Test
	public void testSelectDistinctTeacherName() {
		List<String> names =  teacherServiceImpl.selectDistinctTeacherName();
		Assert.assertTrue(names.size()>0);
	}
	
}
