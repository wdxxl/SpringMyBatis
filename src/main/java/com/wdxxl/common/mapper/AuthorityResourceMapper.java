package com.wdxxl.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wdxxl.common.model.AuthorityResource;
import com.wdxxl.common.model.AuthorityResourceExample;

public interface AuthorityResourceMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int countByExample(AuthorityResourceExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByExample(AuthorityResourceExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insert(AuthorityResource record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int insertSelective(AuthorityResource record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	List<AuthorityResource> selectByExample(AuthorityResourceExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	AuthorityResource selectByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExampleSelective(@Param("record") AuthorityResource record,
			@Param("example") AuthorityResourceExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByExample(@Param("record") AuthorityResource record,
			@Param("example") AuthorityResourceExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKeySelective(AuthorityResource record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table authority_resource
	 * @mbggenerated  Thu Jun 19 00:46:09 CST 2014
	 */
	int updateByPrimaryKey(AuthorityResource record);
	AuthorityResource getResourceById(Integer id)throws Exception;
    List<AuthorityResource> getResourceByPid(Integer id) throws Exception;
    List<AuthorityResource> getAllResourceWithHasByRoleid(Integer roleid);

    void save(AuthorityResource resource) throws Exception;
    void update(AuthorityResource resource) throws Exception;
    void delete(Integer id) throws Exception;
    void deleteByPid(Integer id)  throws Exception;
    
    //int insertRoleResource(RoleResource roleResource);
    //int delRoleResourceBy(RoleResource roleResource);
}