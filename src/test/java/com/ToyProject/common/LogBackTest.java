package com.ToyProject.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class LogBackTest {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public LogBackTest() {
		LOGGER.debug("Constructor " + this.getClass());
	}
	
	@Test
	public void testLogback() {
		LOGGER.debug("debug");
		LOGGER.error("error");
		LOGGER.info("info");
		LOGGER.trace("trace");
		LOGGER.warn("warn");
	}
	
}
