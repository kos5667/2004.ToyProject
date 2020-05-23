package com.ToyProject.user.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.ToyProject.user.service.UserService;

@Controller
public class UserController {

	@Resource(name = "UserService")
	UserService userService;
	
}
