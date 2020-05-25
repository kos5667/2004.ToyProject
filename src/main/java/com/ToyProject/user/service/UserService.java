package com.ToyProject.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	
	public int insertUser(Map<String,Object> param) throws Exception;
	
	public Map<String, Object> selectUser(Map<String, Object> map) throws Exception;
	
	public List<Map<String,Object>> selectUserList() throws Exception;
	
	public void updateUser() throws Exception;
	
	public void deleteUser() throws Exception;
	
}
