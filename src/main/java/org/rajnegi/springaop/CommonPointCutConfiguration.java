package org.rajnegi.springaop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfiguration {

	@Pointcut("execution(* org.rajnegi.springaop.dao.*.*(..))")
	public void dataLayerExecutions() {}
	
	@Pointcut("execution(* org.rajnegi.springaop.business.*.*(..))")
	public void businessLayerExecutions() {}
	
	@Pointcut("dataLayerExecutions() && businessLayerExecutions()")
	public void allLayerExecutions() {}
	
	@Pointcut("@annotation(org.rajnegi.springaop.aspect.TrackTime)")
	public void trackTimeForAnnotated() {}
}
