package com.wdxxl.exam.mapper;

import com.wdxxl.exam.model.Person;
import com.wdxxl.exam.model.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    int countByExample(PersonExample example);
    int deleteByExample(PersonExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(Person record);
    int insertSelective(Person record);
    List<Person> selectByExample(PersonExample example);
    Person selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);
    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);
    int updateByPrimaryKeySelective(Person record);
    int updateByPrimaryKey(Person record);
 
    //================ Personal Method =============
  	List<Person> getPersons();


}