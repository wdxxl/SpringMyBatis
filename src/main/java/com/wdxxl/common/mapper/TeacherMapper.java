package com.wdxxl.common.mapper;

import com.wdxxl.common.model.Teacher;
import com.wdxxl.common.model.TeacherExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int countByExample(TeacherExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByExample(TeacherExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insert(Teacher record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insertSelective(Teacher record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	List<Teacher> selectByExample(TeacherExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	Teacher selectByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Teacher record,
			@Param("example") TeacherExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExample(@Param("record") Teacher record,
			@Param("example") TeacherExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKeySelective(Teacher record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table teacher
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKey(Teacher record);
	//Manually
	List<Teacher> getAllTeacherStudents();
	List<String> selectDistinctTeacherName();

}