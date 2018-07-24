package org.rajnegi.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "org.rajnegi.springaop.CommonPointCutConfiguration.allLayerExecutions()", returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("Returning from {} with result {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "org.rajnegi.springaop.CommonPointCutConfiguration.businessLayerExecutions()", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
		logger.info("Exception {} throw from {}", exception, joinPoint);
	}
	
}
