package com.ally.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ally.common.pojo.AllyResult;
import com.ally.manager.pojo.TUser;

public interface UserService {

	AllyResult checkData(String content, Integer type);
	AllyResult createUser(TUser user);
	AllyResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	AllyResult getUserByToken(String token);
}
