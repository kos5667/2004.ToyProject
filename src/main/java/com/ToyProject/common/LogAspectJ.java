package com.ToyProject.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * FileName : PojoAspectJ.java
 *	:: XML �� ���������� aspect �� ����   
  */
public class LogAspectJ {
	
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	///Constructor
	public LogAspectJ() {
		LOGGER.debug("\nCommon :: "+this.getClass()+"\n");
	}
	
	//Around  Advice
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
			
		LOGGER.debug("");
		LOGGER.debug("[Around before] Ÿ����ü.�޼��� :"+
													joinPoint.getTarget().getClass().getName() +"."+
													joinPoint.getSignature().getName());
		if(joinPoint.getArgs().length !=0){
			LOGGER.debug("[Around before]method�� ���޵Ǵ� ���� : "+ joinPoint.getArgs()[0]);
		}
		//==> Ÿ�� ��ü�� Method �� ȣ�� �ϴ� �κ� 
		Object obj = joinPoint.proceed();

		LOGGER.debug("[Around after] Ÿ�� ��üreturn value  : "+obj);
		LOGGER.debug("");
		
		return obj;
	}
	
}//end of class