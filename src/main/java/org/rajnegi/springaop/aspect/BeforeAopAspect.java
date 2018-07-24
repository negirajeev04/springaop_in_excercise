package org.rajnegi.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//execution(* PACKAGE.*.*(..)) 
	//* - Any return type
	//PACKAGE - Inside the package
	//* - Any class
	//* - Any method in that class
	//(..) Irrespective of the argument type
	@Before("org.rajnegi.springaop.CommonPointCutConfiguration.dataLayerExecutions()")
	public void beforeAspect(JoinPoint joinPoint) {
		logger.info("Check for user access");
		logger.info("Allowed access to {}", joinPoint);
	}
	
}
