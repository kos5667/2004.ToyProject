package com.ToyProject.common;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/com/context-datasource.xml"})
public class OracleConnectionTest {

	@Autowired
	private DataSource dataSource;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public OracleConnectionTest() {
		LOGGER.debug("Constructor " + this.getClass());
	};
	
	@Test
	public void testConnection() {
		try (Connection con=dataSource.getConnection()){
			LOGGER.debug("[TEST] OracleConnectionTest : "+con);
		} catch (NullPointerException e) {
			LOGGER.error("OracleConnectionTest NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("OracleConnectionTest IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("OracleConnectionTest Exception : " + e.getMessage());
		}
	}
}
