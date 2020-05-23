package com.ToyProject.user.dao;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public int insertUser(Map<String, Object> param) throws Exception {
		LOGGER.debug("[UserDao] insertUser param = "+param);
		int result = 1;
		return result;
	}
	
}
