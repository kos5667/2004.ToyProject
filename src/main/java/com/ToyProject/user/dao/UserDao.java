package com.ToyProject.user.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sqlSessionTemplate")
	private SqlSession sqlSession;
	
	
	public int insertUser(Map<String, Object> param) throws Exception {
		LOGGER.debug("[UserDao] insertUser param = "+param);
		int result = 1;
		return result;
	}
	
	public Map<String, Object> selectUser(Map<String, Object> map) throws Exception {
		return sqlSession.selectOne("UserMapper.selectUser", map);
	}
	
}
