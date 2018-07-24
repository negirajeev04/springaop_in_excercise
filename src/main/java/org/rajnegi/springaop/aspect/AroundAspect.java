package org.rajnegi.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("org.rajnegi.springaop.CommonPointCutConfiguration.trackTimeForAnnotated()")
	public void calculateTimeTaken(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		logger.info("Time taken to execute {} is {} milliseconds", joinPoint, System.currentTimeMillis()-startTime);
		
	}
	
}
