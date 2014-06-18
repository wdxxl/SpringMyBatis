package com.wdxxl.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdxxl.common.mapper.TeacherMapper;
import com.wdxxl.common.model.Teacher;
import com.wdxxl.common.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	public List<Teacher> getAllTeacherStudents() {
		return teacherMapper.getAllTeacherStudents();
	}

	public List<String> selectDistinctTeacherName() {
		return teacherMapper.selectDistinctTeacherName();
	}

}
