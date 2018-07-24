package org.rajnegi.springaop;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.rajnegi.springaop.business.Business1;
import org.rajnegi.springaop.business.Business2;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringaopApplication implements CommandLineRunner{

	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(business1.doSomething());
		log.info(business2.doSomething());
	}
}
