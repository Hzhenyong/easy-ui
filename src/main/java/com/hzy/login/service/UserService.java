package com.hzy.login.service;

import java.util.List;

import com.hzy.common.menu.Tree;
import com.hzy.common.utils.BaseResult;
import com.hzy.login.domain.User;



public interface UserService {

	public User selectByExample(String loginName);
	 /**
     * Description: 根据登录名获取用户 <br/>
     */
    User getByLoginName(String loginName);
    
    BaseResult topMenu();

    List<Tree> menuTree(Long id);
}
