package com.wdxxl.exam.service;

import java.util.List;

import com.wdxxl.exam.model.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeacherStudents();
    List<String> selectDistinctTeacherName();
}
