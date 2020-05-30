package com.ToyProject.main;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ToyProject.user.service.UserService;

@Controller
@RequestMapping("/main/*")
public class Main {
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	//Constructor
	public Main() throws Exception {
		LOGGER.debug("\nConstructor :: "+this.getClass()+"\n");
	}
	
	//Method
	@RequestMapping(value="mainPage", method=RequestMethod.GET)
	public String mainPage() {
		LOGGER.debug("\nmainPage :: "+this.getClass()+"\n");
		String URL = "";
		try {
			URL += "/WEB-INF/jsp/main/main.jsp";
		} catch (NullPointerException e) {
			LOGGER.error("mainPage NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("mainPage IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("mainPage Exception : " + e.getMessage());
		}
		return URL;
	}
}
