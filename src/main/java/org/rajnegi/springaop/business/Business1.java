package org.rajnegi.springaop.business;

import org.rajnegi.springaop.aspect.TrackTime;
import org.rajnegi.springaop.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	public String doSomething() {
		return dao1.retreiveSomething();
	}
	
}
