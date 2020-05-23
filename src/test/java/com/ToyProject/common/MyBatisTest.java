package com.ToyProject.common;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ToyProject.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/com/context-datasource.xml",
						"classpath:spring/com/context-mybatis.xml",
						"classpath:spring/com/context-common.xml"})
public class MyBatisTest {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	public MyBatisTest() {
		LOGGER.debug("Constructor " + this.getClass());
	};
	
	@Test
	public void testSession() throws Exception{
		try {
			
			//SqlSession session = sqlSessionFactory.openSession();
			//LOGGER.debug("[TEST] MyBatisTest : "+session);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("key",123);
			userService.selectUser(map);
			
		}catch (NullPointerException e) {
			LOGGER.error("MyBatisTest NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("MyBatisTest IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("MyBatisTest Exception : " + e.getMessage());
		}
	}

}
