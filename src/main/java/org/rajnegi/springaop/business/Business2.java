package org.rajnegi.springaop.business;

import org.rajnegi.springaop.aspect.TrackTime;
import org.rajnegi.springaop.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	@TrackTime
	public String doSomething() {
		return dao2.retreiveSomething();
	}
}
