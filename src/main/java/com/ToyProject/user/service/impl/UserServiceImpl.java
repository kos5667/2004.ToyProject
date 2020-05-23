package com.ToyProject.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ToyProject.user.dao.UserDao;
import com.ToyProject.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserDao")
	UserDao userDao;
	
	@Override
	public int insertUser(Map<String, Object> param) throws Exception {
		int result = userDao.insertUser(param);
		return result;
	}

	@Override
	public Map<String, Object> selectUser(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return userDao.selectUser(map);
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
