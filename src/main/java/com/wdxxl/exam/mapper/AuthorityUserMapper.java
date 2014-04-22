package com.wdxxl.exam.mapper;

import com.wdxxl.exam.model.AuthorityUser;
import com.wdxxl.exam.model.AuthorityUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityUserMapper {
    int countByExample(AuthorityUserExample example);
    int deleteByExample(AuthorityUserExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(AuthorityUser record);
    int insertSelective(AuthorityUser record);
    List<AuthorityUser> selectByExample(AuthorityUserExample example);
    AuthorityUser selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") AuthorityUser record, @Param("example") AuthorityUserExample example);
    int updateByExample(@Param("record") AuthorityUser record, @Param("example") AuthorityUserExample example);
    int updateByPrimaryKeySelective(AuthorityUser record);
    int updateByPrimaryKey(AuthorityUser record);
}