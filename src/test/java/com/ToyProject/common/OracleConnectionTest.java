package com.ToyProject.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ToyProject.user.service.UserService;

public class OracleConnectionTest {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	public OracleConnectionTest() {
		System.out.println(this.getClass());
	};
	
	@Test
	public void testConnection() {
		try {
			LOGGER.debug("[Cotroller] testConnection Strat============");
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("key", "data");
			userService.insertUser(param);
			LOGGER.debug("[Cotroller] testConnection End============");
		} catch (NullPointerException e) {
			LOGGER.error("OracleConnectionTest NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("OracleConnectionTest IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("OracleConnectionTest Exception : " + e.getMessage());
		}
	}
}
