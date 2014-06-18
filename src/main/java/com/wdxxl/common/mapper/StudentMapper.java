package com.wdxxl.common.mapper;

import com.wdxxl.common.model.Student;
import com.wdxxl.common.model.StudentExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int countByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	List<Student> selectByExample(StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	Student selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExample(@Param("record") Student record,
			@Param("example") StudentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKey(Student record);
}