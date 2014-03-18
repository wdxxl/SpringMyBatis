package com.wdxxl.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wdxxl.exam.model.Sample;
import com.wdxxl.exam.model.SampleExample;

public interface SampleMapper {

	int countByExample(SampleExample example);

	int deleteByExample(SampleExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Sample record);

	int insertSelective(Sample record);

	List<Sample> selectByExample(SampleExample example);

	Sample selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Sample record,
			@Param("example") SampleExample example);

	int updateByExample(@Param("record") Sample record,
			@Param("example") SampleExample example);

	int updateByPrimaryKeySelective(Sample record);

	int updateByPrimaryKey(Sample record);
}