package com.eclipseninja.archimedes.internal.sling.library.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eclipseninja.archimedes.sling.library.services.TestService;

public class TestServiceImpl implements TestService {
	
	private static final Logger logger =  LoggerFactory.getLogger(TestServiceImpl.class);

	public void startup() {
		sayHello();
	}
	
	
	@Override
	public void sayHello() {
		logger.debug("Hello, World!");
	}

}
