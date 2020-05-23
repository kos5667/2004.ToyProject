package com.ToyProject.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ToyProject.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {	"classpath:spring/com/context-common.xml",
									"classpath:spring/com/context-aspect.xml"})
public class AspectTest {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	public AspectTest() {
		LOGGER.debug("Constructor " + this.getClass());
	};
	
	@Test
	public void testConnection() {
		try {
			
			LOGGER.debug("test");
			Map<String, Object> param = new HashMap<String, Object>();
			
			param.put("key", 2);
			
			int result = userService.insertUser(param);
			
			System.out.println(result);
		} catch (NullPointerException e) {
			LOGGER.error("OracleConnectionTest NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("OracleConnectionTest IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("OracleConnectionTest Exception : " + e.getMessage());
		}
	}
}
