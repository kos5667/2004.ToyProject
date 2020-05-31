package com.ToyProject.user.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ToyProject.user.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Resource(name = "UserService")
	UserService userService;
	
	@RequestMapping(value="/selectUserList", method=RequestMethod.POST)
	public ModelAndView selectUserList(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		String URL="";
		try {
			List<Map<String,Object>> userList=userService.selectUserList();
			System.out.println("========================================="+userList);
			URL = "/WEB-INF/jsp/user/selectUserList.jsp";
			model.addAttribute("userList", userList);
			modelAndView.setViewName(URL);
			modelAndView.addObject("userList", userList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return modelAndView;
		
		
	}
}
