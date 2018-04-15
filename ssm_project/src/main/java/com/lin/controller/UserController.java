package com.lin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.domain.User;
import com.lin.service.UserService;




@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/")  
    public ModelAndView getIndex(){    
		ModelAndView mav = new ModelAndView("success"); 
		User user = userService.selectUserById(1);
	    mav.addObject("user", user); 
        return mav;  
    }  
	
	//登录
	@RequestMapping("/index")
	public ModelAndView getLogin(String username,String password ){
		
		ModelAndView mav=new ModelAndView("index");
		User user =userService.selectUserByUsername(username);
		System.out.println(user.toString());
		
		mav.addObject("user", user);
		return mav;
	}
	
	
	
}
