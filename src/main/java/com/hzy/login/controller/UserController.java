package com.hzy.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public String    login(String loginName,String password ,Model model) {
		 
		System.out.println("yonghu" + loginName + password);
		
		if (loginName !=null && !loginName.equals("")) {
			  userService.getByLoginName(loginName);
			  model.addAttribute("msg", "成功");
			System.out.println("成功");
		
			
			
		}
		return "success";
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
