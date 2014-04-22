package com.wdxxl.exam.mapper;

import com.wdxxl.exam.model.AuthorityRole;
import com.wdxxl.exam.model.AuthorityRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityRoleMapper {
    int countByExample(AuthorityRoleExample example);
    int deleteByExample(AuthorityRoleExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(AuthorityRole record);
    int insertSelective(AuthorityRole record);
    List<AuthorityRole> selectByExample(AuthorityRoleExample example);
    AuthorityRole selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") AuthorityRole record, @Param("example") AuthorityRoleExample example);
    int updateByExample(@Param("record") AuthorityRole record, @Param("example") AuthorityRoleExample example);
    int updateByPrimaryKeySelective(AuthorityRole record);
    int updateByPrimaryKey(AuthorityRole record);
}