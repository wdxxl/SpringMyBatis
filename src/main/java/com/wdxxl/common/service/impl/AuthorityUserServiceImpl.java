package com.wdxxl.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdxxl.common.mapper.AuthorityUserMapper;
import com.wdxxl.common.model.AuthorityUser;
import com.wdxxl.common.service.AuthorityUserService;

@Service
public class AuthorityUserServiceImpl implements AuthorityUserService {
	
	@Autowired
	private AuthorityUserMapper authorityUserMapper;

	public List<AuthorityUser> getUserByRoleName(String roleName) {
		return authorityUserMapper.getUserByRoleName(roleName, 1);
	}

}
