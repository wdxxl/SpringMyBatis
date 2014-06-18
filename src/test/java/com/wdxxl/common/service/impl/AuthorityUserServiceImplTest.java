package com.wdxxl.common.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.wdxxl.common.model.AuthorityUser;
import com.wdxxl.common.service.AuthorityUserService;
import com.wdxxl.common.utils.SpringTransactionalTestCase;

@ContextConfiguration(locations = {"classpath:spring-mvc-servlet.xml"})
public class AuthorityUserServiceImplTest extends SpringTransactionalTestCase {
	@Autowired 
	private AuthorityUserService authorityUserServiceImpl;
	
	@Test
	public void testGetUserByRoleName() {
		String roleName = "用户";
		List<AuthorityUser> authorityUsers =  authorityUserServiceImpl.getUserByRoleName(roleName);
		Assert.assertTrue(authorityUsers.size()>0);
	}
	
}
