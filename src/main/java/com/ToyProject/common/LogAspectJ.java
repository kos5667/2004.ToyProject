package com.ToyProject.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * FileName : PojoAspectJ.java
 *	:: XML 에 선언적으로 aspect 의 적용   
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
		LOGGER.debug("[Around before] 타겍객체.메서드 :"+
													joinPoint.getTarget().getClass().getName() +"."+
													joinPoint.getSignature().getName());
		if(joinPoint.getArgs().length !=0){
			LOGGER.debug("[Around before]method에 전달되는 인자 : "+ joinPoint.getArgs()[0]);
		}
		//==> 타겟 객체의 Method 를 호출 하는 부분 
		Object obj = joinPoint.proceed();

		LOGGER.debug("[Around after] 타겟 객체return value  : "+obj);
		LOGGER.debug("");
		
		return obj;
	}
	
}//end of class