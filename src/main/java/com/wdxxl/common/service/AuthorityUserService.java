package com.wdxxl.common.service;

import java.util.List;

import com.wdxxl.common.model.AuthorityUser;

public interface AuthorityUserService {
	 List<AuthorityUser> getUserByRoleName(String roleName);
}
