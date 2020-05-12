package com.ToyProject.user.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ToyProject.user.dao.UserDao;

@Service("UserService")
public class UserServiceImpl implements UserService{

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserDao")
	UserDao userDao;
	
	@Override
	public void insertUser(Map<String, Object> param) throws Exception {
		LOGGER.debug("[ServiceImpl] UserServiceImpl param = "+param);
		
	}

	@Override
	public void selectUser() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Object>> selectUserList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
