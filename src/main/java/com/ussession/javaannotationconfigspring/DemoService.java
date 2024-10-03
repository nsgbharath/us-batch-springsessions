package com.ussession.javaannotationconfigspring;

import org.springframework.stereotype.Component;

//java.lang.Object
//toString
//equals
//hashcode
//wait
//getClass
//clone
@Component
public class DemoService {

	public DemoService() {
		super();
		System.out.println("service constructor called");
	}

}
