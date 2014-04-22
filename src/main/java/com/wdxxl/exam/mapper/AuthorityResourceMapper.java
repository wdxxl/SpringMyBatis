package com.wdxxl.exam.mapper;

import com.wdxxl.exam.model.AuthorityResource;
import com.wdxxl.exam.model.AuthorityResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityResourceMapper {
    int countByExample(AuthorityResourceExample example);
    int deleteByExample(AuthorityResourceExample example);
    int deleteByPrimaryKey(Integer id);
    int insert(AuthorityResource record);
    int insertSelective(AuthorityResource record);
    List<AuthorityResource> selectByExample(AuthorityResourceExample example);
    AuthorityResource selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") AuthorityResource record, @Param("example") AuthorityResourceExample example);
    int updateByExample(@Param("record") AuthorityResource record, @Param("example") AuthorityResourceExample example);
    int updateByPrimaryKeySelective(AuthorityResource record);
    int updateByPrimaryKey(AuthorityResource record);
}