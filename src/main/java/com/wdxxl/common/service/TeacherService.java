package com.wdxxl.common.service;

import java.util.List;

import com.wdxxl.common.model.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeacherStudents();
    List<String> selectDistinctTeacherName();
}
