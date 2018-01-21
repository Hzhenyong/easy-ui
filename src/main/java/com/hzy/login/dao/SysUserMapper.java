package com.hzy.login.dao;

import com.hzy.login.domain.User;


public interface SysUserMapper {
	User selectByExample(String  loginName);
	User getByLoginName(String loginName);
}
