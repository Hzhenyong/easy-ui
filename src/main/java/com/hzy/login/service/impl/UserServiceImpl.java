package com.hzy.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzy.common.menu.Tree;
import com.hzy.common.utils.BaseResult;
import com.hzy.login.dao.SysUserMapper;
import com.hzy.login.domain.User;
import com.hzy.login.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper userMapper;

	@Override
	public User selectByExample(String loginName) {

		return userMapper.selectByExample(loginName);
	}

	@Override
	public User getByLoginName(String loginName) {
		System.out.println(loginName);
		if (loginName != null && !loginName.equals("")) {
			return userMapper.getByLoginName(loginName);
			
		}
		System.out.println("sssss");
		return null;
	}

	@Override
	public BaseResult topMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tree> menuTree(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
