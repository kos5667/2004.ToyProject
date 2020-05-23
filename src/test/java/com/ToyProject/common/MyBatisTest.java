package com.ToyProject.common;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/com/context-datasource.xml",
						"classpath:spring/com/context-mybatis.xml"})
public class MyBatisTest {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public MyBatisTest() {
		LOGGER.debug("Constructor " + this.getClass());
	};
	
	@Test
	public void testFactory() {
		LOGGER.debug("[TEST] MyBatisTest : "+sqlSessionFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		try (SqlSession session=sqlSessionFactory.openSession()){
			LOGGER.debug("[TEST] MyBatisTest : "+session);
		}catch (NullPointerException e) {
			LOGGER.error("MyBatisTest NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("MyBatisTest IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("MyBatisTest Exception : " + e.getMessage());
		}
	}

}
