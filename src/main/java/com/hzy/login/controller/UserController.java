package com.hzy.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzy.login.domain.User;
import com.hzy.login.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public Object  login() {
		System.out.println("HUANYING ");
		String loginName = "admin";
		User user = null;
		if (loginName !=null && !loginName.equals("")) {
			 user = userService.getByLoginName(loginName);
			System.out.println(user);
		
			
			
		}
		return user;
		
	}
	
	
	  @RequestMapping(value = "/sys/users/menu/top", method = RequestMethod.GET)
	    @ResponseBody
	    public void topMenu() {
	       // return UserService.topMenu();
	    }

	    @RequestMapping(value = "/sys/users/menu/{id}/tree", method = RequestMethod.GET)
	    @ResponseBody
	    public void menuTree(@PathVariable("id") Long id) {
	       // return UserService.menuTree(id);
	    }

}
